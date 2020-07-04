package seleniumWebdriverAdvancedCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEventsInWebdriver {

	public static void main(String[] args) {
		//  Action classes : build() and perform() methods. To mouse move/hover and key events In WebDriver
		WebDriver driver=new ChromeDriver();
		
		Actions action = new Actions(driver);
		WebElement moveonmenu = driver.findElement(By.xpath("//div[@id='menu1']/div"));
		action.moveToElement(moveonmenu).moveByOffset(50, 100).build().perform();
		action.dragAndDrop(SoruceElement, DestiantionElement).build().perform();
		action.contextClick(element).build.perform();
		action.keyDown(targetElement, Keys.CONTROL.ARROW_DOWN);
		action.keyUp(targetElement, Keys.CONTROL);

	}

}
