package WorkingwithDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Tc1Selectvalue {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
	WebElement Tholiday=driver.findElement(By.id("themes"));
	List<WebElement>values=Tholiday.findElements(By.tagName("option"));
       for(int i=0;i<values.size();i++)	{
    	     
    	String vname=values.get(i).getText();
    	  values.get(i).click();
    	  if(values.get(i).isDisplayed()){
    		  System.out.println(vname+"   "+"Active");
    	  }
    	  else{
    		  System.out.println(vname+"   "+"inActive");

    	  }
    		   
    		   
    	  
       }
	
		
	}

}
