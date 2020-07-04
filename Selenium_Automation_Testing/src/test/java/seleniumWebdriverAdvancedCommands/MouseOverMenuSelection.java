package seleniumWebdriverAdvancedCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverMenuSelection {

	public static void main(String[] args) throws InterruptedException {
		// This program is used to mouse over on menu and select from the list  
		
		WebDriver driver=new ChromeDriver();
		driver.get ("http://www.letef.com/test/testPage2.php");
		WebElement menu = driver.findElement(By.id("menu"));
		Actions action = new Actions(driver); 
	    action.moveToElement(menu).build().perform();
	   // action.keyDown(Keys.TAB);
	    action.moveByOffset(100, 100).perform();
	    Thread.sleep(4000);
	    action.click().perform();
	    
		

	}

}
