package day_50_inheritance03;

public class Cat extends Animal {
 public void speak() {
	 System.out.println("Cat is saying Meow Meow");
 }
 public void move(int steps) {
	 System.out.println("Cat is moving "+ steps +" steps");
 }
}
