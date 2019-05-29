package day_39_arrayList04;
import java.util.*;
public class CitiesTask {
	public static void main(String[] args) {
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add("Paris");
        cities.add("Pittsburgh");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        

        //1) FOR EACH: Print each city in same line separated by |
        for(String city : cities) {
        		System.out.print(city + " | ");
        }
        	System.out.println();
        	
        	//2) FOR LOOP: Print each city in same line separated by |
        	for(int i = 0; i < cities.size(); i++) {
        		System.out.print(cities.get(i) + " | ");
        	}
        System.out.println();
        	
        //3) ToString. Print each City all uppercase
        System.out.println(cities.toString().toUpperCase());
        System.out.println(cities);
        
        //4) Make each city all uppercase
        String paris = cities.get(0).toUpperCase();
        cities.set(0, paris);
        System.out.println(cities.get(0));
        
        cities.set(1, cities.get(1).toUpperCase());
        
        for(int j = 0; j < cities.size(); j++) {
        		String city = cities.get(j).toUpperCase();
        		cities.set(j, city);
        }
        
        System.out.println(cities.toString());
        
        //FIND THE LONGEST AND SHORTES CITIES
       String longestCity = "", shortestCity = "";
     
       for(String city : cities) {
        	if(city.length() > longestCity.length()) {
        		longestCity = city;
        	}
        }
       shortestCity = cities.get(0);
       for(String city : cities) {
    	   if(city.length() < shortestCity.length()) {
    		   shortestCity = city;
    	   }
       }
       System.out.println("longestCity: "+longestCity);
       System.out.println(("shortestCity: "+shortestCity));
     
       
       ArrayList<String> citiesMoreThan6 = new ArrayList<>();
       //assign all cities that have more than 6 chars to this arrayList
       
       for(String city : cities) {
    	   if(city.length() > 6) {
    		   citiesMoreThan6.add(city);
    	   }
       }
        System.out.println(citiesMoreThan6);
	
	}
}
