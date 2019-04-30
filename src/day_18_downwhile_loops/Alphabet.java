package day_18_downwhile_loops;

public class Alphabet {
	public static void main(String[] args) throws InterruptedException {
		char letter = 'a';
		
	while(letter <= 'z') {
		System.out.print(letter +" "); 
		
		letter++;
		Thread.sleep(10);
	}
	System.out.println();
	
	char capitals = 'A';
	while(capitals <= 'Z') {
		System.out.print(capitals+" ");
		capitals++;
		Thread.sleep(10);
	}
	
	System.out.println();
	 char lower = 'z';
	while(lower >= 'a') {
		System.out.print(lower+" ");
		lower--;
		Thread.sleep(10);
	}
		System.out.println();
	
	String letters = "";
	System.out.println();
	
	letters = letters + 'A';
	System.out.println(letters);
	
     letters = letters + 'B';
	System.out.println(letters);
	
	letters = letters + 'C';
	System.out.println(letters);
	
	System.out.println();
	
	String let = "";
	char l = 'A';
	 while(l <= 'Z') {
		 System.out.println(let);
		 let = let + l;
		 l++;
	 }
	
	
	
	}
}
