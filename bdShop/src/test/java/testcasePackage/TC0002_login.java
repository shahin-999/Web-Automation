package testcasePackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC0002_login extends BaseDriver{

	String loginUrl = "https://www.bdshop.com/customer/account/login/";

	@Test
	public void login() throws InterruptedException
	{
		driver.get(loginUrl);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aaas@yahoo.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kasjdTT12");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(5000);
	}
	
}
