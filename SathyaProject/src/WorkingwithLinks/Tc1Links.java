package WorkingwithLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1Links {

	public static void main(String[] args) {

		//open browser navigate to Google page
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineQA");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		//click on gmail link
	
		driver.findElement(By.linkText("Gmail")).click();
	
		//Verify Title 
		String Actual=driver.getTitle();
		String Expected="Gmail";
		System.out.println(Actual);
		
		if(Actual.contains(Expected)){
			System.out.println("TC Pass");
		}
		else{
			System.out.println("TC fail");
		}
		
		driver.close();
		
	}

}
