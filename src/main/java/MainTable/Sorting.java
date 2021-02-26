package MainTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sorting {
	WebDriver driver;

	public Sorting(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.CSS, using = "[type=\"search\"]")
	WebElement sear;
	@FindBy(how = How.XPATH,using = "//tr[@role=\"row\"]/th[@class=\"sorting_asc\"]")
	WebElement namesort;
	
	
	public void searching() {
		sear.sendKeys("London");
	}
	public void name_sort() {
		namesort.click();
	}
}

