package secondCCRX.secondCCRX;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report", "json:target/test-report.json",
		"junit:target/test-report.xml" }, features = {
				
				// this for Receive Email on Basic Function
				"src/test/BDD/POP3/Basic_Function/Basic_Function.feature",
				
	
				
})

public class Basic_Function {

}
