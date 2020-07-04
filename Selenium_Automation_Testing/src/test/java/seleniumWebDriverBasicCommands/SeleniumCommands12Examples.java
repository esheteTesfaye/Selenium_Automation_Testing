package seleniumWebDriverBasicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands12Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
		//to print the title of the website
		System.out.println(driver.getTitle());
		// to get the current URL
		System.out.println("current page URL is :" + driver.getCurrentUrl());
		// prints you over all code of your current page 
		//System.out.println(driver.getPageSource());
		// to prints you the ID of current window (it will help us to shift from one page(tab) to another page) in a browser
		System.out.println("page ID is : "+driver.getWindowHandle());
		//to maximize a page 
		//driver.manage().window().maximize();
		//to navigate to a different page
		driver.navigate().to("https://www.google.com/");
		// to get back to the previous page or go back 
		driver.navigate().back();
		//to navigate forward page 
		driver.navigate().forward();
		//too close the webpage properly 
		//driver.close();
		//to close the webpage forcefully 
		//driver.quit();

	}

}
