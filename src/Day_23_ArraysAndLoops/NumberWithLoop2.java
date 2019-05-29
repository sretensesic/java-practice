package day_23_ArraysAndLoops;

public class NumberWithLoop2 {
	public static void main(String[] args) {
		//outer loop
		for(int c = 1; c<=10;c++) {
			//inner loop
			for(int b = 1; b <=c;b++) {
			System.out.print(b);
			}
			System.out.println();
		}
	}
}
