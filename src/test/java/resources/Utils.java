package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Utils {
	
	public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	{
		if(req==null)
		{
		PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
		 req=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
				 .addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
		.setContentType(ContentType.JSON).build();
		 return req;
		}
		return req;
	}
	
//	public RequestSpecification requestSpecificationwithToken() throws IOException
//	{
//		
//		if(req==null)
//		{
//		PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
//		 req=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))//.addQueryParam("Auth-Token", auth_token)
//				 .addFilter(RequestLoggingFilter.logRequestTo(log))
//				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
//		.setContentType(ContentType.JSON).build();
//		 return req;
//		}
//		return req;
//		
//		
//	}
	
	public static String getGlobalValue(String key) throws IOException
	{

		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("/media/kundan/Personal/TESTING/Software_testing/API_JoiningDB/src/test/java/resources/global.properties");
		prop.load(fis);
//		System.out.println(prop.getProperty(key));
		return prop.getProperty(key);
	}
	
	
	public String getJsonPath(Response response,String key)
	{
		
		String resp=response.asString();
//		System.out.println(resp);
		JsonPath js = new JsonPath(resp);
//		System.out.println("js:"+js);
//		System.out.println(js.get(key).toString());
		return js.get(key).toString();
	}
	


}