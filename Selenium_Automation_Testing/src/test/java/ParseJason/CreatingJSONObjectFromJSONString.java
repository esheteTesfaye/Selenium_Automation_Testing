package ParseJason;

import org.json.JSONObject;

public class CreatingJSONObjectFromJSONString {
	//To parse a JSON String to a JSONObject, we can just pass the String to the constructor.
	//The passed String argument must be a valid JSON otherwise this constructor may throw a JSONException.

	public static void main(String[] args) {
		JSONObject jo = new JSONObject(
				  "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}"
				);
    System.out.println(jo);
	}

}
