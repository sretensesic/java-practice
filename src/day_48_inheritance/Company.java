package day_48_inheritance;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Murufjon";
		emp1.jobTitle = "teacher";
		emp1.gender = 'm';
		emp1.age = 22;
		
		Employee emp2 = new Employee();
		emp2.name = "Maria";
		emp2.jobTitle = "HR";
		emp2.gender = 'F';
		emp2.age = 35;
		
		emp1.work();
		emp1.work();
		
		emp1.eat("Chicken casadia");
		emp2.eat("salad");
		
		emp1.walk();
		emp2.walk();
		
		emp1.sleep(5);
		emp2.sleep(8);
	}
}
