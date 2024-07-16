package com.example.books.services;


import com.example.books.DTO.BookDTO;
import com.example.books.entities.BookEntity;
import com.example.books.repositories.UserRepository;
//import com.example.books.repositories.impl.UserEntityRepositoryImpl;
import com.example.books.services.impl.BookRecommendationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements BookRecommendationService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Autowired
    public UserService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public List<String> recommendBooks(Long userId) {
        List<String> recommendedBooks = userRepository.recommendBooks(userId);
        return recommendedBooks;
    }
}
