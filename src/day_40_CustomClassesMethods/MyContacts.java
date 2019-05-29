package day_40_CustomClassesMethods;

public class MyContacts {
	public static void main(String[] args) {
		//create Contact object
		Contact contact1 = new Contact();
		contact1.name = "Evgenia Jalilova";
		contact1.phoneNumber = "(202) 333-4444";
		contact1.email = "evgenia@yahoo.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
		
		Contact orhan = new Contact();
		orhan.name = " Orhan Sultanov";
		orhan.phoneNumber = "(571) 991-3322";
		orhan.email = "orhan@gmail.com";
		
		System.out.println("Name: "+orhan.name);
		System.out.println("Phone number: "+orhan.phoneNumber);
		System.out.println("Email: "+orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		contact1.call();
		
	}
}
