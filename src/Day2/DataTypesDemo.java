package Day2;

public class DataTypesDemo {

	public static void main(String[] args) 
	{
		//Numerical data types
		int a = 100, b =200;
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		
		System.out.println("The sum of a and b is: "+(a+b));
		
		byte by = 125;
		System.out.println(by);
		
		short sh = 3535;
		System.out.println(sh);
		
		long l = 212131123123L;
		System.out.println(l);
		
		
		//Decimal Number -  float, double
		
		float item_price=15.5F;
		System.out.println(item_price);
		
		Double dbl=1234.4343412;
		System.out.println(dbl);
		
		char grade = 'A';
		System.out.println(grade);
		
		String name="jhon";
		System.out.println(name);
		
		/* invalid 
		 * char ch='ABC';
		 * string ch='ABC';
		 * string ch='A';
		 * string ch="A";
		 */
		
		boolean bl=false;
		System.out.println(bl);
		
		// boolean bl="true";  invalid
		//boolean bl="false";  invalid
		
		String ai="true";
		System.out.println(ai);
		
	}

}
