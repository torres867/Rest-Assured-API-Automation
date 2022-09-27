package Org.Testing.TestCases_4;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCase_2_POSTRequest_ComplexJSON_orgJSON 
{
	public static void main(String[] args)
	{
		JSONObject inner = new JSONObject();
		inner.put("House No.","78V");
		inner.put("Block","T7/H");
		inner.put("Place","Dwarka");
		inner.put("District","South West Delhi");
		inner.put("City","Delhi");
		
		JSONObject outer = new JSONObject();
		outer.put("First Name", "Rishabh");
		outer.put("Last Name","Garg");
		outer.put("Designation","Software Development Engineer in Test");
		outer.put("id","Rishabh_369");
		outer.put("Address",inner);
		outer.put("Project","CS App");
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.post("http://localhost:3000/PythonFolks");
		
		System.out.println(" The Status Code of the Request is ");
		System.out.println(Res.statusCode());
		
		
	}

}
