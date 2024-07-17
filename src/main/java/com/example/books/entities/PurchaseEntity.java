package com.example.books.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "purchase")
public class PurchaseEntity extends BaseEntity {

    private UserEntity user;
    private BookEntity book;
    private LocalDate purchaseDate;

    protected PurchaseEntity() {}

    protected PurchaseEntity(UserEntity user, BookEntity book, LocalDate purchaseDate) {
        this.user = user;
        this.book = book;
        this.purchaseDate = purchaseDate;
    }
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UserEntity getUser() {
        return user;
    }
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id", nullable = false)
    public BookEntity getBook() {
        return book;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Column(name = "purchase_date")
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
}
