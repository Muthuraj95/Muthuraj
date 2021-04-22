package junit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG1 {
@BeforeMethod
private void before() {
	// TODO Auto-generated method stub

System.out.println("before method");}
@AfterMethod
private void after() {
	// TODO Auto-generated method stub
	
System.out.println("after method");
}
@AfterClass
private static void afterclass() {
	// TODO Auto-generated method stub
	
	System.out.println("After class");
}
@BeforeClass
private static void beforeclass() {
	// TODO Auto-generated method stub
	
	System.out.println("Before class");
}
@BeforeSuite
private void beforesuite() {
	// TODO Auto-generated method stub
	
	System.out.println("before suite");
}
@AfterSuite
private void aftersuite() {
	// TODO Auto-generated method stub
	
	System.out.println("after suite");
}
@BeforeTest
private void beforetest() {
	// TODO Auto-generated method stub
	
	System.out.println("before test");}
@AfterTest
private void aftertest() {
	// TODO Auto-generated method stub
	
	System.out.println("aftertest");}
@Test
private void test1() {
	// TODO Auto-generated method stub
System.out.println("test1");

}
@Test
private void test2() {
	// TODO Auto-generated method stub
	
	System.out.println("test2");
}
@Test
private void test3() {
	// TODO Auto-generated method stub
	
	System.out.println("test3");
}

}
