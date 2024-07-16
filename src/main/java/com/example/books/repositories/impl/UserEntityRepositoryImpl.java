//package com.example.books.repositories.impl;
//
//import com.example.books.entities.UserEntity;
//import com.example.books.repositories.GenericRepository;
//import com.example.books.repositories.UserRepository;
//import org.springframework.boot.autoconfigure.AutoConfiguration;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@AutoConfiguration
//@Repository
//public class UserEntityRepositoryImpl implements UserRepository {
//
//    private final GenericRepository<UserEntity,Long> genericRepository;
//
//    public UserEntityRepositoryImpl(GenericRepository<UserEntity,Long> genericRepository) {
//        this.genericRepository = genericRepository;
//    }
//
//    @Override
//    public List<UserEntity> findAllByName(String name) {
//        return genericRepository.findAllByName(name);
//    }
//
//}
