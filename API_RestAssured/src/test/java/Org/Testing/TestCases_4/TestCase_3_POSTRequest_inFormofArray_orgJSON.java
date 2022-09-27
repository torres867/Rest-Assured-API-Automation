package Org.Testing.TestCases_4;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCase_3_POSTRequest_inFormofArray_orgJSON 
{
	public static void main(String[] args) 
	{
		JSONObject inner1 = new JSONObject();    //inner object 1
		inner1.put("House No.","38G");
		inner1.put("Block","G5/A");
		inner1.put("Place","Lajpat Nagar");
		inner1.put("District","South Delhi");
		inner1.put("City","Delhi");
		inner1.put("Type","Primary Address");
		
		JSONObject inner2 = new JSONObject();    //inner object 2
		inner2.put("House No.","69S");
		inner2.put("Block","S5/H");
		inner2.put("Place","Modal Town");
		inner2.put("District","North Delhi");
		inner2.put("City","Delhi");
		inner2.put("Type","Secondary Address");
		
		JSONArray Array1 = new JSONArray();       //Outer Array 1
		Array1.put(0,inner1);
		Array1.put(1,inner2);
		
		JSONObject inner3 = new JSONObject();        //inner object 3
		inner3.put("Job Location 1","Unitech Building 1");
		inner3.put("Floor", "Second");
		inner3.put("Cubicle","4F");
		inner3.put("Type","Primary Location");
		
		JSONObject inner4 = new JSONObject();             //inner object 4
		inner4.put("Job Location 2","Unitech Building 7");
		inner4.put("Floor", "Fourth");
		inner4.put("Cubicle","6Y");
		inner4.put("Type","Secondary Location");
		
		JSONArray Array2 = new JSONArray();     //Outer Array 2
		Array2.put(0,inner3);
		Array2.put(1,inner4);
						
		JSONObject inner5 = new JSONObject();        //inner object 5
		inner5.put("Project Name","Google Drive");
		inner5.put("Project Type","80%Project");
		inner5.put("Role", "To test that Data is getting stored in the Google Drive");
		
		JSONObject inner6 = new JSONObject();        //inner object 6
		inner6.put("Project Name","Google Maps");
		inner6.put("Project Type","20%Project");
		inner6.put("Role","To test the Navigation");
		
		JSONArray Array3 = new JSONArray();      //Outer Array 3
		Array3.put(0,inner5);
		Array3.put(1,inner6);
		
		JSONObject outer = new JSONObject();     //Outer Object
		outer.put("First Name", "Ashish");
		outer.put("Last Name", "Saha");
		outer.put("Designation", "Software Development Engineer in Test II");
		outer.put("id","Ash256");
		outer.put("Address",Array1);
		outer.put("Job Location",Array2);
		outer.put("Project",Array3);
		
		Response Res = 
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.post("http://localhost:3000/SeleniumFolks");
		
		System.out.println(" The Status Code of the Request is: ");
		System.out.println(Res.statusCode());
		
	}

}
