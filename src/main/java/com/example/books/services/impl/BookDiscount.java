package com.example.books.services.impl;

import com.example.books.DTO.BookDTO;
import com.example.books.entities.BookEntity;

import java.util.List;

public interface BookDiscount {

    List<BookDTO> findDiscountEligibleBooks(Long userId);
}
