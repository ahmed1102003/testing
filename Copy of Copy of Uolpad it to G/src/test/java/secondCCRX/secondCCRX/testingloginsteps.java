package secondCCRX.secondCCRX;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

//import org.apache.commons.codec.binary.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.Rectangle;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testingloginsteps {
 
	private static final int waittime = 1000;
	static final int LOAD = 150;
	static WebDriver driver = null;
	private List<WebElement> findElements;
	private long avaragetime;
	private String number2;
	private Integer sum;

	public void afterScenario() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Given("^User at login page$")
	// @SuppressWarnings("deprecation")
	public void user_at_login_p3age() throws Throwable {
		// System.setProperty("webdriver.chrome.driver",
		// "C://chromedriver.exe");
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("http://192.168.202.104");
	}

	@Given("^open the URL and login$")
	public void callmethod() throws Throwable {
		user_at_login_p3age();
		swtich_to_frame("/html/frameset/frame");
		I_enter_username_in_the("Admin", "arg01_UserName");
		wait_for_seconds(1);
		I_enter_username_in_the("Admin", "arg02_Password");
		wait_for_seconds(1);
		I_click_on_Login_button_by_name("Login");
		wait_for_seconds(1);

	}

	@When("^swtich to parents frame$")
	public void swtich_to_parents_frame() throws InterruptedException {
		driver.switchTo().parentFrame();
		System.out.println("Swtich to parants frame");
	}
	

	@When("^click on Initialize button to rest the setting for the Printer$")
	public void reset_the_printer() throws Throwable {
		I_click_on_ID_button("tm50");
		I_click_on_ID_button("s78");
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Click_on_ID_with_value("//*[@id=\"wOneTwentyPX\"]", "Initialize");
		wait_for_seconds(3);
		swtich_to_parents_frame();
		swtich_to_frame("//*[@id=\"alphardmaedasboxdocdetail\"]");
		I_click_on_ID_button("btnAln");
		wait_for_seconds(17);
		swtich_to_parents_frame();

	}

	@When("^click on rest device button to rest the setting for the Printer$")
	public void reset_the_device() throws Throwable {
		I_click_on_ID_button("tm50");
		I_click_on_ID_button("s78");
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Click_on_ID_with_value("//*[@id=\"wTwohundredPX\"]", "Restart Device");
		wait_for_seconds(120);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		I_enter_username_in_the("Admin", "arg01_UserName");
		wait_for_seconds(1);
		I_enter_username_in_the("Admin", "arg02_Password");
		wait_for_seconds(1);
		I_click_on_Login_button_by_name("Login");
		wait_for_seconds(1);

	}

	@When("^click on rest device button to calclate the time$")
	public void reset_the_device_to_calcluet_the_time() throws Throwable {
		I_click_on_ID_button("tm50");
		I_click_on_ID_button("s78");
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Click_on_ID_with_value("//*[@id=\"wTwohundredPX\"]", "Restart Device");

	}
	

	@When("^test id NW012001$")
	public void test_id_NW012001() throws Throwable {
		callmethod();
		To_Disenable_the_POP3_protocol();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}

	@When("^test id NW012002$")
	public void test_id_NW012002() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}

	@When("^test id NW012005$")
	public void test_id_NW012005() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}
/*
	@When("^test id NW012006$")
	public void test_id_NW012006() throws Throwable {
		callmethod();
		reset_the_device();
		wait_for_seconds(15);
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user();
		new Check_Interval(0).run();
		new Check_Interval(863).run();

	}

	@When("^test id NW012007$")
	public void test_id_NW012007() throws Throwable {

		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user();
		swtich_to_parents_frame();
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		I_enter_username_in_by_name("3", "arg10_POP3ChkInterval");
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Submit");
		new Check_Interval(0).run();
		new Check_Interval(150).run();

	}
*/
	@When("^test id NW012010$")
	public void test_id_NW0120010() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_delete_Email_from_server_Off();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
		wait_for_seconds(65);// this will wait as per how many mins the user
								// added to the sleep
		Back_again_to_Email_page_and_click_on_Receive_button();
	}

	@When("^test id NW012011$")
	public void test_id_NW012011() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_delete_Email_from_server_Off();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
		wait_for_seconds(65);// this will wait as per how many mins the user
								// added to the sleep
		new Thread(new 
			   
			   
			   
			   
			   (0)).run();
		Back_again_to_Email_page_and_click_on_Receive_button();
	}
/*
	@When("^test id NW012014$")
	public void test_id_NW0120014() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_delete_Email_from_server_Off();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
		wait_for_seconds(65);// this will wait as per how many mins the user
								// added to the sleep
		new Thread(new Check_Interval(0)).run();
		Back_again_to_Email_page_and_click_on_Receive_button();
	}

	@When("^test id NW012015$")
	public void test_id_NW012015() throws Throwable {
		//callmethod();
		//To_enable_the_POP3_protocol_with_SSL();
		//here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_delete_Email_from_server_Off();
		//Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
		get_the_selected_value_form_drop_down_at_work(); // here it should run this method and bring back the this.number2 value wihich is the sleep time in mins
		int seconds = Integer.parseInt(this.number2)*60;
		wait_for_seconds(seconds);// this will wait as per how many second the user added
		new Thread(new Check_Interval(0)).run();
		Back_again_to_Email_page_and_click_on_Receive_button();
	}
*/	

	@When("^test id NW012101$")
	public void test_id_NW012101() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user1_2_3_And_Select_delete_Email_from_server_And_Cover_Page_On();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
		wait_for_seconds(65);
	}

	@When("^test id NW012087$")
	public void test_id_NW012087() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_STARTTLS();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_Cover_Page_OFF_Port_110();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}

	@When("^test id NW012088$")
	public void test_id_NW012088() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}

	@When("^test id NW012102$")
	public void test_id_NW012102() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_Cover_Page_ON_Port_995();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}

	@When("^test id NW012103$")
	public void test_id_NW012103() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_SSL();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_Cover_Page_ON_Port_995();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}

	@When("^test id NW012104$")
	public void test_id_NW012104() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_STARTTLS();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_Cover_Page_OFF_Port_110();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}

	@When("^test id NW012105$")
	public void test_id_NW012105() throws Throwable {
		callmethod();
		To_enable_the_POP3_protocol_with_STARTTLS();
		here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_Cover_Page_OFF_Port_110();
		Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button();
	}
/*
	class Check_Interval implements Runnable {

		private int time;

		Check_Interval(int time) {
			this.time = time;
		}

		public void run() {
			try {
				wait_for_seconds(this.time);
				SendEmail.sendEmail("this is the second email after 863 seconds waited");
			} catch (InterruptedException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
	*/

	@When("^Confrim the message with OK OFF OFF$")
	public void Confrim_the_message_with_OK_OFF_OFF() throws Throwable {
		get_the_messages("//*[@id=\"htValigncenter35px\"]/td");
		the_following_messages_will_be_displayed("POP3 User 1: OK", "POP3 User 2: Protocol off",
				"POP3 User 3: Protocol off");
	}

	@When("^Confrim the message with OFF OFF OFF$")
	public void Confrim_the_message_with_OFF_OFF_OFF() throws Throwable {
		get_the_messages("//*[@id=\"htValigncenter35px\"]/td");
		the_following_messages_will_be_displayed("POP3 User 1: Protocol off", "POP3 User 2: Protocol off",
				"POP3 User 3: Protocol off");
	}

	@When("^Confrim the message with OK OK OK$")
	public void Confrim_the_message_with_OK_OK_OK() throws Throwable {
		get_the_messages("//*[@id=\"htValigncenter35px\"]/td");
		the_following_messages_will_be_displayed("POP3 User 1: Ok", "POP3 User 2: Ok", "POP3 User 3: Ok");
	}

	@When("^here is the steps for Navaigate to Email pop3 then add valid data for POP3 user And Select delete Email from server Off$")
	public void here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_delete_Email_from_server_Off()
			throws Throwable {
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"wOneTwentyPX\"]", "Settings");
		I_enter_username_in_the("qatester0217@gmail.com", "arg02_pop3U1Address");
		wait_for_seconds(1);
		I_enter_username_in_the("pop.gmail.com", "arg03_pop3U1SrvName");
		I_enter_username_in_the("995", "ntxtbox");
		I_enter_username_in_the("qatester0217@gmail.com", "arg06_pop3U1LoginUserName");
		I_enter_username_in_the("1", "pop3U1LoginPassword");
		Turn_radio_from_to("arg09_pop3U1DelMail", "OFF");
		Turn_radio_from_to("arg21_pop3U2Mode", "OFF");
		Turn_radio_from_to("arg41_pop3U3Mode", "OFF");
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Submit");
		wait_for_seconds(5);
	}

	@When("^here is the steps for Navaigate to Email pop3 then add valid data for POP3 user And Select Cover Page ON Port 995$")
	public void here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_Cover_Page_ON_Port_995()
			throws Throwable {
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"wOneTwentyPX\"]", "Settings");
		I_enter_username_in_the("qatester0217@gmail.com", "arg02_pop3U1Address");
		wait_for_seconds(1);
		I_enter_username_in_the("pop.gmail.com", "arg03_pop3U1SrvName");
		I_enter_username_in_the("995", "ntxtbox");
		I_enter_username_in_the("qatester0217@gmail.com", "arg06_pop3U1LoginUserName");
		I_enter_username_in_the("1", "pop3U1LoginPassword");
		Turn_radio_from_to("arg11_pop3U1CoverPage", "ON");
		Turn_radio_from_to("arg21_pop3U2Mode", "OFF");
		Turn_radio_from_to("arg41_pop3U3Mode", "OFF");
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Submit");
		wait_for_seconds(5);
	}

	@When("^here is the steps for Navaigate to Email pop3 then add valid data for POP3 user And Select Cover Page OFF Port 110$")
	public void here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user_And_Select_Cover_Page_OFF_Port_110()
			throws Throwable {
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"wOneTwentyPX\"]", "Settings");
		I_enter_username_in_the("qatester0217@gmail.com", "arg02_pop3U1Address");
		wait_for_seconds(1);
		I_enter_username_in_the("pop.gmail.com", "arg03_pop3U1SrvName");
		I_enter_username_in_the("110", "ntxtbox");
		I_enter_username_in_the("qatester0217@gmail.com", "arg06_pop3U1LoginUserName");
		I_enter_username_in_the("1", "pop3U1LoginPassword");
		Turn_radio_from_to("arg11_pop3U1CoverPage", "OFF");
		Turn_radio_from_to("arg21_pop3U2Mode", "OFF");
		Turn_radio_from_to("arg41_pop3U3Mode", "OFF");
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Submit");
		wait_for_seconds(5);
	}

	@When("^Back again to Email page and click on Receive button$")
	public void Back_again_to_Email_page_and_click_on_Receive_button() throws Throwable {
		swtich_to_parents_frame();
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Receive");
	}

	@When("^here is the steps for Navaigate to Email pop3 then add valid data for POP3 user1 2 3 And Select delete Email from server And Cover Page On$")
	public void here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user1_2_3_And_Select_delete_Email_from_server_And_Cover_Page_On()
			throws Throwable {
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"wOneTwentyPX\"]", "Settings");
		wait_for_seconds(2);
		Turn_radio_from_to("arg21_pop3U2Mode", "ON");
		wait_for_seconds(2);
		Turn_radio_from_to("arg41_pop3U3Mode", "ON");
		wait_for_seconds(2);
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Submit");
		wait_for_seconds(5);
		// Go out from the POP3 user setting and back to it again
		swtich_to_parents_frame();
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"wOneTwentyPX\"]", "Settings");
		wait_for_seconds(1);
		// This is for User1 Settings
		I_enter_username_in_the("qatester0217@gmail.com", "arg02_pop3U1Address");
		I_enter_username_in_the("pop.gmail.com", "arg03_pop3U1SrvName");
		I_enter_username_in_by_name("995", "arg04_pop3U1Port");
		I_enter_username_in_the("qatester0217@gmail.com", "arg06_pop3U1LoginUserName");
		I_enter_username_in_the("1", "pop3U1LoginPassword");
		Turn_radio_from_to("arg09_pop3U1DelMail", "ON");
		Turn_radio_from_to("arg11_pop3U1CoverPage", "ON");
		// this is for User2 settings
		I_enter_username_in_the("qatester77777@gmail.com", "arg22_pop3U2Address");
		wait_for_seconds(1);
		I_enter_username_in_the("pop.gmail.com", "arg23_pop3U2SrvName");
		I_enter_username_in_by_name("995", "arg24_pop3U2Port");
		I_enter_username_in_the("qatester77777@gmail.com", "arg26_pop3U2LoginUserName");
		I_enter_username_in_the("1", "pop3U2LoginPassword");
		Turn_radio_from_to("arg29_pop3U2DelMail", "ON");
		Turn_radio_from_to("arg31_pop3U2CoverPage", "ON");
		// This is for User3 settings
		I_enter_username_in_the("qatester171717@gmail.com", "arg42_pop3U3Address");
		wait_for_seconds(1);
		I_enter_username_in_the("pop.gmail.com", "arg43_pop3U3SrvName");
		I_enter_username_in_by_name("995", "arg44_pop3U3Port");
		I_enter_username_in_the("qatester171717@gmail.com", "arg46_pop3U3LoginUserName");
		I_enter_username_in_the("1", "pop3U3LoginPassword");
		Turn_radio_from_to("arg49_pop3U3DelMail", "OFF");
		Turn_radio_from_to("arg51_pop3U3CoverPage", "ON");
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Submit");
		wait_for_seconds(5);
	}

	@When("^Go out from POP3 page and back to EMail page and click on Recevie button$")
	public void Go_out_from_POP3_page_and_back_to_EMail_page_and_click_on_Recevie_button() throws Throwable {
		swtich_to_parents_frame();
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Receive");
	}

	@When("^here is the steps for Navaigate to Email pop3 then add valid data for POP3 user$")
	public void here_is_the_steps_for_Navaigate_to_Email_pop3_then_add_valid_data_for_POP3_user() throws Throwable {
		I_click_on_ID_button("tm20");
		wait_for_seconds(1);
		I_click_on_ID_button("s42");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		wait_for_seconds(1);
		Click_on_ID_with_value("//*[@id=\"wOneTwentyPX\"]", "Settings");
		I_enter_username_in_the("qatester0217@gmail.com", "arg02_pop3U1Address");
		wait_for_seconds(1);
		I_enter_username_in_the("pop.gmail.com", "arg03_pop3U1SrvName");
		I_enter_username_in_the("995", "ntxtbox");
		I_enter_username_in_the("qatester0217@gmail.com", "arg06_pop3U1LoginUserName");
		I_enter_username_in_the("1", "pop3U1LoginPassword");
		Turn_radio_from_to("arg21_pop3U2Mode", "OFF");
		Turn_radio_from_to("arg41_pop3U3Mode", "OFF");
		Click_on_ID_with_value("//*[@id=\"b100px\"]", "Submit");
		wait_for_seconds(5);
	}

	// to do the calling method we need to copy the BDD and then remove the and
	// then we click on control + space in the keyborad then from the list we
	// select the method that we want it for this step
	@When("^To enable the POP3 protocol with SSL$")
	public void To_enable_the_POP3_protocol_with_SSL() throws Throwable {
		I_click_on_ID_button("tm30");
		wait_for_seconds(1);
		I_click_on_ID_button("s52");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Turn_radio_from_to("arg21_Pop3Email", "ON");
		Select_Option_From_Dropdownlist("SSL/TLS", "//*[@id=\"arg22_Pop3User1\"]/option");
		wait_for_seconds(2);
		I_click_on_ID_button("b100px");
		wait_for_seconds(6);
		swtich_to_parents_frame();
	}

	@When("^To enable the POP3 protocol with STARTTLS$")
	public void To_enable_the_POP3_protocol_with_STARTTLS() throws Throwable {
		I_click_on_ID_button("tm30");
		wait_for_seconds(1);
		I_click_on_ID_button("s52");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Turn_radio_from_to("arg21_Pop3Email", "ON");
		Select_Option_From_Dropdownlist("STARTTLS", "//*[@id=\"arg22_Pop3User1\"]/option");
		wait_for_seconds(2);
		I_click_on_ID_button("b100px");
		wait_for_seconds(6);
		swtich_to_parents_frame();
	}

	@When("^To disenable the POP3 protocol$")
	public void To_Disenable_the_POP3_protocol() throws Throwable {
		I_click_on_ID_button("tm30");
		wait_for_seconds(1);
		// I_click_on_xpath_button("//*[@id=\"protocolsettings\"]/div/div[2]/u/a/span");
		// this one for xpath at home
		I_click_on_ID_button("s52");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Turn_radio_from_to("arg21_Pop3Email", "OFF");
		wait_for_seconds(2);
		I_click_on_ID_button("b100px");
		wait_for_seconds(6);
		swtich_to_parents_frame();
	}

	@When("^To Open POP3 Protocol and disenable POP3 Security User 1$")
	public void To_Open_POP3_Protocol_and_disenable_POP3_Security_User_1() throws Throwable {
		I_click_on_ID_button("tm30");
		wait_for_seconds(1);
		I_click_on_ID_button("s52");
		wait_for_seconds(1);
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Turn_radio_from_to("arg21_Pop3Email", "ON");
		wait_for_seconds(2);
		Select_Option_From_Dropdownlist("Off", "//*[@id=\"arg22_Pop3User1\"]/option");
		wait_for_seconds(2);
		I_click_on_ID_button("b100px");
		wait_for_seconds(6);
		swtich_to_parents_frame();
	}

	@When("^Print out all IDs$")
	public void Print_out_all_IDs() throws InterruptedException {
		List<WebElement> el = driver.findElements(By.cssSelector("*"));
		for (WebElement i : el) {
			String tagName = i.getTagName();
			String idvalue = i.getAttribute("id");
			String namevalue = i.getAttribute("name");
			if (!StringUtils.isBlank(idvalue) || !StringUtils.isBlank(namevalue)) {
				System.out.print("+++" + tagName + ": ");
				System.out.print("id=" + idvalue);
				System.out.print(" name=" + namevalue);
				System.out.println();
			}

		}
	}

	// This will add value to the field with ID only
	@When("^I enter (.*) in the (.*)$")
	public void I_enter_username_in_the(String username, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		// By id = By.id(xpaths.get(filed));
		// Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.id(filed));
		findElement.clear();
		findElement.sendKeys(username);
	}

	@When("^I enter (.*) in the (.*) by xpath$")
	public void I_enter_username_in_by_xpath(String username, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.xpath(filed));
		findElement.clear();
		findElement.sendKeys(username);
	}

	@When("^I enter (.*) in the (.*) by name$")
	public void I_enter_username_in_by_name(String data, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.name(filed));
		findElement.clear();
		findElement.sendKeys(data);
	}

	// This will add vale to the filed with ID and value
	// @When("^I enter (.*) in the (.*) with value (.*)$")
	// public void I_enter_value_in_thetextbox_with_value(String username,
	// String filed, String value) throws InterruptedException {
	// By by = By.id(filed);
	// List<WebElement> findElements = driver.findElements(by);
	// if (findElements).equalsIgnoreCase(value))
	// findElements.clear();
	// ((WebElement) findElements).sendKeys(username);
	//
	// }
	@When("^I click on (.*) button$")
	public void I_click_on_ID_button(String ID) throws InterruptedException {
		Thread.sleep(waittime);
	
		// Thread.sleep(1000);
		driver.findElement(By.id(ID)).click();
	
	}

	@When("^I click on (.*) button by xpath$")
	public void I_click_on_xpath_button(String xpath) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.xpath(xpath);
		driver.findElement(id).click();
	}

	@When("^wait (.*) seconds$")
	public void wait_for_seconds(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

	@When("^I click on (.*) button by name$")
	public void I_click_on_Login_button_by_name(String Name) throws InterruptedException {
		Thread.sleep(waittime);
	
		driver.findElement(By.name(Name)).click();
	}

	@When("^swtich to frame '(.*)'$")
	public void swtich_to_frame(String xpath) throws InterruptedException {
		By xpath2 = By.xpath(xpath);
		WebElement findElement = driver.findElement(xpath2);
		driver.switchTo().frame(findElement);
	}

	@When("^Turn radio (.*) to (.*)$")
	public void Turn_radio_from_to(String buttonid, String radio) throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,LOAD);
		By by = By.id(buttonid);
		WebDriverWait wait = new WebDriverWait(driver, LOAD);
		wait.until(ExpectedConditions.elementToBeClickable(by));
		List<WebElement> findElements1 = driver.findElements(by);
		if ("ON".equalsIgnoreCase(radio))
			findElements1.get(0).click();
		else
			findElements1.get(1).click();
	}

	// Click on ID xpath button with value
	@When("^I click on '(.*)' with '(.*)'$")
	public void Click_on_ID_with_value(String xpath, String value) throws InterruptedException {
		By by = By.xpath(xpath);
		List<WebElement> findElements1 = driver.findElements(by);
		System.out.println("number of buttons=" + findElements1.size());
		WebElement click = null;
		for (WebElement i : findElements1) {
			if (click == null) {
				String value2 = i.getAttribute("value");
				System.out.println("same value=" + value2 + "=" + value + "|");
				if (value2.equalsIgnoreCase(value)) {
					click = i;
					System.out.println("click=" + value2 + "=" + value + "|");

				}
			}
		}
		click.click();
		Thread.sleep(10000);
	}
	
	// xpath for the drop down list :     "//*[@id=\"arg07\"]/option[@selected]"
	// get the selected value form drop down by xpath with selected method 
		@When("^find the vlaue in the element at for home '(.*)'$")
		public void get_the_selected_value_form_drop_down(String xpath) throws InterruptedException {
			By by = By.xpath(xpath);
			WebElement findElements1 = driver.findElement(by);
					this.number2 = findElements1.getAttribute("value");
					System.out.println("same value=" + "=" + this.number2  + "|");
					Long.parseLong(this.number2);// to convert the string to long and then we can use the long in other method 
					// and this one should be in other method the one we want to use it 
		}
		
		@When("^For work find the vlaue in the element at$")
		public void get_the_selected_value_form_drop_down_at_work() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://web2.0calc.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//swtich_to_frame("/html/frameset/frame");
		//I_enter_username_in_the("Admin", "arg01_UserName");
//		wait_for_seconds(1);
//		I_enter_username_in_the("Admin", "arg02_Password");
//		wait_for_seconds(1);
//		I_click_on_Login_button_by_name("Login");
//		wait_for_seconds(1);
//		I_click_on_ID_button("tm9");
//		wait_for_seconds(1);
//		I_click_on_ID_button("s27");
//		wait_for_seconds(1);
//		swtich_to_parents_frame();
//		swtich_to_frame("/html/frameset/frame");
//		swtich_to_frame("//*[@id=\"printingjobs\"]");
		String sgVal = js.executeScript("return 1+1;").toString();
		this.number2 = sgVal;
		System.out.println("same value=" + "=" + this.number2  + "|");
		//Long.parseLong(this.number2);// to convert the string to long and then we can use the long in other method 
		// and this one should be in other method the one we want to use it 
		}

	

	// Select from drop down list by xpath and click on it
	@When("^Select option (.*) for drop down list '(.*)'$")
	public void Select_Option_From_Dropdownlist(String listoption, String xpath) throws InterruptedException {
		By by = By.xpath(xpath);
		List<WebElement> findElements1 = driver.findElements(by);
		for (WebElement i : findElements1) {
			if (i.getText().equalsIgnoreCase(listoption))
				i.click();

		}
	}

	// find all options in drop down list by xpath
	@When("^Find all Options in drop down list (.*)$")
	public void Find_all_Options_in_the_drop_list(String xpath) throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver,LOAD);
		By by = By.xpath(xpath);
		// wait.until(ExpectedConditions.elementToBeClickable(by));
		List<WebElement> findElements1 = driver.findElements(by);
		// driver.switchTo().frame(0);
		// System.out.println("Options for drop down list");
		for (WebElement i : findElements1) {
			String dropdownlistoption = i.getText();
			System.out.println("|" + dropdownlistoption + "|");
		}
	}

	// this java steps for pop out error message
	@Then("^'(.*)' message will display at '(.*)'$")
	public void Check_Messages(String message, String xpath) throws InterruptedException {
		// Thread.sleep(1000);
		By xpath2 = By.xpath(xpath);
		// WebDriverWait wait = new WebDriverWait(driver, LOAD);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath_to_search_textbox")));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(xpath2));
		// Thread.sleep(1000);
		WebElement findElement = driver.findElement(xpath2);
		String text = findElement.getText();
		assertEquals(message, text);
	}

	@Given("^Send an email to gmail account with '(.*)' subject$")
	public void Send_an_email_to_gmail_account(String subject) throws Throwable {
		SendEmail.sendEmail(subject);
	}

	@Given("^Send 10 emails to User qatester0217 with .xps attachment to gmail account with '(.*)' subject$")
	public void Send_10_emails_to_qatester0217_gmail_account(String subject) throws Throwable {
		Send10EmailsFor0217.sendEmail(subject);
	}

	@Given("^Send 10 emails to User qatester77777 with .doc attachment to gmail account with '(.*)' subject$")
	public void Send_10_emails_to_qatester77777_gmail_account(String subject) throws Throwable {
		Send10EmailsFor77777.sendEmail(subject);
	}

	@Given("^Send 10 emails to User qatester171717 without attachment to gmail account with '(.*)' subject$")
	public void Send_10_emails_to_qatester171717_gmail_account(String subject) throws Throwable {
		Send10EmailsFor171717.sendEmail(subject);
	}

	@Given("^Send an emails to User qatester0217 with JPEG JPG JPE JFIF TXT PRN PDF PS TIFF TIF XPS OXPS PDF attachment to gmail account with '(.*)' subject$")
	public void Send_All_emails_Types_to_qatester0217_gmail_account(String subject) throws Throwable {
		SendAllFileTypesEmailsFor217.sendEmail(subject);
	}
	
	
	

	/*
	 * //I will comment this as we updated but i will add the old one to see how
	 * it will work
	 * 
	 * @Then("^get the messages '(.*)'$") public void get_the_messages(String
	 * xpath) { this.xpath=xpath; //by = By.xpath(xpaths.get(xpath));
	 * this.findElements = driver.findElements(by); //
	 * driver.switchTo().frame(0); System.out.println(
	 * "Options for drop down list" + findElements.size()); for (WebElement i :
	 * findElements) { String dropdownlistoption = i.getText();
	 * System.out.println("/" + dropdownlistoption + "|"); } }
	 * 
	 * @Then("^the following messages will be displayed$") public void
	 * a_list_of_string(List<String> messages) { for (WebElement i :
	 * findElements) { String dropdownlistoption = i.getText();
	 * System.out.println("|" + dropdownlistoption + "|"); } for (String i :
	 * messages) { System.out.println("|" + i + "|"); } List<String> list = new
	 * ArrayList<String>(messages); for (WebElement webElement : findElements) {
	 * String actual = webElement.getText().trim(); if
	 * (!StringUtils.isEmpty(actual)) { assertTrue(list.size() > 0); String
	 * excpet = list.remove(0); assertEquals(excpet, actual); }
	 * 
	 * } assertEquals(0, list.size()); }
	 * 
	 * @Then("^wait until '(.*)' will not display$") public void
	 * wait_until_message_display(String messages) throws InterruptedException {
	 * assertTrue(findElements.size()<0);
	 * while(messages.equals(findElements.get(0))){ Thread.sleep(10000);
	 * get_the_messages(xpath); assertTrue(findElements.size()<0); } }
	 * 
	 */

	@When("^Calculate the time when click on rest Device$")

	public void calculate_The_Time_When_Click_On_Rest_Device() throws Throwable {

		File file = new File("/Users/ahmadyounis/Desktop/Calculate the time when I click on Rest Device button.csv");

		PrintStream out = new PrintStream(file);
		
		long totaltime =0;
		int howmanytimes = 9;
		for (int i = 0; i < howmanytimes; i++) {

			long beforestartime = System.currentTimeMillis();

			callmethod();
			reset_the_device_to_calcluet_the_time();

			long starttime = System.currentTimeMillis();

			WebDriverWait wait = new WebDriverWait(driver, LOAD);

			By id = By.xpath("/html/frameset/frame");

			wait.until(ExpectedConditions.visibilityOfElementLocated(id));

			long endtime = System.currentTimeMillis();
			out.println(",startime,processingtime");
			out.print(i+1);
			out.print(",");
			out.print(starttime - beforestartime);
			out.print(",");
			out.println(endtime - starttime);
			totaltime  += (endtime - starttime);
			
		}

		this.avaragetime=(totaltime/howmanytimes);
		System.out.println("The ave is "+ this.avaragetime );
		out.close();

	}
	
	
	@Then("^the avarage less than (.*)$")
	public void the_avarage_less_than(long time) {
		
		assertTrue((time*1000)>=(this.avaragetime));
	
		}
	

	@Then("^Email should be deleted from gmail account for user1$")
	public void Email_should_be_deleted_from_gmail_account_for_user1() throws Throwable {
		
		int count = EmailCount.emailCount();
		assertTrue("Email count was " + count,count <= (0));


	}
	// we go to prefomance and then eror/ wornny then local change it to wrorryn
	
	@Then("^get the messages '(.*)'$")
	public void get_the_messages(String xpath) {
		// WebDriverWait wait = new WebDriverWait(driver,LOAD);
		By by = By.xpath(xpath);
		this.findElements = driver.findElements(by);
		// driver.switchTo().frame(0);
		System.out.println("Options for drop down list" + this.findElements.size());
		for (WebElement i : this.findElements) {
			String dropdownlistoption = i.getText();
			System.out.println("/" + dropdownlistoption + "|");
		}
	}

	@Then("^the following messages will be displayed$")
	public void the_following_messages_will_be_displayed(String... messages) {
		for (WebElement i : this.findElements) {
			String dropdownlistoption = i.getText();
			System.out.println("|" + dropdownlistoption + "|");
		}
		for (String i : messages) {
			System.out.println("|" + i + "|");
		}
		List<String> list = new ArrayList<String>(Arrays.asList(messages));
		for (WebElement webElement : this.findElements) {
			String actual = webElement.getText().trim();
			if (!StringUtils.isEmpty(actual)) {
				assertTrue(list.size() > 0);
				String excpet = list.remove(0);
				assertEquals(excpet, actual);
			}

		}
		assertEquals(0, list.size());
	}
	
	
	// this is for Home work 
	

   @When("^number (.*) plus number (.*)$")

  public void The_sum_of_tow_integer(Integer fristnumber, Integer secondnumber) throws InterruptedException {

	   //int sum;

	   this.sum = fristnumber + secondnumber ;

	   System.out.println(this.sum);

   }

    @Then("^total should be (.*)$")

    public void confirmtheresult (Integer total) throws InterruptedException {


    	assertEquals(this.sum, total);

}
    
    @Given("^User at home page$")
	// @SuppressWarnings("deprecation")
	public void user_at_home_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://www.ebates.com");
	}
    
    //@When("^Confrim the error message for login page$")
	//public void Confrim_the_error_message_for_login_page() throws Throwable {
		//get_the_messages("//*[@id=\"passwd-field\"]/div");			  
		//the_following_messages_will_be_displayed("Oops. The email address and/or password you entered is incorrect. Remember, passwords are case-sensitive. Please try again.");
	//}
    
	@When("^click (.*) id$")
	public void I_click_on_button(String ID) throws InterruptedException {
		Thread.sleep(waittime);
		driver.findElement(By.id(ID)).click();
	
	}
    
    
    @When("^I enter (.*) in (.*) filed$")
   
	public void I_enter_text_for_singin_page(String username, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.id(filed));
		findElement.clear();
		findElement.sendKeys(username);
	}

    @Then ("^'(.*)' will see it '(.*)'$")
    public void check_message(String message,String xpath){
    	WebElement findElement = driver.findElement(By.xpath(xpath));
    	String text = findElement.getText();
    	assertEquals(message,text);
    	
    }
    
  
// the end of home work 
	

}
