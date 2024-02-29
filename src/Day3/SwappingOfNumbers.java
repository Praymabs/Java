package Day3;

public class SwappingOfNumbers {

	public static void main(String[] args) 
	{
		//example -1
		 int x = 1;
		    int y = 2;

		    System.out.println("Before swapping: x = "+x+" y = "+y);
		    // Swap the numbers using addition and subtraction
		    x=x+y; // x is 3
		    y=x-y; // y is 1
		    x=x-y; // x is 2

		    System.out.println("After swapping: x = "+x+" y = "+y);
		    
		    
		  //example -2
		    int p=5, b=4;
		    System.out.println("Before Swapping: P = "+p+" B = "+b);
		    // Swap the numbers using multiplication and division
		    p=p*b; // p is 20
		    b=p/b; // b is 5
		    p=p/b; // p is 4
		    
		    System.out.println("After swapping: P = "+p+" B = "+b);
		
	}

}
