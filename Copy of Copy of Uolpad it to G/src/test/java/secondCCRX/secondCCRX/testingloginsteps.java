package secondCCRX.secondCCRX;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.PrintStream;
import java.util.List;

//import org.apache.commons.codec.binary.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import java.util.List;

import org.openqa.selenium.By;
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
	private long avaragetime;


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
	
	@Given("^User at login page$")
	// @SuppressWarnings("deprecation")
	public void user_at_login_p3age777() throws Throwable {
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
	


	
	
	@When("^click on rest device button to calclate the time$")
	public void reset_the_device_to_calcluet_the_time() throws Throwable {
		I_click_on_ID_button("tm50");
		I_click_on_ID_button("s78");
		swtich_to_parents_frame();
		swtich_to_frame("/html/frameset/frame");
		swtich_to_frame("//*[@id=\"printingjobs\"]");
		Click_on_ID_with_value("//*[@id=\"wTwohundredPX\"]", "Restart Device");

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
	


}
