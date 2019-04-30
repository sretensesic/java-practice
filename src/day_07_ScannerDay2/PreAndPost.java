package day_07_ScannerDay2;

public class PreAndPost {
	
	public static void main(String[] args) {
		
		int num =0;
		int num2 = num++;
		
		System.out.println("num: "+num);
		System.out.println("num2: "+num2);
		
		
		int n =1;
		int n2= ++n;
		 
		System.out.println("n: "+n);
		System.out.println("n2: "+n2);
		 
		int bananas = 6;
				int pears = bananas++;
				int apples = ++bananas;
				
				System.out.println("bananas: "+ bananas);
				
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);
		
		int friends = 10;
		System.out.println(friends++);
		
		 
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("baterries: "+ batteries);
		System.out.println("oldBatteries: "+ oldBatteries);
		System.out.println("totalBatteries: " + totalBatteries);
		
		
	
		
	}

}
