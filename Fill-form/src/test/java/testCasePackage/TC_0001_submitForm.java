package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC_0001_submitForm extends BaseDriver{

	String baseUrl = "https://forms.gle/sm4PfmRqTiX9XHhP6";
	
	@Test
	public void fillForm() throws InterruptedException
	{
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String name = "Sakib";
		String email = "abc2@gmail.com";
		String phone = "12343456";
		String coverLetter = "Hello Hello Hello";
		
		String nameXpath = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"; 
		String emailXpath = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input";
		String phoneXpath = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input"; 
		String coverLetterXpath = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/textarea";
		String btnXpath = "//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span";
		
		driver.findElement(By.xpath(nameXpath)).sendKeys(name);
		Thread.sleep(500);
		
		driver.findElement(By.xpath(emailXpath)).sendKeys(email);
		Thread.sleep(500);
		
		driver.findElement(By.xpath(phoneXpath)).sendKeys(phone);
		Thread.sleep(500);
		
		driver.findElement(By.xpath(coverLetterXpath)).sendKeys(coverLetter);
		Thread.sleep(500);		
		
		driver.findElement(By.xpath(btnXpath)).click();
		Thread.sleep(5000);
	}
	
}
