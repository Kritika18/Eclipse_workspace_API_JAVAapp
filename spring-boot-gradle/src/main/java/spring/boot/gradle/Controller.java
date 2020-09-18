package spring.boot.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;




@RestController
public class Controller {

	
	@Autowired
	public DAOclass dao;
	
	@RequestMapping("/Hi")
	public String Hello()
	{
		return "Welcome";
	}
	

    @RequestMapping("/getcustInfo")
    public List<customer> customerInformation() {
        List<customer> customers = dao.isData(); 
        return customers;
    }
}



