package Org.Testing.TestCases_5;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase_1_POSTRequest_SimpleJSON_PojoClass 
{
	public static void main(String[] args) 
	{
		BasicInformation_1 basic = new BasicInformation_1();
		basic.setFirst_Name("Akash");
		basic.setLast_Name("Pandey");
		basic.setDesignation("Software Test Engineer");
		basic.setId("Akash_369");
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.post("http://localhost:3000/ManualFolks");
		
		System.out.println(" The Status Code of the Request is ");
		System.out.println(Res.statusCode());
	}

}
