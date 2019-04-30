package day_12_switch_ternary;

public class SwitchScore {
	
	public static void main(String[] args) {
		
	 int score = 3;
		
		switch(score) {
		case 1:
			System.out.println("Score is1");
			break;  //exit switch statement
		case 2:
			System.out.println("Score is 2");
			break;
		case 3:
			System.out.println("score is 3");
			break;
		default:                                //if no matching score it will print out this statement
			System.out.println("Invalid score");
		}
		
		
		
		/*with Switch statement we can only test if a variable equals certain values
		
		switch(variable){
		case value1:
		//CODEA;
		 break;
		 case value2:
		 //CODEB;
		  break;
		...
		*** We need break; statement. otherwise it will keep going ***
		
		
		*/
	}
	
	

}
