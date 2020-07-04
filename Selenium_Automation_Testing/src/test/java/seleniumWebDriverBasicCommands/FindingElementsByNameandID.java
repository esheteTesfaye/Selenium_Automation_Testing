package seleniumWebDriverBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementsByNameandID {

	public static void main(String[] args) {
		// webdriver finding elements by ID, name,link text, partial lin text, xpath(absolute & relative),
		//classname,css selector, tagname 
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.letef.com/test/testPage.php");
		driver.findElement(By.name("name")).sendKeys("Eshete");
		driver.findElement(By.id("eml")).sendKeys("oneshete@gmail.com");
		driver.findElement(By.name("website")).sendKeys("bbc.com");
		driver.findElement(By.name("comment")).sendKeys("I am doing Great");

	}

}
