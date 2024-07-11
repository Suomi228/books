package com.example.books.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "books")
public class BookEntity extends BaseEntity{

    private String title;
    private String description;
    private double price;
    private GenreEntity genre;

    protected BookEntity(String title, String description, double price, GenreEntity genre) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.genre = genre;
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
    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id", nullable = false)
    public GenreEntity getGenre() {
        return genre;
    }

    public void setGenre(GenreEntity genre) {
        this.genre = genre;
    }
}
