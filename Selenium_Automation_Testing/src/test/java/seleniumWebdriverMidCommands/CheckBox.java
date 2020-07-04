package seleniumWebdriverMidCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		// how to check box 
		WebDriver driver=new ChromeDriver();
		
		driver.get ("http://www.letef.com/test/testPage.php"); 
		
		//select all the check box together store it into a list web element type 
		List<WebElement>checkBoxs=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		//to uncheck the box which is by default is selected 
		for (WebElement checkBox : checkBoxs) {
			if(checkBox.isSelected()) {
				checkBox.click();
			}
		// to check the specific box 
			if(checkBox.getAttribute("value").contains("Bike")) {
			checkBox.click();
		}

}
}
}
