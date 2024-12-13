package LetCode.com;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Window {
	static WebDriver driver;
@Given("Open Window")
public void open_window() {
	driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@And("click on tab")
public void click_on_tab() {
	WebElement Click=driver.findElement(By.linkText("Tabs"));
    Click.click();
}

@Then("click on openHomePage")
public void click_on_open_home_page() {
	WebElement Home=driver.findElement(By.id("home"));
    Home.click();
    System.out.println("Title : "+ driver.getTitle());
    String ParentWindow=driver.getWindowHandle();
    driver.switchTo().window(ParentWindow);
}

@Then("MultiWindow")
public void multi_window() {
	WebElement MultiWindow=driver.findElement(By.id("multi"));
	MultiWindow.click();
	Set<String> Window =driver.getWindowHandles();
	
	for(String handle : Window)
	{
		driver.switchTo().window(handle);
		String WindowTitle =driver.getTitle();
		System.out.println(WindowTitle);
		driver.close();
	}
	
}

}
