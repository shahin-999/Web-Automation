package testcasePackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverPackage.BaseDriver;

public class TC0001_createAccount extends BaseDriver{

	String baseUrl = "https://www.bdshop.com/customer/account/create/";
	
	@Test
	public void signup() throws InterruptedException
	{
		//Data
		String fName = "Md";
		String lName = "Kuddus";
		String email = "abc@gmail.com";
		String password = "123456789";
		String mobile = "01928773211";
		//XPath
		String fNameXpath = "//*[@id=\"firstname\"]";
		String lNameXpath = "//*[@id=\"lastname\"]";
		String emailXpath = "//*[@id=\"email_address\"]";
		String passwordXpath = "//*[@id=\"password\"]";
		String confirmPasswordXpath = "//*[@id=\"password-confirmation\"]";
		String mobileXpath = "//*[@id=\"mobilenumber\"]";
		String btnXpath = "//*[@id=\"form-validate\"]/div/div[1]/button";
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		driver.findElement(By.xpath(fNameXpath)).sendKeys(fName);
		Thread.sleep(500);
		driver.findElement(By.xpath(lNameXpath)).sendKeys(lName);
		Thread.sleep(500);
		driver.findElement(By.xpath(emailXpath)).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.xpath(passwordXpath)).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath(confirmPasswordXpath)).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath(mobileXpath)).sendKeys(mobile);
		Thread.sleep(500);
		driver.findElement(By.xpath(btnXpath)).click();
		Thread.sleep(3000);
		
		
	}
	
}
