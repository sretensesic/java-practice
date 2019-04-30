package day_30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void main(String[] args) {
		
		showMe5Numbers();
		doPush10Upss();
		doPushUps();
		rangePrint();
	
	}
	
	public static void showMe5Numbers() {
		Random r = new Random();
		for(int i =1; i<= 5; i++) {
			System.out.print(r.nextInt(1001)+" | ");
		}
			System.out.println(); //take it to new line
		
		
		
	}

	public static void doPush10Upss() {
		for(int i = 1; i<= 10; i ++) {
		System.out.println("PushUps: "+i);
		
		}
		
		}	
		public static void doPushUps() {
		
		int pushUps = 1;
	 while(pushUps <=10) {
		 System.out.println("Pushup: "+pushUps);
		 pushUps++;
		}
		System.out.println("Time to rest!");
		
	}

			public static void rangePrint() {
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter number 1:");
				int num1 = scan.nextInt();
				System.out.println("Enter number 2:");
				int num2 = scan.nextInt();
				
				if(num1 < num2) {
					for(int i = num1; i < num2; i++) {
					System.out.print(i+" ");
					}}else if(num1 > num2) {
					for(int j = num2; j < num1; j++) {
						System.out.print(j+" ");
					}
				}else {
					System.out.println(num1);
				}
				
			
			}

}
