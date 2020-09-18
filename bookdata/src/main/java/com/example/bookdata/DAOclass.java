package com.example.bookdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class DAOclass {

     @Autowired
     private JdbcTemplate jdbcTemplate;

     private static final String SQL = "select * from booksdata";

     public List<books> isData() {

          List<books> books = new ArrayList<books>();
          List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

          for (Map<String, Object> row : rows) 
          {
               books b = new books();
               b.setBookname((String)row.get("Bookname")); // from database set into b  
               b.setAuthorfirstname((String)row.get("Authorfirstname"));
               b.setAuthorlastname((String)row.get("Authorlastname"));

               books.add(b);
           }

         return books;
     }
}
