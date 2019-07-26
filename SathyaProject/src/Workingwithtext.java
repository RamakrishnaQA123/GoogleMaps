import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Workingwithtext {

	public static void main(String[] args) {

		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
	WebElement text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"))	;
	
	String Actual=text.getTagName();
	
	if(Actual.equals("b")){
		System.out.println("bold text");
	}
	else{
		System.out.println("normal text");
	}
	
		
		
		
		
		
		

}
}