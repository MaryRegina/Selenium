package restassuredrequests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PatchRequest {
	
	@Test
	public void testPatch() {
		
		int id= 350;
		JSONObject request = new JSONObject();
		request.put("name","lakshmi");
		request.put("job", "HR");
		System.out.println(request.toJSONString());
		
		given().
			header("content-type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users"+id).
		then().
			statusCode(200).
			log().all();
		
	}

}
