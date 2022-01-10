/**
 * 
 */
package Ganeric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Vaibhav Garse
 *
 */
//----------Wait------------------------------------------
public class Action extends BaseTest implements ActionInterface {
	
	WebDriver driver;
	public void implicitlywait(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	
	public void explicitlywait(int time,String title)
	{
		WebDriverWait wb = new WebDriverWait(driver,time);
		wb.until(ExpectedConditions.titleContains(title));

	}
//----------Title------------------------------------------
	
	public String getTitleOfTheWebPage()
	{
		String titleOfTheWebPage = driver.getTitle();
		return titleOfTheWebPage;
	}
	
	public void verifyTheTitleOfTheWebpage(String expectedTitle,String actualTitle,String pageName)
	{
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("The"+pageName+" page title is matching and TEST CASE IS PASSED");
		}
		else
		{
			System.out.println("The"+pageName+" page title is not  matching and TEST CASE IS FAILED");
		}

	}
	
//----------Frame------------------------------------------
	public void switchToFrame(String idOrName)
	{
		driver.switchTo().frame(idOrName);
	}

	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}

	public void selectTheOption(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);

	}

//----------DROPDOWN------------------------------------------
	
	public void selectTheOption(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}


	public void selectTheOption(String value,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);

	}
	
//----------DROPDOWN Print all options ------------------------------------------
	
	public void getOptionOfDropdown(WebElement element)
	{
		Select sel = new Select(element);
		java.util.List<WebElement> ops = sel.getOptions();

		for(WebElement we:ops)
		{
			String dropdownOps = we.getText();
			System.out.println(dropdownOps);
		}



	}
	
	public void implicitWait(WebDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void explicitWait(WebDriver driver, WebElement element, int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void pageLoadTimeOut(WebDriver driver, int timeOut) {
		driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
	}
	

	public String getTitle(WebDriver driver) {
		boolean flag = false;

		String text = driver.getTitle();
		if (flag) {
			System.out.println("Title of the page is: \""+text+"\"");
		}
		return text;
	}
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}

	
	public void click(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}
	public void mouseHoverOnTheElement(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	//This method is used to right click on the WebElement
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
}
