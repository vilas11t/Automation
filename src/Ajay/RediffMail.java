package Ajay;

import static org.testng.Assert.assertEquals;

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
		String tab1=" HOME";
		String tab2="NEWS";
		String tab3="BUSINESS";
		String tab4="MOVIES";
		String tab5="CRICKET";
		String tab6="SPORTS";
		String tab7="GET AHEAD";
		String tab8="REALTIME NEWS";
		String tab9="COVID-19";
		
		List<String>expectedTabvalues=new ArrayList<String>();
		expectedTabvalues.add(tab1);
		expectedTabvalues.add(tab2);
		expectedTabvalues.add(tab3);
		expectedTabvalues.add(tab4);
		expectedTabvalues.add(tab5);
		expectedTabvalues.add(tab6);
		expectedTabvalues.add(tab7);
		expectedTabvalues.add(tab8);
		expectedTabvalues.add(tab9);
		
		maximizeWindow();
		implicitlyWait(20);
		driver.get("https://www.rediff.com/");
		
		List<WebElement>tabs=homePage.getcovidTabs();
		
		Assert.assertEquals(tabs.size(), 9,"tabs not displayed");
		
		int i=0;
		
		for (WebElement tab:tabs) {
			Assert.assertEquals(tab.getText(), expectedTabvalues.get(i),expectedTabvalues.get(i) +"not displayed");
			i++;
		}
	}
}
