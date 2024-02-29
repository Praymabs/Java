package Day3;

public class DecrementOperator {

	public static void main(String[] args) 
	{
		/*
		// case 1
		int a=10;
		a--;
		System.out.println(a); //9
		*/
		
		/*
		//case 2, its post decrement
		int a=100;
		
		int pb=a--;
		System.err.println(pb);  //100
		System.out.println(a);  //99
		*/
		
		
		//case 3, its pre decrement
		int a=100;
				
		int pb=--a;
		System.out.println(pb);  //99
		System.out.println(a);  //99
		
	}

}
