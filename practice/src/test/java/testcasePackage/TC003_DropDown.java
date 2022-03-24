package testcasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC003_DropDown extends BaseDriver{
	String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test(priority = 2)
	public void dropDown() throws InterruptedException
	{
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement dropDownName = driver.findElement(By.id("cars"));
		Select s = new Select(dropDownName);
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(2)).click(s.getOptions().get(0)).keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.xpath("/html/body/form/input")).click();
		
		driver.switchTo().defaultContent();
	}
	
	@Test(priority = 1)
	public void hoverDropDown() throws InterruptedException
	{
		driver.navigate().to("https://www.sliderrevolution.com/");
		
		Actions a = new Actions(driver);
		
		WebElement hoverOption = driver.findElement(By.xpath("//li[@id='menu-item-26']//a[normalize-space()='Features']"));
		WebElement hoverSubOption = driver.findElement(By.xpath("//li[@id='menu-item-9241']//a[@href='#'][normalize-space()='Modules']"));
		
		a.moveToElement(hoverOption);
		a.moveToElement(hoverSubOption);
		a.click().build().perform();
		driver.findElement(By.xpath("//li[@id='menu-item-9769']//a[normalize-space()='Websites']")).click();
		Thread.sleep(5000);
	}
}
