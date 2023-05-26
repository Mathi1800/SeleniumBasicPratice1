package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml");

		driver.manage().window().maximize();

		// type the name

		WebElement textbox = driver.findElement(By.id("j_idt88:name"));

		textbox.sendKeys("mathivanan");

		// Append

		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys(" new ");

		// disabled

		WebElement disableValue = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		Boolean result = disableValue.isEnabled();
		System.out.println(result);

		// clear

		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));

		clearBox.clear();

		// get the value

		WebElement getData = driver.findElement(By.id("j_idt88:j_idt97"));
		getData.sendKeys("hello");
		String data = getData.getAttribute("value");
		System.out.println(data);

		// email

		WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));

		email.sendKeys("mathimathi1800@gmail.com" + Keys.TAB);

		Thread.sleep(3000);
		// confirm

		WebElement confirm = driver.findElement(By.id("j_idt106:thisform:age"));

		confirm.sendKeys(Keys.ENTER);

	}

}
