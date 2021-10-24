package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties properties;
	public static FileInputStream fis;
	public static File file;
	
	public String getProperty(String property) throws IOException {
		file=new File(System.getProperty("user.dir")+"//file.properties");
		fis=new FileInputStream(file);
		properties=new Properties();
		properties.load(fis);
		String value=properties.get(property).toString();
		return value;
		
	}

	public WebDriver driverInitialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void implicitlyWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	

}
