package javalearning;

public class Drawbox {

	public static void main(String[] args) { 
		// It is a common convention to put main method as first or last method in the class

		
		System.out.println("+-----+");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("+-----+");
		System.out.println();
		System.out.println("+-----+");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("+-----+");
		drawbox1();
		drawbox1();
		
	}

	public static void drawbox1() { // static method(procedural style not object oriented styled method
		// TODO Auto-generated method stub
		System.out.println("+-----+");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("+-----+"); // executing this static method is called method call, which will be done by the main method
		drawbox1(); // A static method has called itslef so this goes into infinite loop causing stackoverflow error
	}

}
