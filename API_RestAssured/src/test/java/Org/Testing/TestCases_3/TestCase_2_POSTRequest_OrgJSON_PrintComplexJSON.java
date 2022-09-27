package Org.Testing.TestCases_3;

import org.json.JSONObject;

public class TestCase_2_POSTRequest_OrgJSON_PrintComplexJSON 
{
	public static void main(String[] args) 
	{
		JSONObject inner = new JSONObject();
		inner.put("House No.","39G");
		inner.put("Block","A6/K");
		inner.put("Place","Vasant Kunj");
		inner.put("City","Delhi");
		
		JSONObject outer = new JSONObject();
		outer.put("First Name","Shubh");
		outer.put("Last Name","Deep");
		outer.put("Designation","Lead Consultant");
		outer.put("id","Shubh_321");
		outer.put("Address",inner);
		
		System.out.println(outer);
		
	}

}
