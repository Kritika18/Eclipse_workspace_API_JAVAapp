//This class is required for storing the username and password we recieve from the client.
package com.login.creatingtoken.model;



import java.io.Serializable;

public class jwtrequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;
	private String email;
	private String password;
	
	//need default constructor for JSON Parsing
	public jwtrequest()
	{
		
	}

	public jwtrequest(String username, String password) {
		this.setEmail(username);
		this.setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
