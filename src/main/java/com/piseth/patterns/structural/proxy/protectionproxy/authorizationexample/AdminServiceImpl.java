package com.piseth.patterns.structural.proxy.protectionproxy.authorizationexample;

public class AdminServiceImpl implements AdminService {
    @Override
    public void deleteUser(String userId) {
        IO.println("ADMIN Deleted User ID: " + userId);
    }
}
