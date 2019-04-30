package day_16_stringManipulation;

public class ReplaceThem {
public static void main(String[] args) {
	
	String sentence = "Coding is fun, it is my hobby!!";
    String withNoSpaces = sentence.replace(" ", "");
    
    System.out.println(withNoSpaces);

    System.out.println(sentence);
    //replace, with!!!
    sentence = sentence.replace("," , "!!!");
    System.out.println(sentence);
    
    
    String mixed = "^&*j$%a^v&*&a^";
    mixed = mixed.replace("^&*", "");
    mixed = mixed.replace("$%", "");
    System.out.println(mixed);
    mixed = mixed.replace("^", "").replace("&*&", "").replace("^", ""); //chained way of doing it
    System.out.println(mixed);
    
    
    
    String result = "About 115,000,000 result (0.59 seconds)";
    result = result.replace("About ","");
    result = result.replace("results(0.59)", "");
   result = result.substring(0, result.indexOf(" "));
    
    
    
    System.out.println(result);
    System.out.println("gh");
    
    
}
    }