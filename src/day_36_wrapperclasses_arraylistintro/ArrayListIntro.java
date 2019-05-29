package day_36_wrapperclasses_arraylistintro;
import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		//Create an ArrayList
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		//Array<int> nums = new ArrayList<>();    will not work because we can use only Object type
		
		ArrayList<Integer> nums = new ArrayList<>(); //will work
		// assign value into arrayList
		names.add("Roman");
		names.add("Orhan");
		names.add("Natalia");
		names.add("Olimjon");
		names.add("Vlad");
		names.add("Maria");
			
		nums.add(new Integer("100"));
		nums.add(99);
		nums.add(656);
		nums.add(8566);
		
		//read from ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(5));

		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println(nums.get(3));
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
		
	}
}
