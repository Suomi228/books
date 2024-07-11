package com.example.books.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String email;
    private String name;
    private String password;

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
}
