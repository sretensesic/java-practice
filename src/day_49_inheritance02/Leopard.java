package day_49_inheritance02;

public class Leopard extends Animal {
	public Leopard() {
		super(); // call super class no-args constructor
		System.out.println("Leopard constructor");
		setType("Leopard");
		
		
	}
	public Leopard(String type) {
		super(type); // call Animal String type constructor
		System.out.println("Leopard one arg constructor");
	}
}
