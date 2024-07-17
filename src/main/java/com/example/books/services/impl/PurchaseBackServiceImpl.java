package com.example.books.services.impl;

import com.example.books.entities.PurchaseEntity;
import com.example.books.exception.PurchaseNotFoundException;
import com.example.books.exception.ReturnPeriodExpiredException;
import com.example.books.repositories.PurchaseRepository;
import com.example.books.services.PurchaseBackService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@Service
public class PurchaseBackServiceImpl implements PurchaseBackService {


    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseBackServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Transactional
    @Override
    public void deletePurchaseIfWithinThreeDays(Long userId, Long bookId) throws PurchaseNotFoundException, ReturnPeriodExpiredException {
        PurchaseEntity purchase = purchaseRepository.findByUserIdAndBookId(userId, bookId);
        if (purchase == null) {
            throw new PurchaseNotFoundException("Purchase record not found.");
        }
        long daysSincePurchase = ChronoUnit.DAYS.between(purchase.getPurchaseDate(), LocalDate.now());

        if (daysSincePurchase < 3) {
            purchaseRepository.deletePurchaseIfWithinThreeDays(userId, bookId);
        } else {
            throw new ReturnPeriodExpiredException("Return period has expired.");
        }
    }
}
