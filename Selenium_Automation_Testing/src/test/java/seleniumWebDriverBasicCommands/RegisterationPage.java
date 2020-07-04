package seleniumWebDriverBasicCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Eshete");
		driver.findElement(By.name("lastName")).sendKeys("Tesfeye");
		driver.findElement(By.name("phone")).sendKeys("6129870926");
		driver.findElement(By.id("userName")).sendKeys("oneshete@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("8914 Waldren Way");
		driver.findElement(By.name("city")).sendKeys("Lorton");
		driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.name("postalCode")).sendKeys("22079");
		Select oSelect = new Select(driver.findElement(By.name("country")));
		oSelect.selectByVisibleText("ETHIOPIA");

		// Using Select class for selecting value from dropdown

		// Select dropdown = new Select(driver.findElement(By.name("country")));
		// dropdown.selectByVisibleText("UNITED KINGDOM");

		driver.findElement(By.id("email")).sendKeys("wagon");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		driver.findElement(By.name("register")).click();
		Thread.sleep(15000);
		driver.quit();

	}

}
