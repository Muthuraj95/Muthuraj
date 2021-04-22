package junit;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class Test4 {
public static WebDriver driver;
	@BeforeClass
public static void beforeclass() {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\New java files\\Project1\\Driver\\chromedriver.exe");	
driver = new  ChromeDriver();
driver.get("https://www.facebook.com/");
String url = driver.getCurrentUrl();
Assert.assertEquals("https://www.facebook.com/",url);
	}
@BeforeMethod
public void before() {
	System.out.println("By Assert Validation");
	// TODO Auto-generated method stub

}
@AfterMethod
@org.junit.Ignore
public void after() {
	// TODO Auto-generated method stub
Date d = new Date();
System.out.println(d);
}

@AfterClass
public static void afterclass() {
	// TODO Auto-generated method stub
System.out.println("Working...exit()");
}
@Test

public void test1() {
	// TODO Auto-generated method stub
	WebElement findElement = driver.findElement(By.id("email"));	
	findElement.sendKeys("muthunesik");
	String s =findElement.getAttribute("value");
//	Assert.assertTrue("Assert Works",s.contains("gmal"));
	AssertJUnit.assertFalse("Assert Works again",s.contains("muthunsik"));
	System.out.println("test1");
}

@Test
public void test2() {
	// TODO Auto-generated method stub
	WebElement findElement = driver.findElement(By.id("pass"));
	findElement.sendKeys("pass");
	String s = findElement.getAttribute("value");
	Assert.assertEquals("pass",s);
	System.out.println("test2");
}

@Test
public void test3() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.findElement(By.name("login")).click();
	String url = driver.getCurrentUrl();
//	System.out.println(url);
	Thread.sleep(5000);
	AssertJUnit.assertTrue("https://www.facebook.com/", url.contains("facebook.com/"));
	System.out.println("test3");
}
}

