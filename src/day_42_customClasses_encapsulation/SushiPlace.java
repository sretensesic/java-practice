package day_42_customClasses_encapsulation;

public class SushiPlace {
	String name;
	double rating;
	String address;
	
	public void setInfo(String nName, double nRating, String newAddress) {
		name = nName;
		rating = nRating;
		address = newAddress;
		
	}
	
	public void eatSushi() {
		System.out.println("Enjpying sushi at " + name);
	}
}
