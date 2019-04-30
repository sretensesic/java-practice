package day_08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		
		int i = (int)3.4;
	
		System.out.println("i: "+ i); //uses only a value of  the whole number
		
		double price = 230.50;
		int dollars = (int)price;
		
		System.out.println("dollars: "+dollars);
		
		
		//whole numbers.byte, short, int
		
		int count = 44;
		byte byteCount = (byte)count;
		
		System.out.println("ByteCount: "+byteCount);
		
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		
		System.out.println("Int value: "+intValue);
		
		int large = 5678;
		short small = (short) large;
		System.out.println("Small: "+small);
		
		int result = (int)(500.4/2.0);
		System.out.println("Result: "+result);
		
		
		byte b =123;
		int t = b; //will automatically cast it. it goes automatically from smaller to larger
		
		
		
		//implicit casting => automatically casting smaller into larger
		
		//explicit casting => is used when converting from larger to smaller type
		
		
		
	}

}
