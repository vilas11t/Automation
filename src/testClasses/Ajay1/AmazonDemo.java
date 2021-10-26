package testClasses.Ajay1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.AmazonHomePage;
import pomClasses.HomePage;

public class AmazonDemo extends BaseClass{
	static WebDriver driver;
	static AmazonHomePage amazonhomepage;
	
	@BeforeClass
	void beforclass() {
		driver=driverInitialization();
		amazonhomepage=new AmazonHomePage(driver);
	}
	
	@Test
	void loginLinkVerificationOnHomePage() {
		String signInexpectedText="Hello, Sign in";
		driver.get("https://www.amazon.com/");
		Assert.assertTrue(amazonhomepage.loginPageLink1().isDisplayed());	
		String signInactualText=amazonhomepage.loginPageLink1().getText();
		Assert.assertEquals(signInactualText, signInexpectedText,"Actual value is not matching");
	}
}
