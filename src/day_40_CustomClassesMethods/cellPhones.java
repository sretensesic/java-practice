package day_40_CustomClassesMethods;

public class cellPhones {
	String brand; //null
	double screenSize; //0.0
	String color; //null
	double price; //0.0
	
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
	}
		public void call() {
			System.out.println("Calling...");
		
	}
		public void message() {
			System.out.println("Sending a message..");
		}
		        
		    
	}

