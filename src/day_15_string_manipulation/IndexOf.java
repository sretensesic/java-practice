package day_15_string_manipulation;

public class IndexOf {
public static void main(String[] args) {
	
	String word1 = "github";
	System.out.println(word1.indexOf('g')); //   "g" would work the same way =>  pos. 0
	System.out.println(word1.indexOf("th")); //  => postion 2
	System.out.println(word1.indexOf("hub")); // position 3

String url = "www.okta.com";
int index = url.indexOf(".");
System.out.println("Pos of . :"+ index);
System.out.println(url.charAt(index+1)); // it will go to 'o'



String title = "Java - Google search";
// find position of '-' and check if space is on right and left sides


int dash = title.indexOf('-'); // position 5
System.out.println(title.charAt(dash - 1)); //  " "
System.out.println(title.charAt(dash + 1)); // " "

String country = "United States of Amderica";
int states = country.indexOf("States");
System.out.println("Position of States:"+ states);

String word2 = "java, c++, python, tomcat, eclipse";
if(word2.contains("c++")) {
	System.out.println("c++ is there");
}else {
	System.out.println("c++ is not there");
}

//when string/char found 
//when string/char NOT found

if(word2.indexOf("c++") > -1) {
System.out.println("c++ is there");
}

}
}
