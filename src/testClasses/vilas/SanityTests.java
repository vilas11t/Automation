package testClasses.vilas;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.HomePage;

public class SanityTests extends BaseClass {
	
	static WebDriver driver;
	static HomePage homePage;
	
	@BeforeClass
	void beforclass() {
		driver=driverInitialization();
		homePage=new HomePage(driver);
	}
	
	// 1. open rediffmail.com
	//2. verify login link is present
	//Assert-testNG- hard assert and soft assert
	
	@Test
	void loginLinkVerificationOnHomePage() {
		String signInexpectedText="Sign In";
		driver.get("https://www.rediff.com/");
		Assert.assertTrue(homePage.loginPageLink().isDisplayed());	
		String signInactualText=homePage.loginPageLink().getText();
		Assert.assertEquals(signInactualText, signInexpectedText,"Actual value is not matching");
	}
	
	
	

}
