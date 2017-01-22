package secondCCRX.secondCCRX;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report", "json:target/test-report.json",
		"junit:target/test-report.xml" }, features = {

				// this for Xmail SErver
				"src/test/BDD/POP3/Xmail _Server/Xmail_Server.feature",

})

public class Xmail_Server {

}
