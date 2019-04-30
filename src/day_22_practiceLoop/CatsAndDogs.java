package day_22_practiceLoop;

public class CatsAndDogs {
	public static void main(String[] args) {
		String str = "mycatyourcat";
		int cats = 0;
	//count how many cats
		
		for(int i = 0; i <= str.length()-3; i++) {
		System.out.println(str.substring(i, i+3));
		if(str.substring(i, i+3).equals("cat")) {
			cats++;
			System.out.println("Cats: "+cats);
		}
		}
	
	
	
	}
} 
