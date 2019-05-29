package day_50_inheritance03;

public class TestAnimals {
	public static void main(String[] args) {
		Animal an =  new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(12);
		cat.move(244);
		dog.move(56);
		duck.move(78);

	}
}
