package TestNGFramework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HrmloginTCByTestNG {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
	       pr=new ProfilesIni();
	       fp=pr.getProfile("OnlineQA");
		
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
	public void login(String u,String p){
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(3);
	}
	
    @Test(priority=1)
    public void verifystatus(){
 String Actual=driver.findElement(By.linkText("Welcome Admin")).getText();
    	String Expected="Welcome Admin";
    	
    	assertEquals(Expected, Actual);	
    }
    @Test(priority=2)
    public void logout(){
    	driver.findElement(By.linkText("Welcome Admin")).click();
    	driver.findElement(By.linkText("Logout")).click();
    }
    @AfterTest
    public void close(){
    	driver.close();
    }
}
