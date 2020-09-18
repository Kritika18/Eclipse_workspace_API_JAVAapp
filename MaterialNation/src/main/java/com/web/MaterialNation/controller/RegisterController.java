package com.web.MaterialNation.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.MaterialNation.DAOModel.RegisterUser;
import com.web.MaterialNation.service.RegisterService;


@RestController
public class RegisterController {
	private static Logger LOG = LoggerFactory.getLogger("RegisterController");
	
	@Autowired
	RegisterService registerservice;
	
	@RequestMapping("/Hi")
	public String Hi()
	{
	   return "Welcome";	
	}
	
	
	
	@PostMapping("/register")  
	private int save(@Valid @RequestBody RegisterUser u)   
	{  
		registerservice.saveOrUpdate(u);  
	return u.getId();  
	}  
	
	
	
	@GetMapping(path = "emailaddress/{email}")
	public ResponseEntity<?>  customeremail(@PathVariable("email") String emailaddress) {
		LOG.info("Loading email Details");
        return new ResponseEntity<>(registerservice.emaildata(emailaddress), HttpStatus.OK);
	}
        
        @GetMapping(path = "mobile/{mobile}")
    	public ResponseEntity<?> customermobile(@PathVariable("mobile") String mobileno) {
            
        	LOG.info("Loading mobile Details");
            return new ResponseEntity<>(registerservice.mobiledata(mobileno), HttpStatus.OK);
        }
        
        
        @GetMapping(path = "details/{email}")
    	public ResponseEntity<?> customername(@PathVariable("email") String email) {
        	LOG.info("Loading email2 Details");
            return new ResponseEntity<>(registerservice.isemaildata(email), HttpStatus.OK);
        }
}
