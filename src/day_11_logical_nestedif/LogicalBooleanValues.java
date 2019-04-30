package day_11_logical_nestedif;

public class LogicalBooleanValues {
public static void main(String[] args) {
	
	
	boolean b1 = 50 > 10 && 10 < 100; //true
	System.out.println("B1: "+b1);

	boolean b2 = 'a'=='a' && 123 > 120; //true
	System.out.println("B2: "+b2);
	
    boolean b3 = true && 10>= 10 && 1000 <=900; //false
	System.out.println("B3: "+b3);
	
	boolean b4 = false && false && 10==10; //false
	System.out.println("B4: "+b4);
	
	boolean b5 = false || true && 10==10; //true
	System.out.println("B5: "+b5);
	
	boolean b6 = false && true || 10 == 10; //true
	System.out.println("B6: "+b6);
	
	boolean b7 = true && (true || 10!=10); //true
    System.out.println("B7: "+b7);
	
    boolean b8 = false && (true || 10 == 10); //false
    System.out.println("B8: "+b8);
	
    
    /* Presedence of Logical operators
    
    - && and || in same condition, && will be eveluated first
    - || will come after that
    
    
    
    */

boolean topicdone = true;
boolean isMoreThan3pm = true;
boolean everyThingIsClear = true || false;
boolean letsGoForABreak = topicdone && isMoreThan3pm && everyThingIsClear;
System.out.println("letsGoForABreak: "+ letsGoForABreak);


boolean b10 = 10 < 5 && 5 == 5; /* this example, sincefirts condition is false is not even gonna check the other 
one and it will be false.
 when we use && (double), it will not check the second condition
*/
}
}
