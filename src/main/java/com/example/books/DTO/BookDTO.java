package com.example.books.DTO;

import com.example.books.entities.AuthorEntity;
import com.example.books.entities.GenreEntity;

public class BookDTO {

    private long id;
    private String title;
    private String description;
    private double price;
    private GenreDTO genre;
    private AuthorDTO author;

    public BookDTO(long id, String title, String description, double price, GenreDTO genre, AuthorDTO author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.genre = genre;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public GenreDTO getGenre() {
        return genre;
    }

    public void setGenre(GenreDTO genre) {
        this.genre = genre;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
