package Testingpack2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc2VerifyHrmlogin {

	public static void main(String[] args) {

		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
