package ParseJason;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class CreatingJSONFromMap {
	/*Instead of directly putting key and values in a JSONObject, 
	 * we can construct a custom Map and then pass it as an argument to JSONObject‘s constructor.
	 */


	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("name", "jon doe");
		map.put("age", "22");
		map.put("city", "chicago");
		JSONObject jo = new JSONObject(map);
		System.out.println(jo);
	}

}

//This example will produce same results as above: