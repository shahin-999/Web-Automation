package testcasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC002_CheckboxAndRedioButton extends BaseDriver{
	String baseUrl = "https://jqueryui.com/checkboxradio/";
	
	@Test
	public void clickOPtions() throws InterruptedException
	{
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
	
		
		WebElement parisButton = driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[2]"));
		WebElement fiveStar = driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[4]"));
		WebElement oneQueen = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]"));
		WebElement oneKing = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[4]"));
		
		parisButton.click();
		fiveStar.click();
		oneQueen.click();
		oneKing.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
	}
}
