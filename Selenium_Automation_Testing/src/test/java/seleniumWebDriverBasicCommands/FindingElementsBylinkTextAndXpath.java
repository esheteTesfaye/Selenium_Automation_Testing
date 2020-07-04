package seleniumWebDriverBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementsBylinkTextAndXpath {

	public static void main(String[] args) {
		// to find an element by xpath. this is an absolute xpath
		WebDriver driver=new ChromeDriver();
		
		driver.get ("http://www.letef.com/test/testPage.php"); 
		
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("bbc.com");
		
		// to find element by relative xpath
		// two double slash from the beginning "//" which means start anywhere 
		driver.findElement(By.xpath("//form/textarea")).sendKeys("i found the element throught relative xpath");
		
// to find element by link text and partial link text 
		driver.findElement(By.linkText("Open Goodle")).click();
		
		driver.findElement(By.partialLinkText("open Yahoo page")).click();
// to find element by class name 
		driver.findElement(By.className("special")).click();
// to find element by tag name 
	driver.findElement(By.tagName("textarea")).sendKeys("by tag name");
	}

}
