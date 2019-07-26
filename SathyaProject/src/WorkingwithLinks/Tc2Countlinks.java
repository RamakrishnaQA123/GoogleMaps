package WorkingwithLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc2Countlinks {

	public static void main(String[] args) {

		//open browser navigate to ICICIbank
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.icicibank.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are"+"   "+links.size());
		
		
		
	}

}
