/**
 * 
 */
package test_scenario;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Ganeric.Action;
import Ganeric.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.AddtoCartPage;
import object.HomePage;
import object.LoginPage;

/**
 * @author Vaibhav Garse
 *
 */
public class EndtoEndTest extends BaseTest{
	WebDriver driver;
	HomePage homepage;
	AddtoCartPage addtocartpage;

//	@BeforeTest
//	public void Setup() throws IOException
//	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
		

	@Test
	public void TestHomePage() throws Throwable
	{
		homepage=new HomePage();
		
		System.out.println("Popup Tittle :-- "+homepage.GetpopupTittle());
		System.out.println("The Popup Page is Displayed On Not TRUE/False :--"+homepage.ValidatePopup());
		homepage.clickonpopup();
		Reporter.log("------------------Popup Succesfully Closed---------------- ", true);
		Thread.sleep(2000);
		addtocartpage=new AddtoCartPage();
		System.out.println("Home Page Title :--"+addtocartpage.homepageTittle());
		addtocartpage.searchProd();
		Reporter.log("------------------Product Succesfully Searched---------------- ", true);
		Thread.sleep(3000);
		addtocartpage.clickonprod();
		Reporter.log("------------------Specific Product succesfully Selected---------------- ", true);
		addtocartpage.addtocartprocess();
		
		
	}

}
