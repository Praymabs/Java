package Day3;

public class TernaryOperator {

	public static void main(String[] args) 
	{
		//variable = exp ? result: result2;
		
		//example-1
		int a =200, b=100;
		
		int x=(a>b)? a:b;
		System.out.println(x);

		//example-2
		int y=(a<b)? a:b;
		System.out.println(y);
		
		
		// example-3
		int z =(1==1)?100:200;
		System.out.println(z);
		
		// example-4
		int u =(1==2)?100:200;
		System.out.println(u);
		
		// example-5
		int Person_age = 25;
		String result=(Person_age>=18)?"Eligible":"Not Eligiable";
		System.out.println(result);
		
		// example-6
		int Person2_age = 10;
		String result2=(Person2_age>=18)?"Eligible":"Not Eligiable";
		System.out.println(result2);
		
	}

}
