//package com.example.books.repositories;
//
//import com.example.books.entities.BookEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//
//import java.util.List;
//
//@Repository
//public interface BookRepository extends JpaRepository<BookEntity, Long> {
//
//    List<BookEntity> findByAuthor(String author);
//    List<BookEntity> findByTitle(String title);
//    List<BookEntity> findByPrice(double price);
//    List<BookEntity> findByGenre(String genre);
//
//}
