package jdbctemplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@RequestMapping("hi")
	public String Hi(){
		return "Hi";
		
	}

}
