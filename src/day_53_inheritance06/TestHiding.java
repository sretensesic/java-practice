package day_53_inheritance06;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(345, "London");
		Capital cap = new Capital(433, "Paris", 536748392L);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
	}
}
