package day_24_CreatingArrays;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", "Istanbul", "Baku", "Miami", "Silver Spring", "McLean"};
		System.out.println(cities.length);
	//Task all cities that start with M
		int[] nums = {1,2,443,5};
        // System.out.println(cities.length);
        // TASK print all cities that start with M
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].startsWith("M")) {
                System.out.println(cities[i]);
            }
        }
//      same thing, with for each loop
        for(String city: cities) {
            if (city.startsWith("M")) {
                System.out.println(city);
            }
        }
        
        
	}
	
		
	
	
	
	}

