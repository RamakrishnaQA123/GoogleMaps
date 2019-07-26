package Testingpack2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc1VerifyTourslogin {

	public static void main(String[] args) {

		
		//open FF navigate to Newtours
		
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	
		
driver.findElement(By.name("userName")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("login")).click();




		
		
		
		
		
	}

}
