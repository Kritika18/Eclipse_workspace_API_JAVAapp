//It overrides the loadUserByUsername for fetching user details from the database using the username. 
//The Spring Security Authentication Manager calls this method for 
//getting the user details from the database when authenticating the user details provided by the user.
package com.login.creatingtoken.service;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.creatingtoken.dao.Usersdaoimpl;
import com.login.creatingtoken.model.UserRegDTO;

@Service
public class jwtuserdetailservice implements UserDetailsService {
	
	@Autowired
	private Usersdaoimpl userDao;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;


	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		System.out.println("in userdetail method"+ email); //checks email given by user
		UserRegDTO user = userDao.isemail2(email);
		if (user == null) {
			System.out.print("Hi");
			throw new UsernameNotFoundException("User not found with email: " + email);
			
		}
		System.out.print(user.getFirstName());
		System.out.print(user.getPassword());
		System.out.print(user.getMobile());
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		System.out.print(user.getPassword());
		return new org.springframework.security.core.userdetails.User(user.getFirstName(), user.getPassword(),
				new ArrayList<>());
		
	}
}