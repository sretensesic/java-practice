package day_26_Array04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {
	public static void main(String[] args) {
		String[] PopularNames = {"James","Mary",
								"John","Patricia",
								"Robert","Jennifer",
								"Michael","Linda",
								"William","Elizabeth",
								"David","Barbara",
								"Richard","Susan",
								"Joseph","Jessica",
								"Thomas","Sarah",
								"Charles","Margaret",
								"Christopher","Karen",
								"Daniel","Nancy",
								"Matthew","Lisa",
								"Anthony","Betty",
								"Donald","Dorothy",
								"Mark","Sandra",
								"Paul","Ashley",
								"Steven","Kimberly",
								"Andrew","Donna",
								"Kenneth","Emily",
								"George","Carol",
								"Joshua","Michelle",
								"Kevin","Amanda",
								"Brian","Melissa",
								"Edward","Deborah",
								"Ronald","Stephanie",
								"Timothy","Rebecca",
								"Jason","Laura",
								"Jeffrey","Helen",
								"Ryan","Sharon",
								"Jacob","Cynthia",
								"Gary","Kathleen",
								"Nicholas","Amy",
								"Eric","Shirley",
								"Stephen","Angela",
								"Jonathan","Anna",
								"Larry","Ruth",
								"Justin","Brenda",
								"Scott","Pamela",
								"Brandon","Nicole",
								"Frank","Katherine",
								"Benjamin","Samantha",
								"Gregory","Christine",
								"Raymond","Catherine",
								"Samuel","Virginia",
								"Patrick","Debra",
								"Alexander","Rachel",
								"Jack","Janet",
								"Dennis","Emma",
								"Jerry","Carolyn",
								"Tyler","Maria",
								"Aaron","Heather",
								"Henry","Diane",
								"Jose","Julie",
								"Douglas","Joyce",
								"Peter","Evelyn",
								"Adam","Joan",
								"Nathan","Victoria",
								"Zachary","Kelly",
								"Walter","Christina",
								"Kyle","Lauren",
								"Harold","Frances",
								"Carl","Martha",
								"Jeremy","Judith",
								"Gerald","Cheryl",
								"Keith","Megan",
								"Roger","Andrea",
								"Arthur","Olivia",
								"Terry","Ann",
								"Lawrence","Jean",
								"Sean","Alice",
								"Christian","Jacqueline",
								"Ethan","Hannah",
								"Austin","Doris",
								"Joe","Kathryn",
								"Albert","Gloria",
								"Jesse","Teresa",
								"Willie","Sara",
								"Billy","Janice",
								"Bryan","Marie",
								"Bruce","Julia",
								"Noah","Grace",
								"Jordan","Judy",
								"Dylan","Theresa",
								"Ralph","Madison",
								"Roy","Beverly",
								"Alan","Denise",
								"Wayne","Marilyn",
								"Eugene","Amber",
								"Juan","Danielle",
								"Gabriel","Rose",
								"Louis","Brittany",
								"Russell","Diana",
								"Randy","Abigail",
								"Vincent","Natalie",
								"Philip","Jane",
								"Logan","Lori",
								"Bobby","Alexis",
								"Harry","Tiffany",
								"Johnny","Kayla"};
			//Print total number of names	
		System.out.println("Total names: "+PopularNames.length);
			//to print all in one line
		System.out.println(Arrays.toString(PopularNames));
		
		System.out.println("*************************************");
		//TASK:  Print in column format
		//  2 names in one line
		for(int i =0; i < PopularNames.length; i+=2){
			System.out.println(PopularNames[i]+", "+PopularNames[i+1]);
		}
			/* 
			  int i = 0;
			  int b = 1;
			 
			  while(i < PopularNames.lenghth){
			  b++;
			  System.out.println(PopularaNames[0]+", "+PopularNames[1]);
			
			
			*/
			
			//Print male names in single line separated by comma
			System.out.println("************************************");
			System.out.println("Male names");
			for(int m = 0; m < PopularNames.length; m+=2) {
				System.out.print(PopularNames[m]+", ");
			}
			System.out.println("***************************************");
				
			//print female names in single line separated by comma
				System.out.println("Female names");
			for(int idx =0; idx < PopularNames.length; idx++) {
				if(idx%2 !=0) {
					System.out.print(PopularNames[idx]+", ");
				}else { System.out.print(PopularNames[idx]+", "); 
				}
			}
			
			System.out.println("******************************************");
			
			//Print one random name from this array
			//Use random class
			
			Random random = new Random();
			int r = random.nextInt(PopularNames.length);
			System.out.println("Random name: "+PopularNames[r]);
			System.out.println("************************************************");
			//Print all names that are up to 4 characters in Upper Case, in same line
			for(String name:PopularNames) {
				if(name.length()<=4) {
					System.out.print(name.toUpperCase()+", ");
				}
			}
			System.out.println("NAMES LENGTH SORT");
			
			String namesUpTo4 = "";
			String names5to6 = "";
			String names7orMore = "";
			
			for(String name:PopularNames) {
				if(name.length()<=4) {
					namesUpTo4 += name+", ";
				}else if((name.length()==5) || (name.length()==6)) {
					names5to6 += name+", ";
				}else if(name.length()>=7) {
					names7orMore += name+", ";
				}
			}
			
			System.out.println("Name up to 4: "+namesUpTo4);
			System.out.println("Name 5 to 6: "+names5to6);
			System.out.println("Name 7 and more: "+names7orMore);
			
			System.out.println("**********************************");
			//SWAP seats
			System.out.print("\n"+Arrays.toString(PopularNames));
			//code here
			for(int i =0; i < PopularNames.length; i+=2){
				String temp = PopularNames[i];
				PopularNames[i] = PopularNames[i+1];
				PopularNames[i+1]= temp;
			}
				System.out.print("\n"+Arrays.toString(PopularNames));
			
			
			
			 
			
		
		
	}
}