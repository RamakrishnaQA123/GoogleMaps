package WorkingwithLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tc4CountfromHeaderpart {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.bing.com/");
		
      List<WebElement>links=driver.findElements(By.tagName("a"));
      
      for(int i=0;i<links.size();i++){
    	  if(links.get(i).isDisplayed()){
    		  String lname=links.get(i).getText();
    		links.get(i).click();
    		Sleeper.sleepTightInSeconds(3);
    		String url=driver.getCurrentUrl();
    	System.out.println(lname+"   "+url);	
    		  
    	driver.navigate().back();	  
    	links=driver.findElements(By.tagName("a"));
    		  
    		  
    	  }
      }
      
		
		
		
		
	}

}
