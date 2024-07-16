package com.example.books.services;


import com.example.books.DTO.UserDTO;
import com.example.books.entities.UserEntity;
import com.example.books.repositories.UserRepository;
//import com.example.books.repositories.impl.UserEntityRepositoryImpl;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService implements BookRecommendationService{

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Autowired
    public UserService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }


    public List<UserEntity> findAllByName(String name){
        List<UserEntity> users = userRepository.findAllByName(name);
        System.out.println(users);
        return userRepository.findAllByName(name);
    };

    @Override
    public List<UserDTO> recommendBooks(UserDTO userDTO) {
        List<UserEntity> users = userRepository.findAllByName(userDTO.getName());
        List<UserDTO> userDTOs = users.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserDTO.class))
                .collect(Collectors.toList());;
        return userDTOs;
    }
}
