package day_30_methods02;

public class StudentAtSchool {
	
	public static void main(String[] args) {
		study("Selenium"); //inside () we are assigning value to the String Topic that is declared
		study("SQL");				// below in "study" method
	
		sleep(10);
	}
	
	
	public static void study(String topic) {
		System.out.println("Student is studying "+topic);
	}
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+ hours+" hours");
	}
}
