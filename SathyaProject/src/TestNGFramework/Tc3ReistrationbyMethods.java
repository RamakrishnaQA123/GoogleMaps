package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Tc3ReistrationbyMethods {
	
	ToursReusablemethods obj;
	FirefoxDriver driver;
	@Test
	public void task(){
		 obj=new ToursReusablemethods();
		 obj.open();
		 Sleeper.sleepTightInSeconds(3);
		 obj.registerlink();
		 Sleeper.sleepTightInSeconds(3);

		 
		 obj.registerpage("Ramakrishna", "QA", "ramki.trainer@gmail.com","Madhuranagar", "Hyd", "TG", "INDIA", "QA123", "12345", "12345");
		 Sleeper.sleepTightInSeconds(3);

		 String Actual=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		 String Expected="QA123";
		 if(Actual.contains(Expected)){
			 System.out.println("registartion Succ");
		 }
		 else{
			 System.out.println("registration fail");
		 }
		 
	}

}
