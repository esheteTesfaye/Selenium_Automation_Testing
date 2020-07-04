package seleniumWebdriverMidCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wordSearchOnGoole {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", utility.DriverPath.chromeDriver);
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com");
		driver.findElement(By.className("gLFyf gsfi").name("q")).sendKeys("selenium",Keys.ENTER);
		
	}

}
