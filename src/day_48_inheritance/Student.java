package day_48_inheritance;

public class Student extends Person {
	int studentID;
	String clazz;
	
	public void code(String lang) {
		System.out.println(name+" is coding "+lang);
	}
	public void attendClass() {
		System.out.println(name+" attending "+clazz+" class");
	}
}
