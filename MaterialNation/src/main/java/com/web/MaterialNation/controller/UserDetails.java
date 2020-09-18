package com.web.MaterialNation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.web.MaterialNation.service.UserDetailsService;

@RestController
public class UserDetails {
	private static Logger LOG = LoggerFactory.getLogger("UserDetails");

	@Autowired
	private UserDetailsService userDetails;
	@GetMapping(path = "/userdetails/emailaddress/{emailaddress}")
	public ResponseEntity<?> loadUserDetails( @PathVariable String emailaddress) {
		LOG.info("Loading User Details" + emailaddress);
		return new ResponseEntity<>(userDetails.loadUserDetails(emailaddress), HttpStatus.OK);

	}
}
