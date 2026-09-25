package com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.service;

import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.exception.AccessDeniedException;
import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.model.Role;
import com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.model.User;

public class SecurityDocumentServiceProxy implements DocumentService {
    private final DocumentService realService;
    private final User currentUser;

    public SecurityDocumentServiceProxy(
            DocumentService realService,
            User currentUser
    ) {
        this.realService = realService;
        this.currentUser = currentUser;
    }

    @Override
    public String readDocument(String documentId) {
        checkReadPermission();
        return realService.readDocument(documentId);
    }

    @Override
    public void deleteDocument(String documentId) {
        checkDeletePermission();
        realService.deleteDocument(documentId);
    }

    private void checkReadPermission() {
        if (currentUser == null) {
            throw new AccessDeniedException(
                    "Authentication required"
            );
        }
        IO.println(
                "[SECURITY PROXY] Read permission granted to "
                        + currentUser.getUsername()
        );
    }

    private void checkDeletePermission() {
        if (currentUser == null) {
            throw new AccessDeniedException(
                    "Authentication required"
            );
        }
        if (currentUser.getRole() != Role.ADMIN) {
            throw new AccessDeniedException(
                    "User "
                            + currentUser.getUsername()
                            + " is not allowed to delete documents"
            );
        }
        IO.println(
                "[SECURITY PROXY] Delete permission granted to "
                        + currentUser.getUsername()
        );
    }
}
