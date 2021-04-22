package baseadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass1 {
	public static WebDriver driver;
public static void launchBrowser() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "E:\\New java files\\Java\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
}
public static void launchurl(String url) {
	// TODO Auto-generated method stub
driver.get(url);}
public static void Insertvalues(WebElement f,String Value) {
	// TODO Auto-generated method stub
//WebElement f = driver.findElement(By.id(Values));
f.sendKeys(Val +92  ue);
}
public static void click(WebElement f) {
	// TODO Auto-generated method stub
f.click();
}
public static void quite() {
	// TODO Auto-generated method stub
 driver.quit();
}
}

