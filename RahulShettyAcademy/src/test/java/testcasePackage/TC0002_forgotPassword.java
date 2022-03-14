package testcasePackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC0002_forgotPassword extends BaseDriver{
	
	String url = "https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void forgotPassword() throws InterruptedException
	{
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("Rabby");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("123445");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();
		Thread.sleep(2000);
		
		String s = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/p")).getText();
		String tempPass = s.substring(s.indexOf("'")+1, s.indexOf("' "));
		System.out.println(tempPass);
		
	}

}
