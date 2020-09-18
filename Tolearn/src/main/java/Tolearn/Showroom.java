package Tolearn;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

   private final List<Vehicle> theVehicles = new ArrayList<>();

   public boolean addVehicle( Vehicle newVehicle ) {
      theVehicles.add( newVehicle ); 
      // add that vehicle v1 , v2 in list    // now imagine list with index 0 - vehicle 0 - index 1 - vehicle 1 
      System.out.println(theVehicles);    
      return true;
      
   }
   
   public void getVehicle()
   {
	   
	   System.out.println(theVehicles.get(0));
	   System.out.println(theVehicles.get(1).getManufacturer());  
	   //getting manufacturer (index 0 - vehicle 0 , so we can also access getManufacturer)
   }

   public static void main( String[] args ) {
      final Showroom showroom = new Showroom();   //object of main class 
      final Vehicle v1 = new Vehicle();
    		  v1.Vehicl( "renault", "clio", "12", "290890" );  // object of vehicle (model )
      final Vehicle v2 = new Vehicle();
    		  v2.Vehicl( "renault2", "clio2", "122", "2908902" );
      showroom.addVehicle( v1 );  // call method and add objects of vehicle 
      showroom.addVehicle( v2 );
      showroom.getVehicle();
      
      
   }
}


class Vehicle {

    private String manufacturer;
    private String model;
    private String custName;
    private String vin;
    private String dateMan;
    private String dateSold;
    private Boolean sold;
    private char tax;
    private double cost;

    public void Vehicl(String a, String b, String c, String d) {
        manufacturer = a;
        model = b;
        vin = c;
        dateMan = d;
    }

    public String toString() {
        String s = "Manufacturer: " + manufacturer + "  Model: "
                + model + "  vin: " + vin + "Date Manufactured:" + dateMan
                + "Cost: " + cost;
        return s;
    }

    public void buyVehicle(String a, String b) {  //buy method for the vehicle
        a = dateSold;
        b = custName;
        sold = true;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getCustName() {
        return custName;
    }

    public String getVin() {
        return vin;
    }

    public String getDateMan() {
        return dateMan;
    }

    public String getDateSold() {
        return dateSold;
    }

    public Boolean getSold() {
        return sold;
    }

    public char getTax() {
        return tax;
    }

    public double getCost() {
        return cost;
    }
}

/*
package parking_lot;
import java.util.*; 

public class Testingmodel {
	
	
	
	   
	
	    private List<Person> listPeople; 
	   
	    public void setListPeople(List<Person> list) { 
	        this.listPeople = new ArrayList<Person>(list); 
	    } 
	   
	    public List<Person> getListPeople() { 
	        return new ArrayList<Person>(this.listPeople); 
	    } 
	   
	    public static void main(String[] args) { 
	        Testingmodel app = new Testingmodel(); 
	   
	        List<Person> list1 = new ArrayList<Person>(); 
	        list1.add(new Person("Peter" , "20") ); 
	        list1.add(new Person("Alice , 10 ")); 
	        list1.add(new Person("Mary , 9")); 
	   
	        app.setListPeople(list1); 
	   
	        System.out.println("List 1: " + list1); 
	        System.out.println(list1.get(2));
	   
//	        list1.get(2).setName("Maryland"); 
//	   
//	        List<Person> list2 = app.getListPeople(); 
//	        System.out.println("List 2: " + list2); 
//	   
//	        list1.get(0).setName("Peter Crouch"); 
//	   
//	        List<Person> list3 = app.getListPeople(); 
//	        System.out.println("List 3: " + list3); 
	   
	    } 
	} 
	   
	class Person { 
	    private String name; 
	    private String age;
	   
	    public String getAge() {
			return age;
		}

		

		public void setAge(String age) {
			this.age = age;
		}

		public Person(String name) { 
	        this.name = name; 
	    } 
	   
	    public Person(String string, String string2) {
			// TODO Auto-generated constructor stub
		}



		public String getName() { 
	        return this.name; 
	    } 
	   
	    public void setName(String name) { 
	        this.name = name; 
	    } 
	   
	    public String toString() { 
	        return this.name; 
	    } 
	}
*/

