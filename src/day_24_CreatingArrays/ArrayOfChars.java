package day_24_CreatingArrays;

public class ArrayOfChars {
	public static void main(String[] args) {
		char[] values = {'a', 'b', 'c'};
		for(char value: values) {
			System.out.println(value);
		}
	
		
		String str = "Wooden spoon";
		//this method toCharArray() converts string 
		//into array of characters
		char[]chars = str.toCharArray();
		for(char c:chars) {
			System.out.print(c);
		}
			System.out.println();
		str = "";
			for (int i = chars.length-1; i>=0; i--) {
		str+= chars[i];
			}	
		System.out.println(str);
		//TASK
		//print characters with help of array of characters
		//one by one
		//if characters are equals to 'o' replace with '*'
		for(char c: chars) {
			if(c == '0') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}
		}
	
	}
}
