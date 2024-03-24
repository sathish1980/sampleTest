package test.FITASelenium1PMBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tables {

	public void tableimplementaion(String expectedcountry) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> allpages =driver.findElements(By.xpath("//*[@class='ui-paginator-pages']//a"));
		for(int page=1;page<=allpages.size();page++)
		{
			driver.findElement(By.xpath("//*[@class='ui-paginator-pages']//a["+page+"]")).click();;
			Thread.sleep(2000);

			List<WebElement> allrows = driver.findElements(By.xpath("//*[@id='form:j_idt89']//table//tbody//tr"));
			for(int i=1;i<=allrows.size();i++)
			{
				String actualcountry = driver.findElement(By.xpath("//*[@id='form:j_idt89']//table//tbody//tr["+i+"]//td[2]//span[3]")).getText();;
				if(expectedcountry.equalsIgnoreCase(actualcountry))
				{
					String name = driver.findElement(By.xpath("//*[@id='form:j_idt89']//table//tbody//tr["+i+"]//td[1]")).getText();;
					System.out.println(name);
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Tables T = new Tables();
		T.tableimplementaion("Germany");
	}

}
