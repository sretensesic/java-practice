package day_06_operators2;

public class ShortHandOperators {
	public static void main(String[] args) {
		
		
		int students = 45;
		students = students + 5;
		System.out.println("Students: "+ students);
		
		students = students - 2;
		System.out.println("Students " + students);
		
		int teachers = 10;
		System.out.println("Teachers: " + teachers);
	
		
	 teachers+=2;
	 System.out.println("Teachers: " + teachers);
		
	 teachers-=5;
	 
		System.out.println("Teachers: " + teachers);
		
		int cars = 12;
		System.out.println(cars);
		
		
		  cars*= 2; //Cars value multiply by 2
		 
		  int shoes = 20;
		  shoes /= 4;
		  
		  
		   double price = 45.50;
		   int amount = 5;
		   price += amount;
		   
		   System.out.println(price);
		   
		   int minutes = 60;
		   minutes%= 60;
		   
		   System.out.println("Remaining :" + minutes);
		
		int pennies = 550;
		pennies%= 100;
		System.out.println("Pennies left: " + pennies);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
