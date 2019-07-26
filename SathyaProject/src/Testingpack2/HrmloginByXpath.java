package Testingpack2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HrmloginByXpath {

	public static void main(String[] args) {

		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		
		
		
		
		
	}

}
