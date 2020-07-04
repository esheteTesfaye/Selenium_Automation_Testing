package SeleniumWebDriverAdvanced2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TackScreenShoot2 {

	
		 WebDriver driver = null;
		 
		 @BeforeTest 
		 public void beforetest() {
		  System.setProperty("webdriver.gecko.driver", utility.DriverPath.firefoxDriver);
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		 }
		 
		 @AfterTest
		 public void aftertest() {
		 driver.quit();
		  
		 }
		 
		 @Test
		 public void test () throws InterruptedException, IOException 
		 { 
		  //Capture entire page screenshot and then store it to destination drive
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshot, new File("D:\\screenshot.jpg"));
		  System.out.print("Screenshot is captured and stored in your D: Drive");
		 }		
		 
}
