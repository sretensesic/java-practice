package day_40_CustomClassesMethods;
import java.util.*;
public class WarmUpClass {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("mam");
		words.add("tataa");
		words.add("battta");
		words.add("deda");
		words.add("baba");
		words.add("bakica");
		
		String word1 = "bakica";
		System.out.println(countOccurances(words, word1));
	}
	
	public static int countOccurances(ArrayList<String> str , String word) {
		 int count =0;
		 for(int i =0; i < str.size(); i++) {
			 if(str.get(i).contentEquals(word)) {
				 count++;
			 }
		 }
		return count;
	}
/* ArrayList<String> myList = new ArrayList<>();
        myList.add("Moon");
        myList.add("Sun");
        myList.add("Mars");
        myList.add("Saturn");
        myList.add("Venus");
        myList.add("Earth");
        myList.add("Sun");
        myList.add("Pluto");
        myList.add("Mercury");
        myList.add("Neptune");
        myList.add("Sun");
        
        String targetWord = "Sun";
        int count = countOccurences(myList, targetWord);
        if(count == 3) {
            System.out.println("Unit test PASS: Count is 3.");
        }else {
            System.out.println("Unit Test FAIL: Count is " + count);
        }
        
    } 
                                     //[aa, aa, bb, jj, yy]           aa
    public static int countOccurences(ArrayList<String> list, String word) {
        int count = 0;
        for(String str : list) {
            if(str.equals(word)) {
                count++;
            }
        }
        return count; */
}
