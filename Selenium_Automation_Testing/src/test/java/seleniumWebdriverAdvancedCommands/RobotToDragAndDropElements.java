package seleniumWebdriverAdvancedCommands;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotToDragAndDropElements {

	public static void main(String[] args) throws AWTException {
		// This program is to drag and drop elements using Robot Java class
		
		WebDriver driver=new ChromeDriver();
		driver.get ("http://localhost:80/test/testPage.php");
		WebElement menu = driver.findElement(By.id("menu"));
		Robot robot = new Robot();
		Point element2 = driver.findElement(By.id("c2")).getLocation();
		
		
		

	}

}
