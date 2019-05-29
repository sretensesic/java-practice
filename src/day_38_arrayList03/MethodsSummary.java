package day_38_arrayList03;
import java.util.*;
public class MethodsSummary {
	public static void main(String[] args) {
		List<String> list1 =  new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("black");
		list1.add("grey");
		//add method with index: "yellow will be placed to to index 0"
		list1.add(0, "yelllow");
		//toString method to print all values in the same line
		System.out.println(list1.toString());
		//size method . return number of values
		System.out.println("Number of elements: "+list1.size());
		//get method return value from index
		System.out.println("3: "+list1.get(3));
		System.out.println("0: "+list1.get(0));
		//remove using index number . removes value from index position
		list1.remove(0); //removes yellow
		System.out.println(list1.toString());
		//remove using value/element. removes element first occurrence
		list1.remove("blue");
		System.out.println(list1.toString());
		//set(index, value) replace certain index with new value
		list1.set(0, "orange"); //red will be replaced with orange
		System.out.println(list1.toString());
		//indexOf(value). returns index of value in the list
		System.out.println("grey: "+list1.indexOf("grey"));
		System.out.println("green: "+list1.indexOf("green")); // will show -1 because is not there
		//isEmpty returns true if list is empty. size ==0
		System.out.println("is list Empty? - "+list1.isEmpty());
		System.out.println("is list Empty? - "+(list1.size() == 0));
		//CONTAINS(element) ==> returns true if value is present
		System.out.println("white in list? - "+list1.contains("white"));
		
		List<String> list2 = new ArrayList<>();
		//ADD ALL method --> adds all values from one list to another
		list2.addAll(list1);
		System.out.println("list2: "+list2.toString());
		//CONTAINS ALL. check if list has all values of another list
		System.out.println("containsAll: "+list1.containsAll(list2));
		//EQUALS(list) check if 2 lists are exactly the same
		System.out.println("equals: "+list1.equals(list2));
		
		list2.add("pink");
		//REMOVEALL(list). removes att matching values from your list that are in other list
		list2.removeAll(list1);
		System.out.println("list2 after removeAll: "+list2);
		System.out.println("list1: "+list1);
		
		//ADDALL(index, list) adds a new list values starting from given index
		list2.addAll(0, list1);
		System.out.println("list2 after list2.addAll(0,list):"+list2);
		
		list1.clear();
		list2.clear();
		System.out.println(list1);
		System.out.println(list2);
	}
}
