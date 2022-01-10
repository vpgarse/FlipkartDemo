/**
 * 
 */
package object;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Ganeric.Action;
import Ganeric.BaseTest;
import Ganeric.Flib;
import Ganeric.IAutoConstant;

/**
 * @author Vaibhav Garse
 *
 */
public class LoginPage extends BaseTest {
	Action action=new Action();
	

	@FindBy(xpath = "//a[.='Login' and @class='_1_3w1N']") 
	private WebElement loginbutton1;
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']") 
	private WebElement mobilenotextfield;
	@FindBy(xpath = "//input[@type='password']") 
	private WebElement passwordtextfield;
	@FindBy(xpath = "//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement loginbutton2;


	public LoginPage()
	{
		PageFactory.initElements(driver, this);

	}
	public void Clickonlogin1()
	{
		System.out.println("Login Button is Displayed True/False :"+loginbutton1.isDisplayed());
		loginbutton1.click();
		//action.getTitleOfTheWebPage();
	}
	public void SendCreads() throws IOException
	{
		//Flib flib = new Flib();
		//System.out.println(flib.readPropertyData(PROP_PATH, un));
		mobilenotextfield.sendKeys("9405149425");
		passwordtextfield.sendKeys("05121996");
		
	}
	public void  Clickonlogin2()
	{
		System.out.println(loginbutton2.isEnabled());
		
		loginbutton2.click();
		//action.getTitleOfTheWebPage();
	}


}
