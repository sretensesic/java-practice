package day_27_arrays05;
import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {4,6,7,10,55};
		
		System.out.println(Arrays.binarySearch(nums, 7));
		System.out.println(Arrays.binarySearch(nums, 55));
		System.out.println(Arrays.binarySearch(nums, 5));

		int i = Arrays.binarySearch(nums, 10);
		System.out.println(i);
	
	
		int[] nums2 = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(nums2, 40));

	//in order for Binary search to work, it needs to be Sorted first
	//Arrays.sort(a, fromIndex. toIndex, c); comparator
		
	
	}
}
