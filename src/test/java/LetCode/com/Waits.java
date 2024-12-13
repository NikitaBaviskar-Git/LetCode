package LetCode.com;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Waits {
	static WebDriver driver;
@Given("Open the URL given Page")
public void open_the_url_given_page() {
	driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@And("Click on Waits")
public void click_on_waits() {
	WebElement Click=driver.findElement(By.linkText("Timeout"));
    Click.click();
}

@Then("Click on SimpleAlert")
public void click_on_simple_alert() {
	WebElement SimpleAlert=driver.findElement(By.id("accept"));
	SimpleAlert.click();
	WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));
	w.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	System.out.println("Alert Handled");
}


}
