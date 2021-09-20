package restassuredrequests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutRequest {
	
	@Test
	public void testPut() {
		
		int id= 350;
		JSONObject request = new JSONObject();
		request.put("name","Roopa");
		request.put("job", "HR");
		System.out.println(request.toJSONString());
		
		given().
			header("content-type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("https://reqres.in/api/users"+id).
		then().
			statusCode(200).
			log().all();
		
	}

}
