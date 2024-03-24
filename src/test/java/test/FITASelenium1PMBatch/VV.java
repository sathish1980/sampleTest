package test.FITASelenium1PMBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VV {


	public void Framesimplementation()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");

		//
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.tagName("h5")).getText());
		System.out.println(driver.findElement(By.id("j_idt88:j_idt91")).getAttribute("name"));
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.findElement(By.id("j_idt88:j_idt106")).getCssValue("color"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VV v = new VV();
		v.Framesimplementation();
	}

}
