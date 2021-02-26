package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Checkboxdemo {
	WebDriver driver;

	public Checkboxdemo(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//ul[@class=\"nav navbar-nav\"]/li[1]/a[@class=\"dropdown-toggle\"]")
	WebElement Input_Forms;
	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[2]/a[contains (text(),'Checkbox Demo')]")
	WebElement Check_Box;
	@FindBy(how = How.XPATH, using = "//input[@id=\"isAgeSelected\"]")
	WebElement Single_checkbox;
	@FindBy(how = How.XPATH, using = "//div[@id=\"txtAge\"]")
	WebElement Sucess_Chkbox;
	@FindBy(how = How.XPATH, using = "//input[@class=\"btn btn-primary\"]")
	WebElement Check_All;
	@FindBy(how = How.XPATH, using = "//input[@value=\"Uncheck All\"]")
	WebElement uncheck_all;

//	@FindBy(how =How.XPATH, using = "//input[@class=\"cb1-element\"]")
//	WebElement Option_1;
//	@FindBy(how =How.XPATH, using = "//div[@class=\"checkbox\"][2]")

	public void clickInput() {
		Input_Forms.click();
	}

	public void ClickCheckBox() {
		Check_Box.click();
	}

	public void validateCheckBox() {

		String actual = "Checkbox Demo";
		String expected = Check_Box.getText();

		Assert.assertEquals(actual, expected);
	}

	public void Singlecheckbox() {
		Single_checkbox.click();

	}

	public void success_chkbox() {
		Assert.assertTrue(Sucess_Chkbox.isDisplayed());
	}

	public void CheckAll() {
		if (Check_All.isSelected()) {
			uncheck_all.isDisplayed();
		} else {
			Check_All.click();
		}
		

		
	}

}
