package Problem3_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Make_My_Trip extends BaseClass
{
	/*Launch a below browser in Firefox and verify makemytrip logo is present or not on the Page.

    Implement using Selenium with Web Driver concept https://www.makemytrip.com/
   */
	
	@Test
	public void makeMyTripFireFox() 
	{
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.makemytrip.com/");
		
		
		WebElement makemytriplogo = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		
		if(makemytriplogo.isDisplayed())
		{
			System.out.println("Make my trip logo is present");
		}
		else
		{
			System.out.println("Make my tripp logo is not present");
		}
		
		driver.close();
		
	}
	
	
}
