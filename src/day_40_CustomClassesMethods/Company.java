package day_40_CustomClassesMethods;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Kate";
		emp1.jobTitle = "Developer";
		emp1.salary = 115000.0;
		
		emp1.introduce();
		emp1.work();
		emp1.attendMeeting();
		
	}
}
