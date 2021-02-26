package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Demo Home')]")
	WebElement Demo_text;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Menu List')]")
	WebElement Menu_text;

	public void validatedemo() {
			String actual="Demo Home";
			String expected=Demo_text.getText();
			
		Assert.assertEquals(actual, expected);
		
	}
		
		public void validatemenu() {
			String actual="Menu List";
			String expected=Menu_text.getText();
			
			Assert.assertEquals(actual, expected);
			
		}
			
		}


