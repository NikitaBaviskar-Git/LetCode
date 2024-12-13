package LetCode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Elements {
	static WebDriver driver;
	
@Given("Open the Page")
public void open_the_page() {
	driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@And("Click on  FindElements")
public void click_on_find_elements() {
	WebElement Click=driver.findElement(By.linkText("Find Elements"));
    Click.click();
}

@Then("Enter GitUsername")
public void enter_git_username() {
    //
	WebElement TextBox=driver.findElement(By.name("username"));
    TextBox.sendKeys("ortonikc");
    WebElement Search=driver.findElement(By.id("search"));
    Search.click();
   
}

}
