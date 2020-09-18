package registerapi.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import registerapi.Model.UserRegDTO;


@Repository
public class Usersdaoimpl  {

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
	public List<UserRegDTO> ismobile(String mobile) {
		String sql = "select * from users where mobile = '" + mobile + "'";
        List<UserRegDTO> m = new ArrayList<UserRegDTO>(); // list of how many users will be displayed in postman
        List<Map<String, Object>> rows = jdbc.queryForList(sql); // list of data of one user that comes in postman(rows)

        for (Map<String, Object> row : rows) // of one user 
        {
             UserRegDTO custommob = new UserRegDTO();
             custommob.setEmail((String)row.get("email")); //get is of map getting data from database   
             custommob.setMobile((String)row.get("mobile"));
             m.add(custommob);
         }

       return m; // we are getting display in postman 
   }
	
	public UserRegDTO isuser1(String firstname1) {

	    String sql = "SELECT * FROM users WHERE firstname = ?";

	    return jdbc.queryForObject(sql, new Object[]{firstname1}, (rs, rowNum) ->
	            new UserRegDTO(
	                    rs.getString("firstname"),
	                    rs.findColumn(firstname1)
	            ));

	}
		
	
	public UserRegDTO isemail2(String email) {
		String sql = "select * from users where email = '" + email + "'";
       UserRegDTO getUser = new UserRegDTO(); // list of how many users will be displayed in postman
        List<Map<String, Object>> rows = jdbc.queryForList(sql); // list of data of one user that comes in postman(rows)

        for (Map<String, Object> row : rows) // of one user 
        {
             
             getUser.setFirstName((String)row.get("firstname")); //get is of map getting data from database   
             getUser.setMobile((String)row.get("mobile"));
             System.out.print(getUser.getMobile());
             
             
         }
        return getUser;

        // we are getting display in postman 
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
