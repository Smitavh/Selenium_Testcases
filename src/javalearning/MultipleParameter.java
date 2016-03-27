package javalearning;

public class MultipleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		writeChars("=",4);
		writeChars("*",3);
	}

	public static void writeChars(String string, int number)
	{
		for (int i=1; i<=number;i++)
			System.out.println(string);
		 
	}
	
	
}
