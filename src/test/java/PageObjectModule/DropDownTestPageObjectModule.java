package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestPageObjectModule {
WebDriver driver;

	
	@FindBy(xpath= "//select[@id='fruits']")
	WebElement Select_a_fruit;
	
    @FindBy(xpath= "//select[@id='lang']")
	//@FindBy(xpath= "//option[@value='sharp']")
    WebElement Select_a_Programming_Language;
    
    @FindBy(xpath = "//h1[@class='title has-text-centered is-pulled-left']")
    WebElement DropDown;
    
    @FindBy(xpath= "//select[@id= 'country']")
    WebElement Select_India_Using_Values;
    
    public DropDownTestPageObjectModule(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    public void I_Select_a_Fruit()throws InterruptedException {
    	Select taken = new Select(Select_a_fruit);
    	taken.selectByVisibleText("Pine Apple");
    	Thread.sleep(5000);
    }
    
    
    public void I_Select_Programming_Language() throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", Select_a_Programming_Language);
    	Select taken = new Select(Select_a_Programming_Language);
    	taken.selectByValue("sharp");
    	//Select taken = new Select(Select_a_Programming_Language);
    	//taken.selectByVisibleText("C#");
    	Thread.sleep(3000);
    	JavascriptExecutor js2 = (JavascriptExecutor) driver;
    	js2.executeScript("arguments[0].scrollIntoView(true);", DropDown);
    	
    }
    public void SelectCountry() {
    	Select Country = new Select(Select_India_Using_Values);
    	Country.selectByValue("India");
    }
    public void I_Close_The_Browser() {
    	driver.close();
    }
}

