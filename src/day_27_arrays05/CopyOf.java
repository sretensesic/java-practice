package day_27_arrays05;

import java.util.*;
public class CopyOf {
	public static void main(String[] args) {
		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));

		d1[0] = 1000.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));

		//in above example, d1[0] will change value
		//in both d1 and d2[0] because is pointing
		// to the same array
		
		double[] d3 = Arrays.copyOf(d2, d2.length);
		// now d2 and d3 are going to be different
		
		System.out.println("D3:"+Arrays.toString(d3));
	
	// benefits: 1) you can copy values of an array
	// into another without pointing to same object in memory
		      // 2) when you copy into a new array, you can add more indexes into new array
		      // as if resizing an array
	
	
	}
}
