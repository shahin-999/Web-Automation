package testcasePackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC0001_login extends BaseDriver {
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void login() throws InterruptedException
	{
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("1234");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkboxTwo\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		Thread.sleep(4000);
	}
}
