package day_40_CustomClassesMethods;

public class bestBuy {
	public static void main(String[] args) {
		// System.out.println(brand);
		// Above line will not work, we need object to use brand
		// Create CellPhone object
		cellPhones cell1 = new cellPhones();
		
		
		System.out.println(cell1.brand); // null
		System.out.println(cell1.screenSize); // 0.0
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;

		System.out.println("Brand: " + cell1.brand);
		System.out.println("screenSize: " + cell1.screenSize);
		System.out.println("color: " + cell1.color);
		System.out.println("price: " + cell1.price);
		
		cell1.color = "Black";
		System.out.println("color: " + cell1.color);
		
		cellPhones cell2 = new cellPhones();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		
		System.out.println("##### CELL 2 VALUES #####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("screenSize: " + cell2.screenSize);
		System.out.println("color: " + cell2.color);
		System.out.println("price: " + cell2.price);
		
		
		System.out.println("#### CALLING METHODS ####");
		cell1.call();
		cell1.message();
		
		
		
		
		
		
		
		

	}
}
