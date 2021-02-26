package MainTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class demo {
WebDriver driver;

public demo(WebDriver driver) {
	this.driver = driver;
}


@FindBy(how = How.XPATH, using = "//button[@data-target=\"all\"]")
WebElement first;

public void Green() {
	
first.getCssValue("green");	
}


}

