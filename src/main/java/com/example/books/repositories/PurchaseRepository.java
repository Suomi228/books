package com.example.books.repositories;

import com.example.books.entities.PurchaseEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends GenericRepository<PurchaseEntity, Long>{
    @Modifying
    @Transactional
    @Query("DELETE FROM PurchaseEntity p WHERE p.user.id = :userId AND p.book.id = :bookId")
    void deletePurchaseIfWithinThreeDays(@Param("userId") Long userId, @Param("bookId") Long bookId);

    PurchaseEntity findByUserIdAndBookId(Long userId, Long bookId);
}
