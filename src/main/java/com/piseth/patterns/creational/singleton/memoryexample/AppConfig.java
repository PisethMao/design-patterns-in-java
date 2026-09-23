package com.piseth.patterns.creational.singleton.memoryexample;

public class AppConfig {
    // Use this for eager singleton
    //    private static final AppConfig INSTANCE = new AppConfig();
    // Use this for both lazy and synchronized singleton
    //    private static AppConfig INSTANCE = new AppConfig();
    // Use this for double-checked locking singleton
    private static volatile AppConfig INSTANCE = new AppConfig();

    private String applicationName;

    private AppConfig() {
        applicationName = "My Banking API";
        IO.println("AppConfig Object Created");
    }

    // Type of Singleton
    // 1. Eager Singleton
//    public static AppConfig getInstance() {
//        return INSTANCE;
//    }
    // 2. Lazy Singleton
//    public static AppConfig getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new AppConfig();
//        }
//        return INSTANCE;
//    }
    // 3. Synchronized Singleton
//    public static synchronized AppConfig getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new AppConfig();
//        }
//        return INSTANCE;
//    }
    // 4. Double-Checked Locking Singleton
//    public static AppConfig getInstance() {
//        if (INSTANCE == null) {
//            synchronized (AppConfig.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new AppConfig();
//                }
//            }
//        }
//        return INSTANCE;
//    }
    // 5. Initialization-On-Demand Holder Singleton
    private static class Holder {
        private static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
