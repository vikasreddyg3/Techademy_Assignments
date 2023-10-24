package Problem3_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Make_My_Trip_FromAndTo extends BaseClass{

	 
	@Test
	public void makeMyTripFromAndToSelect() throws InterruptedException {
		
		//ChromeDriver driver =new ChromeDriver();
		//driver.get("https://www.makemytrip.com/");
		//close the pop up window
		driver.findElement(By.xpath("//div[@class='imageSlideContainer']/section/span")).click();
		
		//click on the flights
		driver.findElement(By.xpath("(//span[@class='headerIconWrapper']/span)[1]")).click();
		Thread.sleep(5000);
		//click on the one way radio button
		WebElement oneWayRadioButton = driver.findElement(By.xpath("((//div[@class='makeFlex hrtlCenter'])[2]/ul/li)[1]"));
		if(oneWayRadioButton.isSelected())
		{
			//System.out.println("One way radio button is selected by default");
			oneWayRadioButton.click();
		}
		else
		{
			System.out.println("One way radio button is selected by default");
			//driver.findElement(By.xpath("((//div[@class='makeFlex hrtlCenter'])[2]/ul/li)[2]")).click();
		}
		Thread.sleep(5000);
		//Click on From
		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		from.click();
		//Enter the From place
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderbad");
		Thread.sleep(2000);
		//Click on the "Rajiv Gandhi International Airport"
		driver.findElement(By.xpath("//p[text()='Rajiv Gandhi International Airport']")).click();
		
		//click on To
		driver.findElement(By.xpath("//span[text()='To']")).click();
		//Enter the To place
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		//Click on the "Bengaluru International Airport"
		driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();
		driver.close();
	}

}
