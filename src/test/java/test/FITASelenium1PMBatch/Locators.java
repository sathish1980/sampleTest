package test.FITASelenium1PMBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public void launch()
	{

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("sathish");
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("kumar");

		/*
		 * contains -*
		 * starswith - ^
		 * endsWith -$
		 * e.g tagname[arrtirbute*='partialvalue']
		 * e.g tagname[arrtirbute^='partialstartingvalue']
		 * e.g tagname[arrtirbute$='partialendvalue']
		 */

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
