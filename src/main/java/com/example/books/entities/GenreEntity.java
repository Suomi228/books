package com.example.books.entities;
import jakarta.persistence.*;
@Entity
@Table(name="genre")
public class GenreEntity extends BaseEntity{
    private String name;
    private String description;
    protected GenreEntity() {}

    protected GenreEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
