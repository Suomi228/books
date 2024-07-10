package com.example.books.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "book_collections")
public class BookCollectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public BookCollectionEntity(Long id, UserEntity user, BookEntity book) {
        this.id = id;
        this.user = user;
        this.book = book;
    }

    public BookCollectionEntity() {

    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity book;
}
