package com.example.books.services.impl;

import com.example.books.exception.UserNotFoundException;
import com.example.books.repositories.BookRepository;
import com.example.books.services.BookRecommendationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookRecommendationServiceImpl implements BookRecommendationService {

    private final ModelMapper modelMapper;
    private final BookRepository bookRepository;

    @Autowired
    public BookRecommendationServiceImpl(ModelMapper modelMapper, BookRepository bookRepository) {
        this.modelMapper = modelMapper;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<String> recommendBooks(Long userId) {
        if (!bookRepository.existsById(userId)) {
            throw new UserNotFoundException(userId);
        }
        List<String> recommendedBooks = bookRepository.recommendBooks(userId);
        return recommendedBooks;
    }
}
