package Org.Testing.TestCases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase_1_GetRequest_AllRecord 
{
    public static void main(String[] args) 
    {
    	Response Res =
    	given()
    	.contentType(ContentType.JSON)
    	.when()
    	.get(" http://localhost:3000/PostmanAPIFolks ");
    	
    	System.out.println(" The Status Code of the Request is ");
    	System.out.println(Res.statusCode());
    	
    	System.out.println(" The Response Data of the Request is ");
    	System.out.println(Res.asString());
    	
	}
}
