package pom;

import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;

import baseadactin.Baseclass1;
import baseadactin.Sample1;

public class Task2 extends Baseclass1{
public static void main(String[] args) {
	launchBrowser();
	launchurl("http://www.fb.com/");
	Insertvalues(new Task1().getGetname(),Myname);
	
}
}
