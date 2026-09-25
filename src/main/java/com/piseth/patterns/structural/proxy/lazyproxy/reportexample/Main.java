package com.piseth.patterns.structural.proxy.lazyproxy.reportexample;

public class Main {
    public static void main() {
        Report report =
                new LazyReportProxy();
        IO.println(
                "Application started"
        );
        IO.println(
                "User hasn't requested report yet"
        );
        report.generate();
        IO.println(
                "Report generated"
        );
    }
}
