package SeleniumWebDriverAdvanced2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChooseBrowser {

	public static WebDriver StartABrowser(String browserName) {
		WebDriver driver = null;
		if(browserName.toUpperCase().contains("CHROME")) {
			System.out.println("I am going to run Chrome");
			driver = new ChromeDriver();

		}else if (browserName.toUpperCase().contains("FIREFOX")) {
			System.out.println("I am going to run firefoxe");
			driver = new FirefoxDriver();

		}else if (browserName.toUpperCase().contains("IE")) {
			System.out.println("I am going to run IE");
			driver = new InternetExplorerDriver();
	}
		return driver; 
	
	}
}
