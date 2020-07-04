package ParseJason;



import java.io.FileNotFoundException;
import java.io.FileReader;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonReader
{
    public static void main(String args[])
    {
    	JSONParser parser = new JSONParser();
        try
        {
            Object object = parser.parse(new FileReader("C:\\Users\\eshet\\eclipse-workspace\\Selenium_Automation_Testing\\src\\main\\java\\sample.json"));
                   
            
            //convert Object to JSONObject
            JSONObject jsonObject = (JSONObject)object;
            
            //Reading the String
            String name = (String) jsonObject.get("Name");
            Long age = (Long) jsonObject.get("Age");
            
            //Reading the array
            JSONArray countries = (JSONArray)jsonObject.get("Countries");
            
           /* //Printing all the values
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Countries:");
            for(Object country : countries)
            {
                System.out.println("\t"+country.toString());
            }*/
            
         // assert using if condition
            if(jsonObject.get("Age").toString().contains("10")) {
    			System.out.println("pass");
    		}else {
    			System.out.println("fail");
    		}
        
        }
        
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
