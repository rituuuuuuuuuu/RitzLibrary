package com.ritz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritz.entity.Book;
import com.ritz.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	
	  public List<Book> getAllBooks()
	  { List<Book> allBooks = (List<Book>)
	  bookRepo.findAll(); allBooks.forEach(b -> b.setName(b.getName() + "-b"));
	  return allBooks; }
	 
	/*
	 * public List<Book> getAllBooks1()
	 *  { List<Book> allBooks = (List<Book>)
	 * bookRepo.findAll(); 
	 * allBooks.forEach(b -> b.setAuthor(b.getAuthor() +"-Ritz")); return allBooks; }
	 */
	
}

