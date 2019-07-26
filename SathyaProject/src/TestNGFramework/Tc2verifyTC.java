package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc2verifyTC {
	
	ToursReusablemethods obj1;
	FirefoxDriver driver;
	
	@Test
	public void task(){
	obj1=new ToursReusablemethods();
	
	obj1.open();
	
	String Atagn=driver.findElement(By.linkText("REGISTER")).getTagName();
	System.out.println(Atagn);
	/*String Etagn="a";
	if(Atagn.contains(Etagn)){
		obj1.registerlink();
		String Atitle=driver.getTitle();
		String Etitle="Register";
		if(Atitle.contains(Etitle)){
			System.out.println("Final TC Pass");
		}
		else{
			System.out.println("TC Fail");
		}
	}
	else{
		System.out.println("Tc fail");
	}
	}*/

}
}
