package com.ritz;
//static import to include static variable or method 
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ritz.LibrarySpringBootMockitoApplication;
import com.ritz.entity.Book;
import com.ritz.repository.BookRepository;
import com.ritz.service.BookService;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ritz.LibrarySpringBootMockitoApplication;
import com.ritz.entity.Book;
import com.ritz.repository.BookRepository;
import com.ritz.service.BookService;

@SpringBootTest(classes=LibrarySpringBootMockitoApplication.class)
//JIS CLASS P TEST KRNA H USKA NAME THN TEST 
public class BookServiceTest {
	
	@Mock 
	BookRepository bookRepo;
	
	@InjectMocks
	BookService bookService = new BookService();
	
	@Test
	public void testGetAllBooks() {
		
		List<Book> books = new ArrayList<>();
		Book b = new Book(1, "Learn Java", "Abcd", 100, "borrowed");
		books.add(b);
		Book b1 = new Book(1, "R D Sharma", "ABC", 120, "borrowed");
		books.add(b1);
		
		
		when(bookRepo.findAll()).thenReturn(books);
		
		List<Book> result = bookService.getAllBooks();
		   //assertion -- class of JuNIT
		 	
			/* List<Book> result = bookService.getAllBooks1(); */
		 Assertions.assertNotEquals(null, result);
		
		  Assertions.assertTrue(result.get(0).getName().endsWith("-b"));
		  Assertions.assertEquals("Learn Java-b", result.get(0).getName());
		  Assertions.assertEquals("R D Sharma-b", result.get(1).getName());
		  
		//author
		/*
		 * Assertions.assertTrue(result.get(0).getAuthor().endsWith("-Ritz"));
		 * 
		 * Assertions.assertEquals("Abcd-Ritz", result.get(0).getAuthor());
		 * Assertions.assertEquals("ABC-Ritz", result.get(1).getAuthor());
		 */
		
		
	}
}