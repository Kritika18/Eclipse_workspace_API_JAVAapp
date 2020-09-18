package Tolearn;

import java.util.*; 


	public class Dog extends Animal {


	    private List<Animal> listPeople; 
	   
	    public void setListPeople(List<HashMap<String, Integer>> list1) { 
	        this.listPeople = new ArrayList<Animal>(); 
	    } 
	   
	    public List<Animal> getListPeople() { 
	        return new ArrayList<Animal>(this.listPeople); 
	    } 
	    public void index()
        {
     	   Map<String, Integer> map = new HashMap<String, Integer>();
            List<HashMap<String, Integer>> list1 = new ArrayList<HashMap<String, Integer>>();  //here 6 list will come (plate - slot)
	        map.put("name", 3);
	        map.put("favfood", 4); // want to pass Lists, Integers also
	        setValue(map);
	        list1.add((HashMap<String, Integer>) map); 
	        System.out.println("map: " + map);
	        setListPeople(list1); 
	      System.out.println(list1.get(0));
	        System.out.println("List 1: " + list1);
        }
	    public static void main(String[] args) { 
	       
	    	Dog dog =new Dog();
	        dog.index();
	        
           
	      }
	    }

	
	   
	
	   
	    
//		
//	        Understandinggetter app = new Understandinggetter(); 
//	   
//	        
//	        list1.add(new Person("Alice")); 
//	        list1.add(new Person("Mary")); 
//	        list1.add(new Person("20")); 
//	        list1.add(new Person("30")); 
//	        list1.add(new Person("40")); 
//	   
//	        app.setListPeople(list1); 
//	       // System.out.println(list1.indexOf("20"));
//	        System.out.println("List 1: " + list1); 
	   
//	        list1.get(2).setName("Maryland"); 
//	   
//	        List<Person> list2 = app.getListPeople(); 
//	        System.out.println("List 2: " + list2); 
//	   
//	        list1.get(0).setName("Peter Crouch"); 
//	   
//	        List<Person> list3 = app.getListPeople(); 
//	        System.out.println("List 3: " + list3); 
	   
	    
	 
	   
class Animal {

    Map<String, Integer> data = new HashMap <String, Integer>();

    public void setValue(Map<String, Integer> map)
     {
       this.data = map;
     }
    public Map<String, Integer> getValue()
     {
      return this.data;
     }
  }



