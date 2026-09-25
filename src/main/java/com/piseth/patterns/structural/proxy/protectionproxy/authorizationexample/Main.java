package com.piseth.patterns.structural.proxy.protectionproxy.authorizationexample;

public class Main {
    public static void main() {
        AdminService adminService = new AdminServiceProxy("USER");
        adminService.deleteUser("123");
    }
}
