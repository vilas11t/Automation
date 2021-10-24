package seleniumPractice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class WaitsPractice {
	static WebDriver driver;
	@Test
	void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		WebElement userName;
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(10,TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
				
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//userName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login1']")));
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Username");
		
	}
	
	
	
	
	
	
	
	
	
}
