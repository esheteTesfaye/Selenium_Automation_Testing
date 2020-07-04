package seleniumWebdriverAdvancedCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OvermouseAndGetBackGroundColour {

	public static void main(String[] args) {
		//this program will over mouse on a link and check the background color is changing 
		
		WebDriver driver=new ChromeDriver();
		driver.get ("http://www.letef.com/test/testPage.php"); 
        
		WebElement googlelink = driver.findElement(By.partialLinkText("Open Google"));
		Actions action = new Actions(driver);
		String bgColor= googlelink.getCssValue("background-color");
		System.out.println("background color before overmouse is =" + bgColor);
		action.moveToElement(googlelink).build().perform();
		bgColor = googlelink.getCssValue("background-color");
		System.out.println("background color after over mouse is=" + bgColor);
	}

}
