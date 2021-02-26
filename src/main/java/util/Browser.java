package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	
	static WebDriver driver;

	public static WebDriver Homepage() {
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe" );
		
		driver =new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
		
		
	}
	
}
