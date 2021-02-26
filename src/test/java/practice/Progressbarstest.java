package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import progressTable.Bootstrap;
import progressTable.Dragdrop;
import progressTable.ProgressDrop;
import util.Browser;

public class Progressbarstest {
	WebDriver driver;
	ProgressDrop bars;
	Bootstrap strap;
	Dragdrop drag;

	@Test
	public void test_progress() {
		driver = Browser.Homepage();
		bars = PageFactory.initElements(driver, ProgressDrop.class);
		bars.progressbar();
//		bars.Jqu();
//		bars.download();
//		bars.validationprogressbar();
//		strap = PageFactory.initElements(driver, Bootstrap.class);
//		bars.boot();
//		strap.downloa();
		//strap.validationcircle();
		drag = PageFactory.initElements(driver, Dragdrop.class);
		bars.slide();
		drag.sliderone();
		
		

	}

}
