package com.web.MaterialNation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.web.MaterialNation.service.BookDetailsService;
import com.web.MaterialNation.service.UserDetailsService;

@RestController
public class BookController {
	private static Logger LOG = LoggerFactory.getLogger("BookController");
	
	@Autowired
	private BookDetailsService bookDetailsService;

	@GetMapping(path = "/bookdetails")
	public ResponseEntity<?> loadBookDetails() {
		LOG.info("Loading Book Details");
		return new ResponseEntity<>(bookDetailsService.loadBookDetails(), HttpStatus.OK);
	}
	
	@GetMapping(path="/bookbyname/byname/{bname}")
	public ResponseEntity<?> searchbookbyname(@PathVariable("bname") String bookname)
	{
		LOG.info("Searching book by Bookname");
		return new ResponseEntity<>(bookDetailsService.searchname(bookname),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbycategory/bycategory/{bcategory}")
	public ResponseEntity<?> searchbookbycategory(@PathVariable("bcategory") String bookcategory)
	{
		LOG.info("Searching book by category");
		return new ResponseEntity<>(bookDetailsService.searchcategory(bookcategory),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbyauthor/byauthor/{bauthor}/{blast}")
	public ResponseEntity<?> searchbookbyauthor(@PathVariable("bauthor") String bookafname ,@PathVariable("blast") String bookalname)
	{
		LOG.info("Searching book by authorname");
		return new ResponseEntity<>(bookDetailsService.searchauthor(bookafname,bookalname),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbysubject/bysubject/{bsubject}")
	public ResponseEntity<?> searchbookbysubject(@PathVariable("bsubject") String booksubject )
	{
		LOG.info("Searching book by subject");
		return new ResponseEntity<>(bookDetailsService.searchsubject(booksubject),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbyisbn/{isbn}")
	public ResponseEntity<?> searchbookbyisbn(@PathVariable("isbn") String bookisbn)
	{
		LOG.info("Searching book by isbn");
		return new ResponseEntity<>(bookDetailsService.searchisbn(bookisbn),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	
	
}
