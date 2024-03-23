package test.FITASelenium1PMBatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public void AlertsImplementation()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		driver.switchTo().alert().accept();
		String output = driver.findElement(By.id("simple_result")).getText();
		System.out.println(output);

		driver.findElement(By.id("j_idt88:j_idt93")).click();
		driver.switchTo().alert().dismiss();
		String output1 = driver.findElement(By.id("result")).getText();
		System.out.println(output1);

		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("FITA");
		System.out.println(al.getText());
		al.accept();
		String output2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(output2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alerts a = new Alerts();
		a.AlertsImplementation();
	}

}
