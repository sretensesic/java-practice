package day_27_arrays05;

public class Tools {
	public static void main(String[] args) {
		/*Java --> programming language
Selenium --> Test Automation
TestNG --> Unit Tests
JUnit --> Unit Tests
JUnit --> Unit Tests
Cucumber --> BDD Style testing
Git --> Version control
Maven --> Building and execution for project
*/
String[] tools = {"Java","Selenium","TestNG",
		     "JUnit","Cucumber","Git","Maven"};

	for(String tool : tools) {
		switch(tool.toLowerCase()) {
		case "java":
			System.out.println("Java --> programming language");
		break;
		case "selenium":
			System.out.println("Selenium --> Test Automation");
		break;
		case "testNG":
			System.out.println("TestNG --> Unit Tests");
		break;
		case "testing":
		case "junit":
			System.out.println(tool+"JUnit --> Unit Tests");
		break;
		case "cucumber":
			System.out.println("Cucumber --> BDD Style testing");
		break;
		case "git":
			System.out.println("Git --> Version control");
		break;
		case "maven":
		System.out.println("Maven --> Building and execution for project");	
		break;
		default:
			System.out.println("Unknown tool");
		
		}
	}
		

	
	
	
	
	}
}
