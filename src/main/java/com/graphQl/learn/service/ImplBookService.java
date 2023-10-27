package com.graphQl.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphQl.learn.entities.Book;
import com.graphQl.learn.repository.BookRepo;

@Service
public class ImplBookService implements BookService {

	@Autowired
	private BookRepo bookRepo;

	/*
	 * public ImplBookService() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public ImplBookService(BookRepo bookRepo) { super(); this.bookRepo =
	 * bookRepo; }
	 */

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return this.bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return this.bookRepo.findAll();
	}

	@Override
	public Book bookById(int id) {
		// TODO Auto-generated method stub
		return this.bookRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Book you are ooking for not found on server! "));
	}

}
