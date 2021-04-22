package junit;

import java.io.IOException;
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

import selenium.org.Datadriven1;

public class Test1 extends Datadriven1{
	public static WebDriver driver; 
	@BeforeClass
	public static void beforeclass() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\New java files\\Project1\\Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("http://www.adactin.com/HotelApp/");}
		@AfterClass
		public static void afterclass() {
			Date d = new Date();
			System.out.println(d);}
		@Before
		public void before() {
			Date d = new Date();
			System.out.println(d);
		}
		@After
		public void after() {
			Date d = new Date();
			System.out.println(d);
		}
		@Test
		public void test1() throws IOException {
		WebElement findElement = driver.findElement(By.name("username"));
		findElement.sendKeys(getData(0,0));}
		
		@Test
		public void test2() throws IOException {
		WebElement findElements = driver.findElement(By.id("password"));
		findElements.sendKeys(getData(0,1));

}}
	