package LetCode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Drop {
	static WebDriver driver;
	@Given("Open Page")
	public void open_page() {
		driver =new ChromeDriver();
	    driver.get("https://letcode.in/test");
	}

	@And("Click on Drop")
	public void click_on_drop() {
		WebElement Click=driver.findElement(By.linkText("AUI - 2"));
	    Click.click();
	}

	@Then("DragandDrop Box")
	public void dragand_drop_box() {
		WebElement Drag=driver.findElement(By.id("draggable"));
		WebElement Drop=driver.findElement(By.id("droppable"));
		Actions action =new Actions(driver);
		action.dragAndDrop(Drag, Drop).perform();
	}

}
