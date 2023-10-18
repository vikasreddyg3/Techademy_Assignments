package Problem3_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public RemoteWebDriver driver;
	public String browser;
	@Parameters({"browser"})
	@BeforeMethod
	public void preCondition(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
		}
	}
	
	

}
