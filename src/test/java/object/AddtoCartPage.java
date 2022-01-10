package object;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Ganeric.Action;
import Ganeric.BaseTest;

public class AddtoCartPage extends BaseTest {
	
	Action action=new Action();
	
	@FindBy(xpath="//div[.='REDMI 9i Sport (Metallic Blue, 64 GB)' and @class='_4rR01T']") 
	 WebElement mobileREDMI9i;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocard;
	@FindBy(xpath = "//input[@name='q']")
	WebElement searchproductbox;

	@FindBy(xpath = "//button[@type='submit' and  @class='L0Z3Pu']") 
	WebElement searchbutton;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']") 
	WebElement addtocartbutton;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL' and .='Place Order']") WebElement placeorder;
	
	public AddtoCartPage() 
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	    public String homepageTittle() {
		String HomePageTittle = driver.getTitle();
		return HomePageTittle;
		}

		public void searchProd() throws IOException
		{
			
			
			searchproductbox.sendKeys("Mobile");
//			action.getOptionOfDropdown(searchproductbox);
			searchbutton.click();
			
		}
		public void clickonprod()
		{
			System.out.println(mobileREDMI9i.getText());
			mobileREDMI9i.click();
			
		}
		public void addtocartprocess()
		{
			String parenthandle = driver.getWindowHandle();
		     Set<String> allhandles = driver.getWindowHandles();
		      for (String handle : allhandles) 
		      {
		    	if (parenthandle.equals(handle)) 
		    	{
		    		
					
				} 
		    	else 
		    	{
				driver.switchTo().window(handle);
					
				
			System.out.println(addtocartbutton.getText());
			System.out.println(driver.getTitle());
			addtocartbutton.click();
			Reporter.log("------------------Specific Product succesfully Added To Cart---------------- ", true);
				//System.out.println( "Added Product in Cart is Displyaed True/False" + mobileREDMI9i.isDisplayed());
			Reporter.log("------------------Specific Product succesfully Placed Order---------------- ", true);
			placeorder.click();
			
		    	}
		}
		      
	
		}
		
}
