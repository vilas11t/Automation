package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class loginTest extends BaseClass {
	static WebDriver driver;	
	@BeforeClass
	void beforeClass() {
		driver=driverInitialization();
	}
	
	
	@Test
	void test1() {
		maximizeWindow();
		implicitlyWait(10);
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	void test2() {
		maximizeWindow();
		implicitlyWait(10);
		driver.get("https://www.google.com/");
	}
	

}
