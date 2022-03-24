package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC001_LocatorLearning extends BaseDriver {
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("inputUsername")).sendKeys("Satabdi");
		driver.findElement(By.name("inputPassword")).sendKeys("parvez");
		

		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//Formula:    tagname.value (if class is given)
		//			  tagname#value (if id is given)

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("newName");
		//tagname[@attribute='value']
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("newEmail");
		
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01670102216");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tanvir");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(2000);
	}
}
