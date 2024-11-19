package SampleProject.ONE;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult {
	WebDriver driver;
	
	@FindBy(xpath="//ol[@class='products list items product-items']/li/div")
	List<WebElement>liBag;
	
	public void selectDesiredBage() {
		liBag.get(0).click();
	}
	
	
	
	public SearchResult(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
