package SeleniumWebDriverAdvanced2;

    
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
	public class FileDownload {

	public static void main(String[] args) {

	// Create a profile
	FirefoxProfile profile=new FirefoxProfile();
	// using this preference you can give file path, extension type and any other configurations to the browser

	// Set preferences for file type not to raise any popup window, and use the default one
	profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");

	// Open browser with profile
	WebDriver driver=new FirefoxDriver(profile);

	// Set implicit wait
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	// Maximize window
	driver.manage().window().maximize();

	// Open APP to download application
	driver.get("http://www.filehippo.com/download_adobe_reader");

	// Click on download
	driver.findElement(By.xpath("//*[@id='program-header']/div[4]/a[1]")).click();
	}
}
