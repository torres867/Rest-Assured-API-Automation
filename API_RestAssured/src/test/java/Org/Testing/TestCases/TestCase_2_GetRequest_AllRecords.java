package Org.Testing.TestCases;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase_2_GetRequest_AllRecords 
{
	public static void main(String[] args) 
	{
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("  http://localhost:3000/RestAssuredAPIFolks ");
		
		System.out.println(" The Status Code of the GET Request is ");
		System.out.println(Res.statusCode());
		
		System.out.println(" The Response Data of The Get Request is ");
		System.out.println(Res.asString());
	}

}
