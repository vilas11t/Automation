package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBasic {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	driver.findElement(By.xpath("//*[@onclick='myPromptFunction()']")).click();
	
	
	
		/*
		 * driver.findElement(By.xpath("//input[@type='button' and @value='Alert']")).
		 * click();
		 * 
		 * Thread.sleep(2000); driver.switchTo().alert().accept();
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@value='Confirmation Box']")).click();
		 * driver.switchTo().alert().dismiss();
		 */
	
		/*
		 * driver.findElement(By.xpath("//input[@value='Prompt']")).click();
		 * Thread.sleep(2000);
		 */
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("testing");
	//alert.accept();
	Thread.sleep(2000);
	System.out.println(alert.getText());
	
	
	
	

	
	
	
	
	
	
	
	
	// accept, dissmiss, sendkeys, gettext
	
 }

}
