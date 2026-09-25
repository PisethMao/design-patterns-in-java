package com.piseth.patterns.structural.proxy.sychronizationproxy.counterexample;

public class Main {
    private static final int THREAD_COUNT = 8;
    private static final int INCREMENTS_PER_THREAD = 20_000;

    public static void main() throws InterruptedException {
        IO.println("=== WITHOUT PROXY ===");
        Counter unsafeCounter = new BasicCounter();
        runTest(unsafeCounter);
        IO.println();
        IO.println("=== WITH SYNCHRONIZATION PROXY ===");
        Counter realCounter = new BasicCounter();
        Counter synchronizedCounter = new SynchronizedCounterProxy(realCounter);
        runTest(synchronizedCounter);
    }

    private static void runTest(Counter counter) throws InterruptedException {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        int expected = THREAD_COUNT * INCREMENTS_PER_THREAD;
        IO.println("Expected : " + expected);
        IO.println("Actual   : " + counter.getCounter());
    }
}
