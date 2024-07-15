package com.example.books.services;


import com.example.books.entities.UserEntity;
import com.example.books.repositories.impl.UserEntityRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
@AutoConfiguration
@Service
public class UserService {
    private final UserEntityRepositoryImpl userRepository;

    @Autowired
    public UserService(UserEntityRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }
    public List<UserEntity> findAllByName(String name){
        return userRepository.findAllByName(name);
    };
}
