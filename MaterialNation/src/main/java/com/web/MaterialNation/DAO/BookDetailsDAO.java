package com.web.MaterialNation.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.MaterialNation.DAOModel.Book;

@Repository
public class BookDetailsDAO {
	

    private static Logger LOG = LoggerFactory.getLogger(BookDetailsDAO.class);
    private JdbcTemplate jdbcTemplate;
    @Autowired
	public BookDetailsDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
    

	public List<Book> getBookDetails() {
		String sql = "select * from booksdata";
		LOG.debug("Fetching Book Details...");
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
	}


	public List<Book> getBookbyname(String name) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Bookname ='" + name + "'";
		LOG.debug("Fetching Book Details by name...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class)); //using row mapper we are mapping data from
		// database to our object (to return that same in postman) here we are seeting data into model .
	}


	public List<Book> getBookbycategory(String bookcategory) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Bookcategory ='" + bookcategory + "'";
		LOG.debug("Fetching Book Details by category...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
	}
	
	public List<Book> getBookbyauthorname(String firstname , String lastname) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Authorfirstname ='" + firstname + "' or Authorlastname = '" + lastname +"'";
		LOG.debug("Fetching Book Details by Authorname...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
	}


	public Object getBookbysubject(String booksubject) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Booksubject ='" + booksubject + "'";
		LOG.debug("Fetching Book Details by subject...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
	}


	public Object getBookbyisbn(String bookisbn) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Bookisbnno ='" + bookisbn + "'";
		LOG.debug("Fetching Book Details by isbn...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
	}
	
}
