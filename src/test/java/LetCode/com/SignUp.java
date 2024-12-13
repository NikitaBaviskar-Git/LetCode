package LetCode.com;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignUp {
static WebDriver driver;

@Given("Launch the Browser")
public void launch_the_browser() {
   driver =new ChromeDriver();
   driver.get("https://letcode.in/test");
}

@Then("click on Signup button")
public void click_on_signup_button() {
    WebElement SignupButton =driver.findElement(By.linkText("Sign up"));
    SignupButton.click();
}
@Then("Enter Name")
public void enter_name() {
	 WebElement Name =driver.findElement(By.id("name"));
	 Name.sendKeys("Johny");
}

@And("Enter Email")
public void enter_email() {
	WebElement Email =driver.findElement(By.id("email"));
	Email.sendKeys("dinex748@rustetic.com");
}

@And("Enter Password")
public void enter_password() {
	WebElement Password =driver.findElement(By.id("pass"));
	Password.sendKeys("Johny@123");
}

@Then("Click CheckBox")
public void click_check_box() {
	WebElement CheckBox =driver.findElement(By.cssSelector("input[type='checkbox']"));
	CheckBox.click();
	
}

@And("Click on SignUp button")
public void click_on_sign_up_button() {
    WebElement SignUpButton =driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/div/div/form/div[5]/p/button"));
    SignUpButton.click();
}
/*
@Then("Click on SignOut button")
public void click_on_sign_out_button() {
	 WebElement SignoutButton =driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[2]/div/div/a"));
	    SignoutButton.click();
}
*/
}
