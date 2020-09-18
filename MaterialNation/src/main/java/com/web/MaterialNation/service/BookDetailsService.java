package com.web.MaterialNation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.MaterialNation.DAO.BookDetailsDAO;
import com.web.MaterialNation.DAOModel.Book;

@Service
public class BookDetailsService {

	@Autowired
	private BookDetailsDAO bookDetailsDAO;
	
	
	public List<Book> loadBookDetails() {
		return bookDetailsDAO.getBookDetails();
	}
	
	public Object searchname(String bookname) {
		// TODO Auto-generated method stub
		
		return bookDetailsDAO.getBookbyname(bookname);
	}

	public Object searchcategory(String bookcategory) {
		// TODO Auto-generated method stub
		return bookDetailsDAO.getBookbycategory(bookcategory);
	}

	public Object searchauthor(String bookafname, String bookalname) {
		// TODO Auto-generated method stub
		return bookDetailsDAO.getBookbyauthorname(bookafname,bookalname);
	}

	public Object searchsubject(String booksubject) {
		// TODO Auto-generated method stub
		return bookDetailsDAO.getBookbysubject(booksubject);
	}

	public Object searchisbn(String bookisbn) {
		// TODO Auto-generated method stub
		return bookDetailsDAO.getBookbyisbn(bookisbn);
	}

	
}
