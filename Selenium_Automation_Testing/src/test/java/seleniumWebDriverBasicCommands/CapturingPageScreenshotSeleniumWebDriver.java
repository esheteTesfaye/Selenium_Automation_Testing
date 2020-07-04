package seleniumWebDriverBasicCommands;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingPageScreenshotSeleniumWebDriver {

	public static void main(String[] args) throws IOException {
		//Capturing entire page screenshot in Selenium WebDriver
		
		WebDriver driver=new ChromeDriver();  
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Eshete");
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File("C:\\screenshot.jpg"));
		
		//The below method will save the screen shot in D drive with name "screenshot.png"
		//The line FileUtils.copyFile(); has been updated to FileHandler.copy()
		FileHandler.copy(screenshot, new File("D:\\screenshot.png"));

	}

}
