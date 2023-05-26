package SeleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExercise {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		// select the value in dropdown
		/*
		 * there are three types to get the value selectByindex SelectByValue
		 * SelectByBisibleText
		 */

		WebElement selects = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));

		// we need create select object before using select

		Select value = new Select(selects);
		value.selectByIndex(2);

		// get the total number of option

		List<WebElement> lists = value.getOptions();

		System.out.println(lists);

		// select by sendkeys
		selects.sendKeys("Selenium");

// multiple value
//
//		value.selectByIndex(0);
//		value.selectByIndex(4);

	}

}
