package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMozelloWebsite {
	public WebDriver driver;
	
	public  CheckMozelloWebsite(WebDriver driver){
		 this.driver=driver;
	 }
	public By loginLinkOne=By.xpath("//a[@class='button top signup']");
	public WebElement loginLinkOne() {
		return driver.findElement(loginLinkOne);
	

	 }

}
