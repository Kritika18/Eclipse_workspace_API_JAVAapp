//Expose a POST API /authenticate using the JwtAuthenticationController. 
//The POST API gets username and password in the body(from user)- Using Spring Authentication Manager 
//we authenticate the username and password.
//If the credentials are valid, a JWT token is created using the JWTTokenUtil and provided to the client.

package com.login.creatingtoken.controller;



import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.login.creatingtoken.service.jwtuserdetailservice;


import com.login.creatingtoken.config.jwtutil;
import com.login.creatingtoken.model.jwtrequest;
import com.login.creatingtoken.model.jwtresponse;

@RestController
@CrossOrigin
public class jwtcontroller {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private jwtutil jwtTokenUtil;

	@Autowired
	private jwtuserdetailservice userDetailsService;
	
	
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST )
	public ResponseEntity<?> createAuthenticationToken(@RequestBody jwtrequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getEmail(), authenticationRequest.getPassword()); // this method takes
		// data from user and then compares it with database data by calling jwtuserservice
		//System.out.print(authenticationRequest.getUsername());
		System.out.print(authenticationRequest.getPassword());
		
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getEmail()); // after authentication is done we are loading 
		//user data from database to create token
		
		System.out.print(authenticationRequest.getEmail());
          
		final String token = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new jwtresponse(token));
	}

	
	private void authenticate(String email, String password) throws Exception {
		System.out.println("in controller" + email); //given by user 
		System.out.println(password);
		try {
			System.out.println("hi");
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password)); //goes to jwtuserdetailservice taking email and password and checks
			// with database email and password that we get from userdao method present in jwtuserservice 
			System.out.print("in controller authenticate " + authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password)));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}