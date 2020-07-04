package seleniumWebDriverBasicCommands;
import java.util.Scanner;//bring the library or class to use

public class ToScanFronConsole {

	public static void main(String[] args) {
		// use conditions
		//Scan to read name and score 
		//use while loop to run it forever  
//java can you give me a string space in memory and name it sc and add on it (save on it)  
	// which can handle
		/*using if else statement to give grade report 
		 >= 80 score A
		 80 > X >= 70 score is B
		 70 > X >= 60 score is C
		 60 > X >= 50 score is  D
		 50 > X >=0 score is F
	use conditions
	use scanner to read name and score
	use while loop to run it forever	 

		  */
		// XXX YYY = new XXX();
		int count=1;
		
		while(count <=10) {
			
			
			 Scanner sc =new Scanner(System.in);
				String grade ="N";
				System.out.print("Enter your name: ");
				String Name = sc.next();
				System.out.print("Please inter your score: ");
				double result =sc.nextInt();
				
				if(result > 100) {
				grade = "error";
				
				}else if (result >=80) {
					if(result == 99) {
				       grade ="A+";
					}else {
			
		            	grade = "A";
					}
				}else if (result >=70) {
				grade = "B";
				
				}else if (result >=60) {
				grade ="C";
				
				}else if (result >=50) {
			     grade = "D";
				
				}else if(result >=0){
				 grade ="F";
				 
				}else {
				grade = "R"; // wrong value 
				}
				System.out.println("Hi:" + Name + "your score is:" + grade);
		}
		
	}
	
}
						
						
		
	
