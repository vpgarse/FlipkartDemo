/**
 * 
 */
package test_scenario;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Ganeric.BaseTest;
import object.HomePage;
import object.LoginPage;
import object.Logout;

/**
 * @author Vaibhav Garse
 *
 */
public class LogoutTest extends BaseTest {
	
	HomePage homepage;
	LoginPage loginpage;
	Logout logout;
	@Test
	public void logout() throws IOException, InterruptedException {
	homepage=new HomePage();
	homepage.clickonpopup();
	Reporter.log("------------------Popup Succesfully Closed---------------- ", true);
	loginpage = new LoginPage();
	loginpage.Clickonlogin1();
	Thread.sleep(2000);
	loginpage.SendCreads();
	Thread.sleep(2000);
	loginpage.Clickonlogin2();
	Reporter.log("------------------Login Successfully Done---------------- ", true);
	logout = new Logout();
	logout.mousehour();
	Thread.sleep(1000);
	logout.Loggedout();
	Reporter.log("------------------End To End Logout Test Succesfully Pass---------------- ", true);
	
	
	
	}

}
