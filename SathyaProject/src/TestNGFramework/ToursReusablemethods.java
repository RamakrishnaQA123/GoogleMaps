package TestNGFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ToursReusablemethods {


	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void registerlink(){
driver.findElement(By.linkText("REGISTER")).click();
	}	
	
@Test(priority=1)
public void registerpage(String f,String l,String e,String add1,
		String ct,String st,String c,String usr,String psw,String cp) {
driver.findElement(By.name("firstName")).sendKeys(f);	
driver.findElement(By.name("lastName")).sendKeys(l);
driver.findElement(By.id("userName")).sendKeys(e);
driver.findElement(By.name("address1")).sendKeys(add1);
driver.findElement(By.name("city")).sendKeys(ct);
driver.findElement(By.name("state")).sendKeys(st);
driver.findElement(By.name("country")).sendKeys(c);
driver.findElement(By.id("email")).sendKeys(usr);
driver.findElement(By.name("password")).sendKeys(psw);
driver.findElement(By.name("confirmPassword")).sendKeys(cp);
driver.findElement(By.name("register")).click();
}
@AfterTest
public void close(){
	driver.close();
}


	
}
