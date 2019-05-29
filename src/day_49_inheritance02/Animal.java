package day_49_inheritance02;

public class Animal {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Animal(){
		System.out.println("Animal Constructor");
		type = "undifened";
	}
	public Animal(String type){
		System.out.println("Leopard 1 constructor");
		this.type = type;
	}
}
