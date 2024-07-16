package com.example.books;

import com.example.books.DTO.BookDTO;
import com.example.books.entities.UserEntity;
import com.example.books.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/search/{userID}")
    public List<String> getAll(@PathVariable("userID") Long userID) {
        return userService.recommendBooks(userID);
    }
}
