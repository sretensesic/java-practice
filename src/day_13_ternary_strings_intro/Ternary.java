package day_13_ternary_strings_intro;

public class Ternary {
	public static void main(String[] args) {
		
		String result;
		int score = 88;
		
		if(score > 60) {
			result = "pass";
		}else {
			result = "fail";
		}
		
		System.out.println("Result is "+result);
		
		result = score > 60 ? "pass" : "fail";
;		
		System.out.println("Result is "+ result);
		
	}

}
