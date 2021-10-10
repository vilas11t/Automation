package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class ActionClass {
	
	WebDriver driver;
	@BeforeClass
	void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	@Test
	void test1(){
		driver.get("https://www.amazon.com/");
		WebElement Text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions Builder = new Actions(driver);
		Builder.moveToElement(Text).keyDown(Keys.SHIFT).sendKeys(Text, "Keyboard").keyUp(Keys.SHIFT).build().perform();
	}
	
	@Test
	void test2(){
		driver.get("https://www.google.com/");
		String window=driver.getWindowHandle();
		System.out.println(window);				
	}
	
	@Test
	void test3(){
		driver.get("https://www.rediff.com/");
		String title=driver.getTitle();
		System.out.println(title);				
	}
	
	@AfterClass
	void afterClass() {
		driver.close();
	}
}