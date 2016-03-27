package javalearning;

public class Drawfigures3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drawDiamond();
		drawX();
		drawRocket();
		
	}

public static void drawDiamond()
{
	drawCone();
	drawV();
	
	}

public static void drawCone()
{
	System.out.println("   /\\ ");
	System.out.println("   /\\ ");
	System.out.println("   /\\ ");
	
	
}
public static void drawV()
{
	System.out.println("   \\/ ");
	System.out.println("   \\/ ");
	System.out.println("   \\/ ");
	
	
}

public static void drawX()
{ 

	drawV();
	drawCone();
	
}

public static void drawRocket()
{
	drawCone();
	drawbox1();
	System.out.println("INDIA");
	drawbox1();
	drawCone();
	
	}

public static void drawbox1() { // static method(procedural style not object oriented styled method
	// TODO Auto-generated method stub
	System.out.println("+-----+");
	System.out.println("|     |");
	System.out.println("|     |");
	System.out.println("+-----+"); // executing this static method is called method call, which will be done by the main method
	
}
}