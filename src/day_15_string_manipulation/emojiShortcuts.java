package day_15_string_manipulation;

import java.util.Scanner;

public class emojiShortcuts {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String emoji = ":)";
	
	if(emoji.length() != 2 ) {
	System.out.println("Invalid emoji");
	return; //stop execution
	}
	
 //if emoji reaches this point it means that emoji has two chars
	
	char first = emoji.charAt(0);
	char second = emoji.charAt(1);
	
	if(first == ':') {
		if(second == ')') {
			System.out.println("smile");
		}
	else if(second == '(')  {
			System.out.println("sad");
	}else if(second == '/') {
		System.out.println("upset");
	}else if(first == 'p') {
		System.out.println("playful");
	}else {
		System.out.println("Invalid Emoji");
	}
	
} else if(first == ';'){
	if (second == ')'){
			System.out.println("wink");
	}else if(second == '/') {
		System.out.println("upset");
	}else if(first == 'p') {
		System.out.println("playful");
	}else {
		System.out.println("Invalid Emoji");
	}
}
}
}

