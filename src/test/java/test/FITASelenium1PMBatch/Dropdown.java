package test.FITASelenium1PMBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public void dropdownimplementaion() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");

		Select dropdown = new Select(driver.findElement(By.className("ui-selectonemenu")));
		/*
		 * 3 methods
		 * selectByValue
		 * selectByIndex
		 * selectBy VisibleText
		 */
		dropdown.selectByIndex(2);
		//dropdown.selectByValue("");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Cypress");

	}

	public void multiselect() throws InterruptedException
	{

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='second']")));
		if(s.isMultiple())
		{
			s.selectByValue("donut");
			Thread.sleep(2000);
			s.selectByIndex(2);
			Thread.sleep(2000);
			s.deselectByIndex(1);
			Thread.sleep(2000);
			s.deselectByValue("burger");
			Thread.sleep(2000);
			s.deselectAll();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown D = new Dropdown();
		D.multiselect();
	}

}
