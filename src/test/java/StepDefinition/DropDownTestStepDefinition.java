package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import PageObjectModule.DropDownTestPageObjectModule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownTestStepDefinition {
	DropDownTestPageObjectModule calculate;
	
public static WebDriver driver;
	
	@Given("Launch the Browser and Open the LetCode DropDown Page")
	public void launch_the_browser_and_open_the_let_code_drop_down_page() {
		System.setProperty("webdriver.edge.driver","C:\\\\WebDriver\\\\edgedriver_win64\\\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		calculate = new DropDownTestPageObjectModule(driver);
	}
	@When("I Select Pine Apple From the Fruit DropDown")
	public void i_select_pine_apple_from_the_fruit_drop_down() throws InterruptedException {
	   calculate.I_Select_a_Fruit();
	  
	}
	@When("I Select  the Last Programming Language From the DropDown")
	public void i_select_the_last_programming_language_from_the_drop_down() throws InterruptedException {
	   calculate.I_Select_Programming_Language();
	}
	@When("Select India from DropDown")
	public void select_india_from_drop_down() {
	   calculate.SelectCountry();
	}
	@Then("I Close the Browser")
	public void i_close_the_browser() {
	   calculate.I_Close_The_Browser();
	}

}
