package day_36_wrapperclasses_arraylistintro;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// declare ArrayLIst called languages
		ArrayList<String> languages = new ArrayList<>(); 
		// add values
		languages.add("Java");
		languages.add("English");
		languages.add("Arabic");
		languages.add("Arabic");
		languages.add("Spanish");
		languages.add("Russian");
		languages.add("Azarbaijani");
		languages.add("Ukrainian");
		
		System.out.println("Number of languages: "+ languages.size());
		languages.add("Serbian");
		System.out.println("Number of languages: "+ languages.size());
		
		// remove java
		languages.remove(0);
		System.out.println("Number of languages: "+ languages.size());

		System.out.println(languages.toString());
		
	}
}
