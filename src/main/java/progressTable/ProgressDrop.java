package progressTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ProgressDrop {
	WebDriver driver;
	
	public ProgressDrop(WebDriver driver) {
		this.driver=driver;
	}
	
@FindBy(how = How.XPATH, using = "//ul[@class=\"nav navbar-nav navbar-right\"]/li[1]/a[@class=\"dropdown-toggle\"]")
WebElement Download_progress;
@FindBy(how =How.XPATH, using ="//ul[@class=\"dropdown-menu\"]/li[1]/a[contains (text(), \"JQuery Download Progress bars\")]")
WebElement JQuery_download;
@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[2]/a[contains (text(), \"Bootstrap Progress bar\")]")
WebElement Bootstrap;
@FindBy(how = How.XPATH, using = "//ul[@class=\"dropdown-menu\"]/li[3]/a[contains (text(), \"Drag & Drop Sliders\")]")
WebElement Drag;
@FindBy(how = How.XPATH, using="//button[@id=\"downloadButton\"]")
WebElement down;
@FindBy(how = How.XPATH, using="//button[contains (text(), \"Close\")]")
WebElement close;
	
	public void progressbar() {
		Download_progress.click();
	}
	public void Jqu() {
		JQuery_download.click();
	}
	public void download() {
		down.click();
	}
	public void boot() {
		Bootstrap.click();
	}
	public void slide() {
		Drag.click();
		
	}
	public void validationprogressbar() {
		Assert.assertTrue(close.isDisplayed());
	
	}
}
