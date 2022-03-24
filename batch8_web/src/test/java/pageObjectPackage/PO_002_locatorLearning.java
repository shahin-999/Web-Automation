package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_002_locatorLearning {

	WebDriver driver=null;
	
	public PO_002_locatorLearning(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	By userNameField=By.id("inputUsername");
	
	public void sendUserName(String name) 
	{
		driver.findElement(userNameField).sendKeys(name);
	}
	
	
}
