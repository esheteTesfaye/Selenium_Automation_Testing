package SeleniumWebDriverAdvanced2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DisableFirfoxDownloadWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("browser.download.folderList",2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false); 
		firefoxProfile.setPreference("browser.download.dir","c:\\downloads"); 
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");
		WebDriver driver = new FirefoxDriver((Capabilities) firefoxProfile);
		//new RemoteWebDriver(new URL("http://localhost:/wd/hub"), capability); driver.navigate().to("http://www.myfile.com/hey.csv");


	}

}
