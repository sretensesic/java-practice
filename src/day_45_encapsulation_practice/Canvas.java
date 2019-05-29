package day_45_encapsulation_practice;
import java.util.*;
public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programing");
		
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");

		course1.setTeachers(javaTeachers);
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Burak");
		javaStudents.add("Roman");
        javaStudents.add("Murad");
        javaStudents.add("Vlad");
        
        course1.setStudents(javaStudents);
        System.out.println(javaStudents.toString());
        
        course1.addTeacher("Luis");
        course1.addStudent("Kate");
        
        if(course1.getTeachers().contains("Maria")) {
        	System.out.println("Maria is a teacher");
        }else {
        	System.out.println("Maria is not a teacher");
        }
        
        if(course1.getStudents().contains("Kate")) {
        	System.out.println("Kate is a student");
        }else {
        	System.out.println("Kate is not a student");
        }
        
        course1.removeTeacher("Murodil");
        course1.removeStudent("Vlad");
        
        if(!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is removed successfully");
		}else {
			System.out.println("Murodil is still a teacher");
		}
		
		if(!course1.getStudents().contains("Vlad")) {
			System.out.println("Vlad is removed successfully");
		}else {
			System.out.println("Vlad is still a student");
		}
	}
}
