/**
 * 
 */
package Ganeric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Vaibhav Garse
 *
 */
public interface ActionInterface {
	
	public void implicitlywait(long time);
	public void explicitlywait(int time,String title);
	public String getTitleOfTheWebPage();
	public void verifyTheTitleOfTheWebpage(String expectedTitle,String actualTitle,String pageName);
	public void switchToFrame(String idOrName);
	public void switchToFrame(int index);
	public void switchToFrame(WebElement element);
	public void selectTheOption(WebElement element,int index);
	public void selectTheOption(WebElement element,String text);
	public void selectTheOption(String value,WebElement element);
	public void getOptionOfDropdown(WebElement element);
	public void implicitWait(WebDriver driver, int timeOut);
	public void explicitWait(WebDriver driver, WebElement element, int timeOut );
	public void pageLoadTimeOut(WebDriver driver, int timeOut);
	public String getTitle(WebDriver driver);
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);
	public void click(WebDriver driver, WebElement ele);

}
