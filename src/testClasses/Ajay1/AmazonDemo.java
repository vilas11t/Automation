package testClasses.Ajay1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.HomePage;

public class AmazonDemo extends BaseClass{
	static WebDriver driver;
	static HomePage homePage;
	
	@BeforeClass
	void beforclass() {
		driver=driverInitialization();
		homePage=new HomePage(driver);
	}
	
	@Test
	void loginLinkVerificationOnHomePage() {
		String signInexpectedText="Hello, in";
		driver.get("https://www.amazon.com/");
		Assert.assertTrue(homePage.loginPageLink1().isDisplayed());	
		String signInactualText=homePage.loginPageLink1().getText();
		Assert.assertEquals(signInactualText, signInexpectedText,"Actual value is not matching");
	}
}
