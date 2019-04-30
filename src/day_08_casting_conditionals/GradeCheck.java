package day_08_casting_conditionals;

import java.util.Scanner;

public class GradeCheck {
	
	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
	
		char A,B,C,D;
		
        System.out.println("What is your grade?");
		char grade = scan.next().charAt(0);
		
		if (grade == 'A') {
			System.out.println("Excelent job. Keep it up!");
		}else {
			System.out.println("How many points did you miss for 'A'?");
			int point = scan.nextInt();
			System.out.println("You could earn "+point+" if you studied more");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
