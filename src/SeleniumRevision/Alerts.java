package SeleniumRevision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");

		WebElement normalAlerts = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		normalAlerts.click();

		Alert value1 = driver.switchTo().alert();
		value1.accept();
		Thread.sleep(3000);

//dismiss

		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		promptBox.click();

		Alert value2 = driver.switchTo().alert();
		value2.dismiss();

		// enter sendkeys

		WebElement sendKeys = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		sendKeys.click();

		Alert value3 = driver.switchTo().alert();
		value3.sendKeys("mathi workingas SDET");
		value3.accept();

	}

}
