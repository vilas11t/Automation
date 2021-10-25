package testClasses.sandip;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.HomePage;

public class AssignSandip extends BaseClass{
	static WebDriver driver;
	
	static HomePage homepage;

	@BeforeClass 
	void beforeclass() {
		driver=driverInitialization();
		homepage=new HomePage(driver);
	}

@Test
void loginLinkVerificationOnHomePage() {
	String signInexpectedText="Facebook helps you connect and share with the people in your life.";
	driver.get("https://www.facebook.com/");
	Assert.assertTrue(homepage.loginPageLink().isDisplayed());	
	String signInactualText=homepage.loginPageLink().getText();
	Assert.assertEquals(signInactualText, signInexpectedText);
}}
