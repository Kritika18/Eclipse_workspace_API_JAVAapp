package library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import library.DAO.LibBookDAO;
import library.model.LibBook;
import library.model.RegisterUser;

@Service
public class LibBookService {

	@Autowired
	private LibBookDAO bookDetailsDAO;
	
	
	public List<LibBook> loadBookDetails() {
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
	
	public Object searchany(String bookkeyword) {
		// TODO Auto-generated method stub
		return bookDetailsDAO.getBookbyany(bookkeyword);
	}

	public void issuebook(String b  , String userid)   
	{  
		
		if((bookDetailsDAO.getbyavailability(b)).isEmpty() )
		{
			bookDetailsDAO.issuebook(b , userid);  
		}
		else
		{
			System.out.print("Book already isuued");
		}
		
		
			
		
	}

	public Object isavailable(String bookid) {
		// TODO Auto-generated method stub
		return bookDetailsDAO.getbyavailability(bookid);
	}  
	
}
