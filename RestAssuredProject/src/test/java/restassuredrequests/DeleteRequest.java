package restassuredrequests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequest {
	
	@Test
	public void testDelete() {
		int id=350;
		when().
			delete("https://reqres.in/api/users/2"+id).
		then().
			statusCode(204).
			log().all();
	}

}
