package SeleniumWebDriverAdvanced2;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class FileUpload {
	public static void main(String[] args) {
	/* By the time when you upload a file a windows directory explorer opens to choose your file
	Which is out of the control of Selenium. To solve this problem there are two methods
	1. use your own sendkyes() tricks
	2. if sendkyes() is not active, we will be forced to use external tracking tools in the middle like 'autoit'
	in this example I will show you how to use your own tricks to upload to a website*/
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.megafileupload.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement upload = driver.findElement(By.id("myfile"));
	upload.sendKeys("/Users/sso/the/local/path/to/darkbulb.jpg");
	driver.findElement(By.id("submit")).click();
	driver.findElement(By.tagName("img"));
}
	}
