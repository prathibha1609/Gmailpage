package MainTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class paginationTable {

	WebDriver driver;

	public paginationTable(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@class=\"prev_link\"]")
	WebElement prev;
	@FindBy(how = How.CSS, using = "[class=\"next_link\"]")
	WebElement next;
	@FindBy(how = How.XPATH, using = "//ul/li[3]//a[@class=\"page_link\"]")
	WebElement two;
	@FindBy(how = How.XPATH, using = "//ul/li[4]/a[@class=\"page_link\"]")
	WebElement third;

	public void tablelist() {
		List<WebElement> Pagination = driver.findElements(By.xpath("//table/tbody"));
		int total = Pagination.size();
		System.out.println(total + "tablet");
	}

	public void click_third() {
		third.click();
	}

	public void second() {
		two.click();
		if (two.isSelected()) {
			prev.isEnabled();
			next.isEnabled();
		}
	}
}
