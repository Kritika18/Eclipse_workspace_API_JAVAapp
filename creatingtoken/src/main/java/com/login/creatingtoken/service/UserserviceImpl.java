package com.login.creatingtoken.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.creatingtoken.model.UserRegDTO;
import com.login.creatingtoken.dao.Usersdaoimpl;

@Service
public class UserserviceImpl  {
	
	@Autowired
	Usersdaoimpl repo;
	
//	public void register(UserRegDTO user)
//	{
//		return repo.registerUser(user) > 0 ? true : false ;
//		
//	}
	
//	public void saveOrUpdate(UserRegDTO user)   
//	{  
//		System.out.print(user.getEmail());
//		System.out.print(repo.isemail(user.getEmail()));
//		
//		if((repo.isemail(user.getEmail())).isEmpty() && (repo.ismobile(user.getMobile())).isEmpty() )
//		{
//	
//	      repo.registeruser(user);  
//		}
//		else
//		{
//			System.out.print("User present");
//		}
//	}  
	
	
//	public List<UserRegDTO> emaildata(String email)
//	{
//		return repo.isemail(email);
//	}
//	public List<UserRegDTO> mobiledata(String mobile)
//	{
//		return repo.ismobile(mobile);
//	}

}
