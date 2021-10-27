package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	public WebDriver driver;
	
	
	public AmazonHomePage(WebDriver driver){
		 this.driver=driver;
	 }
	 
 public By loginLink1=By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]");
	 
	 public WebElement loginPageLink1() {
			return driver.findElement(loginLink1);
		 }
		 
}
