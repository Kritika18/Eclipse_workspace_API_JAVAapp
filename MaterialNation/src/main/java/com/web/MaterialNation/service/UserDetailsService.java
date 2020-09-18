package com.web.MaterialNation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.MaterialNation.DAO.UserDetailsDAO;

@Service
public class UserDetailsService {

	@Autowired
	private UserDetailsDAO userDetailsDAO;
	
	
	public Object loadUserDetails(String emailaddress) {
		// TODO Auto-generated method stub
		return userDetailsDAO.getUserDetails(emailaddress);
	}

	
}
