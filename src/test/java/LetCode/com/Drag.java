package LetCode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Drag {
	static WebDriver driver;
//

@Given("Get Browser")
public void get_browser() {
	driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@Then("Click on Drag")
public void click_on_drop() {
	WebElement Click=driver.findElement(By.linkText("AUI - 1"));
    Click.click();
}

@Then("Drag Box")
public void drag_box() {
	WebElement Drag=driver.findElement(By.id("sample-box"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(Drag, 400, 400).perform();
}



}
