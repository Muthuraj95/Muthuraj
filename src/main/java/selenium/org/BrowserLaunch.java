package selenium.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch extends Datadriven1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\New java files\\Project1\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.name("username"));
		findElement.sendKeys(getData(0,0));
		WebElement findElements = driver.findElement(By.id("password"));
		findElements.sendKeys(getData(0,1));
	}
}
