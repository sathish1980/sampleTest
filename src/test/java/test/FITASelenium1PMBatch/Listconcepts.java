package test.FITASelenium1PMBatch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Listconcepts {

	public void listnimplementaion(String expectedcountry) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		driver.findElement(By.xpath("//*[@id='j_idt87:country']//div[starts-with(@class,'ui-select')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:country_items']//li[last()]")));

		List<WebElement> allCountry = driver.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));

		for(int i=1;i<=allCountry.size();i++)
		{
			String actualcountry= driver.findElement(By.xpath("//*[@id='j_idt87:country_items']//li["+i+"]")).getText();
			if(expectedcountry.equalsIgnoreCase(actualcountry))
			{
				driver.findElement(By.xpath("//*[@id='j_idt87:country_items']//li["+i+"]")).click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Listconcepts L = new Listconcepts();
		L.listnimplementaion("Germany");
	}

}
