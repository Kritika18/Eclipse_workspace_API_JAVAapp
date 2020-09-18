package library.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import library.DAO.RegisterUserDAO;
import library.model.RegisterUser;





@Service
public class RegisterUserService  {
	
	@Autowired
	private RegisterUserDAO repo;
	
	
	public void saveOrUpdate(RegisterUser user)   
	{  
		
		if((repo.isemail(user.getEmail())).isEmpty() && (repo.ismobile(user.getMobile())).isEmpty() )
		{
	
	      repo.registeruser(user);  
		}
		else
		{
			System.out.print("User present");
		}
	}  
	
	
	public List<RegisterUser> emaildata(String email)
	{
		return repo.isemail(email);
	}
	public List<RegisterUser> mobiledata(String mobile)
	{
		return repo.ismobile(mobile);
	}
	
	public Object isemaildata(String email)
	{
		return repo.isemail2(email);
	}

}
