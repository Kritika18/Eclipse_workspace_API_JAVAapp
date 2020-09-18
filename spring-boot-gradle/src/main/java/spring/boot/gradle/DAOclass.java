package spring.boot.gradle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class DAOclass {

     @Autowired
     private JdbcTemplate jdbcTemplate;

     private static final String SQL = "select * from customers";

     public List<customer> isData() {

          List<customer> customers = new ArrayList<customer>();
          List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

          for (Map<String, Object> row : rows) 
          {
               customer custom = new customer();
               custom.setCustNo((int)row.get("Cust_id"));
               custom.setCustName((String)row.get("Cust_name"));
               custom.setCountry((String)row.get("Country"));

               customers.add(custom);
           }

         return customers;
     }
}
