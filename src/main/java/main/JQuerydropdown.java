package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class JQuerydropdown {
	WebDriver driver;

	public JQuerydropdown(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//ul[@class=\"nav navbar-nav\"]/li[1]/a[@class=\"dropdown-toggle\"]")
	WebElement Input_Forms;
	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[7]/a[contains (text(), 'JQuery Select dropdown')]")
	WebElement JQuery_dropdown;
	@FindBy(how = How.XPATH, using = "//select[@id=\"country\"]")
	WebElement Select_country;
	@FindBy(how = How.XPATH, using = "//select[@class=\"js-example-basic-multiple select2-hidden-accessible\"]")
	WebElement Select_State;
	@FindBy(how = How.XPATH, using = "//select[@class=\"js-example-disabled-results select2-hidden-accessible\"]")
	WebElement Select_Territories;
	@FindBy(how = How.CSS,using = "[class=\"form-control\"]")
	WebElement select_file;

	public void clickInput() {
		Input_Forms.click();
	}

	public void JQuery() {
		JQuery_dropdown.click();
	}

	public void validateJQuery() {

		String actual = "Single Select - Search and Select country";
		String expected = JQuery_dropdown.getText();

		Assert.assertEquals(actual, expected);
	}

	public void Indexcountry() {
		Select sel = new Select(Select_country);
		sel.selectByIndex(3);
	}

	public void state() {
		Select sel = new Select(Select_State);
		sel.selectByVisibleText("Alabama");

	}
	public void Terri() {
		Select sel=new Select(Select_Territories);
		sel.selectByValue("AS");
	}
	public void file() {
		Select sel =new Select(select_file);
		sel.selectByValue("jquery");
	}
}