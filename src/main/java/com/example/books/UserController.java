package com.example.books;

import com.example.books.entities.UserEntity;
import com.example.books.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AutoConfiguration
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{name}")
    public List<UserEntity> getAll(String name) {
        return userService.findAllByName(name);
    }

}
