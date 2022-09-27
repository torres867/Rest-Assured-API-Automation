package Org.Testing.TestCases_5;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase_3_POSTRequest_inFormofArray_PojoClass 
{
	public static void main(String[] args) 
	{
		AddressInformation_3[] address = new AddressInformation_3[2];
		address[0] = new AddressInformation_3();
		address[0].setHouse_No("67A");
		address[0].setBlock("AS9");
		address[0].setPlace("Mayur Vihar");
		address[0].setDistrict("East Delhi");
		address[0].setCity("Delhi");
		address[0].setType("Primary Address");
		
		address[1] = new AddressInformation_3();
		address[1].setHouse_No("A-126");
		address[1].setBlock("C Block");
		address[1].setPlace("Vasundhara Enclave");
		address[1].setDistrict("East Delhi");
		address[1].setCity("Delhi");
		address[1].setType("Secondary Address");
		
		ProjectInformation[] project = new ProjectInformation[2];
		project[0] = new ProjectInformation();
		project[0].setProject_Name("HMH");
	    project[0].setProject_Domain("E-Learning");
	    
	    project[1] = new ProjectInformation();
	    project[1].setProject_Name("QBL");
	    project[1].setProject_Domain("Health Domain");
	    
	    BasicInformation_3 basic = new BasicInformation_3();
	    basic.setFirst_Name("Gayan");
	    basic.setLast_Name("Sharma");
	    basic.setDesignation("Senior Software Engineer");
	    basic.setId("Gayan_123");
	    basic.setAddress(address);
	    basic.setProject(project);
	    
	    Response Res =
	    given()
	    .contentType(ContentType.JSON)
	    .body(basic)
	    .when()
	    .post("http://localhost:3000/RobotFrameworkFolks");
	    
	    System.out.println(" The Status Code of the Request is ");
	    System.out.println(Res.statusCode());
	  }

}
