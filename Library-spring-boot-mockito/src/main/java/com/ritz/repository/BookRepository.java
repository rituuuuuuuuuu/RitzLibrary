package com.ritz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ritz.entity.Book;
//cjst for git 

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	public List<Book> findByName(String name);
	public List<Book> findByAuthor(String author);

}