package day_18_downwhile_loops;

public class StairCase {
	public static void main(String[] args) {
		
		
		String stairs = "*";
		System.out.println(stairs);
		 stairs = stairs + "*";
		 
		 // 1.) first way of doing it
		 
		 int num = 1;
		 while(num <= 10) {
			 System.out.println(stairs);
			 stairs += "*";
			 num++;
		 }
		 
		 System.out.println();
		 
		 // 2.) second way of doing it (checking the length)
		 
		stairs = "*";
		while(stairs.length() <= 10){
			System.out.println(stairs);
			stairs += "*";
		}
		
		
	}
}
