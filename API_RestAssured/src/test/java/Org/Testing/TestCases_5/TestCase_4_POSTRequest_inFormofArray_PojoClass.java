package Org.Testing.TestCases_5;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase_4_POSTRequest_inFormofArray_PojoClass 
{
	public static void main(String[] args) 
	{
		AddressInformation_4[] address = new AddressInformation_4[2];
		address[0] = new AddressInformation_4();
		address[0].setHouseNo("34A");
		address[0].setBlock("C2/H");
		address[0].setPlace("Preet Vihar");
		address[0].setDistrict("East Delhi");
		address[0].setCity("Delhi");
		address[0].setType("Primary Address");
		
		address[1] = new AddressInformation_4();
		address[1].setHouseNo("12C");
		address[1].setBlock("A2/Y");
		address[1].setPlace("Lodhi Colony");
        address[1].setDistrict("Central Delhi");
        address[1].setType("Secondary Address");
        
        LocationInformation_4[] location = new LocationInformation_4[2];
        location[0] = new LocationInformation_4();
        location[0].setJobLocation("Unity Cyber Tech Gurgaon");
        location[0].setBuilding("3A");
        location[0].setFloor("Third Floor");
        location[0].setCubicle("78F");
        
        location[1] = new LocationInformation_4();
        location[1].setJobLocation("Unity Cyber Tech Gurgaon");
        location[1].setBuilding("5A");
        location[1].setFloor("Second Floor");
        location[1].setCubicle("45G");
        
        ProjectInformation_4[] project = new ProjectInformation_4[2];
        project[0] = new ProjectInformation_4();
        project[0].setProjectName("Google Maps");
        project[0].setProjectDomain("Navigation");
        project[0].setRole("Software Test Engineer");
        
        project[1] = new ProjectInformation_4();
        project[1].setProjectName("Google Chat");
        project[1].setProjectDomain("Media");
        project[1].setRole("Software Development Engineer in Test 1 ");
        
        BasicInformation_4 basic = new BasicInformation_4();
        basic.setFirstName("Mansha");
        basic.setLastName("Kumar");
        basic.setDesignation("Software Engineer");
        basic.setId("Mansha_123");
        basic.setAddress(address);
        basic.setLocation(location);
        basic.setProject(project);
        
        Response Res =
        given()
        .contentType(ContentType.JSON)
        .body(basic)
        .post(" http://localhost:3000/CucumberFrameworkFolks ");
        
        System.out.println(" The Status Code of the Request is ");
        System.out.println(Res.statusCode());
        
     }

}
