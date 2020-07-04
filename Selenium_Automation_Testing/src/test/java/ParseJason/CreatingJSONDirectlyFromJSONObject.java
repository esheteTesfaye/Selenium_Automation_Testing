package ParseJason;

import org.json.simple.JSONObject;

public class CreatingJSONDirectlyFromJSONObject {
	/*
	 * JSONObject exposes an API similar to Java’s Map interface. We can use the
	 * put() method and supply the key and value as an argument:
	 */
	// comment for github push
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		System.out.println(jo);

	}

}

// Now our JSONObject would look like: on consul

// this comment is pushed for github