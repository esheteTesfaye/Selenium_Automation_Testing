package SeleniumWebDriverAdvanced2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class TackScreenShoot {

	
		
		/*taking screenshot helps you to see
		1. when there is error like element not fund
		2. if you need to see the form is correctly filled
		3. to see in any state who the page looks */
	
		public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://google.com");
		// let us tinkg that we are looking un existing element on google home page
		// because it raises an error I will cover it with try{}catch{} error handler
		try{
		driver.findElement(By.id("UnknownID")).sendKeys("just a demo to raise error");
		}catch(Exception e){
		// because the element not found, the compiler comes here and start executing this code
		// I need to take screenshot
		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//The below method will save the screen shot in d drive with name "screenshot.png"
		//The line FileUtils.copyFile(); has been updated to FileHandler.copy()
		FileHandler.copy(srcFile, new File("D:\\screenshot.png"));
		System.out.println("image is save on your D drive");
		}
	}

}
