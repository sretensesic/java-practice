package day_32_methods4;

public class Cooking {
public static void main(String[] args) {
		
		/* add("oil");
		mix(15);
		fry(10);
		boil(8); */
		pancakes();
		pasta();
		cook("Omellete", "Eggs, oil, tomatoes, green papers");
		
	}
	public static void pancakes() {
		add("Milk, eggs, flour, sugar, salt");
		mix(120);
		fry(3);
		System.out.println("Enjoy your pancakes!");
		
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("<>"+dish.toUpperCase()+ " RECIPE <>");
		add(ingredients);
		System.out.println("Cook until is cooked");
		System.out.println("<>"+dish.toUpperCase()+" is ready");
	}
	
	public static void pasta() {
		System.out.println("Italan pasta!");
		add("water, olive oil, salt");
		boil(8);
		add("spagetti pasta");
		boil(10);
		mix(10);
		add("chesse, butter");
		System.out.println("Enjoy your pasta!!!");
	}
	
	public static void add(String ingridiants) {
		System.out.println("Add  "+ ingridiants);
	}
	public static void mix(int second) {
		System.out.println("Mix for "+second);
	}
	public static void fry (int minutes) {
		System.out.println("Fry for "+minutes+" minutes");
	}
	public static void boil(int minutes) {
		System.out.println("Boil for "+minutes+" minutes");
	}
}

