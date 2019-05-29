package day_45_encapsulation_practice;

public class EatsyADotCom {
	public static void main(String[] args) {
		EatsyAccount acct1 = new EatsyAccount();
		System.out.println(acct1.toString());
		acct1.setEmail("pumev@mrmail.info");
		acct1.setFirstName("Pumev");
		acct1.setPassword("bulgaria123");
		
		System.out.println(acct1.toString());
		
		EatsyAccount acct2 = new EatsyAccount();
		acct2.setEmail("pumevmrmail.info");
		acct2.setFirstName("12pumev");
		acct2.setPassword("112233bulgaria");
		
		System.out.println(acct2.toString());

		EatsyAccount acct3 = new EatsyAccount("helireva@royalhost.info", "Helireva", "royal1234");
		System.out.println(acct3.toString());
		
		EatsyAccount acct4 = new EatsyAccount("woodenspoon@gmail.com", "WdSpoon");
		System.out.println(acct4.toString());

	}
}
