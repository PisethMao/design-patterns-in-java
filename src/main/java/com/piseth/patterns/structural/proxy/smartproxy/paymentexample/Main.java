package com.piseth.patterns.structural.proxy.smartproxy.paymentexample;

import com.piseth.patterns.structural.proxy.smartproxy.paymentexample.proxy.SmartBankAccountProxy;
import com.piseth.patterns.structural.proxy.smartproxy.paymentexample.service.BankAccountService;
import com.piseth.patterns.structural.proxy.smartproxy.paymentexample.service.RealBankAccountService;

public class Main {
    public static void main() {
        BankAccountService service =
                new RealBankAccountService();
        BankAccountService services = new SmartBankAccountProxy(service);
        services.withdraw(
                "ACC-001",
                100
        );
        IO.println();
        services.withdraw(
                "ACC-002",
                -200
        );
        IO.println();
        services.withdraw(
                "ACC-003",
                300
        );
    }
}
