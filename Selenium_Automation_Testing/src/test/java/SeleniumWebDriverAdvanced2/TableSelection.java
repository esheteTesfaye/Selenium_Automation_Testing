package SeleniumWebDriverAdvanced2;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;

	public class TableSelection {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.united.com/ual/en/us/flight-search/book-a-flight");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id='roundTripOption']/div[4]/div[1]/label")).click();
	//driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
	String month = driver.findElement(By.className("ui-datepicker-month")).getText();
	String year = driver.findElement(By.className("ui-datepicker-year")).getText();
	while(!(month.contains("June") && year.contains("2016"))){
	//go to next month
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
	month = driver.findElement(By.className("ui-datepicker-month")).getText();
	year = driver.findElement(By.className("ui-datepicker-year")).getText();
	}
	List<WebElement> tableDays=(List<WebElement>) driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr/td/a"));
	for(WebElement trDay: tableDays){
	if(trDay.getText().contains("21")){
	trDay.click();
	System.out.println("I clicked 21 date");
	System.exit(0);
	}
	}

}
	}
