package LetCode.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Multi_Select {
	static WebDriver driver;

@Given("Open the URL Page")
public void open_the_url_page() {
	driver =new ChromeDriver();
    driver.get("https://letcode.in/test");

}

@And("Click on  MultiSelect button")
public void click_on_multi_select_button() {
	WebElement Click=driver.findElement(By.linkText("AUI - 4"));
    Click.click();
}

@Then("Select All")
public void select_all() {
	List<WebElement> listItems = driver.findElements(By.id("selectable"));
    Actions actions = new Actions(driver);

    for (WebElement item : listItems) 
    {
        actions.moveToElement(item).perform();
    }
    WebElement firstItem = listItems.get(0);
    WebElement lastItem = listItems.get(listItems.size() - 1);

    actions.clickAndHold(firstItem).moveToElement(lastItem).release().perform();
	
}


}
