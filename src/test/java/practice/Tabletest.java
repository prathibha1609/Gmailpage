package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MainTable.DataTable;
import MainTable.Sorting;
import MainTable.Tablesearch;
import MainTable.demo;
import MainTable.paginationTable;
import MainTable.sunithatable;
import main.SimpleForm;
import util.Browser;

public class Tabletest {
	WebDriver driver;
	sunithatable suni;
	SimpleForm info;
	paginationTable pag;
	Tablesearch search;
	demo color;
	Sorting sort;
	DataTable data;

	@Test
	public void table_test() {
		driver = Browser.Homepage();
//		info = PageFactory.initElements(driver, SimpleForm.class);
//		info.clickInput();
//		table = PageFactory.initElements(driver, TableMenu.class);
//		table.droptable();
		suni = PageFactory.initElements(driver, sunithatable.class);
		suni.clickTableDrop();
//		suni.PagiTableDrop();
//		pag = PageFactory.initElements(driver, paginationTable.class);
//		pag.tablelist();
//		pag.second();
		// pag.click_third();
//		suni.clickTableDrop();
//		suni.SearchDataTable();
//		search = PageFactory.initElements(driver, Tablesearch.class);
//		search.tasks();
//		search.filter();
//		suni.clickTableDrop();
//		suni.FilterTable();
//		color = PageFactory.initElements(driver, demo.class);
//		color.Green();
//		suni.clickTableDrop();
//		suni.SortTable();
//		sort = PageFactory.initElements(driver, Sorting.class);
//		sort.searching();
//		sort.name_sort();
		data = PageFactory.initElements(driver, DataTable.class);
		suni.DownoadTable();
		data.Tablesearch();
		
		

	}

}
