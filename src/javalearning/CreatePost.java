package javalearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatePost {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver(); 
		driver.get("http://pageobjectpattern.wordpress.com/wp-admin");
		driver.findElement(By.id("user_login"));
		WebElement Username = driver.findElement(By.id("user_login"));
		Username.sendKeys("smitaj.hodiggeri@gmail.com");
		WebElement Password = driver.findElement(By.name("pwd"));
		Password.sendKeys("Fedora5940");
		Password.submit();
		//driver.findElement(By.name("wp-submit")).click();
		

	}

}
