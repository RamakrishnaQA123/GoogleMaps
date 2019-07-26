package Testingpack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CountnoofElements {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in");
		
		
		//count no of links
		List<WebElement>Elements=driver.findElements(By.tagName("a"));
		System.out.println("no of Links are"+"  "+Elements.size());
		
		//count no of Images
		
		Elements=driver.findElements(By.tagName("img"));
		System.out.println("no of images are"+"   "+Elements.size());
		
		//count no of radiobuttons
		Elements=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no of radios are"+"  "+Elements.size());
		
		
		
		
		
		
		
		
	}

}
