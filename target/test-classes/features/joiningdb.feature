Feature: Validating Joining Database API's 

# Sign up user
@signup 
Scenario Outline:Verify if sign up is being successfully added using signUp APIs 
	Given Add Sign up payload with the email "<email>", first name "<fname>" and last name "<lname>" 
	When user calls "signUp" with "POST" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "User registered Successfully." 
	Examples: 
			|email|fname|lname|
			|test |Test |Test |	

@signin			
Scenario Outline:Verify sign in is being successfully login using signIn APIs
	Given Add Sign in payload with the email "<email>" and password "<pwd>" 
	When user calls "signIn" with "POST" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Login successfully."
	And get the authuntication token is for all API 
	Examples: 
			|email									|pwd  |
			|kundankotangale@varahitechnologies.com |123  |

@language
Scenario: Verify if all languages is being retrived using language APIs 
	Given to retrive all the "language" 
	When user calls "language" with "GET" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Retrieved Language.!"


@addTemplate
Scenario Outline: Verify if template is being Succesfully added using add norms APIs 
	Given Add template payload with the name is "<name>" 
	When user calls "add" with "POST" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Records Retrieved" 
	
	Examples: 
		|name 	          | 
		|Kundan Template  |	
		
@getAllTemplate		
Scenario: Verify if all template records is being retrived using template APIs 
	Given to retrive all the "template" records 
	When user calls "templates" with "GET" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Templates Retrieved" 
	
@getAllProperty	
Scenario: Verify if all property records is being retrived using records APIs 
	Given to retrive all the "property" records 
	When user calls "records" with "GET" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Records Retrieved" 
	
@getAllUsers	
Scenario: Verify if all users records is being retrived using allUsers APIs 
	Given to retrive all the "all users" records 
	When user calls "allUsers" with "GET" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Users Retrieved" 
	
@getAllfetchProperty	
Scenario: Verify if all property fetch records is being retrived using fetchProperty APIs 
	Given to retrive all the "fetch property" records 
	When user calls "fetchProperty" with "GET" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Properties Retrieved" 
	
@addRecords 
Scenario Outline: Verify if property is being Succesfully added using addRecords APIs 
	Given Add property payload with the name is "<name>" 
	When user calls "addRecords" with "POST" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Records inserted" 
	
	Examples: 
		|name 	 	 	| 
		|Kundan Record  |
		

		
@getAllunit	
Scenario: Verify if all units fetch records is being retrived using units APIs 
	Given to retrive all the "units" records 
	When user calls "units" with "GET" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Retrieved Unit.!" 		
				
@getAlllocalization
Scenario: Verify if all localization fetch records is being retrived using localzation APIs 
	Given to retrive all the "localization" language recrords 
	When user calls "localization" with "GET" http request 
	Then the API call got success with status code "200"
	And "entry" in response body is "Eintrag"
	And "Enter" in response body is "Eingeben"

		
@updateTemplate 
Scenario Outline: Verify if template is being Succesfully updated using edit APIs 
	Given Update template payload with the name is "<name>" 
	When user calls "updateTemplate" with "PUT" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "Succesfully Updated." 
	
	Examples: 
		|name 	 	 	   | 
		|Updated template  |				
				
@searchAPI			
Scenario Outline:Verify search is being successfully Search records using search APIs
	Given To search the value "<v1>","<v2>","<v3>", Layer is "<layer>" and name is "<n1>","<n2>"
	When user calls "searchAPI" with "GET" http request 
	Then the API call got success with status code "200" 
	And "message" in response body is "<responseMsg>"
	Examples: 
			|v1 |v2  |v3 |layer      |n1             |n2       |responseMsg								     |
			|88 |960 |1  |interlayer |Material Grade |Joint ID |Succesfully data is search with multiple tags|
			|888|9608|18 |interlayer1|Material Grade8|Joint ID8|No record found	                             |
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			