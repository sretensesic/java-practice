package day_07_ScannerDay2;

public class EnoughPizza {
	
	public static void main(String[] args) {
		//slices in pizza -> 8
		//slices per student -> 2
		
		int pizzaCount = 30;
		int studentsCount = 145;
		boolean isEnoughPizza = (pizzaCount * 8) / studentsCount >= 2;
		isEnoughPizza = pizzaCount * 8 / studentsCount >= 2;
		
		
		
		
		System.out.println("Is Enough Pizza: " + isEnoughPizza); //false
		
		
		
		
		
		
		
	}

}
