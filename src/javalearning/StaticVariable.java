package javalearning;

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVariable.x =10;
		GlobalVariable g= new GlobalVariable(10,20,30);
		g.m=10;
		g.x=10;
		g.y=8;
		
		g.sum(9, 5);
		System.out.println(g.m +" "+ g.y);
		System.out.println(g.x);
	}

}
