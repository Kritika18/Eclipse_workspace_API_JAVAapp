//This is class is required for creating a response containing the JWT to be returned to the user.
package com.login.creatingtoken.model;


import java.io.Serializable;

public class jwtresponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;

	public jwtresponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
