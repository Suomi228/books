package com.example.books.exception;

public class PurchaseNotFoundException extends RuntimeException {
    public PurchaseNotFoundException(String message) {
        super(message);
    }
}

