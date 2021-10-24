package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class ActionClass {
	
	static WebDriver driver;
	
	@BeforeClass
	void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	@Test(priority=0,enabled=false)
	void mno(){
		driver.get("https://www.amazon.com/");
		WebElement Text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions Builder = new Actions(driver);
		Builder.moveToElement(Text).keyDown(Keys.SHIFT).sendKeys(Text, "Keyboard").keyUp(Keys.SHIFT).build().perform();
	}
	
	
	@Test(priority=-1,invocationCount=5)
	void xyz(){
		driver.get("https://www.google.com/");
		String window=driver.getWindowHandle();
		System.out.println(window);				
	}
	
	@Test(priority=2)
	void abc(){
		driver.get("https://www.rediff.com/");
		String title=driver.getTitle();
		System.out.println(title);				
	}
	
	/*
	@Test
	void test4(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement Text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions Builder = new Actions(driver);
		Builder.moveToElement(Text).keyDown(Keys.SHIFT).sendKeys(Text, "Keyboard").keyUp(Keys.SHIFT).build().perform();
	} */
	
	@AfterClass
	void afterClass() {
		driver.close();
	}
}