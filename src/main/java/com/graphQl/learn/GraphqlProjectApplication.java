package com.graphQl.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphQl.learn.entities.Book;
import com.graphQl.learn.service.BookService;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// TimeUnit.MINUTES.sleep(1);

		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning Java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("XYZ");

		Book b2 = new Book();
		b2.setTitle("Learn Java Easily");
		b2.setDesc("Reference For learning Java");
		b2.setPages(600);
		b2.setPrice(500);
		b2.setAuthor("ABC");

		Book b3 = new Book();
		b3.setTitle("Java High Level Language");
		b3.setDesc("Learn Java Easily");
		b3.setPages(300);
		b3.setPrice(700);
		b3.setAuthor("DEF");

		this.bookService.createBook(b1);
		this.bookService.createBook(b2);
		this.bookService.createBook(b3);
	}
}
