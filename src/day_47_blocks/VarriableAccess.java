package day_47_blocks;

public class VarriableAccess {
	//instance variable
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVarriable = 55;
	
	public static void main(String[] args) {
		//cannot access non static from static method
		//System.out.println(myInstanceVariable);
		System.out.println(myStaticVarriable);
		//create object of VariableAccess and print myInstanceVariable
		VarriableAccess v  = new VarriableAccess();
		System.out.println(v.myInstanceVar);
		//access static variable using object
		System.out.println(v.myStaticVarriable);
		//access static variable using object
		System.out.println(VarriableAccess.myStaticVarriable);
		
	}
	
}
