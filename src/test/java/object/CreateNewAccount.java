/**
 * 
 */
package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ganeric.Action;
import Ganeric.BaseTest;

/**
 * @author Vaibhav Garse
 *
 */
public class CreateNewAccount extends BaseTest {

WebDriver driver;
	
@FindBy(xpath = "") private WebElement searchbox;
@FindBy(xpath = "']") private WebElement searchbutton;
public CreateNewAccount(WebDriver driver) 
{
	PageFactory.initElements(driver, this);	
}

	
}
