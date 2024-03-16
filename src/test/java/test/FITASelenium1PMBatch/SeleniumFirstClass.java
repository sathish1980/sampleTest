package test.FITASelenium1PMBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumFirstClass {

	public void launch()
	{
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sathish");
		username.clear();
		driver.findElement(By.name("pass")).sendKeys("sathish");
		driver.findElement(By.name("pass")).clear();
		//driver.findElement(By.className("inputtext _55r1 _6luy _9npid")).sendKeys("sathish");
		/*driver.navigate().to("https://www.gmail.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().minimize();
		driver.close();
		driver.quit();*/

		//	driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("assword?")).click();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumFirstClass S = new SeleniumFirstClass();
		S.launch();
	}

}
