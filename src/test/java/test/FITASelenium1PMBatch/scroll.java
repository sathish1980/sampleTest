package test.FITASelenium1PMBatch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {


	WebDriver driver;
	public void scrollimplementation() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/drag.xhtml");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(2000);
		//vertical scroll down
		js.executeScript("window.scrollBy(0,-750)", "");
		Thread.sleep(2000);
		//horizontal scroll right
		js.executeScript("window.scrollBy(750,0)", "");
		Thread.sleep(2000);
		//horizontal scroll left
		js.executeScript("window.scrollBy(-750,0)", "");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		Thread.sleep(2000);

		WebElement startbutton=driver.findElement(By.xpath("//*[text()='Start']//parent::button"));
		js.executeScript("arguments[0].scrollIntoView();", startbutton);

	}


	public void screencapture() throws InterruptedException, IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourceFile =ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(System.getProperty("user.dir")+"//Screenshot//today.png");
		FileUtils.copyFile(sourceFile, destinationFile);

	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		scroll s = new scroll();
		s.scrollimplementation();
	}

}
