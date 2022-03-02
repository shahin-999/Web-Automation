package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;


public class Tc0001_login extends BaseDriver{

	String baseUrl = "https://fs1.formsite.com/form_app/FormSite?FormId=LoadLogin&Auto";
	
	@Test
	public void login() throws InterruptedException
	{
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='UserId']")).sendKeys("Rofik");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456789");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
		Thread.sleep(5000);
		
		String errorMessage = driver.findElement(By.xpath("//div[@id='message-error']")).getText();
		
		System.out.print(errorMessage);
		
	}
	
}
