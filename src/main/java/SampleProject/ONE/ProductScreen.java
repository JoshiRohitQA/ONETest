package SampleProject.ONE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductScreen {
	WebDriver driver;
	
	@FindBy(xpath="//button[@title='Add to Cart']")
	WebElement addTocart;
	
	@FindBy(xpath = "(//span[@class='counter qty'])[1]")
	WebElement quantity;
	
	@FindBy(xpath="//div[@data-block='minicart']")
	WebElement cart;
	
	@FindBy(xpath="//div[@class='items-total']")
	WebElement itemTotal;
	
	
	
	
	public void clickAddedCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(quantity));
		cart.click();
	}
	
	
	public void clickAddtoCart() {
		addTocart.click();
	}
	
	public ProductScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
