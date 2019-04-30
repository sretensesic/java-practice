package day_16_stringManipulation;

public class GetNumberFromString {
public static void main(String[] args) {
	
	String sentence = "I wrote [236] lines of code today";
	//assign to variable and print the number between [and]
	
	int start = sentence.indexOf('[')+1; //+1 so it starts counting after [
	int end = sentence.indexOf(']');
	
	String codeCount = sentence.substring(start, end);
	System.out.println("Lines of code:"+codeCount);
	
	
	
	
	System.out.println("Lines of code:"+sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));
	//nesting/merging way of doing it. same result
	
	
	
	//check if codeCount is more than 10
	int count = Integer.parseInt(codeCount);  //convert String to int
if(count > 20) {
	System.out.println("Wrote more than 20 lines of code today!!!");
}else {
	System.out.println("Not enogh lines of code");
}



//***********************
//SUBSTRING with one input




}
}
