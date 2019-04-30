package day_33_Methods_With_Return;

public class AgeCalculator {
	public static void main(String[] args) {
		int age= calculateAge(1994);
		System.out.println("Youre are "+age+" year old" );
		int age2 = calculateAge(1975);
		System.out.println("Youre are "+age2+" year old");
	}
	
	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		if(age < 0) {
			
			return 0;
		}else if(age >= 0 && age <=14) {
			System.out.println("Child");
		}else if(age >14 && age < 26) {
			System.out.println("Youngster");
		}else if(age >= 26 && age <+64) {
			System.out.println("Adult");
		}else if(age >=64) {
			System.out.println("Senior");
		}
		return age;
	}
}
