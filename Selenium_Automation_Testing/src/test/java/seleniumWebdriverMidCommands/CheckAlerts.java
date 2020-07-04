package seleniumWebdriverMidCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlerts {

	public static void main(String[] args) {

		// Testing 3 types of alerts alerts, confirm and prompt

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/test/testpage.php");

		// Accessing ALERT
		driver.findElement(By.id("alert")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// Accessing CONFIRM both OK and Cancel

		driver.findElement(By.id("confirm")).click();
		// driver.switchTo().alert().accept();//to click accept button of prompt

		driver.switchTo().alert().dismiss();// to click cancel button of prompt

		if (driver.findElement(By.id("demo")).getText().contains("Cancel")) {
			System.out.println("Confirm Cancel is working");
		} else {
			System.out.println("confirm Cancel is not working properly");
		}

		// Accessing PROMPT
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Eshete");
		// driver.switchTo().alert().dismiss();//to click Cancel
		driver.switchTo().alert().accept();// to click OK
		if (driver.findElement(By.id("demo")).getText().contains("Eshete")) {
			System.out.println("Prompt with Ok button is working");
		} else {
			System.out.println("Prompt with Ok button is not working");
		}

		// this is to automatically fill the alert and enter input

		/*
		 * driver.findElement(By.name("name")).sendKeys("Eshete");
		 * 
		 * //
		 * 
		 * String text = driver.findElement(By.id("demo")).getText();
		 * if(text.contains("Eshete")) { System.out.println("pass"); }else {
		 * System.out.println("fail"); }
		 */

	}

}
