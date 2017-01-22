package secondCCRX.secondCCRX;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report",
		"json:target/test-report.json", "junit:target/test-report.xml" }, 
		features = {
				// this for POP Port number 
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Invalid_Port_Number_Receive_Button.feature",
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Invalid_Port_Number_Test_Button.feature",
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Valid_Setup_Receive_Button.feature",
				"src/test/BDD/CCRX/POP3/POP3_Over_SSL_Port_995/POP_Port_Number/POP3_Valid_Setup_Test_Button.feature",
				    
				
				// this for Receive Email on Basic Function
				"src/test/BDD/CCRX/POP3/Basic_Function/Receive_Email/From_CCRX_POP3_OFF.feature",
				"src/test/BDD/CCRX/POP3/Basic_Function/Receive_Email/From_CCRX_POP3_ON.feature",
				
				
				 // this for SSL3.0_TLS1.0
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_All_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_ARCFOUR_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_DES_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_SHA1_Receive_Button_With_3DES.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0/POP3_SSL3.0_TLS1.0_With_SHA1_Receive_Button_With_AES.feature",
				    
				    //this for TLS1.1
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_1_SHA1_Receive_Button.feature",    
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_ARCFOUR_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_DES_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_SHA1_Receive_Button_With_3DES.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.1/POP3_TLS1.1_With_SHA1_Receive_Button_With_AES.feature",
				    

				    //this for TLS1.2
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/1POP3_TLS1.2_With_SHA1_SHA2_Receive0707.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_ARCFOUR_SHA1_SHA2_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_ARCFOUR_SHA1_SHA2_Receive_Button2.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_ARCFOUR_SHA1_SHA2_Receive_Button3.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_3DES.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_3DES2.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_3DES3.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_A.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_A2.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_A3.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_GCM.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS1.2/POP3_TLS1.2_With_SHA1_SHA2_Receive_Button_With_AES_GCM2.feature",
				  
				    
				    //this for TLS3.0_TLS1.0_TLS1.1_TLS1.2
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/1POP3_everyting_With_SHA1_SHA2_Receive0707.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_everything_With_ARCFOUR_SHA1_SHA2_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_ARCFOUR_SHA1_SHA2_Receive_Button2.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_ARCFOUR_SHA1_SHA2_Receive_Button3.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_3DES.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_3DES2.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_3DES3.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_A.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_A2.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_A3.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_GCM.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/TLS3.0_TLS1.0_TLS1.1_TLS1.2/POP3_Everything_With_SHA1_SHA2_Receive_Button_With_AES_GCM2.feature",
				
				    //this for TLS3.0_TLS1.0_TLS1.1
				    
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_1_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_ARCFOUR_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_DES_SHA1_Receive_Button.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_SHA1_Receive_Button_With_3DES.feature",
				    "src/test/BDD/CCRX/POP3/SSL_TLS_Versions/SSL3.0_TLS1.0_TLS1.1/POP3_SSL3.0_TLS1.0_TLS1.1_With_SHA1_Receive_Button_With_AES.feature",
				    
})
public class Run_All_Test_Cases {
}


//import cucumber.api.junit.Cucumber;