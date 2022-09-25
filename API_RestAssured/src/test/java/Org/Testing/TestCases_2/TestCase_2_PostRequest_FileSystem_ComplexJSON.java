package Org.Testing.TestCases_2;

import static io.restassured.RestAssured.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class TestCase_2_PostRequest_FileSystem_ComplexJSON 
{
	public static void main(String[] args) throws IOException 
	{
		File torres = new File("../API_RestAssured/ComplexJSON_BodyData.json"); // Created a Connection
		FileReader FR = new FileReader(torres); // Reading the File Character by Character
		JSONTokener JR = new JSONTokener(FR); // Reading the JSON Data
		JSONObject J = new JSONObject(JR); // Storing the JSON Data
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(J.toString())
		.when()
		.post("http://localhost:3000/PostmanAPIFolks");
		
		System.out.println(" The status code of the Request is ");
		System.out.println(Res.statusCode());
		
	}

}
