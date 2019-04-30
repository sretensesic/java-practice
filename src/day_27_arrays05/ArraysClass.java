package day_27_arrays05;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		int[]nums = {43, 12, 4, 1, 3, 5};
	//toString method
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
	//toString method exist in each every class
	//it is used to describe values in formated String
	
	//Sort method. sorts array in ascending order
	//System.out.println(Arrays.sort(nums)); will not compaile
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

	String[] languages = {"Zulu", "Spanish", "Italian", "English", "Russian", "Buryatian", "Serbian" };
	System.out.println(Arrays.toString(languages));
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));

	//numbers will appear first, upper case next, and lowwer case Strings last
	
	int[]nums2 = {345, 182, 7784, 541, 357, 55};
	//find lowest and largest values from nums2 array
	
	//System.out.println(Arrays.toString(nums2));
	Arrays.sort(nums2);
	int lowest = nums2[0];
	int largest = nums2[nums2.length -1];
	System.out.println("Lowest num: "+lowest);
	System.out.println("Largest num: "+largest);
	
	}
}
