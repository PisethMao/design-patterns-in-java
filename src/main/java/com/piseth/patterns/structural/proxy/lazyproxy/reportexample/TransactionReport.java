package com.piseth.patterns.structural.proxy.lazyproxy.reportexample;

public class TransactionReport implements Report {
    public TransactionReport() {
        IO.println(
                "Loading millions of transactions..."
        );
        IO.println(
                "Calculating report statistics..."
        );
    }

    @Override
    public void generate() {
        IO.println(
                "Transaction report generated."
        );
    }
}
