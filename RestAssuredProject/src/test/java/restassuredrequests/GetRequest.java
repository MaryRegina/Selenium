package restassuredrequests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import io.restassured.response.Response;

public class GetRequest {
	
	@Test
	public void testGet() {
		Response response = get("https://reqres.in/api/users?page=2");
		
		//System.out.println(response.getHeaders());
		//System.out.println(response.getHeader("content-type")); or
		System.out.println(response.getContentType());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		
		int status=response.getStatusCode();
		Assert.assertEquals(status,200);
	}
	
	@Test
	public void testGet1() {
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
		    header("content-type","application/json; charset=utf-8").
		    log().all().
		    body("data.id[3]",equalTo(10)).
		    body("data.first_name", hasItems("Jeniffer","Asha","Nikitha"));
	}

	
	
	
	

}
