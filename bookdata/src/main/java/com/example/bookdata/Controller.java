package com.example.bookdata;

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
	

    @RequestMapping("/getbookdata")
    public List<books> customerInformation() {
        List<books> booksinfo = dao.isData(); 
        return booksinfo;
    }
}



