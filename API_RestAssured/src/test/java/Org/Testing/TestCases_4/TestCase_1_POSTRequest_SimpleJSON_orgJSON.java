package Org.Testing.TestCases_4;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCase_1_POSTRequest_SimpleJSON_orgJSON 
{
	public static void main(String[] args) 
	{
		JSONObject FCB = new JSONObject();
		FCB.put("First Name","Gaurav");
		FCB.put("Last Name","Taneja");
		FCB.put("Designation","Test Engineer");
		FCB.put("id","Gaurav_123");
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(FCB.toString())
		.post("http://localhost:3000/PythonFolks");
		
		System.out.println("The Status Code of the Request is ");
		System.out.println(Res.statusCode());
		
	}

}
