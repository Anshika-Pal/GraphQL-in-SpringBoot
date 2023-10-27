package com.graphQl.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphQl.learn.entities.Book;
import com.graphQl.learn.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	// Create Book
	@MutationMapping("createBook")
	public Book CreateBook(@Argument BookInput book) {

		Book b = new Book();
		b.setTitle(book.getTitle());
		b.setDesc(book.getDesc());
		b.setAuthor(book.getAuthor());
		b.setPages(book.getPages());
		b.setPrice(book.getPrice());

		return this.bookService.createBook(b);
	}

	// Get All Books
	@QueryMapping("allBooks")
	public List<Book> getAllBooks() {
		return this.bookService.getAllBook();
	}

	// Get Single Book
	@QueryMapping("getBook")
	public Book getBook(@Argument int bookId) {
		return this.bookService.bookById(bookId);
	}
}

class BookInput {

	private int pages;
	private String title;
	private String desc;
	private String author;
	private double price;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
