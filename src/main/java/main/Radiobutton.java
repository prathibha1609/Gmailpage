package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Radiobutton {
	WebDriver driver;

	public Radiobutton(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//ul[@class=\"nav navbar-nav\"]/li[1]/a[@class=\"dropdown-toggle\"]")
	WebElement Input_Forms;
	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[3]/a[contains (text(), 'Radio Buttons Demo')]")
	WebElement Radio_Button;
	@FindBy(how = How.XPATH, using = "//div[contains (text(),'Radio Button Demo')]")
	WebElement Confirm_Radiobutton;
	@FindBy(how = How.XPATH, using = "//input[@value=\"Male\" and @name=\"optradio\"]")
	WebElement Male;
	@FindBy(how = How.XPATH, using = "//input[@value=\"Female\" and @name=\"optradio\"]")
	WebElement Female;
	@FindBy(how = How.XPATH, using = "//button[contains (text(), 'Get Checked value')]")
	WebElement Get_Checked_value;
	@FindBy(how = How.XPATH, using ="//input[@value=\"Male\" and @name=\"gender\"]")
	WebElement GenderMale;
	@FindBy(how = How.XPATH, using="//input[@value=\"Female\" and @name=\"gender\"]")
	WebElement GenderFemale;
	@FindBy(how = How.XPATH, using="//input[@value=\"0 - 5\"]")
	WebElement Age_below_5;
	@FindBy(how = How.XPATH, using="//input[@value=\"5 - 15\"]")
	WebElement Age_below_15;
	@FindBy(how = How.XPATH, using="//input[@value=\"15 - 50\"]")
	WebElement Age_below_50;
	@FindBy(how =How.XPATH, using="//button[@onclick=\"getValues();\"]")
	WebElement Get_Value;
	@FindBy(how=How.XPATH, using="//p[@class=\"groupradiobutton\"]")
	WebElement ConfirmAge;

//	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[4]/a[contains (text(),'Select Dropdown List')]")
//	WebElement Drop_Down;
//	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[5]/a[contains (text(),'Input Form Submit')]")
//	WebElement Input_Submit;
//	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[6]/a[contains (text(),'Ajax Form Submit')]")
//	WebElement Ajax_Forms;
//	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[7]/a[contains (text(),'JQuery Select dropdown')]")
//	WebElement J_Query;

	public void clickInput() {
		Input_Forms.click();
	}

	public void Radiobuttons() {
		Radio_Button.click();
	}

	public void ValidateRadiobutton() {
		String actual = "Radio Button Demo";
		String expected = Confirm_Radiobutton.getText();
		
		Assert.assertEquals(actual, expected);

	}
	public void ClickMale() {
		Male.click();
		
	}
	public void GetCheckedValue() {
		Get_Checked_value.click();	
	}
//public void validateMale() {
	
//}
	public void Female() {
		Female.click();
	}
	public void GenderMale() {
		GenderMale.click();
	}
	public void Agebelowfive() {
		Age_below_5.click();
	}
	public void GetValues() {
		Get_Value.click();
	}
}
