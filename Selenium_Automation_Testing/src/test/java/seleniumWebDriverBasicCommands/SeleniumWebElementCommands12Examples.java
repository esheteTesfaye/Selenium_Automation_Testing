package seleniumWebDriverBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElementCommands12Examples {

	public static void main(String[] args) {
		// learning web elements commands 
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://newtours.demoaut.com");
		// it will help you to store the ELEMENT in one place as a VARIABLE.And you can use that variable afterwards
		WebElement userName = driver.findElement(By.name("userName"));
		// it will find an element and clear it if it has a text inside it
		userName.clear();
		userName.click();
		System.out.println("user name box size is:" +userName.getAttribute("size"));
		System.out.println("user name box type is:" +userName.getAttribute("type"));
		// it will get you the location of an element 
		Point location = userName.getLocation();
		System.out.println("the inpute box is located at:"+ "x="+location.x+ "and y="+location.y);
		//to get the size of the element
		Dimension size = userName.getSize();
		System.out.println("the size of inpute box is:"+ size.height +","+ size.width);
		// to get the tag name of the element
		System.out.println("the tag name of user name element is :" +userName.getTagName());
		//to get the text of the element 
		System.out.println("text of user name is:"+userName.getText());
		// if condition to check user name element is visible 
		
		if (userName.isDisplayed()) {
			System.out.println("Yes user name element is vissible on the current page");
		}else {
			System.out.println("user name element is not visible on the current page");
		}
		
	//if condition to check user name element is active 
		if(userName.isEnabled()) {
			System.out.println("yes username elemnet is active on the page");
			
		}else {
			System.out.println("username element is not acctive on the page ");
		}
		// if condition to specially to check if the radio button is selected by default
		if(userName.isSelected()) {
			System.out.println("element is selected right now");
		}else {
			System.out.println("element is not selected");
			
			// to get the css color 
			System.out.println("background colur of user name element is:"+userName.getCssValue("background-color"));
			//to type on am element 
			userName.sendKeys("Eshete");
			//submite is same as finding and click an element for next action 
			userName.submit();
			
			
		}

	}

}
