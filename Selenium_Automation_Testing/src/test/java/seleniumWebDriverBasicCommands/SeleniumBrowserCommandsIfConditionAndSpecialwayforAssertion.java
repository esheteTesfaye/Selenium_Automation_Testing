package seleniumWebDriverBasicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumBrowserCommandsIfConditionAndSpecialwayforAssertion  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://newtours.demoaut.com");
		
		//to print the title of the website. getting the title helps 
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		// if condition for assertion 
		if(title.contains("Welcome: Mercury Tours")){
		System.out.println("You are in the right page");
		
		}else { 
			System.out.println("You are in the wrong page");
		}
		
		//special way of assertion 
		Assert.assertTrue(title.contains("Welcome: Mercury Tours"));
		System.out.println(title);
		

		

	}

}
