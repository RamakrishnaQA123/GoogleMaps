package TestNGFramework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTC {
	
	@BeforeTest
	public void open(){
		System.out.println("browser open navigate to page");
	}

    @Test(priority=0,enabled=false)
    public void registration(){
    	System.out.println("register for new Account");
    }
   
    @Test(priority=1)
    public void login(){
    	System.out.println("login for next operation");
    }
    @Test(priority=2,enabled=false)
    public void dailyreport(){
    	System.out.println("daily report updates");
    }
    
    @Test(priority=3)
    public void sendreport(){
    	System.out.println("sending reporting TL");
    }
    
    @Test(priority=4)
    public void logout(){
    	System.out.println("logout from application");
    }
    
    @AfterTest
    public void close(){
    	System.out.println("close browser");
    }
    
    
    
    
    
}
