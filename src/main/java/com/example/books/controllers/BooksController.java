package com.example.books.controllers;

import com.example.books.DTO.BookDTO;
import com.example.books.services.impl.BookDiscountServiceServiceImpl;
import com.example.books.services.impl.BookRecommendationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {
    @Autowired
    private final BookRecommendationServiceImpl bookRecommendationServiceImpl;
    @Autowired
    private final BookDiscountServiceServiceImpl bookDiscountServiceImpl;
    @Autowired
    public BooksController(BookRecommendationServiceImpl bookRecommendationServiceImpl, BookDiscountServiceServiceImpl bookDiscountServiceImpl) {
        this.bookRecommendationServiceImpl = bookRecommendationServiceImpl;
        this.bookDiscountServiceImpl = bookDiscountServiceImpl;
    }

    @GetMapping("/search/{userID}")
    public List<String> getAll(@PathVariable("userID") Long userID) {
        return bookRecommendationServiceImpl.recommendBooks(userID);
    }
    @GetMapping("/discount-eligible-books/{userId}")
    public List<BookDTO> getDiscountEligibleBooks(@PathVariable("userId") Long userId) {
        return bookDiscountServiceImpl.findDiscountEligibleBooks(userId);
    }
}
