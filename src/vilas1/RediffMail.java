package vilas1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomClasses.HomePage;

public class RediffMail extends BaseClass {
	static WebDriver driver;
	static HomePage homePage;
	
	@BeforeClass
	void beforeClass() {
		driver=driverInitialization();
		homePage=new HomePage(driver);
	}
	
	
	@Test
	void test1() {
		
		String tab1="TOP STORIES";
		String tab2="LATEST";
		String tab3="FOR YOU";
		
		List<String> expectedTabvalues=new ArrayList<String>();
		expectedTabvalues.add(tab1);
		expectedTabvalues.add(tab2);
		expectedTabvalues.add(tab3);
		
		
		maximizeWindow();
		implicitlyWait(10);
		driver.get("https://www.rediff.com/");
		List<WebElement>tabs=homePage.getcovidTabs();
		Assert.assertEquals(tabs.size(), 3,"Exactly 3 tabs not displayed");
		int i=0;
		
		for(WebElement tab:tabs) {
			Assert.assertEquals(tab.getText(), expectedTabvalues.get(i),expectedTabvalues.get(i)+ "not displayed");
			i++;
		}
		
	}

}
