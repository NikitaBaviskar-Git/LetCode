package LetCode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Radio {
	static WebDriver driver;
@Given("Go to Browser")
public void go_to_browser() {
	driver =new ChromeDriver();
    driver.get("https://letcode.in/test");
}

@And("Click on Toggle")
public void click_on_toggle() {
	WebElement Click=driver.findElement(By.linkText("Toggle"));
    Click.click();
}

@Then("Click any one")
public void click_any_one() {
	WebElement SelectOne=driver.findElement(By.id("yes"));
	SelectOne.click();
}

@And("Select Radio button")
public void select_radio_button() {
	WebElement Radio=driver.findElement(By.id("two"));
	Radio.click();
}

@Then("Find Bug")
public void find_bug() {
	WebElement FindBug=driver.findElement(By.id("nobug"));
	FindBug.click();
	//WebElement FindBug1=driver.findElement(By.id("bug"));
	//FindBug1.click();
	if(FindBug.isSelected())
	{
		System.out.println(" NOT A BUG ");
	}
	else
	{
		WebElement FindBug1=driver.findElement(By.id("bug"));
		FindBug1.click();
	}

}

@Then("Which_Selected")
public void which_selected() {
    //notfoo
	WebElement First=driver.findElement(By.id("foo"));
	WebElement Second=driver.findElement(By.id("notfoo"));
	
	if(First.isSelected())
	{
		System.out.println("Foo Selected ");
	}
	else
	{
		System.out.println(" Bar selected ");
	}
}
@Then("Last Selected")
public void last_selected() {
	
	WebElement First=driver.findElement(By.id("going"));
	if(First.isEnabled())
	{
		System.out.println("First is Enabled");
	}
	
	WebElement Second=driver.findElement(By.id("notG"));
	if(Second.isEnabled())
	{
		System.out.println("Second is Enabled");
	}
	WebElement Third=driver.findElement(By.id("maybe"));
	if(Third.isEnabled())
	{
		System.out.print("Third is Enabled");
	}
	else 
	{
		System.out.println("Third is Disabled");
	}
	
	
}

@Then("Checkbox selected")
public void checkbox_selected() {
	WebElement CheckBox=driver.findElement(By.cssSelector("input[type='checkbox']"));
	if(CheckBox.isSelected())
	{
		System.out.println("CheckBox is Selected");
	}
}

@Then("Select checkbox")
public void select_checkbox() {
	WebElement CheckBox1=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input"));
	CheckBox1.click();
}

}
