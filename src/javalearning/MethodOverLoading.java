package javalearning;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double root =Math.sqrt(5);
		//System.out.println("So the square root is " + root);
		
	//	int sum1= Math.abs(2);
		//System.out.println("So the absolute value is " + sum1);
		
		int add1= sum(3);
		System.out.println("So the absolute value is " + add1);	
	}

	
	public static double sqrt(double n)
	{
		return n;
		
	}
	
	public static int abs(int n)
	{
		return(n*1/2);
	}
	
	public static int sum(int n)
	{
		return(n+1);
	}
}
