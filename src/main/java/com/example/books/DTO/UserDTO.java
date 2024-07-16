package com.example.books.DTO;

import com.example.books.entities.BookCollectionEntity;
import com.example.books.entities.PurchaseEntity;

import java.util.Set;

public class UserDTO {
    private long id;
    private String email;
    private String name;
    private String password;
    private Set<BookCollectionEntity> bookCollections;
    private Set<PurchaseEntity> purchaseEntities;


    protected UserDTO(long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    protected UserDTO() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<BookCollectionEntity> getBookCollections() {
        return bookCollections;
    }

    public void setBookCollections(Set<BookCollectionEntity> bookCollections) {
        this.bookCollections = bookCollections;
    }

    public Set<PurchaseEntity> getPurchaseEntities() {
        return purchaseEntities;
    }

    public void setPurchaseEntities(Set<PurchaseEntity> purchaseEntities) {
        this.purchaseEntities = purchaseEntities;
    }
}
