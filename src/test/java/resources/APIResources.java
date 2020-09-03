package resources;

public enum APIResources {
	
	add("/templates/add"),
	templates("/templates"),
	records("/records"),
	allUsers("/user/allUsers"),
	fetchProperty("templates/fetchProperty"),
	addRecords("/records/addRecords"),
	signUp("/user/signUp"),
	signIn("/user/signIn"),
	language("/language"),
	units("/units"),
	localization("/"),
	updateTemplate("/templates/edit/5f320caf384e872188e21065"),
	searchAPI("/records/search/multipletags");
	
	
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
}
