package pomClasses;

import java.util.List;

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
	public By covidTabs=By.xpath("//div[@id='tabtable']/div");
	public By mainTabs=By.xpath("//div[@class='navbar cor_margin']//li");
	 
	 
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
	 
	 public List<WebElement> getcovidTabs() {
			return driver.findElements(covidTabs);
		 }
	 
	 public List<WebElement> getmainTabs() {
			return driver.findElements(mainTabs);
		 }
	 
	 
	 
	 
		 
	 

}
