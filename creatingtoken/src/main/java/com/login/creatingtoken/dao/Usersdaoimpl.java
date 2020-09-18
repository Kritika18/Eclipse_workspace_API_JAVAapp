package com.login.creatingtoken.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.login.creatingtoken.model.UserRegDTO;


@Repository
public class Usersdaoimpl {

	@Autowired
    private JdbcTemplate jdbc;

//	public void ispresent(String email)
//	{
//	
//		String sql = "select email , mobile from users where email = '" + email + "'";
//		try {
//			
//			
//				jdbc.execute(sql);
//			
//		
//		}
//        catch(Exception e) {
//			
//			System.out.println(e);
//		
//	
//		}	
//	}
	
	
	public List<UserRegDTO> isemail(String email) {
		String sql = "select * from users where email = '" + email + "'";
        List<UserRegDTO> getUser = new ArrayList<UserRegDTO>(); // list of how many users will be displayed in postman
        List<Map<String, Object>> rows = jdbc.queryForList(sql); // list of data of one user that comes in postman(rows)

        for (Map<String, Object> row : rows) // of one user 
        {
             UserRegDTO custom = new UserRegDTO();
             custom.setEmail((String)row.get("email")); //get is of map getting data from database   
             custom.setMobile((String)row.get("mobile"));
             getUser.add(custom);
             
         }

       return getUser; // we are getting display in postman 
   }
	
	public UserRegDTO isemail2(String givenemail) {
		String sql = "select * from users where email = '" + givenemail + "'";
       UserRegDTO getUser = new UserRegDTO(); // list of how many users will be displayed in postman
        List<Map<String, Object>> rows = jdbc.queryForList(sql); // list of data of one user that comes in postman(rows)
       
       // System.out.print(getUser.getFirstName());
        for (Map<String, Object> row : rows) // of one user 
        {
             
             getUser.setFirstName((String)row.get("firstname")); //get is of map getting data from database   
             getUser.setMobile((String)row.get("mobile"));
             getUser.setPassword((String)row.get("password"));
                          
         }
        //System.out.print(getUser.getMobile());
        return getUser;

        // we are getting display in postman 
   }
	
	
	
	public String isuser(String firstname ) {

        String sql = "SELECT firstname FROM users WHERE firstname = ?";

        return jdbc.queryForObject(
                sql, new Object[]{firstname}, String.class);

    }
	
	
	public UserRegDTO isuser1(String firstname1) {

	    String sql = "SELECT * FROM users WHERE firstname = ?";

	    return jdbc.queryForObject(sql, new Object[]{firstname1}, (rs, rowNum) ->
	            new UserRegDTO(
	                    rs.getString("firstName"),
	                    rs.getString("lastname")
	            ));

	}
		
	
	public void registeruser(UserRegDTO u) {
		// TODO Auto-generated method stub
		
		
		String sql = "insert into users(id , firstname , lastname , email ,mobile,password) values(?,?,?,?,?,?)";
		try {
			jdbc.update(sql , u.getId(), u.getFirstName() , u.getLastname(),u.getEmail(),u.getMobile(),u.getPassword() );
		}
		catch(Exception e) {
			
			System.out.println(e);
		
		
		}	
	}
	

	
	
	

}
