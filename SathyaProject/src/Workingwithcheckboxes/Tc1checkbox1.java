package Workingwithcheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tc1checkbox1 {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.spicejet.com/");
		
WebElement Student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
Student.click();
Sleeper.sleepTightInSeconds(5);

if(Student.isSelected()){
	System.out.println("working succ");
}
else{
	System.out.println("working fail");
}

		
		
		
		
		
		
	}

}
