package com.graphQl.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphQl.learn.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
