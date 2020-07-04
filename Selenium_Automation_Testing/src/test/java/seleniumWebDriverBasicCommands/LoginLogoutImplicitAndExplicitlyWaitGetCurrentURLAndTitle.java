package seleniumWebDriverBasicCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogoutImplicitAndExplicitlyWaitGetCurrentURLAndTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// login logout newtours website

		// step 1 is opening google chrome
		WebDriver driver = new ChromeDriver();

		// wait will be applied for any element not available for the first try
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// step 2 is opening http://newtours.demoaut.com (driver.get is to open a
		// website)
		driver.get("http://newtours.demoaut.com");
		// step 3 is finding the user name element (user name inpute box) and typing
		// user name
		driver.findElement(By.name("userName")).sendKeys("a");
		// step 4 is finding the password element and typing password
		driver.findElement(By.name("password")).sendKeys("a");
		// step 5 is finding the signe in element and click sing in
		driver.findElement(By.name("login")).click();

		// Get current page url, title and page source
		driver.get("http://newtours.demoaut.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());// prints you the over all of your current page

		// Get Current Page URL In Selenium WebDriver and Get page title in selenium
		// webdriver
		/*
		 * String url=driver.getCurrentUrl(); String title=driver.getTitle();
		 * if(url.contains("http://newtours.demoaut.com")) {
		 * System.out.println("login is successfull" +url +title); }else {
		 * System.out.println("login is not sucessful"); }
		 */

		// Explicitly wait only works for a specific element for line. using try catch
		/*
		 * try { Thread.sleep(6000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// Applying Explicit wait in webdriver with WebDriver canned conditions.

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("SIGN-OFF"), "Time left: 7 seconds"));

		// step 6 is finding the sign off link and click
		driver.findElement(By.linkText("SIGN-OFF")).click();

	}

}
