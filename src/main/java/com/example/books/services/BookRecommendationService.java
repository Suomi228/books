package com.example.books.services;

import com.example.books.DTO.UserDTO;

import java.util.List;
import java.util.Set;

public interface BookRecommendationService {
    List<UserDTO> recommendBooks(UserDTO userDTO);
}
