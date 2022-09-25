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

public class TestCase_3_PostRequest_File_InFormofArray 
{
	public static void main(String[] args) throws IOException 
	{
		File FCB = new File("../API_RestAssured/ArrayJSON_BodyData.json"); // Created a Connection
		FileReader RM = new FileReader(FCB); // Reading the File Character by Character
		JSONTokener BVB = new JSONTokener(RM); // Reading the JSON Data
		JSONObject ACM  = new JSONObject(BVB); // Storing the Object of JSON Data
		
		Response Res = 
		given()
		.contentType(ContentType.JSON)
		.body(ACM.toString())
		.post(" http://localhost:3000/PostmanAPIFolks ");
		
		System.out.println(" The Status Code of the Request is: ");
		System.out.println(Res.statusCode());
		
	}

}
