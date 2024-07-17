package com.example.books.services.impl;

import com.example.books.exception.UserNotFoundException;
import com.example.books.repositories.UserRepository;
import com.example.books.services.BookRecommendationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookRecommendationServiceImpl implements BookRecommendationService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Autowired
    public BookRecommendationServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public List<String> recommendBooks(Long userId) {
        if (!userRepository.existsById(userId)) {
            throw new UserNotFoundException(userId);
        }
        List<String> recommendedBooks = userRepository.recommendBooks(userId);
        return recommendedBooks;
    }
}
