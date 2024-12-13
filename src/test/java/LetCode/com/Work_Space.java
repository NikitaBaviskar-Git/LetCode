package LetCode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Work_Space {
  static WebDriver driver;
  
@Given("Open the Browser")
public void open_the_browser() {
    driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@Then("Click on Edit")
public void click_on_edit() {
	WebElement Input_Feature =driver.findElement(By.linkText("Edit"));
	Input_Feature.click();
}

@Then("Enter FullName")
public void enter_full_name() {
	WebElement Fullname =driver.findElement(By.id("fullName"));
	Fullname.sendKeys(" Nikita Baviskar");
}

@Then("Add Append")
public void add_append() {
  	WebElement Append_Data =driver.findElement(By.cssSelector("input[value='I am good']"));
	Append_Data.sendKeys(" Girl ");
	Append_Data.sendKeys(Keys.TAB);
}

@Then("Get Value")
public void get_value() {
	WebElement Get_Attribute =driver.findElement(By.id("getMe"));
	String str= Get_Attribute.getAttribute("value");
	System.out.println("***********************"+str);
}

@Then("Clear Text")
public void clear_text() {
	WebElement ClearText =driver.findElement(By.id("clearMe"));
	ClearText.clear();;
}

@Then("Disabled Box")
public void disabled_box() {
	WebElement DisabledBox =driver.findElement(By.id("noEdit"));
	
	if(DisabledBox.isEnabled())
	{
		System.out.println("Box is Enabled1");
	}
	else
	{
		DisabledBox.click();
		System.out.println("Box is Disabled1");
	}
}

@Then("Enabled Box")
public void enabled_box() {
	WebElement EnabledBox =driver.findElement(By.id("dontwrite"));
	
	if(EnabledBox.isEnabled())
	{
		EnabledBox.click();
		System.out.println("Box is Enabled2");
	}
	else
	{
		System.out.println("Box is Disabled2");
	}
}





}
