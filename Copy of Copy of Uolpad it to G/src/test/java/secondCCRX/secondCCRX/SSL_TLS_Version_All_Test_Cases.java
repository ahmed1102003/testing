package secondCCRX.secondCCRX;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report", "json:target/test-report.json",
		"junit:target/test-report.xml" }, features = {
				// this for SSL3.0_TLS1.0
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_All_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_ARCFOUR_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_DES_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_SHA1_Receive_Button_With_3DES7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_SHA1_Receive_Button_With_AES7.feature",
				    
				    //this for TLS1.1
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_1_SHA1_Receive_Button7.feature",    
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_ARCFOUR_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_DES_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_SHA1_Receive_Button_With_3DES7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_SHA1_Receive_Button_With_AES7.feature",
				    

				    //this for TLS1.2
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/1POP3_TLS1.2_With_SHA1_SHA2_Receive07077.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_ARCFOUR_SHA1_SHA2_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_ARCFOUR_SHA1_SHA2_Receive_Button27.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_ARCFOUR_SHA1_SHA2_Receive_Button37.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_3DES7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_3DES27.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_3DES37.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_A7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_A27.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_A37.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_GCM7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_GCM27.feature",
				  
				    
				    //this for TLS3.0_TLS1.0_TLS1.1_TLS1.2
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/1POP3_everyting_With_SHA1_SHA2_Receive07077.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_everything_With_ARCFOUR_SHA1_SHA2_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_ARCFOUR_SHA1_SHA2_Receive_Button27.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_ARCFOUR_SHA1_SHA2_Receive_Button37.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_3DES7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_3DES27.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_3DES37.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_A7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_A27.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_A37.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_GCM7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_GCM27.feature",
				    
				  //this for TLS3.0_TLS1.0_TLS1.1
				    
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_1_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_ARCFOUR_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_DES_SHA1_Receive_Button7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_SHA1_Receive_Button_With_3DES7.feature",
				    "src/test/BDD/CCRX/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_SHA1_Receive_Button_With_AES7.feature",
})

public class SSL_TLS_Version_All_Test_Cases {

}
