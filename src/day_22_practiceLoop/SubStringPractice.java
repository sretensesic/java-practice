package day_22_practiceLoop;

public class SubStringPractice {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0, 2));
	//print each character in separate line
		//substring, no loop needed
		
	System.out.println(word.substring(0,1));
	System.out.println(word.substring(1,2));
	System.out.println(word.substring(2,3));
	System.out.println(word.substring(3,4));

	System.out.println("***********");

	int i = 0;
	System.out.println(word.substring(i , i+1));
	i++;
	System.out.println(word.substring(i , i+1));
	i++;
	System.out.println(word.substring(i , i+1));
	i++;
	System.out.println(word.substring(i , i+1));

	System.out.println("***********");
	System.out.println("***FOR LOOP***");
	//using for loop and substring, print each character
	for(int n = 0; n <= 3; n++) {
	System.out.println(word.substring(n, n+1));
	}

	System.out.println("*****REVERSE*****");
	
	for(int n = 3; n >= 0; n--) {
		System.out.println(word.substring(n, n+1));
		}
	int start = 1;
	int end = 5;  //01234567891011
	String word2 = "UnitedStates";
	System.out.println(word2.substring(start, end));
	System.out.println(word2.substring(2,3));//i
	System.out.println(word2.substring(6,7));//S
	System.out.println(word2.substring(6));//will go all the way

	System.out.println("*********");
	
	String word3 = "apple";
	System.out.println(word3.substring(word.length()-1));
	
	
	
	}
}