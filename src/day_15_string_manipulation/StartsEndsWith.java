package day_15_string_manipulation;

public class StartsEndsWith {
public static void main(String[] args) {
	
	String word1 = "eclipse";
	//startsWith ==>  test if string starts with another 
	
	System.out.println(word1.startsWith("e")); //true
	System.out.println(word1.startsWith("ec")); //true
	
	System.out.println(word1.startsWith("ecli")); //true
	System.out.println(word1.startsWith("Ec")); //false because of upper case char
	
	System.out.println(word1.endsWith("e")); //true
	System.out.println(word1.endsWith("se")); //true
	
	System.out.println(word1.toUpperCase().endsWith("PSE")); //true
	
	
	
	
	
	//Mr. => ma
	//Mrs. => married woman
	//Ms. => some woman
	//Dr. => doctor man or woman
	// ==> unknown status
	String name = "Mr. Jackson";
	if(name.startsWith("Mr.")) {
		System.out.println("man");
	}else if(name.startsWith("Mrs.")) {
		System.out.println("Married woman");
	}else if(name.startsWith("Ms.")){
			System.out.println("Some woman");
	}else if (name.startsWith("Dr.")) {
		System.out.println("Some doctor");
	}else {
		System.out.println("Unknown");
	}
	
}
}
