package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Flipkart_HomePage;

public class RunFlipKart extends ProjectSpecificMethod
{
	@Test
	public void runTestCaseFlipkart() throws InterruptedException
	{
		Flipkart_HomePage flip=new Flipkart_HomePage(driver);
		flip.closePopUpWindow()
		.verifyFlikartLogo()
		.serachForTheProduct()
		.clickOnTheFirstResult()
		.enterPinCode()
		.clickOnPINCheck()
		.clickOnGoToCart()
		.verifyTheProductisAddedTOCartORNot();
	}
}

