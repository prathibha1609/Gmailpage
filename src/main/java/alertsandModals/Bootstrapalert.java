package alertsandModals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Bootstrapalert {
		WebDriver driver;
		
		public Bootstrapalert(WebDriver driver) {
			this.driver=driver;
}
		@FindBy(how=How.XPATH, using="//ul[@class=\"nav navbar-nav navbar-right\"]/li[2]/a[@class=\"dropdown-toggle\"]")
		WebElement Alerts_Modals;
		@FindBy(how = How.XPATH,using = "//ul[@class=\"dropdown-menu\"]/li[1]/a[contains (text(), 'Bootstrap Alerts')]")
		WebElement DropBootstrapalerts;
		
		public void Alermodal() {
			Alerts_Modals.click();
		}
		public void drop_alert() {
			DropBootstrapalerts.click();
		}
		
		
		
		
}
