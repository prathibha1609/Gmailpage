package progressTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Bootstrap {
	WebDriver driver;
	public Bootstrap(WebDriver driver) {
		this.driver=driver;
		
	}

	@FindBy(how = How.CSS,using= "[id=\"cricle-btn\"]")
	WebElement Circle;
	@FindBy(how = How.XPATH,using = "//div[@class=\"prog-circle\"]/div[contains (text(), '100%')]")
WebElement comple;
	
	public void downloa() {
		Circle.click();
	}
	public void validationcircle() {
		Assert.assertTrue(comple.isDisplayed());
	}
	
}
