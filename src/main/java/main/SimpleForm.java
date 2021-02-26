package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SimpleForm {
	WebDriver driver;

	public SimpleForm(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//ul[@class=\"nav navbar-nav\"]/li[1]/a[@class=\"dropdown-toggle\"]")
	WebElement Input_Forms;
	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li/a[contains (text(),'Simple Form Demo')]")
	WebElement Simple_Forms;
	@FindBy(how = How.XPATH, using = "//input[@placeholder=\"Please enter your Message\"]")
	WebElement Enter_Message;
	@FindBy(how = How.XPATH, using = "//form[@id=\"get-input\"]/button[@class=\"btn btn-default\"]")
	WebElement Show_Message;
	@FindBy(how = How.XPATH, using = "//span[@id=\"display\"]")
	WebElement validate_message;
	@FindBy(how = How.XPATH, using = "//input[@id=\"sum1\"]")
	WebElement Enter_a;
	@FindBy(how = How.XPATH, using = "//*[@type=\"text\" and @id=\"sum2\"]")
	WebElement Enter_b;
	@FindBy(how = How.XPATH, using = "//button[@onclick=\"return total()\"]")
	WebElement Get_Total;
	@FindBy(how = How.XPATH, using = "//a[@class=\"at-cv-button at-cv-lightbox-yesno at-cm-no-button\"]")
	WebElement Pop_Up;
	@FindBy(how = How.XPATH, using = "//span[@id=\"displayvalue\"]")
	WebElement Sum;
	
	public void clickInput() {
		Input_Forms.click();
	}
	public void validateInput() {

		String actual = "Simple Form Demo";
		String expected = Simple_Forms.getText();

		Assert.assertEquals(actual, expected);
	}

	public void ClickSimpleForm() {
		Simple_Forms.click();
	}

	String name = "Prathibha";

	public void EnterMessage() {
		Enter_Message.sendKeys(name);
	}

	public void ShowMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Show_Message));
		Show_Message.click();
	}

	public void validateshowmessage() {
		if (validate_message.getText().equalsIgnoreCase(name)) {
			System.out.println("Pass");
		} else {
			Show_Message.click();
		}

	}
int a1;	

	public void Entera() {
		String a = "506";
		int  a1 = Integer.parseInt(a);
		Enter_a.sendKeys(String.valueOf(a1));
	}
int b1;
	public void Enterb() {
		String b = "506";
		int  b1 = Integer.parseInt(b);
		Enter_b.sendKeys(String.valueOf(b1));
	}
    public void GetTotal() {
		Get_Total.click();
	}

	public void validationsum() {
		int c = a1 + b1;
		String d = Integer.toString(c);
		String expected = d;
		String actual= Sum.getText();
		
		Assert.assertEquals(actual, expected);
	}

	public void Popup() {
		Pop_Up.click();
	}
	
	
}
