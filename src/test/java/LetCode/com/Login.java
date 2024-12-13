package LetCode.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	static WebDriver driver;

@Given("Launch Browser")
public void launch_browser() {
	driver =new ChromeDriver();
	driver.get("https://letcode.in/test");
}

@Then("Click on Login button")
public void click_on_login_button() {
    WebElement LoginButton =driver.findElement(By.linkText("Log in"));
    LoginButton.click();
}

@And("Enter Registered Email")
public void enter_registered_email() {
    WebElement Email =driver.findElement(By.name("email"));
    Email.sendKeys("dinex748@rustetic.com");
}

@Then("Enter Registerd Password")
public void enter_registerd_password() {
    WebElement Password = driver.findElement(By.name("password"));
    Password.sendKeys("Johny@123");
    
}

@Then("Click on Login1 button")
public void click_on_login1_button() {
	WebElement LoginButton1 =driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
    LoginButton1.click();
}


}
