package LetCode.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DropDown {
	static WebDriver driver;
	
@Given("Open URL")
public void open_url() {
	driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@And("Click on DropDown")
public void click_on_drop_down() {
	WebElement Click=driver.findElement(By.linkText("Drop-Down"));
    Click.click();
}

@Then("Select Visible Text")
public void select_visible_text() {
	WebElement Fruit=driver.findElement(By.id("fruits"));
	Select sc = new Select(Fruit);
    sc.selectByVisibleText("Apple");
}

@And("Select Superhero")
public void select_superhero() {
	WebElement Hero=driver.findElement(By.id("superheros"));
	Select sc = new Select(Hero);
    sc.selectByVisibleText("Thor");
}

@Then("Select AllOptions")
public void select_all_options() {
	WebElement Language=driver.findElement(By.id("lang"));
	Select sc = new Select(Language);
    sc.selectByValue("sharp");
    
    List<WebElement> list1 = sc.getOptions();
	for(WebElement elements: list1)
	{
		System.out.println(elements.getText());
	}
}

@Then("Select India")
public void select_india() {
    // India
	WebElement Country=driver.findElement(By.id("country"));
	Select sc = new Select(Country);
    sc.selectByValue("India");
    WebElement str= sc.getFirstSelectedOption();
    System.out.println(str.getText());


}

}


