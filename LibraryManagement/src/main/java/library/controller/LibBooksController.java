package library.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import library.model.LibBook;
import library.service.LibBookService;


@RestController
public class LibBooksController {
	private static Logger LOG = LoggerFactory.getLogger("BookController");
	
	@Autowired
	private LibBookService bookDetailsService;

	@PostMapping("/bookissue")  
	private int save(@Valid @RequestBody LibBook b)   
	{  
		bookDetailsService.issuebook(b);  
	return b.getId();  
	}
	
	
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
	
	
	@GetMapping(path="/bookbyauthor/byauthor/{bauthor}/{blast}")
	public ResponseEntity<?> searchbookbyauthor(@PathVariable("bauthor") String bookafname ,@PathVariable("blast") String bookalname)
	{
		LOG.info("Searching book by authorname");
		return new ResponseEntity<>(bookDetailsService.searchauthor(bookafname,bookalname),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbyany/byany/{num}")
	public ResponseEntity<?> searchbookbyany(@PathVariable("num") String bookkey)
	{
		LOG.info("Searching book by anyway");
		return new ResponseEntity<>(bookDetailsService.searchany(bookkey),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbysubject/bysubject/{bsubject}")
	public ResponseEntity<?> searchbookbysubject(@PathVariable("bsubject") String booksubject )
	{
		LOG.info("Searching book by subject");
		return new ResponseEntity<>(bookDetailsService.searchsubject(booksubject),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbyisbn/byisbn/{isbn}")
	public ResponseEntity<?> searchbookbyisbn(@PathVariable("isbn") String bookisbn)
	{
		LOG.info("Searching book by isbn");
		return new ResponseEntity<>(bookDetailsService.searchisbn(bookisbn),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	@GetMapping(path="/bookbyavailabilty/byavailability")
	public ResponseEntity<?> searchbookbyavailability(@PathVariable("isbn") String bookisbn)
	{
		LOG.info("Searching book by isbn");
		return new ResponseEntity<>(bookDetailsService.isavailable(bookisbn),HttpStatus.OK); //giving responseEntity we can take 
		//any return type eg - here it is object in previous method it is list.
	}
	
	
	
}
