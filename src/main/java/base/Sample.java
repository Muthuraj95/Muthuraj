package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends Baseclass {
	public static void main(String[] args) throws Throwable {
	getchromedriver();
	urllaunch("http://www.fb.com/");
	WebElement element = driver.findElement(By.id("email"));
	sendkeys(element,"muthu");
	WebElement element2 = driver.findElement(By.id("pass"));
	sendkeys(element2,"1223344");
	WebElement element3 = driver.findElement(By.name("login"));
	click(element3);
	exit();
	}}
