package day_18_downwhile_loops;

public class Students {
public static void main(String[] args) {
	int numberOfStudents = 1;
	
	//using a loop, iterate until we have 10 students in the room
	//
	
	while(numberOfStudents <= 10) {
		System.out.println("Student:" +numberOfStudents);
		numberOfStudents++;
		
	}
	System.out.println("No more space");
}
}
