package secondCCRX.secondCCRX;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report", "json:target/test-report.json",
		"junit:target/test-report.xml" }, features = {
				
				// this for POP Port number 
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Invalid_Port_Number_Receive_Button.feature",
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Invalid_Port_Number_Test_Button.feature",
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Valid_Setup_Receive_Button.feature",
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Valid_Setup_Test_Button.feature",

})

public class POP3_Over_SSL_Port_995 {

}
