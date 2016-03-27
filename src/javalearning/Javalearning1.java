package javalearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

public class Javalearning1 {  // class header
	
		public static void main(String[] args) { // Main method header
		
			WebDriver driver = new FirefoxDriver();	 // these are called statements
			// driver.get("https://www.google.com.au/?gws_rd=ssl");
			// driver.close();
			System.out.println("Smita's first program");
			System.out.println(" a \\\\ slash or a //// slash?");
			whitespaces(3); // here 10 is a actual parameter or argument
			
		// TODO Auto-generated method stub

	}

		 public static void whitespaces(int number)  // Here Int number is a formal parameter or argument, argument or parameter are synonyms
		 {
			 
			 for (int i =1; i<=number; i++)
			 System.out.println("2");
		 }
}
