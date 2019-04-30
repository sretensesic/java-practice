package day_31_methods3;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		countUp(5);  //num = 5;
		countUp(10); //num = 10;
		//countUp("hi!"); will not work
		countUp(10);
		countUp(0);
		countUp(-5);
		countDown(3);
		int n = 5;
		countDown(n); //num = n
		countDown(0); 
		countDown(-3);
	
		Scanner scane = new Scanner(System.in);
		System.out.println("Enter num to counterUp");
		int inputNum = scane.nextInt();
		countUp(inputNum);
	}
	
	/*
	 name: countUp
	 return type: void
	 param/Input: int
	 it prints from 1 to the value of the param
	 countUp(5);
	 1 2 3 4 5
	 */
	public static void countUp(int num) {
		if(num < 1) {
			System.out.println("Invalid input - " + num);
		}else {
			for(int i = 1; i <= num; i++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
	
	/*
	 name countDown
     return type: void
     param: int
     it prints from param value till 1
     countDown(5);
     5 4 3 2 1
	 */
	public static void countDown(int num) {
		if(num < 1) {
			System.out.println("Invalid input");
		}else {
			for(int n = num; n >= 1; n--) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
