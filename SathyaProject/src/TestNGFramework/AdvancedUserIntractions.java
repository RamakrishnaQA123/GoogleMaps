package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdvancedUserIntractions {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
	       pr=new ProfilesIni();
	       fp=pr.getProfile("OnlineQA");
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
	}
	
	@Test
	public void data(){
		Actions action=new Actions(driver);
	driver.switchTo().frame(0);
	Sleeper.sleepTightInSeconds(3);
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	
	action.dragAndDrop(drop, drop).build().perform();
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
