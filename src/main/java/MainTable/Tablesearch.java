package MainTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Tablesearch {
WebDriver driver;

public Tablesearch(WebDriver driver) {
	this.driver= driver;
	
}

@FindBy(how = How.CSS, using="[id=\"task-table-filter\"]")
WebElement Task_Status;
@FindBy(how =How.CSS,using="[class=\"btn btn-default btn-xs btn-filter\"]")
WebElement user_Filter;

public void tasks() {
	Task_Status.sendKeys("Bootstrap");	
}
public void filter() {
	user_Filter.click();
}

}
