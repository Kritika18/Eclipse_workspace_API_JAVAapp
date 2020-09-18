package registerapi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"registerapi"})
@SpringBootApplication
public class Library {

	
	public static void main(String[] args)
	{
		SpringApplication.run(Library.class, args);
	}
}
