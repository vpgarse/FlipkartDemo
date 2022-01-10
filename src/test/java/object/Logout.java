/**
 * 
 */
package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ganeric.Action;
import Ganeric.BaseTest;

/**
 * @author Vaibhav Garse
 *
 */
public class Logout extends BaseTest {
	
	Action action=new Action();
	@FindBy(xpath = "//div[@class='exehdJ' and .='Vaibhav ' ]") 
	private String mousehour;
	@FindBy(xpath="//a[@href='#']") private WebElement logoutbtn;
	public Logout() 
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	public void mousehour()
	{
		WebElement target = driver.findElement(By.xpath("//div[@class='exehdJ' and .='Vaibhav ' ]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(target).perform();		
	}
	
	public void Loggedout()
	{
		logoutbtn.click();

	}

}
