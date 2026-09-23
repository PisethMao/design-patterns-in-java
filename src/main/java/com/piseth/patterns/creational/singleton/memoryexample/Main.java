package com.piseth.patterns.creational.singleton.memoryexample;

public class Main {
    static void main() {
        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();
        AppConfig appConfig = AppConfig.getInstance();
        IO.println(appConfig1);
        IO.println(appConfig2);
        IO.println(appConfig);
        // 6. Enum Singleton
        AppConfigEnum.INSTANCE.printConfig();
    }
}
