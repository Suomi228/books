package com.example.books.repositories;

import com.example.books.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<UserEntity> findAllByEmail(String email);

    // Show every book that user liked
    @Query(value = "select u, b.book from UserEntity u join BookCollectionEntity b on u.id = b.id where u.name in :name")
    List<UserEntity> findAllByName(@Param(value = "name") String name);
}
