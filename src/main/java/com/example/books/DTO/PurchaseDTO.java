package com.example.books.DTO;

import com.example.books.entities.BookEntity;
import com.example.books.entities.UserEntity;

import java.util.Date;

public class PurchaseDTO {
    private long id;
    private Date purchaseDate;

    public PurchaseDTO(long id, Date purchaseDate) {
        this.id = id;
        this.purchaseDate = purchaseDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
