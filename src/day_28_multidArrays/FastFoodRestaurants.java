package day_28_multidArrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		
		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: "+ data.length);
	
		//print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		//print last restaurant
		System.out.println(data[data.length -1]);
		
		//print information in separate line
		int counter = 0;
		for(String restaurant : data ) {
			System.out.println("#"+counter+")"+restaurant);
			counter++;
		}
		//print all restaurant information in state of VA
			
		// using for each loop
			int count = 0;
			for(int i = 0; i < data.length; i++) {
				if(data[i].contains("VA")) {			
			
			System.out.println("Va count: "+count+" Restaurants in VA: "+data[i]);
			count++;
				
				}}
		//using for loop
				int countVA =0;
				for( String rest : data) {
					if(rest.contains("VA")) {
						System.out.println("Count: "+countVA+"Restaurants in VA: "+rest);
						countVA++;
					}
				}
				
				//find all restaurant information in state of VA
				//print the restaurant names along with city name
				//Subway - Herndon (example)
				
				int counting = 0;
					for(String res : data) {
				if(res.contains("VA")) {			
						String[] resArr = res.split(",");
				System.out.println(resArr[2]+" - "+resArr[1]);
				
				
				}}
				}
		}
	
	
	
	
	
	
	
	
	

