package testCasePackageAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO_001_checkboxAndRadio;

public class TC003_checkBoxAndRadioButton_POM_TestCase extends BaseDriver{

	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	// Selection of Radio button and Check box in Frames:
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		PO_001_checkboxAndRadio radioClass= new PO_001_checkboxAndRadio(driver);
		
		// Switch to Frame
		driver.switchTo().frame(0);
		
		// click radio button with method
		radioClass.clickRadioButtonLondon();
		Thread.sleep(5000);
		
		// click 5star checkbox with method
		radioClass.clickFiveStar();
		Thread.sleep(5000);
		
		// Back to page
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}
}
