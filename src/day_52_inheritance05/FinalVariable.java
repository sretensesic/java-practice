package day_52_inheritance05;

public class FinalVariable {
	
	public final int ROADSTER_MAX_RANGE = 610; // first option for signing value
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public final String JAN = "January";
	
	public FinalVariable(){
		//MODEL_3_MAX_SPEED = max;
		 MODEL_3_MAX_SPEED = 180;// second option with constructor
		}
	
	{
		MODEL_X_PASSENGERS = 7; // third option with "init" block
	}
	
	public static void main(String[] args) {
		final int MAX_PASSENGER_COUNT = 5;
		//MAX_PASSENGER_COUNT = 10;  will not work because final is already assigned
		final double PI = 3.141424353627181838;
		//PI =  4.138736352;
		System.out.println(MAX_PASSENGER_COUNT);
		
		final int SSN;
		SSN = 314597883;
		//SSN++ not possible
		FinalVariable finalVars = new FinalVariable();
		
		System.out.println("Max range for roadster: "+ finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: "+ finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model X passengers: "+finalVars.MODEL_X_PASSENGERS);
	}
}
