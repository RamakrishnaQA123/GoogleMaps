package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Tc1ByReusableMethods {
	
	HrmloginTCByTestNG obj;
	FirefoxDriver driver;
	@Test
	public void Tc1login(){
		
		obj=new HrmloginTCByTestNG();
		obj.open();
		obj.login("Admin","admin123");
		obj.verifystatus();

		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("menu_pim_addEmployee")).click();	
	  driver.findElement(By.id("firstName")).sendKeys("QAUser");
	  driver.findElement(By.id("middleName")).sendKeys("Tester");
	  driver.findElement(By.id("lastName")).sendKeys("Quality");
	  driver.findElement(By.id("employeeId")).sendKeys("0036");	
	  driver.findElement(By.id("btnSave")).click();  
		Sleeper.sleepTightInSeconds(3);
	String Actual=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
	String Expected="QAUser";
	if(Actual.contains("Expected")){
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}
		obj.logout();
		obj.close();
	}

}
