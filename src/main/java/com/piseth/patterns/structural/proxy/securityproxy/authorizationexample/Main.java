package com.piseth.patterns.structural.proxy.securityproxy.authorizationexample;

import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.exception.AccessDeniedException;
import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.model.Role;
import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.model.User;
import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.service.DocumentService;
import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.service.RealDocumentService;
import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.service.SecurityDocumentServiceProxy;

public class Main {
    public static void main() {
        DocumentService realService =
                new RealDocumentService();
        User piseth = new User(
                "Piseth",
                Role.USER
        );
        DocumentService userProxy =
                new SecurityDocumentServiceProxy(
                        realService,
                        piseth
                );
        IO.println("=== NORMAL USER ===");
        String content =
                userProxy.readDocument("DOC-001");
        IO.println(content);
        try {
            userProxy.deleteDocument("DOC-001");
        } catch (AccessDeniedException exception) {
            IO.println(
                    "ACCESS DENIED: "
                            + exception.getMessage()
            );
        }
        IO.println();
        IO.println("=== ADMIN USER ===");
        User admin = new User(
                "System Admin",
                Role.ADMIN
        );
        DocumentService adminProxy =
                new SecurityDocumentServiceProxy(
                        realService,
                        admin
                );
        IO.println();
        String adminContent =
                adminProxy.readDocument("DOC-001");
        IO.println(adminContent);
        adminProxy.deleteDocument("DOC-001");
    }
}
