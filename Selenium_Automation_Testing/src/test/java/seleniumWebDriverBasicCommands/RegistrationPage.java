package seleniumWebDriverBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();  
driver.get("http://newtours.demoaut.com/");
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("Eshete");
	}

}
