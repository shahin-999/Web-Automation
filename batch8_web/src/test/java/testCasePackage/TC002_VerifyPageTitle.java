package testCasePackage;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC002_VerifyPageTitle extends BaseDriver {

	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test(priority = 1)
	public void verifyPageTitle_shoudPass() {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		String foundTitleFromWebsite = driver.getTitle();
		System.out.println("The Title of the site is: " + foundTitleFromWebsite);

	}

	@Test(priority = 2)
	public static void isWebsiteSecured() {
		String y = driver.getCurrentUrl();
		if (y.contains("https")) {
			System.out.println("Site is secured");
		} else {
			System.out.println("Site is not secured");
		}
	}

}
