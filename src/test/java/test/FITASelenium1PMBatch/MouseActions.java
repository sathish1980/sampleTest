package test.FITASelenium1PMBatch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {

	public void mouseimplementation() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//*[@class='vl-flyout-nav__js-tab']//a[text()='Electronics']"))).perform();
		Thread.sleep(1000);
		mouse.moveToElement(driver.findElement(By.xpath("//a[text()='Computers and tablets']"))).click().perform();
	}

	public void fbimplement() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
	}

	public void draganddrop() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("form:drag_content"))).dragAndDrop(driver.findElement(By.id("form:drag_content")), driver.findElement(By.id("form:drop_content"))).perform();
	}

	public void draganddropby() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//*[@id='form:j_idt125']//span[1]"))).dragAndDropBy(driver.findElement(By.xpath("//*[@id='form:j_idt125']//span[1]")),-30,0 ).perform();
		mouse.moveToElement(driver.findElement(By.xpath("//*[@id='form:j_idt125']//span[2]"))).dragAndDropBy(driver.findElement(By.xpath("//*[@id='form:j_idt125']//span[2]")),30,0 ).perform();

	}

	public void toastmessage() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		driver.findElement(By.id("form:j_idt119")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("ui-progressbar-label")),"100%"));
		String toastMessage = driver.findElement(By.className("ui-growl-title")).getText();
		System.out.println(toastMessage);
	}

	public void keyboard() throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("email"))).sendKeys("sathish").perform();
		mouse.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(1000);
		//mouse.moveToElement(driver.findElement(By.id("pass"))).sendKeys("pass").perform();
		//mouse.moveToElement(driver.findElement(By.id("pass"))).click().perform();
		mouse.keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT).keyUp(Keys.TAB).perform();

		mouse.doubleClick().contextClick().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		MouseActions M = new MouseActions();
		M.keyboard();
	}

}
