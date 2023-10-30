package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class Flipkart_HomePage extends ProjectSpecificMethod
{
	
	public Flipkart_HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//close the POP UP Login window
	public Flipkart_HomePage closePopUpWindow()
	{
		driver.findElement(By.xpath("//div[@class=\"JFPqaw\"]/span")).click();
		return this;
	}
	
	//Verify the logo present in Home page or not
	public Flipkart_HomePage verifyFlikartLogo()
	{
		WebElement flipkartLogo = driver.findElement(By.xpath("(//a[@class='YLCOuy _3-rS5G']/img)[1]"));
		if(flipkartLogo.isDisplayed())
		{
			System.out.println("Flipkart Logo is present");
		}
		else
		{
			System.out.println("Flipkart logo is not present");
		}
		return this;
	}
	
	public SearchResultsPage serachForTheProduct()
	{
		WebElement inputFieldToSearchIteams = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		inputFieldToSearchIteams.sendKeys("“Macbook air m2");
		inputFieldToSearchIteams.sendKeys(Keys.ENTER);
		return new SearchResultsPage(driver);
	}

}
