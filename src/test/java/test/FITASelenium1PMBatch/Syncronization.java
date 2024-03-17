package test.FITASelenium1PMBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Syncronization {

	public void waitconcepts() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		/*
		 * implict wait
		 * Explict wait
		 * fluent wait
		 * Thread.sleep(millisecond)
		 */

		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));

		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("sathish");
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Syncronization s = new Syncronization();
		s.waitconcepts();
	}

}
