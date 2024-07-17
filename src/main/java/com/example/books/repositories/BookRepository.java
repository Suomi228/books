package com.example.books.repositories;

import com.example.books.entities.BookEntity;
import com.example.books.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends GenericRepository<UserEntity, Long> {

    List<UserEntity> findByName(String name);

    //  Show every book that user liked
    @Query("SELECT b.title FROM BookEntity b WHERE b.genre = " +
            "(SELECT bc.book.genre FROM BookCollectionEntity bc WHERE bc.user.id = :userId " +
            "GROUP BY bc.book.genre ORDER BY COUNT(bc.book.id) DESC LIMIT 1) " +
            "AND b NOT IN (SELECT bc.book FROM BookCollectionEntity bc WHERE bc.user.id = :userId) " +
            "ORDER BY b.id")
    List<String> recommendBooks(@Param("userId") Long userId);

    @Query("SELECT b FROM BookEntity b WHERE b.genre IN " +
            "(SELECT p.book.genre FROM PurchaseEntity p WHERE p.user.id = :userId " +
            "GROUP BY p.book.genre HAVING COUNT(p.book.id) >= 1) " +
            "AND b.id NOT IN (SELECT p.book.id FROM PurchaseEntity p WHERE p.user.id = :userId)")
    List<BookEntity> findDiscountBooks(@Param("userId") Long userId);

}
