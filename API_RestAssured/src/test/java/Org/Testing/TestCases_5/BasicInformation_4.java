package Org.Testing.TestCases_5;

public class BasicInformation_4 
{
	private String FirstName;
	private String LastName;
	private String Designation;
	private String id;
	private AddressInformation_4[] address;
	private LocationInformation_4[] location;
	private ProjectInformation_4[] project;
	
public AddressInformation_4[] getAddress() {
		return address;
	}
	public void setAddress(AddressInformation_4[] address) {
		this.address = address;
	}
	public LocationInformation_4[] getLocation() {
		return location;
	}
	public void setLocation(LocationInformation_4[] location) {
		this.location = location;
	}
	public ProjectInformation_4[] getProject() {
		return project;
	}
	public void setProject(ProjectInformation_4[] project) {
		this.project = project;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
