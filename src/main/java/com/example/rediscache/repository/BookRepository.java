package com.example.rediscache.repository;


import com.example.rediscache.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
  
}