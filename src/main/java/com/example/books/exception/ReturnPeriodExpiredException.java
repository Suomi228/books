package com.example.books.exception;

public class ReturnPeriodExpiredException extends RuntimeException {
    public ReturnPeriodExpiredException(String message) {
        super(message);
    }
}