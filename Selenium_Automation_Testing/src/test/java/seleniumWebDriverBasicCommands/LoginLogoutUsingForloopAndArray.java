package seleniumWebDriverBasicCommands;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutUsingForloopAndArray {

	

			public static void main(String[] args) throws InterruptedException {
				int max=7; // let you read the value from the box 
				Scanner scan = new Scanner(System.in);
				System.out.print("inter the number you want to repeat : ");
				//max=scan.nextInt();
				// I generate test data 
				// find defect, don do exhaustive testing, error free test is a flacy solomon, solomon, xxxx 
				String listOfName[]= {"a", "b", "a", "a", "dfasdf", "asfanat", "asdfsdafsdaf", ""};
				String listOfPassword[]= {"a", "b", "fsdfsfa", "","a", "", "fdgsdfhgdsfhfd", ""};
				String lss="mercuryreservation";
				String lff="mercurysignon";
				String expectedList[]= {lss, lss, lff, lff, lff, lff, lff, lff};
				
				// 
				
				// array ==> way of storing similar values in a lit ==> so that you can pick values as you want 

				for (int i = 0; i < listOfName.length; i++) {

					// basic java data types int, String, boolian, double
					String userName = listOfName[i];
					String pass = listOfPassword[i];
					double abcd = 10.5;

					// loop = repeat someting again and agina (for, while, do)
					// Open newtrours.demoaut.com
					System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
					WebDriver driver = new FirefoxDriver();
					driver.get("http://www.newtours.demoaut.com/");
					driver.findElement(By.name("userName")).sendKeys(userName);
					WebElement element = driver.findElement(By.name("password"));
					element.sendKeys(pass);
					// driver.findElement(By.name("Login")).click();
					element.submit();
					System.out.println(userName);
					Thread.sleep(10000); // let us sleep for 7sec
					String url = driver.getCurrentUrl();

					// if user name and password is correct then the the url contains mut contians
					// mercuryreservation.
					// if either user name or pssowrd is not correct then url contians mercurysignon
					// text
					// java if conditon
					if (url.contains(expectedList[i])) {
						System.out.println("Test Case pass");

					} else {
						System.out.println("Test case failed ");

					}
					// what is the diff b/n colse and quite
					// driver.close(); // colse the active tab
					driver.quit(); // colse the browser itself
				}
			}

		}
