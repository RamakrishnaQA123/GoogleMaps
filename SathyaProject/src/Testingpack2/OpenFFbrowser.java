package Testingpack2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class OpenFFbrowser {

	public static void main(String[] args) {

	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("onlineQA");
		
FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("http://google.com");
		
		
		
	}

}
