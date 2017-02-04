package secondCCRX.secondCCRX;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report", "json:target/test-report.json",
		"junit:target/test-report.xml" }, features = {

				// this for POP Port number
				"src/test/BDD/Perfomance testing/Calculate_The_Time_For_Rest_Device.feature",

})

public class Users_3 {

}
