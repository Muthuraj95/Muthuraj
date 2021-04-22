package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;

	public static void getchromedriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\New java files\\Java\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void urllaunch(String Url) throws Exception {
		driver.get(Url);
		Thread.sleep(3000);
	}

	public static void sendkeys(WebElement a, String Value) {
		a.sendKeys(Value);
	}

	public static void click(WebElement c) throws Throwable {
		// TODO Auto-generated method stub
		c.click();
		Thread.sleep(5000);
	}

	public static void exit() {
		driver.close();

	}
}