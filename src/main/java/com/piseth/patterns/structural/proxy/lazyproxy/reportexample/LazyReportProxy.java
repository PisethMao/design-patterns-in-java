package com.piseth.patterns.structural.proxy.lazyproxy.reportexample;

public class LazyReportProxy implements Report {
    private TransactionReport report;

    @Override
    public void generate() {
        if (report == null) {
            IO.println(
                    "Initializing transaction report..."
            );
            report = new TransactionReport();
        }
        report.generate();
    }
}
