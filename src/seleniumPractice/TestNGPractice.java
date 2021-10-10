package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGPractice {
	
	WebDriver driver;
	
	@BeforeClass
	void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="login data")
	void LoginTest(String userName, String Password) {
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
				
	}
	
	@DataProvider(name="login data")
	Object[][] loginData(){
		Object[][] loginDetails;
		loginDetails= new Object[][] {{"rahul554321@rediffmail.com","pass"},{"rahul554321","Pass@123"},{"rahul554321@rediffmail.com","Pass@123"}};
		return loginDetails;
		
	}

}
