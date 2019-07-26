package Workingwithradios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1radiostC1 {
	

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in");
		
		
List<WebElement>radios=driver.findElements(By.xpath("//input[@type='radio']"));
		
	for(int i=0;i<radios.size();i++){
		String name=radios.get(i).getAttribute("name");
		if(radios.get(i).isSelected()){
			System.out.println(name+"   "+"Active");
		}
		else{
			System.out.println(name+"   "+"inActive");

		}
		
	}
	
	
		
		
		
		
		
		
		
		
	}

}
