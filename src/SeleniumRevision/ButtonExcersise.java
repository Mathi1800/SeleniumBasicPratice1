package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExcersise {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		// Maximize the window

		driver.manage().window().maximize();

		// confirm button is disabled

		WebElement disable = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));

		Boolean datas = disable.isEnabled();
		System.out.println(datas);

		// position of button

		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		org.openqa.selenium.Point value = position.getLocation();
		int x = value.getX();
		int y = value.getY();

		System.out.println("x:" + x + "y" + y + "value" + value);

		// color

		WebElement getColor = driver.findElement(By.id("j_idt88:j_idt96"));

		String color = getColor.getCssValue("color");
		System.out.println(color);

		// find height and length

		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();

		System.out.println("height" + height + "width" + width);

		// Click the button

		WebElement clickButton = driver.findElement(By.id("j_idt88:j_idt90"));
		clickButton.click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
