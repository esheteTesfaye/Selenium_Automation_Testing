package seleniumWebdriverMidCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class submitForm {
	
		 
		WebDriver driver = null;
		 
		 
		  @BeforeTest
		  public void setup() throws Exception { 
		  // set geckodriver path.
		System.setProperty("webdriver.gecko.driver", utility.DriverPath.firefoxDriver);
		  //initialize firefox driver.
		  driver = new FirefoxDriver();
		         driver.manage().window().maximize();
		         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		         driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html"); 
		  } 
		 
		  @AfterTest
		  public void tearDown() throws Exception { 
		   driver.quit();
		     } 
		  
		  @Test
		  public void LogIn_Test(){
		   driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("MyFName");
		   driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("MyLName");
		   driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys("My Email ID");
		   driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys("My Mob No.");
		   driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("My Comp Name");
		   //To submit form.
		   //You can use any other Input field's(First Name, Last Name etc.) xpath too In bellow given syntax.
		   driver.findElement(By.xpath("//input[@name='Company']")).submit();
		   String alrt = driver.switchTo().alert().getText();
		   driver.switchTo().alert().accept();
		   System.out.println(alrt);
		  }
		}