package day_30_methods02;

public class EtsySearch {
	public static void main(String[] args) {
		navigateToEatsy();
		searchForWoodenSpoon();
		printResult();
	}
	public static void navigateToEatsy() {
		System.out.println("Open your browser");
		System.out.println("Navigate to Eatsy");
		
	}
	public static void searchForWoodenSpoon(){
		System.out.println("Type 'WoodenSpoon' into search fiels");
		System.out.println("Click on search button");
	}
	public static void printResult() {
		System.out.println("wooden spoon "+"(142,000 results)");
	}
}
