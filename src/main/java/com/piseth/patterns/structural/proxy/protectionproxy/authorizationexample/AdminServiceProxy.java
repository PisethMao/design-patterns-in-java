package com.piseth.patterns.structural.proxy.protectionproxy.authorizationexample;

public class AdminServiceProxy implements AdminService{
    private final AdminService adminService;
    private final String role;

    public AdminServiceProxy(String role) {
        this.role = role;
        this.adminService = new AdminServiceImpl();
    }

    @Override
    public void deleteUser(String userId) {
        if(!"ADMIN".equals(role)) {
            throw new SecurityException("You are not authorized to delete user");
        }
        adminService.deleteUser(userId);
    }
}
