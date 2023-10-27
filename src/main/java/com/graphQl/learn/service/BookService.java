package com.graphQl.learn.service;

import java.util.List;

import com.graphQl.learn.entities.Book;

public interface BookService {

	// Create Book
	Book createBook(Book book);

	// Get All Books
	List<Book> getAllBook();

	// Get Single Book By Id
	Book bookById(int id);
}
