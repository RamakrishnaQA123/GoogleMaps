package Testingpack2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testclass {
	
	
	@Test
	public void open(){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
	}

}
