package seleniumWebDriverBasicCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiffretBrowser {

	public static void main(String[] args) {
		

			
			WebDriver driver = new ChromeDriver();
			
			WebDriver driverF = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driverF.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
			driver.get("http://newtours.demoaut.com/");
			driverF.get("http://newtours.demoaut.com/");

			WebElement uName = driver.findElement(By.name("userName"));
			WebElement uNameF = driverF.findElement(By.name("userName"));
		
			driver.findElement(By.name("password")).sendKeys("a");
			driverF.findElement(By.name("password")).sendKeys("a");
			
			driver.findElement(By.name("login")).click();
			driverF.findElement(By.name("login")).click();
		
			if (driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
				System.out.println("Page title in Chrome for pass block >>>>> " + driver.getTitle());
				System.out.println("Chrome Pass");
			} else {
				System.out.println("Page title in Chrome for fail block >>>>> " + driver.getTitle());
				System.out.println("Chrome Fail");
			}

			if (driverF.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
				System.out.println("Page title in Firefox for pass block >>>>> " + driver.getTitle());
				System.out.println("Firefox Pass");
			} else {
				System.out.println("Page title in Firefox for fail block >>>>> " + driver.getTitle());
				System.out.println("Firefox Fail");
			}

			driver.quit();
			driverF.quit();
			
			
		}

	}
