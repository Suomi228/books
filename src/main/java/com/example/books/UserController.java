package com.example.books;

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

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/search/{name}")
    public List<UserEntity> getAll(@PathVariable("name") String name) {
        return userService.findAllByName(name);
    }
}
