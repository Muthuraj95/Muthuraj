package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseadactin.Baseclass1;
import baseadactin.Sample1;

public class Task1 extends Baseclass1  {
public void facebook() {
	PageFactory.initElements(driver, this);}
@FindBy(id="email")
private WebElement getname; 
@FindBy(id="pass")
private WebElement getpass;
@FindBy(name="login")
private WebElement click;
public WebElement getGetname() {
	return getname;
}
public WebElement getGetpass() {
	return getpass;
}
public WebElement getClick() {
	return click;
}


}


