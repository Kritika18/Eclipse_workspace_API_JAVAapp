package library.controller;


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

import library.model.RegisterUser;
import library.service.RegisterUserService;



@RestController
public class RegisterUserController {
	private static Logger LOG = LoggerFactory.getLogger("RegisterController");
	
	@Autowired
	RegisterUserService registerservice;
	
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
	
	
	
	@GetMapping(path = "userLibraryIdNo/{userLibraryIdNo}")
	public ResponseEntity<?>  customeremail(@PathVariable("userLibraryIdNo") String uLibraryId) {
		LOG.info("Loading email Details");
        return new ResponseEntity<>(registerservice.emaildata(uLibraryId), HttpStatus.OK);
	}
        
        
}
