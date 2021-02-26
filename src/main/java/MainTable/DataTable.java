package MainTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataTable {
	WebDriver driver;
	
	public DataTable(WebDriver driver) {
		this.driver=driver;
	}

	public void Tablesearch() {
		List<WebElement>TablePrint=driver.findElements(By.cssSelector("[class=\"display nowrap dataTable no-footer\"]"));
		System.out.println(TablePrint);
	}
	
	
}
