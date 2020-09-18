package library.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import library.model.LibBook;
import library.model.RegisterUser;

@Repository
public class LibBookDAO {
	

    private static Logger LOG = LoggerFactory.getLogger(LibBookDAO.class);
    private JdbcTemplate jdbcTemplate;
    @Autowired
	public LibBookDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
    

	public List<LibBook> getBookDetails() {
		String sql = "select * from booksdata";
		LOG.debug("Fetching Book Details...");
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(LibBook.class));
	}


	public List<LibBook> getBookbyname(String name) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Bookname ='" + name + "'";
		LOG.debug("Fetching Book Details by name...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class)); //using row mapper we are mapping data from
		// database to our object (to return that same in postman) here we are seeting data into model .
	}


	public List<LibBook> getBookbycategory(String bookcategory) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Bookcategory ='" + bookcategory + "'";
		LOG.debug("Fetching Book Details by category...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class));
	}
	
	public List<LibBook> getBookbyauthorname(String firstname , String lastname) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Authorfirstname ='" + firstname + "' or Authorlastname = '" + lastname +"'  ";
		LOG.debug("Fetching Book Details by Authorname...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class));
	}


	public Object getBookbysubject(String booksubject) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Booksubject ='" + booksubject + "'";
		LOG.debug("Fetching Book Details by subject...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class));
	}


	public Object getBookbyisbn(String bookisbn) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Bookisbnno ='" + bookisbn + "'";
		LOG.debug("Fetching Book Details by isbn...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class));
	}
	
	
	public List<LibBook> getBookbyanyway(String keyword)
	{
		String sql = "select * from booksdata where Booksubject = '" + keyword +  " '   ";
		LOG.debug("Fetching Book Details by anyway...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class));
		
	}
	
	public List<LibBook> getBookbyany(String key) {
		// TODO Auto-generated method stub
		String sql ="select * from booksdata where Bookcategory ='" + key + "'";
		LOG.debug("Fetching Book Details by keyword...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class));
	}

	
	public void issuebook(LibBook b , String bookid) {
		
			// TODO Auto-generated method stub
		 
			String sql = "insert into issuedbooks(userid , bookid ) values(?,?) ;
			insert into libbooks (availability) values (no);
					LOG.debug("Updating user's Data");
			try {
				jdbc.update(sql , b.userid(), u.getFirstName() , u.getLastName(),u.getEmail(),u.getMobile(),u.getPassword() );
			}
			catch(Exception e) {
				
				System.out.println(e);
			
			
			}	
		}


	public List<LibBook> getbyavailability(String bookid) {
		// TODO Auto-generated method stub
		
		String key ="No";
		String sql ="select * from libbooks where Bookid  ='" + bookid + "' and  Bookavailability ='" + key + "'";
		LOG.debug("Fetching Book Details by availability...");
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(LibBook.class));
		
		// TODO Auto-generated method stub
		
	}	
	}


	
	
}
