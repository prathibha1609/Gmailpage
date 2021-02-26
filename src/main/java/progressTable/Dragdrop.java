package progressTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dragdrop {
	WebDriver driver;

		
		public Dragdrop(WebDriver driver){
			this.driver=driver;
			
		}	
	@FindBy(how=How.XPATH, using = "//div[@class=\"range\"]/input[@type=\"range\"]")
	WebElement firstdrag;
	
	public void sliderone() {
		Actions move=new Actions(driver);
		Action action=(Action) move.dragAndDropBy(firstdrag, 10, 30).build();
		action.perform();
	}
	
	
	
	
	
}
