package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mamun\\eclipse-workspace\\MySeleniumProject\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:www.ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("Apple mac book Air", Keys.ENTER);
		Thread.sleep(10000);
		driver.quit();

}
}
