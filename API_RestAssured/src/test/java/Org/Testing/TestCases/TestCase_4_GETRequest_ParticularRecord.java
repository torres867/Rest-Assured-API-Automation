package Org.Testing.TestCases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase_4_GETRequest_ParticularRecord 
{
	public static void main(String[] args) 
	{
		Response Res =
		given()		
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/RestAssuredAPIFolks/Shubh123");
		
		System.out.println(" The status code of the GET Request is ");
		System.out.println(Res.statusCode());
		
		System.out.println(" The Response Data of the GET Request is ");
		System.out.println(Res.asString());
				
	}

}
