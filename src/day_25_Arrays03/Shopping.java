package day_25_Arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Timberland shoes","H&M","Swatch Watch","Gucci Bag","Addidas"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		//print count of products
		System.out.println("Product count: "+products.length);
		//check if product, prices and item itemID have the same count
		if(products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong with this list");
		}
		//loop trough product and print each one by one in separate line
		for(String p : products) {
			System.out.println(p);
		}
		//prices --> for loop
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		 //itemsId print this in reverse order
		for(int i = itemsId.length-1; i >= 0; i--) { 
			System.out.println(itemsId[i]);
		
		// print a report with a total price
		// item1; 12345 - Timberland Shoes - $125.0
		//....
		// Total price	
		System.out.println("##########################");
		double totalPrice = 0;
		for( int b = 0; b < products.length; b++ ) {
			System.out.println("Item "+(b+1)+": "+ itemsId[b]+" - "+products[b]+ " -$ "+prices[b]);
		
		totalPrice += prices[b];
		}
		System.out.println("Total price: $"+totalPrice);
		//print the most expensive item in your list and print it as a report
		//loop and find. do not use arrays class
		System.out.println("#########################");
		//120.0, 5.99, 150.50, 3000.5, 6.99
		int maxIndex = 0;
		double maxPrice =0;
		 for(int c = 0; c < prices.length; c++) {
			 if (prices[c] > maxPrice) {
				 maxPrice = prices[c];
				 maxIndex = c;
			 }
		 }
		System.out.println(itemsId[maxIndex]+" - "+products[maxIndex]+" -$"+maxPrice);
		}
		
	}
}
