package seleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WindowHandlingPractice {
	
	static WebDriver driver;
	
	@BeforeClass
	void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
	}
	
	@Test
	void windowHandling() throws InterruptedException {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String parentWindowId=driver.getWindowHandle();
		
		driver.findElement(By.id("openwindow")).click();
		
		
		Set<String> allOpenedWindowIds=driver.getWindowHandles();
		
		System.out.println(parentWindowId);
		System.out.println(allOpenedWindowIds);
		
		for(String windowId:allOpenedWindowIds) {
			
			if(!(parentWindowId.equals(windowId))) {
				driver.switchTo().window(windowId);
			}
			
		}
		String title=driver.getTitle();
		System.out.println(title);   // QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy
		
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.id("opentab")).click(); 
		
		
		Set<String> windowIds=driver.getWindowHandles();
		
		for(String windowId:windowIds) {
			if(!(parentWindowId.equals(windowId))) {
				driver.switchTo().window(windowId);
			}
		}
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/sign_up' and @class='theme-btn'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
