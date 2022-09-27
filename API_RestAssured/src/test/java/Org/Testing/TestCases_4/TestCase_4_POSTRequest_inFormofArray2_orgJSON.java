package Org.Testing.TestCases_4;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCase_4_POSTRequest_inFormofArray2_orgJSON 
{
	public static void main(String[] args) 
	{
		JSONObject inner1 = new JSONObject();
		inner1.put("House No.","78F");
		inner1.put("Block","F4/G");
		inner1.put("Place","Lodhi Colony Part 1");
		inner1.put("District","Central; Delhi");
		inner1.put("City","Delhi");
		inner1.put("Type","Primary Address");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("House No.","88G");
		inner2.put("Block","H5/A");
		inner2.put("Place","Lodhi Colony Part 2");
		inner2.put("District","Central Delhi");
		inner2.put("Type","Secondary Address");
		
		JSONArray Array1 = new JSONArray();
		Array1.put(0,inner1);
		Array1.put(1,inner2);
		
		JSONObject inner3 = new JSONObject();
		inner3.put("Project Name","HMH");
		inner3.put("Project Domain","E-Learning");
		
		JSONObject inner4 = new JSONObject();
		inner4.put("Project Name","AXON");
		inner4.put("Project Domain","Finance");
		
		JSONArray Array2 = new JSONArray();
		Array2.put(0,inner3);
		Array2.put(1,inner4);
		
		JSONObject outer = new JSONObject();
		outer.put("First Name","Akash");
		outer.put("Last Name","Kumar");
		outer.put("Designation","Software Development Engineer in Test 3");
		outer.put("id","Akash_123");
		outer.put("Address",Array1);
		outer.put("Project",Array2);
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.post("http://localhost:3000/TDDFolks");
		
		System.out.println(" The Status Code of the Request is ");
		System.out.println(Res.statusCode());
		
	}

}
