package day_15_string_manipulation;

public class IndexOf2 {
public static void main(String[] args) {
	
	String list = "html-selenm-angular-jenkins-grid";
	int firstDash = list.indexOf("-");
	System.out.println("first dash:"+firstDash);
	
	
	int secondDash = list.indexOf("-", 5);
	System.out.println("Second dash:"+secondDash);
	
	String word = "java";
	
	int thirdDash = list.indexOf("-", secondDash + 1);
	System.out.println("Third dash:"+ thirdDash);
	
	//find the last dash
	int lastDash = list.lastIndexOf("-");
	System.out.println("Last index:"+lastDash);
	//lastIndexOf can be used when we search for last position of the character /string
	
	
	
	
	
}
}
