package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import alertsandModals.Bootstrapalert;
import util.Browser;

public class Alertsmodalstest {
	
	WebDriver driver;
	Bootstrapalert BSA;
	
	@Test
	public void alertsmodals() {
		driver = Browser.Homepage();
		BSA = PageFactory.initElements(driver, Bootstrapalert.class);
		BSA.Alermodal();
		BSA.drop_alert();
	}


}
