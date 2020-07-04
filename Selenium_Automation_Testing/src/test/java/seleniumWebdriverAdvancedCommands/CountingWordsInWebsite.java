package seleniumWebdriverAdvancedCommands;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingWordsInWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get paragraph and save it into a variable
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		         
				String str = driver.getPageSource();
				String[] splitStr = str.split("\\s+");
				System.out.println(splitStr[10]);
				
				HashMap<String, Integer > count = new HashMap();
				for(int i=0; i<splitStr.length; i++) {
					System.out.println(splitStr[i]);
					if(count.get(splitStr[i])==null) {
					  count.put(splitStr[i], 1);
					}else {
					int currentWordCount = count.get(splitStr[i]) +1;
					count.put(splitStr[i], currentWordCount); 
				}


			}

		 for(String a: count.keySet()) {
			 System.out.println(a + "==" + count.get(a));
		 }
		}
		
	}


