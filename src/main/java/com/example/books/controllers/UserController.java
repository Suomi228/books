package com.example.books.controllers;

import com.example.books.DTO.BookDTO;
import com.example.books.entities.BookEntity;
import com.example.books.services.BookDiscountService;
import com.example.books.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private final UserService userService;
    @Autowired
    private final BookDiscountService bookDiscountService;
    @Autowired
    public UserController(UserService userService, BookDiscountService bookDiscountService) {
        this.userService = userService;
        this.bookDiscountService = bookDiscountService;
    }

    @GetMapping("/search/{userID}")
    public List<String> getAll(@PathVariable("userID") Long userID) {
        return userService.recommendBooks(userID);
    }
    @GetMapping("/{userId}/discount-eligible-books")
    public List<BookDTO> getDiscountEligibleBooks(@PathVariable("userId") Long userId) {
        return bookDiscountService.findDiscountEligibleBooks(userId);
    }
}
