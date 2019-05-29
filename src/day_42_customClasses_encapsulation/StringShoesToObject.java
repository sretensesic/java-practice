package day_42_customClasses_encapsulation;
import java.util.*;
public class StringShoesToObject {
	public static void main(String[] args) {
		String data = "Bruno Magli,9.5";
		//split using comma and store in an array
		String[] arrData = data.split(",");
		Shoes shoes = new Shoes();
		shoes.brand = arrData[0];
	//	shoes.size = Double.parseDouble(arrData[1]);					   it will work
	//	shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));    as same as bellow
		System.out.println(shoes.getShoesData());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		//create object using data form
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
		
		
		
		
		
		}
}
