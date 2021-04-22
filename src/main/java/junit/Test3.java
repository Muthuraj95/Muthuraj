package junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
public static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.gecko.driver","E:\\New java files\\Project1\\Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");}
	@Before
	public void before() {
		System.out.println("muthuraj");
		// TODO Auto-generated method stub

	}
	@After
	public void after() {
		// TODO Auto-generated method stub
System.out.println("kmr");
	}
	@AfterClass
	public static void afterclass() {
		Date d= new Date();
		System.out.println(d);
	}
	@Test
	public void test1()
	{
		WebElement findElement = driver.findElement(By.id("email"));	
		findElement.sendKeys("gmail");
	}
	@Test
	public void test2() {
		// TODO Auto-generated constructor stub
		WebElement findElement = driver.findElement(By.id("pass"));
		findElement.sendKeys("password");
	}
}
