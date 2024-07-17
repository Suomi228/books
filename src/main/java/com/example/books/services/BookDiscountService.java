package com.example.books.services;

import com.example.books.DTO.BookDTO;

import java.util.List;

public interface BookDiscountService {

    List<BookDTO> findDiscountBooks(Long userId);
}
