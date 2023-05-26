package SeleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeNBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");

	}

}
