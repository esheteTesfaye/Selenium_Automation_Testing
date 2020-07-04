package ParseJason;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



//Java program for write JSON to a file
public class JSONWriteToAFile {
	public static void main(String[] args) throws FileNotFoundException 
    {
       
        JSONObject jo = new JSONObject();
         
       
        jo.put("firstName", "John");
        jo.put("lastName", "Smith");
        jo.put("age", 25);
         
       
        Map m = new LinkedHashMap(4);
        m.put("streetAddress", "21 2nd Street");
        m.put("city", "New York");
        m.put("state", "NY");
        m.put("postalCode", 10021);
         
       
        jo.put("address", m);
         
        
        JSONArray ja = new JSONArray();
         
        m = new LinkedHashMap(2);
        m.put("type", "home");
        m.put("number", "212 555-1234");
         
        // adding map to list
        ja.add(m);
         
        m = new LinkedHashMap(2);
        m.put("type", "fax");
        m.put("number", "212 555-1234");
         
        // adding map to list
        ja.add(m);
         
        jo.put("phoneNumbers", ja);
        
        PrintWriter pw = new PrintWriter("C:\\Users\\eshet\\eclipse-workspace\\Selenium_Automation_Testing\\src\\main\\java\\com\\test\\Selenium_Automation_Testing\\WriteJsonOnFile");
        pw.write(jo.toJSONString());
         
        pw.flush();
        pw.close();
    }
}
