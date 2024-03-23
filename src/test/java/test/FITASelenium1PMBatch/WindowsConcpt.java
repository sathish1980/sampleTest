package test.FITASelenium1PMBatch;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsConcpt {


	public void Windowsimplementation()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		String ParentWindow =driver.getWindowHandle();
		driver.findElement(By.id("j_idt88:new")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for(String eachwindow : allWindows)
		{
			if(!eachwindow.equalsIgnoreCase(ParentWindow))
			{
				driver.switchTo().window(eachwindow);
				List<WebElement> elementExist = driver.findElements(By.id("menuform:j_idt39"));
				if(elementExist.size()>0)
				{
					driver.findElement(By.id("menuform:j_idt39")).click();
					driver.findElement(By.id("menuform:m_overlay")).click();
					driver.findElement(By.id("j_idt88:j_idt91")).click();
					driver.switchTo().alert().accept();
					String output = driver.findElement(By.id("simple_result")).getText();
					System.out.println(output);
					driver.close();
					driver.switchTo().window(ParentWindow);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowsConcpt W = new WindowsConcpt();
		W.Windowsimplementation();
	}

}
