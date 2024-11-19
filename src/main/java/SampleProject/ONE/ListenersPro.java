package SampleProject.ONE;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersPro implements ITestListener{

	
	static WebDriver driver;

	
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		Reporter.log("TestCase is Passed");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\eclipse-workspace\\ONE\\ScreenShots\\Passed\\TCPassed"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		Reporter.log("TestCase is failed");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\eclipse-workspace\\ONE\\ScreenShots\\Failed\\TCFailed"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
		
	
	
	
	

