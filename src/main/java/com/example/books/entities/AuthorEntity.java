package com.example.books.entities;
import jakarta.persistence.*;
@Entity
@Table(name="authors")
public class AuthorEntity extends BaseEntity {
    private String firstName;
    private String lastName;

    public AuthorEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public AuthorEntity() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
