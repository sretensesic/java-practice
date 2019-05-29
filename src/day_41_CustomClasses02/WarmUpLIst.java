package day_41_CustomClasses02;
import java.util.*;
public class WarmUpLIst {
	public static void main(String[] args) {
		ArrayList<Integer> nums1 = new ArrayList<>();
		nums1.add(10);
		nums1.add(34);
		nums1.add(14);
		
		System.out.println(numbers(nums1));
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(18);
		nums2.add(25);
		nums2.add(17);
		
		System.out.println(numbers(nums2));
	}
	
	
	
	public static ArrayList<Integer> numbers(ArrayList<Integer> nums){
		int sum = 0;
		for(int i = 0; i< nums.size(); i++) {
			 nums.set(i, nums.get(i)*2);
		}
		return nums;
	}
}
