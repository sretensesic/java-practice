package day_50_inheritance03;

public class App {
	private String name;
	public static int count;
	
	public static void build(String language) {
		System.out.println("Building an app using "+language);
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public App(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
