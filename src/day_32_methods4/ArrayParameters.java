package day_32_methods4;

import java.util.Arrays;

public class ArrayParameters {
public static void main(String[] args) {
		
		int[] myArray = {44,22,66,11};
		printArray(myArray);
		printArray(new int[] {33,45,5,7});
		int[] myNums = new int[] {3,4,5,6,7,8,9,34,44,55,66};
		printArray(myNums);
		
		int[] one = {10,21,45,67};
		int[] two = {12,34,56,77,88,99};
		print2Arrays(one, two);
		
		print2ArraysV2(one, two);
	}
	
	
	public static void printArray(int[] nums) {
		for(int n : nums) {
			System.out.println(n+" ");
		}
	}
		public static void print2Arrays(int[] nums, int[]nums2) {
			for(int i = 0; i < nums.length; i++) {
				for(int j = 0; j < nums2.length; j++) {

			if(nums.length > nums2.length) {
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums2));
			}else {
				System.out.println(Arrays.toString(nums2));
				System.out.println(Arrays.toString(nums));
			}
			}
}
}
		public static void print2ArraysV2(int[] nums, int[]nums2) {
			for(int i = 0; i < nums.length; i++) {
				for(int j = 0; j < nums2.length; j++) {

			if(nums.length > nums2.length) {
				printArray(nums);
				printArray(nums2);
			}else {
				printArray(nums2);
				printArray(nums);
			}
			}
}
		}
}
