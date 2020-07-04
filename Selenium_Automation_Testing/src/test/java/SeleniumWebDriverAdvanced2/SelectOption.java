package SeleniumWebDriverAdvanced2;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class SelectOption {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.name("userName")).sendKeys("a");
	driver.findElement(By.name("password")).sendKeys("a");
	driver.findElement(By.name("login")).click();
	//to select one way flight using cssselector, you can also select by name only
	driver.findElement(By.cssSelector("input[type='radio'][name='tripType'][value='oneway']")).click();
	//to fill number of passengers into 2 person using cssselector
	driver.findElement(By.cssSelector("select>option[value='2']")).click();
	//to change departure to London using sendkey to the list box
	driver.findElement(By.name("fromPort")).sendKeys("London");

	//to change departure month to 'May' using using Selenium Select Class.
	Select oSelect = new Select(driver.findElement(By.name("fromMonth")));
	oSelect.selectByVisibleText("May");// use also index and value to select
	// Exercise do the same above for the day part

	// to select depart

}
	}
