/**
 * 
 */
package test_scenario;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import object.HomePage;
import object.LoginPage;

/**
 * @author Vaibhav Garse
 *
 */
public class LoginTest {
	
	WebDriver driver;
	HomePage homepage;
	@Test
	public void Login() throws InterruptedException, IOException
	{
		
		
		homepage=new HomePage();
		homepage.clickonpopup();
		Reporter.log("------------------Popup Succesfully Closed---------------- ", true);
		LoginPage loginpage = new LoginPage();
		loginpage.Clickonlogin1();
		Thread.sleep(2000);
		loginpage.SendCreads();
		Thread.sleep(2000);
		loginpage.Clickonlogin2();
		Reporter.log("------------------Succesfully Logged In ---------------- ", true);
	}

}
