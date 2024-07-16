package com.example.books.services;

import com.example.books.DTO.BookDTO;
import com.example.books.entities.BookEntity;
import com.example.books.repositories.UserRepository;
import com.example.books.services.impl.BookDiscount;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookDiscountService implements BookDiscount {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Autowired
    public BookDiscountService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public List<BookDTO> findDiscountEligibleBooks(Long userId) {
        List<BookEntity> eligibleBooks = userRepository.findDiscountEligibleBooks(userId);
        return eligibleBooks.stream()
                .map(book -> modelMapper.map(book, BookDTO.class))
                .collect(Collectors.toList());
    }
}
