package com.example.books.repositories;

import com.example.books.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByName(String name);

    //     Show every book that user liked
    @Query(value = "SELECT u FROM UserEntity u WHERE u.name = :name")
    List<UserEntity> findAllByName(@Param("name") String name);

}
