package SeleniumWebDriverAdvanced2;

import org.openqa.selenium.WebDriver;

public class TestLoginPage {

	public static void main(String[] args) {
		WebDriver driver = ChooseBrowser.StartABrowser("Chrome");
		driver.get("http://www.newtours.demoaut.com"); 

	}

}
