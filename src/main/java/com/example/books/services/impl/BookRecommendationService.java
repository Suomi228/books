package com.example.books.services.impl;


import java.util.List;

public interface BookRecommendationService {

    List<String> recommendBooks(Long userId);
}
