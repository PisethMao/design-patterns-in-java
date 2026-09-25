package com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.service;

public class RealDocumentService implements DocumentService {
    @Override
    public String readDocument(String documentId) {
        IO.println(
                "[REAL SERVICE] Reading document: " + documentId
        );
        return "Confidential content of document " + documentId;
    }

    @Override
    public void deleteDocument(String documentId) {
        IO.println(
                "[REAL SERVICE] Deleting document: " + documentId
        );
    }
}