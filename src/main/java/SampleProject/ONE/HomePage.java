package SampleProject.ONE;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchField;
	
	public void inputItem(String item) {
		searchField.sendKeys(item + Keys.ENTER);
	}
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
