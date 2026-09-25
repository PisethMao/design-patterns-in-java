package com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.service;

public interface DocumentService {
    String readDocument(String documentId);

    void deleteDocument(String documentId);
}