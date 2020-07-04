package seleniumWebdriverMidCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCommandsCompleteListOfTestPage {
	
	
	public static void main(String[] args) {
		

WebDriver driver=new ChromeDriver();
driver.get ("http://www.letef.com/test/testPage.php"); 
driver.findElement(By.name("name")).sendKeys("Eshete");
driver.findElement(By.id("eml")).sendKeys("oneshete@gmail.com");
driver.findElement(By.name("website")).sendKeys("www.bbc.com");
driver.findElement(By.name("comment")).sendKeys("Thank You");
driver.findElement(By.id("other")).click();
driver.findElements(By.name("gender")).get(1).click();
driver.findElement(By.name("bike")).click();
driver.findElement(By.name("car")).click();

boolean isBikeChecked =driver.findElement(By.name("bike")).isSelected();

if(isBikeChecked) {
	driver.findElement(By.name("bike")).click();
	}


boolean isCarChecked =driver.findElement(By.name("car")).isSelected();

if(isCarChecked) {
	driver.findElement(By.name("car")).click();
	}

boolean isBoatChecked =driver.findElement(By.name("boat")).isSelected();

if(isBoatChecked) {
	driver.findElement(By.name("boat")).click();
	}
	
boolean isHorseChecked =driver.findElement(By.name("horse")).isSelected();

if(isHorseChecked) {
	driver.findElement(By.name("horse")).click();
	}
driver.findElement(By.name("bike")).click();
// to open a link on the web page 
//driver.findElement(By.linkText("Open Goodle")).click();
//driver.findElement(By.partialLinkText("Yahoo page")).click();

//to click on alert
driver.findElement(By.id("alert")).click();
//to accept alert or say ok since its not part of the webdriver 

 String alertText= driver.switchTo().alert().getText();
 System.out.println(alertText);

 if(alertText.contains("Solomon")) {
	 System.out.println("faill");
 }
 driver.switchTo().alert().accept();
	

	}

}
