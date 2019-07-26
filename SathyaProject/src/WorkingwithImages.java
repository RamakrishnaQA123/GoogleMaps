import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class WorkingwithImages {

	public static void main(String[] args) {

		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
	
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(" no of images are"+"   "+images.size());
		
		for(int i=0;i<images.size();i++){
			System.out.println(images.get(i).getAttribute("src"));
		}
		
		
	}

}
