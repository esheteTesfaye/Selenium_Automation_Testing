package ParseJason;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ProcessJsonFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get the json text, it might be from file 
		String myJsonAsSTring="{\"firstName\":\"Solomon\", \"lastName\":\"habtu\", \"age\":\"35\"}";
		JsonParser p = new JsonParser();
		JsonObject jo= new JsonObject();
		jo=(JsonObject) p.parse(myJsonAsSTring);
		System.out.println(jo.get("age"));
		if(jo.get("age").toString().contains("35")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		// like testNG, cucumber, ==>
		
		// buffer reader and scanner ==> file console RestAsured
		
		// Q1= parse a json text and print each key and value combinations 
		// read a json file and save it as a string
		// parse the string and save it as JsonObject
		// parse json object to get each key and value combinations
		// print them 
		// assert using if condition
		// \n \t \\
		// read from json
		
		
		
	}

}
