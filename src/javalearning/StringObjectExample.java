package javalearning;

public class StringObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		len1(s1);
		charatthingy(s2);
		
		//System.out.println(len1);
	}
	
	static String s1 = "Hello There";
	
	public static void len1(String s1)
	{
	
	int	t1 = s1.length();
		s1.length();
		
		System.out.println(t1);
	}

	static String s2="$inding out the lenght of this $tring";
	public static void charatthingy(String s2)
	{
		
		char t2 = s2.charAt(0);
		
		System.out.println(t2);
	}

}
