package seleniumWebdriverMidCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAndMultipleSelectionAndDeselection {

	public static void main(String[] args) {

		// testing list box and list box with multiple selection

		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/test/testpage.php");
		// using send keys
		driver.findElement(By.name("country")).sendKeys("Ethiopia");
		// using xpath
		driver.findElement(By.xpath("/html/body/form/select[1]/option[4]")).click();
		// using css selector
		// find an element by country and find an element inside look a value
		driver.findElement(By.name("country")).findElement(By.cssSelector("option[value='ETHIOPIA']")).click();

		// multiple selection
		driver.findElement(By.xpath("/html/body/form/select[2]/option[3]")).click();
		driver.findElement(By.xpath("/html/body/form/select[2]/option[4]")).click();
		driver.findElement(By.xpath("/html/body/form/select[2]/option[5]")).click();

		// Multiple selection using select class

		Select skill = new Select(driver.findElement(By.name("skill")));
		skill.deselectAll();
		skill.selectByIndex(1);
		skill.selectByValue("ba");
		skill.selectByVisibleText("Database");
	}

}
