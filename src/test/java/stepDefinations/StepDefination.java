package stepDefinations;

import static io.restassured.RestAssured.given;

import static org.junit.Assert.*;

import java.io.IOException;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;
import resources.APIResources;

public class StepDefination extends Utils{

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();
	static String auth_key;
//	Utils common_utils = new Utils();
	
	public void commonToken() throws IOException {
		add_Sign_in_payload_with_the_email_and_password("kundankotangale@varahitechnologies.com","123");
		user_calls_with_http_request("signIn","POST");
		get_the_authuntication_token_is_for_all_API();
	}
	
	@Given("Add template payload with the name is {string}")
	public void add_template_payload_with_the_name_is(String expected_name) throws IOException {
		commonToken();
		res=given().header("Auth-Token", auth_key).spec(requestSpecification())
		.body(data.addNormspayload(expected_name));
	}
	
	@Given("Add property payload with the name is {string}")
	public void add_property_payload_with_the_name_is(String expected_name) throws IOException {
		commonToken();
		res=given().header("Auth-Token", auth_key).spec(requestSpecification())
		.body(data.addProperty(expected_name));
	}
	
	@Given("to retrive all the {string} records")
	public void to_retrive_all_the_records(String string) throws IOException {
		commonToken();
		res=given().header("Auth-Token", auth_key).spec(requestSpecification());
	}
	
	@Given("to retrive all the {string} language recrords")
	public void to_retrive_all_the_language_recrords(String string) throws IOException {
		commonToken();
		res=given().header("Auth-Token", auth_key).header("Accept-Language", "de").spec(requestSpecification());
	}
	
	@Given("Add Sign up payload with the email {string}, first name {string} and last name {string}")
	public void add_Sign_up_payload_with_the_email_first_name_and_last_name(String email, String fname, String lname) throws IOException {
		res=given().spec(requestSpecification())
		.body(data.SignUp(email,fname,lname));
	}
		
	@Given("Add Sign in payload with the email {string} and password {string}")
	public void add_Sign_in_payload_with_the_email_and_password(String email, String pwd) throws IOException {
		res=given().spec(requestSpecification())
		.body(data.SignIn(email, pwd));
	}
	
	@Given("to retrive all the {string}")
	public void to_retrive_all_the(String string) throws IOException {
		commonToken();
		System.out.println(auth_key);
		res=given().header("Auth-Token", auth_key).spec(requestSpecification());
	}
	
	@Given("Update template payload with the name is {string}")
	public void update_template_payload_with_the_name_is(String expected_name) throws IOException {
		commonToken();
		res=given().header("Auth-Token", auth_key).spec(requestSpecification())
		.body(data.updateTemplate(expected_name));
	}
	
	@Given("To search the value {string},{string},{string}, Layer is {string} and name is {string},{string}")
	public void to_search_the_value_Layer_is_and_name_is(String val1, String val2, String val3, String layer, String name1, String name2) throws IOException {
		commonToken();
//		System.out.println("static:- "+auth_key);
		res=given().header("Auth-Token", auth_key).spec(requestSpecification())
		.body(data.SearchAPIs(val1,val2,val3,layer,name1,name2));
	}
	
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		
		APIResources resourceAPI=APIResources.valueOf(resource);
		resspec =new ResponseSpecBuilder()
				.expectContentType(ContentType.JSON).build();
		if(method.equalsIgnoreCase("POST"))
			response =res.when().post(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("GET"))
			response =res.when().get(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("PUT"))
			response =res.when().put(resourceAPI.getResource());
		
		
	}

	@Then("the API call got success with status code {string}")
	public void the_API_call_got_success_with_status_code(String statusCode) {
		assertEquals(response.getStatusCode(),Integer.parseInt(statusCode));
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {	
		assertEquals(getJsonPath(response,keyValue),Expectedvalue);
	}
	
	@Then("get the authuntication token is for all API")
	public void get_the_authuntication_token_is_for_all_API() {
		String token=response.asString();
		JsonPath path=new JsonPath(token);
        auth_key=path.getString("data.token");
		System.out.println("Token: "+auth_key);
	}

	
	
}
