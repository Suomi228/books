package com.example.books.services;


import java.util.List;

public interface BookRecommendationService {

    List<String> recommendBooks(Long userId);
}
