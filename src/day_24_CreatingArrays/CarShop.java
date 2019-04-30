package day_24_CreatingArrays;

public class CarShop {
	public static void main(String[] args) {
		String[] cars = {"Bmw", "Lada", "Mercedes", "Tesla"};	
	for(String c: cars) {
		if(c.toLowerCase().contains("r")) {
        System.out.println(c);
    }else {
        continue;
    }
	}
	}
}
	