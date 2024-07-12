package com.example.books.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String email;
    private String name;
    private String password;
    private Set<BookCollectionEntity> bookCollections;
    private Set<PurchaseEntity> purchaseEntities;


    protected UserEntity(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    protected UserEntity() {

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="email", unique = true)
    public String getEmail() {
        return email;
    }
    @Column(name="password")
    public String getPassword() {
        return password;
    }
    @Column(name="name", unique = true)
    public String getName() {
        return name;
    }

    @ManyToMany
    @JoinTable(
            name = "purchase",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    public Set<PurchaseEntity> getPurchaseEntities() {
        return purchaseEntities;
    }

    public void setPurchaseEntities(Set<PurchaseEntity> purchaseEntities) {
        this.purchaseEntities = purchaseEntities;
    }

    @ManyToMany
    @JoinTable(
            name = "book_collection",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    public Set<BookCollectionEntity> getBookCollections() {
        return bookCollections;
    }

    public void setBookCollections(Set<BookCollectionEntity> bookCollections) {
        this.bookCollections = bookCollections;
    }
}
