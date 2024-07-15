package com.example.books.repositories;

import com.example.books.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository{


//     Show every book that user liked
    @Query(value = "select u, b.book from UserEntity u join BookCollectionEntity b on u.id = b.user.id where u.name in (:name)")
    List<UserEntity> findAllByName(@Param("name") String name);

}
