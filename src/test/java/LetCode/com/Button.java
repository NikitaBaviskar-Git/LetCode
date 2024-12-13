package LetCode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Button {
	static WebDriver driver;
@Given("Open Browser")
public void open_browser() {
    driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@Then("Click on ClickButton")
public void click_on_click_button() {
    WebElement Click=driver.findElement(By.linkText("Click"));
    Click.click();
}

@Then("GotoHome button")
public void goto_home_button() {
	WebElement Gotohome=driver.findElement(By.id("home"));
	Gotohome.click();
	driver.navigate().to("https://letcode.in/buttons");
}

@Then("getlocation")
public void getlocation() {
	WebElement FindLocation=driver.findElement(By.id("position"));
	//FindLocation.click();
	System.out.println(FindLocation.getLocation());
	}

@Then("GetColor")
public void get_color() {
    WebElement getcolor=driver.findElement(By.id("color"));
    //getcolor.click();
    System.out.println(getcolor.getCssValue("background-color"));
}

@Then("Getsize")
public void getsize() {
	WebElement getsize=driver.findElement(By.id("property"));
    getsize.click();
    System.out.println(getsize.getSize());
}

@Then("disabled")
public void disabled() {
	WebElement disabled=driver.findElement(By.id("isDisabled"));
	if(disabled.isEnabled())
	{
		System.out.println("Enabled");
	}
	else
	{
		System.out.println("Disabled");
	}
}

@Then("Hold")
public void hold() {
	WebElement hold=driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[6]/div/button/div/h2"));
	Actions action=new Actions(driver);
	action.clickAndHold(hold).perform();
}


}
