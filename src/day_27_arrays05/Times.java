package day_27_arrays05;

import java.util.Scanner;

public class Times {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] time1 = new int[2]; //0 by default
		int [] time2 = new int[2]; //0 by default
		
		//System.out.println(time1[0]); // o by default
		
		time1[0] = 10;
		time1[1] = 15;
		time2[0] = 16;
	    time2[1] = 10;
	//before comparing, check if both arrays have 
	    //valid hour/minute
      if(time1[0] < 0 || time1[1] >23) {
    	  System.out.println("Time1 has invalid hour");
    	  return;
      }
      if(time1[1] < 0 || time1[1] >59) {
    	  System.out.println("Time1 has invalid minutes");
    	  return;
      }
      if(time2[0] < 0 || time2[1] >23) {
    	  System.out.println("Time2 has invalid hour");
    	  return;
      }
      if(time2[1] < 0 || time2[1] >59) {
    	  System.out.println("Time2 has invalid minutes");
    	  return;
      }
	
	//compare Arrays and tell which one is earlier
      //compare hours
      if(time1[0] < time2[0]) {
    	  System.out.println("Time1 is earllier");
      }else  if(time2[0] < time1[0]) {
    	  System.out.println("Time2 is earllier");
      }else {//hours are equal, check minutes
    	  if(time1[1] < time2[1]) {
        	  System.out.println("Time1 is earllier");
      }else  if(time2[1] < time1[2]) {
    	  System.out.println("Time2 is earllier");
      }else {
    	  System.out.println("Same time");
      }
	}
}}
