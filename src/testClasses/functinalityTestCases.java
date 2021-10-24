package testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.HomePage;

public class functinalityTestCases extends BaseClass {
	
	static WebDriver driver;
	static HomePage homePgae;
	@BeforeClass
	void beforeClass() {
		driver=driverInitialization();
		homePgae=new HomePage(driver);
	}
	
	
	@Test
	void test1() throws IOException {
		maximizeWindow();
		implicitlyWait(10);
		System.out.println(getProperty("username"));
		driver.get("https://www.rediff.com/");
		homePgae.loginPageLink().click();
	}
	
	@Test
	void test2() {
		maximizeWindow();
		implicitlyWait(10);
		driver.get("https://www.google.com/");
	}
	
	

}
