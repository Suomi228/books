package com.example.books.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "books")
public class BookEntity extends BaseEntity{

    private String title;
    private String description;
    private double price;

    protected BookEntity(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    protected BookEntity() {

    }
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "description", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
