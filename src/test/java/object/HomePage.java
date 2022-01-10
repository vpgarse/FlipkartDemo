/**
 * 
 */
package object;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ganeric.Action;
import Ganeric.BaseTest;
import Ganeric.Flib;
import Ganeric.IAutoConstant;

/**
 * @author Vaibhav Garse
 *
 */
public class HomePage extends BaseTest {
	Action action=new Action();

@FindBy(xpath = "//button[.='✕']") 
WebElement popup;  



public HomePage()
{
	PageFactory.initElements(driver, this);
	
}
public boolean ValidatePopup() {
	
	return popup.isDisplayed();
	
}
public String GetpopupTittle()
{
	String popuptittle = popup.getText();
	return popuptittle;
}

public void clickonpopup()
{
	popup.click();
}

}
	

	

