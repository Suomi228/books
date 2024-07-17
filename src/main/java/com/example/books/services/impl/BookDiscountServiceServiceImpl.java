package com.example.books.services.impl;

import com.example.books.DTO.BookDTO;
import com.example.books.entities.BookEntity;
import com.example.books.exception.UserNotFoundException;
import com.example.books.repositories.BookRepository;
import com.example.books.services.BookDiscountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookDiscountServiceServiceImpl implements BookDiscountService {

    private final ModelMapper modelMapper;
    private final BookRepository bookRepository;

    @Autowired
    public BookDiscountServiceServiceImpl(ModelMapper modelMapper, BookRepository bookRepository) {
        this.modelMapper = modelMapper;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDTO> findDiscountBooks(Long userId) {
        if (!bookRepository.existsById(userId)) {
            throw new UserNotFoundException(userId);
        }
        List<BookEntity> eligibleBooks = bookRepository.findDiscountBooks(userId);
        return eligibleBooks.stream()
                .map(book -> {
                    BookDTO bookDTO = modelMapper.map(book, BookDTO.class);
                    bookDTO.setPrice(book.getPrice() * 0.75); // Применение 25% скидки
                    return bookDTO;
                })
                .collect(Collectors.toList());
    }
}
