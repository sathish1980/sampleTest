package test.FITASelenium1PMBatch;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {


	WebDriver driver;
	public void scrollimplementation() throws InterruptedException, IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/drag.xhtml");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,100)", "");
		screencapture("down");
		Thread.sleep(2000);
		//vertical scroll up
		js.executeScript("window.scrollBy(0,-750)", "");
		screencapture("up");
		Thread.sleep(2000);
		//horizontal scroll right
		js.executeScript("window.scrollBy(750,0)", "");
		screencapture("right");
		Thread.sleep(2000);
		//horizontal scroll left
		js.executeScript("window.scrollBy(-750,0)", "");
		screencapture("left");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		screencapture("completlydown");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		Thread.sleep(2000);

		WebElement startbutton=driver.findElement(By.xpath("//*[text()='Start']//parent::button"));
		js.executeScript("arguments[0].scrollIntoView();", startbutton);

	}


	public void toast() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/drag.xhtml");
		driver.findElement(By.id("form:j_idt119")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("ui-progressbar-label"),"100%"));
		String toasttxt =driver.findElement(By.className("ui-growl-title")).getText();
		System.out.println(toasttxt);
	}

	public void screencapture(String name) throws InterruptedException, IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourceFile =ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(System.getProperty("user.dir")+"//Screenshot//"+name+".png");
		FileUtils.copyFile(sourceFile, destinationFile);

	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Screenshot s = new Screenshot();
		s.scrollimplementation();
	}

}
