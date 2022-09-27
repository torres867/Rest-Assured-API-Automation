package Org.Testing.TestCases_3;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestCase_3_POSTRequest_OrgJSON_inFormofArray 
{
	public static void main(String[] args) 
	{
		JSONObject inner1 = new JSONObject();
		inner1.put("House No.","38T");
		inner1.put("Block","T9/A");
		inner1.put("Place","Saket");
		inner1.put("City","Delhi");
		inner1.put("Type","Primary Address");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("House No.","56I");
		inner2.put("Block","R4/6");
		inner2.put("Place","Andrews Ganj");
		inner2.put("City","Delhi");
		inner2.put("Type","Secondary Address");
		
		JSONArray Array1 = new JSONArray();
		Array1.put(0,inner1);
		Array1.put(1,inner2);
		
		JSONObject inner3 = new JSONObject();
		inner3.put("Project Name","Google Maps");
		inner3.put("Project Type","80%Project");
		inner3.put("Role","Navigation");
		
		JSONObject inner4 = new JSONObject();
		inner4.put("Project Name","Google Ads");
		inner4.put("Project Type","20% Project");
		inner4.put("Role","Publishing Ads");
		
		JSONArray Array2 = new JSONArray();
		Array2.put(0,inner3);
		Array2.put(1,inner4);
		
		JSONObject outer = new JSONObject();
		outer.put("First Name", " Nivedita");
		outer.put("Last Name", "Garg");
		outer.put("Designation", "Software Lead");
		outer.put("id","Nivedita_987");
		outer.put("Address", Array1);
		outer.put("Project",Array2);
		
		System.out.println(outer);
		
	}

}
