package restassuredrequests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequest {
	
	@Test
	public void testPost() {
//		Map<String, Object> map=new HashMap<String, Object>();
//		map.put("name", "jeniffer");
//		map.put("job", "tester");
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		request.put("name","shwetha");
		request.put("job", "tester");
		System.out.println(request.toJSONString());
		
		given().
			header("content-type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().all();
		
	}

}
