package com.example.books.services;

public interface PurchaseBackService {
    void deletePurchaseIfWithinThreeDays(Long userId, Long bookId);
}
