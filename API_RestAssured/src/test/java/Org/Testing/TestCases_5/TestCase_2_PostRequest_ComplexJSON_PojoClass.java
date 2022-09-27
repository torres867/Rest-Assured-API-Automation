package Org.Testing.TestCases_5;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase_2_PostRequest_ComplexJSON_PojoClass 
{
	public static void main(String[] args) 
	{
		AddressInformation_2 address = new AddressInformation_2();
		address.setHouse_No("76E");
		address.setBlock("H3/A");
		address.setPlace("Pritam Pura");
		address.setDistrict("North West Delhi");
		address.setCity("Delhi");
		
		BasicInformation_2 basic = new BasicInformation_2();
		basic.setFirst_Name("Tanmay");
		basic.setLast_Name("Sharma");
		basic.setDesignation("Test Lead");
		basic.setId("Tanmay_256");
		basic.setAddress(address);
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/AppiumFolks");
		
		System.out.println(" The Status Code of the Request is ");
		System.out.println(Res.statusCode());
		
	}
	

}
