package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	 
	public HomePage(WebDriver driver){
		 this.driver=driver;
	 }
	 
	public By loginLink=By.xpath("//a[@class='signin']");
	public By businessEmail=By.xpath("//a[@title='Lightning fast business email hosting']");
	 
	 
	 
	public WebElement loginPageLink() {
		return driver.findElement(loginLink);
	 }
	 
	 
	 
	public WebElement businessEmailLink() {
			return driver.findElement(businessEmail);
		}
	 public By loginLink1=By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]");
	 
	 public WebElement loginPageLink1() {
			return driver.findElement(loginLink1);
		 }
		 
	 

}
