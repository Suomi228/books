package com.example.books.repositories;

import com.example.books.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
@Repository
public abstract class GenericRepository<T, ID> implements JpaRepository<T, Long> {

    public abstract List<T> findAllByName(String name);

}
