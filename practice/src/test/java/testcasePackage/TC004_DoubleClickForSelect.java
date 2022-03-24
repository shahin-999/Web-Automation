package testcasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC004_DoubleClickForSelect extends BaseDriver{
	@Test
	public void selectText() throws InterruptedException
	{
		driver.navigate().to("https://www.sliderrevolution.com/one-page-websites-that-could-win-awards/");		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement selectingText = driver.findElement(By.xpath("//*[@id=\"post-9736\"]/div/div[6]/p/span/i"));
		a.doubleClick(selectingText);
		a.contextClick(selectingText);
		a.build().perform();
		
		Thread.sleep(3000);
	}
}
