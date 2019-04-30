package day_20_forLoop;

public class WeekDays {
	public static void main(String[] args) {
		//FOOR LOOP: 1-7
		//1 - Monday
		//2 - Tuesday
		//...
		
		
		for(int dayNum = 1; dayNum <= 7; dayNum++){
			switch(dayNum) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:	
				System.out.println("Saturday");
				break;
			case 7:	
				System.out.println("Sunday");
				default:
			
			}
		}
		
		
		
		
	}
}
