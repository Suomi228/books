package com.example.books.services.impl;

import com.example.books.DTO.BookDTO;

import java.util.List;

public interface BookRecommendationService {

    List<BookDTO> recommendBooks(Long userId);
}
