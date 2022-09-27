package Org.Testing.TestCases_3;

import org.json.JSONObject;

public class TestCase_1_POSTRequest_OrgJSON_PrintSimpleJSON 
{
	public static void main(String[] args) 
	{
		JSONObject BVB = new JSONObject();
		BVB.put("First Name","Omair");
		BVB.put("Last Name","Ali");
		BVB.put("Designation","Software Test Engineer");
		BVB.put("id","omair_123");
		
		System.out.println(BVB);
		
	}
      
}
