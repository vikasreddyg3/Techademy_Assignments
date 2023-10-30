package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class AfterAddToCartPage extends ProjectSpecificMethod
{
	public AfterAddToCartPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyTheProductisAddedTOCartORNot()
	{
		String viewCartURl=driver.getCurrentUrl();
		if(viewCartURl.contains("viewcart"))
		{
			System.out.println("Product added to the card sucessuflly");
		}
		else
		{
			System.out.println("Produt not added to the card");
		}
	}
}
