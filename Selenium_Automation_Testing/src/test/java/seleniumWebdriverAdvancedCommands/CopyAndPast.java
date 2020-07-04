package seleniumWebdriverAdvancedCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPast {

	public static void main(String[] args) {
		// This program is to copy and past text from one box to the other and upper case text 
		
		WebDriver driver=new ChromeDriver();
		driver.get ("http://www.letef.com/test/testPage.php"); 
		
	   // saving the nameElement and commentElemets 
		WebElement nameElement = driver.findElement(By.name("name"));
	    WebElement commentElement = driver.findElement(By.name("comment"));
	    
	    //using action library copy text from nameElement 
	     
	    Actions action = new Actions(driver);
	   
	    // using perform in each line is like executing/performing each line of code one by one 
	    
	    action.moveToElement(nameElement).doubleClick().perform();// double click on the text of name field (nameElement)
	    action.keyDown(Keys.CONTROL).sendKeys("c").perform();// holding ctrl + C to copy 
	    action.keyUp(Keys.CONTROL).perform();// releasing ctrl + c
	    action.click(commentElement).perform();// moving the cursor click on the comment field (commentElemnt) 
	    action.keyDown(Keys.CONTROL).sendKeys("v").perform();//pasting the text holding ctrl + V 
	    action.keyUp(Keys.CONTROL).perform();// releasing the keys ctrl + V
	    action.keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).perform();
	    
	   
	    // using build is like saving the action on each line and finaly perform the action all together 
	   
	    /*action.moveToElement(nameElement).doubleClick().build();
	    action.keyDown(Keys.CONTROL).
	    sendKeys("c"). 
	    keyUp(Keys.CONTROL).
	    click(commentElement).
	    keyDown(Keys.CONTROL).
	    sendKeys("v").
	    keyUp(Keys.CONTROL).
	    keyDown(Keys.SHIFT).
	    sendKeys("hello").
	    keyUp(Keys.SHIFT).build().
	    perform();
	   */ 
	}

}
