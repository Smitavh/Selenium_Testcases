package javalearning;

public class ArrayExercise {

	public static void main(String[] args) {
		
		int[] smita = {10,22,333,45};
		int[] smita1 = new int[4];
		int n=333;
		
		for (int i=0 ; i <3 ; i++)
		{
			smita1[i] = i;
			System.out.println(smita1[i]);
		}
		for(int i=0;i<smita.length;i++){
			
			if(smita[i]==n){
				
				n=i;
			}
		}
		System.out.println(n);
		System.out.println(lastIndexOf(45, smita));

		
	}
	

	public static int lastIndexOf( int n, int [] smita )
	{
	
		int index=0;
		for(int i=0;i<4;i++){
			if(smita[i]==n){
				
				index=smita[i];
			}
			
		}
		return index;
	}

		
	}

