package LetCode.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Alerts {
	static WebDriver driver;
	@Given("Open given Url")
	public void open_given_url() {
		driver =new ChromeDriver();
	    driver.get("https://letcode.in/test");
	}

	@Then("Click on Dialog button")
	public void click_on_dialog_button() {
		WebElement Click=driver.findElement(By.linkText("Dialog"));
	    Click.click();
	}

	@Then("Click on Simple Alert")
	public void click_on_simple_alert()  {
		WebElement SimpleAlert=driver.findElement(By.id("accept"));
		SimpleAlert.click();
	    Alert alert=driver.switchTo().alert();
	    alert.accept();
	}

@Then("Click on Confirm Alert")
public void click_on_confirm_alert() {
	WebElement ConfirmAlert=driver.findElement(By.id("confirm"));
	ConfirmAlert.click();
    Alert alert=driver.switchTo().alert();
    System.out.println("Text box contain : "+alert.getText());
    alert.dismiss();
    
}

@Then("Click on Prompt Alert")
public void click_on_prompt_alert() {
	WebElement PromptAlert=driver.findElement(By.id("prompt"));
	PromptAlert.click();
    Alert alert=driver.switchTo().alert();
    alert.sendKeys("Nikita ");
    alert.accept();
}

@Then("Click on Modern Alert")
public void click_on_modern_alert() {
	WebElement ModernAlert=driver.findElement(By.id("modern"));
	ModernAlert.click();
	
	
}




}
