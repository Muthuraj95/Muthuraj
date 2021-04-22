package junit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;

public class Task5 {
	public static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\New java files\\Project1\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");}
//		System.out.println("brfore class");}
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("muthuraj");
		String s =element.getAttribute("value");
		AssertJUnit.assertFalse("Assert Works again",s.contains("muthunesik"));
		System.out.println("test1");}
	@Test
	public void test2() {
		// TODO Auto-generated method stub
		WebElement element1 = driver.findElement(By.id("pass"));
		element1.sendKeys("pass");}
	@Test
	@org.junit.Ignore

	public void test3() {
		// TODO Auto-generated method stub
		WebElement element2 = driver.findElement(By.name("login"));
		element2.click();
	
	}
	@BeforeMethod
	public void before() {
		// TODO Auto-generated method stub
System.out.println("before");
	}
	@AfterMethod
	public void after() {
		// TODO Auto-generated method stub
System.out.println("after");

	}
	@AfterClass
	public static void afterclass() {
		// TODO Auto-generated method stub
System.out.println("afterclass");

	}
}