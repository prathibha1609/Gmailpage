package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MainTable.TableMenu;
import main.AjaxForm;
import main.Checkboxdemo;
import main.HomePage;
import main.JQuerydropdown;
import main.Radiobutton;
import main.SimpleForm;
import util.Browser;

public class testdata {
	WebDriver driver;
	Browser br;
	HomePage hp;
	SimpleForm info;
	Radiobutton Radio;
	Checkboxdemo checkbox;
	AjaxForm Ajax;
	JQuerydropdown drop;
	TableMenu table;

	@Test
	public void data() {

		driver = Browser.Homepage();
//		hp = PageFactory.initElements(driver, HomePage.class);
//		hp.validatedemo();
//		hp.validatemenu();
//		info = PageFactory.initElements(driver, SimpleForm.class);
//		info.clickInput();
//		info.validateInput();
//		info.ClickSimpleForm();
//		info.EnterMessage();
//		info.Popup();
//		info.ShowMessage();
//		info.validateshowmessage();
//		info.Entera();
//		info.Enterb();
//		info.GetTotal();
//		 info.validationsum();
//		checkbox = PageFactory.initElements(driver, Checkboxdemo.class);
//		checkbox.clickInput();
//		checkbox.ClickCheckBox();
//		 checkbox.validateCheckBox();
//		checkbox.Singlecheckbox();
//		 checkbox.success_chkbox();
//		checkbox.CheckAll();
//		Radio = PageFactory.initElements(driver, Radiobutton.class);
//		Radio.clickInput();
//		Radio.Radiobuttons();
//		Radio.ValidateRadiobutton();
//		Radio.ClickMale();
//		Radio.GetCheckedValue();
//		Radio.GenderMale();
//		Radio.Agebelowfive();
//		Radio.GetValues();
//		Ajax = PageFactory.initElements(driver, AjaxForm.class);
//		Ajax.clickInput();
//		Ajax.Ajax();
//		//Ajax.validateAjaxform();
//		Ajax.Name1();
////		Ajax.comment();
////		Ajax.submit();
//		drop = PageFactory.initElements(driver, JQuerydropdown.class);
//		drop.clickInput();
//		drop.JQuery();
//		//drop.validateJQuery();
//		drop.Indexcountry();
//		drop.state();
//		drop.Terri();
//		drop.file();
		table = PageFactory.initElements(driver, TableMenu.class);
		
		//table.droptable();
//		table.table_page();
//		table.table1();
		

	}

}
