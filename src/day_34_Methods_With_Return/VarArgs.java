package day_34_Methods_With_Return;

import java.util.Arrays;

//import javax.print.attribute.IntegerSyntax;

public class VarArgs {
	public static void main(String... args) {
		
		//VARARGS - it can be use only as a method parameter and nowhere else
		// it will be handled like regular array in the method
		// it can accept 0 or more values
		//each input needs to be separated by coma
		
			printWords("red", "blue", "yellow"); // 3 values
			printWords("grey"); // one value
			printWords(); // empty. so array will be empty array. 
			
			System.out.println(sum(3, 5 , 10));
			System.out.println(sum(87564, 545, 879844, 55,33232,54545432,2344,2345,533,1234,523));
			int budget = 200;
			if(sum(10, 45, 110, 30) <= budget) {
				System.out.println("Within budget");
			}else {
				System.out.println("Broke");
			}
			
			int total = sum(234,43,567,12,34);
			System.out.println("total: "+total);
			cook("Buritto Bowl", "Rice", "Beans", "Meat", "Sour Cream");
			cook("Avocado Toast", "Avocado", "Sunny Side Eggs", " Cheese", "Bread" );
			shoppingList("Avocado", "Swatcs watch", "Milk", "Meat", "Tomato");
		}
		
		private static void shoppingList(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		
	}

		public static void printWords(String... words) {
			//handle it like an ARRAY
			for(String w :  words) {
				System.out.println(w);
			}
		}
		/*
		 * sum(10,30,40); ==> 80
		 * sum(30,40); ==> 70
		 */
		public static int sum(int... nums) {
			int sum = 0;
			for(int n : nums) {
				sum += n;//sum = sum + n
			}
			return sum;
		}
		//MORE PARAMS NEXT TO VARAG
		//when we use varags with other params
			//varags types must be last one
			public static void cook(String name, String... ings) {
				System.out.println("Food: "+ name);
				System.out.println(Arrays.toString(ings));
			}
	
	        public static void shoppingList(int totalPrice, String... items) {
	        	System.out.println("Total cost: "+ totalPrice);
	        	System.out.println(Arrays.toString(items));
	}
}
