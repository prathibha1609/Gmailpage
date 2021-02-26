package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AjaxForm {
	WebDriver driver;

	public AjaxForm(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//ul[@class=\"nav navbar-nav\"]/li[1]/a[@class=\"dropdown-toggle\"]")
	WebElement Input_Forms;
	@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[6]/a[contains (text(), 'Ajax Form Submit')]")
	WebElement Ajax_Form;
	@FindBy(how = How.XPATH, using = "//title[contains (text(), 'Selenium Easy - Ajax Form submit demo for automation')]")
	WebElement Title;		
	@FindBy(how = How.XPATH, using = "//input[@class=\"form-control\"]")
	WebElement Name;
	@FindBy(how = How.XPATH, using="//textarea[@name=\"description\"]")
	WebElement comment;
	@FindBy(how = How.XPATH, using="//input[@onclick=\"ajaxSubmit();\"]")
	WebElement Submit;
	
	public void clickInput() {
		Input_Forms.click();
	}
	
	public void Ajax() {
		Ajax_Form.click();
	}
	
	public void validateAjaxform() {
		
		String expected = "Selenium Easy - Ajax Form submit demo for automation";
		
		Assert.assertTrue((Title.getText()).equalsIgnoreCase(expected));
		
		System.out.println(Title.getText());
	}
	
	public void Name1() {
		
		Name.sendKeys("Newyork");
		
	}
	
	public void comment2() {
		comment.sendKeys("abcd");
		
	}
	public void submit3() {
		Submit.click();
	}
}

