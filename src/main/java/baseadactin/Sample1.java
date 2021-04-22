package baseadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Baseclass;

public class Sample1 extends Baseclass1{
	public static void main(String[] args) throws InterruptedException {
	launchBrowser();
	launchurl("http://www.adactin.com/HotelApp/");
	WebElement f1 = driver.findElement(By.id("username"));
	Insertvalues(f1,"Muthuraj");
	WebElement f2 = driver.findElement(By.id("password"));
	Insertvalues(f2,"Maruthu");
	WebElement f3 = driver.findElement(By.id("login"));
	click(f3);
	Thread.sleep(5000);
	quite();

	}

}
