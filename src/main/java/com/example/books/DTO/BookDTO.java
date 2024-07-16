package com.example.books.DTO;

import com.example.books.entities.AuthorEntity;
import com.example.books.entities.GenreEntity;

public class BookDTO {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String genre;
    private String author;

    public BookDTO() {}

    public BookDTO(Long id, String title, String description, double price, String genre, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.genre = genre;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
