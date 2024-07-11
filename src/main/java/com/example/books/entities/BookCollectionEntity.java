package com.example.books.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "book_collection")
public class BookCollectionEntity extends BaseEntity{
    private UserEntity user;
    private BookEntity book;
    public BookCollectionEntity(UserEntity user, BookEntity book) {
        this.user = user;
        this.book = book;
    }
    public BookCollectionEntity() {
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }
}
