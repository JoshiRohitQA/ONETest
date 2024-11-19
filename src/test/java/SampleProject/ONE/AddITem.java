package SampleProject.ONE;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddITem extends LaunchQuit{
	
	@Test(retryAnalyzer = SampleProject.ONE.RetryPro.class,dataProvider = "inputs")
	public void addTest(String items) {
		HomePage hp = new HomePage(driver);
		hp.inputItem(items);
		SearchResult sr = new SearchResult(driver);
		sr.selectDesiredBage();
		ProductScreen ps = new ProductScreen(driver);
		ps.clickAddtoCart();
		ps.clickAddedCart();
		
		Assert.assertTrue(ps.itemTotal.isDisplayed());
	}
	
	@DataProvider(name="inputs")
	public Object[][] data1(){
		return new Object[][] {{"bag"}};
		
	}
		
	

}
