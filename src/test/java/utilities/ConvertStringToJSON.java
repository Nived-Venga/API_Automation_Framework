package utilities;

import io.restassured.path.json.JsonPath;

public class ConvertStringToJSON {
	
	public static JsonPath getJSON(String response) {
		JsonPath jsonpath = new JsonPath(response);
		return jsonpath;
	}

}
