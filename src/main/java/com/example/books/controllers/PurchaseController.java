package com.example.books.controllers;

import com.example.books.exception.PurchaseNotFoundException;
import com.example.books.exception.ReturnPeriodExpiredException;
import com.example.books.services.PurchaseBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {

    private final PurchaseBackService purchaseBackService;

    @Autowired
    public PurchaseController(PurchaseBackService purchaseBackService) {
        this.purchaseBackService = purchaseBackService;
    }

    @DeleteMapping("/return")
    public String returnBook(@RequestParam("userId") Long userId, @RequestParam("bookId") Long bookId) {
        try {
            purchaseBackService.deletePurchaseIfWithinThreeDays(userId, bookId);
            return "Book returned successfully.";
        } catch (PurchaseNotFoundException e) {
            return e.getMessage();
        } catch (ReturnPeriodExpiredException e) {
            return e.getMessage();
        }
    }
}