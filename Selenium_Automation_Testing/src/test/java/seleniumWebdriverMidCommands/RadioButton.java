package seleniumWebdriverMidCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// how to test radio button, list box, check box and multiple selection
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/test/testpage.php");

		// testing radio button
		driver.findElements(By.name("gender")).get(2).click();
		driver.findElement(By.xpath("//*[@id=\"other\"]")).click();

		// how to test radio button using css selector

		driver.findElement(By.cssSelector("input[name='gender'][value='male']")).click();

	}

}
