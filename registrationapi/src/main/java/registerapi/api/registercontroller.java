package registerapi.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import registerapi.Model.UserRegDTO;
import registerapi.Service.UserserviceImpl;


@RestController
public class registercontroller {
	@Autowired
	UserserviceImpl userSer;
	
	@RequestMapping("/Hi")
	public String Hi()
	{
	   return "Welcome";	
	}
	
	@PostMapping("/register")  
	private int save(@Valid @RequestBody UserRegDTO u)   
	{  
	userSer.saveOrUpdate(u);  
	return u.getId();  
	}  
	
	
	@GetMapping(path = "emailaddress/{email}")
	public List<UserRegDTO> customeremail(@PathVariable("email") String emailaddress) {
        List<UserRegDTO> customers = userSer.emaildata(emailaddress); 
        return customers;
	}
        
        @GetMapping(path = "mobile/{mobile}")
    	public List<UserRegDTO> customermobile(@PathVariable("mobile") String mobileno) {
            List<UserRegDTO> customers = userSer.mobiledata(mobileno); 
            return customers;
}
        
        
        
        @GetMapping(path = "details/{email}")
    	public UserRegDTO customername(@PathVariable("email") String email) {
            UserRegDTO customers = userSer.isemaildata(email); 
            return customers;
}
}
