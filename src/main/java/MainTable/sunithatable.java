package MainTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class sunithatable {
	WebDriver driver;

	public sunithatable(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//ul[@class=\"nav navbar-nav\"]/li[3]/a")
	WebElement SlectTable;
	@FindBy(how = How.XPATH, using = "//li[@class=\"dropdown open\"]/ul/li[1]/a")
	WebElement Table_Pagination;
	@FindBy(how = How.XPATH, using = "//li[@class=\"dropdown open\"]/ul/li[2]/a")
	WebElement Table_DataSearch;
	@FindBy(how = How.XPATH, using = "//li[@class=\"dropdown open\"]/ul/li[3]/a")
	WebElement Table_Filter;
	@FindBy(how = How.XPATH, using = "//li[@class=\"dropdown open\"]/ul/li[4]/a")
	WebElement Table_sort;
	@FindBy(how = How.XPATH, using = "//li[@class=\"dropdown open\"]/ul/li[5]/a")
	WebElement Table_Download;

	public void clickTableDrop() {
		SlectTable.click();
	}

	public void PagiTableDrop() {
		Table_Pagination.click();
	}

	public void SearchDataTable() {
		Table_DataSearch.click();
	}

	public void FilterTable() {
		Table_Filter.click();
	}

	public void SortTable() {
		Table_sort.click();
	}

	public void DownoadTable() {
		Table_Download.click();
	}

}
