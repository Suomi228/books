package com.example.books.DTO;

import com.example.books.entities.BookEntity;
import com.example.books.entities.UserEntity;

import java.time.LocalDate;
import java.util.Date;

public class PurchaseDTO {
    private long id;
    private LocalDate purchaseDate;

    public PurchaseDTO(long id, LocalDate purchaseDate) {
        this.id = id;
        this.purchaseDate = purchaseDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
