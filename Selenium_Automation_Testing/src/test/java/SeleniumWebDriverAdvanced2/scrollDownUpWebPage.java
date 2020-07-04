package SeleniumWebDriverAdvanced2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrollDownUpWebPage {
//Scroll Down-Up Web Page Using Javascript Executor In Selenium Webdriver
	
		WebDriver driver;
		 @BeforeTest
		 public void setup() throws Exception {
		  driver =new ChromeDriver();     
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://only-testing-blog.blogspot.in");
		 }
		 
		 @Test
		 public void Scroll_Page() throws IOException, InterruptedException {
		  //To scroll down web page by 600 pixels In x(vertical) direction.  
		  //You can y parameter to scroll page In horizontal direction.
		  JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  javascript.executeScript("window.scrollBy(0,600)", "");
		  
		  Thread.sleep(3000);
		  
		  //To scroll up web page by 300 pixels In x(vertical) direction.
		  javascript.executeScript("window.scrollBy(0,-300)", "");
		  
		  //Scroll down to bottom of page
		 // If you wants to scroll down to bottom of the page, 
		  Thread.sleep(3000);
		  javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)", ""); 
		  
		  //Scroll to element In selenium WebDriver
		  //If you wants to scroll till some element on page then you can use element parameter In javascript as shown In bellow
		  Thread.sleep(3000);
		  JavascriptExecutor je = (JavascriptExecutor) driver;
		  WebElement element = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		  je.executeScript("arguments[0].scrollIntoView(true);",element);

		  }
		}