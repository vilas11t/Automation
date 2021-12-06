package testClasses.swapnil;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.CheckMozelloWebsite;
import pomClasses.HomePage;

public class MozelloTest extends BaseClass {
	static WebDriver driver;
	static CheckMozelloWebsite homePage;
	
	@BeforeClass
	void beforclass() {
		driver=driverInitialization();
		homePage=new CheckMozelloWebsite(driver);
	}
	@Test
	void loginLinkVerificationOnHomePage() {
		String signInexpectedText="Sign up";
		driver.get("https://www.mozello.com/");
		Assert.assertTrue( homePage.loginLinkOne().isDisplayed());	
		String signInactualText=homePage.loginLinkOne().getText();
		Assert.assertEquals(signInactualText, signInexpectedText,"Actual value is not matching");
	}
	
	
	

	

}
