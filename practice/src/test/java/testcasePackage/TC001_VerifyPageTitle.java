package testcasePackage;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC001_VerifyPageTitle extends BaseDriver{
	String baseUrl = "http://automationpractice.com/index.php";
	
	@Test(priority = 1)
	public void checkPageTitle()
	{
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		
		String pageTitle = driver.getTitle();
		System.out.println("Current page title is '" + pageTitle + "'");
		
		if(pageTitle == "My Store"){
			System.out.println("Page title matched");
		}else {
			System.out.println("Page title not matched");
		}
		
	}
	
	@Test(priority = 2)
	public void checkPageSecureOrNot()
	{
		String url = driver.getCurrentUrl();
		if(url.contains("https")) {
			System.out.println("Page is secure");
		}else {
			System.out.println("Page is not secure");
		}
	}
}
