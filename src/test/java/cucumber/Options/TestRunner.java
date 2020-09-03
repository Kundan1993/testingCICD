package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		tags= {"@searchAPI"},
//		tags= {"@signup,@signin,@language,@addTemplate,@getAllTemplate,@getAllProperty,@getAllUsers,@getAllfetchProperty,@addRecords,@getAllunit,@getAlllocalization,@updateTemplate"},
		plugin ="json:target/jsonReports/joiningDB-report.json",
		glue = {"stepDefinations"}
		)
public class TestRunner {

	
	// to generate report open terminal and hit command "mvn test verify" otherwise for test case for mvn test
}
