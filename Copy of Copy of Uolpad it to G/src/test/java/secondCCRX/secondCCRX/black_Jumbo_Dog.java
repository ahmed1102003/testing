package secondCCRX.secondCCRX;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report", "json:target/test-report.json",
		"junit:target/test-report.xml" }, features = {

				// this for Black_jumbo_dog
				"src/test/BDD/POP3/Black_jumbo_dog/Black _Jumbo_dog.feature",

})

public class black_Jumbo_Dog {

}
