package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pom.Login_Navia_POM;

import atu.testrecorder.ATUTestRecorder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	public static ATUTestRecorder recorder;

	Login_Navia_POM l = new Login_Navia_POM(driver);
	Actions ac = new Actions(driver);
	static Set<String> windowHandles = driver.getWindowHandles();
	static ArrayList<String> li = new ArrayList<String>(windowHandles);
	@Before
	public static void beforeStartTestCase() throws  Exception{	
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder("C:\\Users\\Venkateshwaran\\git\\repository\\EightFourthFive_Testing\\VideoRecorder",
				"RecordedVideo-" + dateFormat.format(date), false);
		recorder.start();
		
		//VideoRecorder_utlity.startRecord("GoogleTestRecording");
//		 Robot robot = new Robot();
//	        robot.keyPress(KeyEvent.VK_WINDOWS);
//	        robot.keyPress(KeyEvent.VK_ALT);
//	        robot.keyPress(KeyEvent.VK_R);
//	        robot.keyRelease(KeyEvent.VK_WINDOWS);
//	        robot.keyRelease(KeyEvent.VK_ALT);
//	        robot.keyRelease(KeyEvent.VK_R);
	}

	@After
	public static void afterTestCase() throws Exception {
		
		recorder.stop();

		 Robot robot = new Robot();
//	        robot.keyPress(KeyEvent.VK_WINDOWS);
//	        robot.keyPress(KeyEvent.VK_ALT);
//	        robot.keyPress(KeyEvent.VK_R);
//	        robot.keyRelease(KeyEvent.VK_WINDOWS);
//	        robot.keyRelease(KeyEvent.VK_ALT);
//	        robot.keyRelease(KeyEvent.VK_R);

		driver.manage().deleteAllCookies();
		
	//	driver.quit();
//		driver.navigate().refresh();
//		driver.navigate().to("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ARZ0qKI-OlL97AHzrSW5jo-HTJUGbvX92-F9JL5tkG0YOoAc--tSk-Ov-Sx3LjsiF09roaEhm4JvDg&theme=mn&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("automationtestingnavia@gmail.com");
//		
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		Thread.sleep(6000);
//
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("NaviaAutomationTesting@24");
//		Thread.sleep(2000);
//
//	
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		Thread.sleep(10000);
//		
//		
//		driver.findElement(By.xpath("//div[text()='Compose']")).click();
//		Thread.sleep(2000);
//
//		//driver.findElement(By.xpath("//div[text()='Recipients']")).click();
//		
//		driver.findElement(By.xpath("(//span[text()='Cc'])[1]")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//input[@aria-label='To recipients']")).sendKeys("venkateshwaran01096@gmail.com");
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@aria-label='To recipients']")).sendKeys("Kiruthika1515@gmail.com");
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//			
//		driver.findElement(By.xpath("//input[@aria-label='To recipients']")).sendKeys("sandeep@navia.co.in");
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
////		driver.findElement(By.xpath("//div[@aria-label='Cc']")).click();
////		Thread.sleep(5000);
////
////
////		WebElement element = driver.findElement(By.xpath("//input[@id=':co']"));
////		element.sendKeys("venketsmart4848@gmail.com");
////		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Daily 8:45 testing Recording");
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Testing Demo");
//		
//		Thread.sleep(4000);
//
//		driver.findElement(By.xpath("//div[@id=':aj']")).click();
//		
//		Thread.sleep(5000);
//		StringSelection s = new StringSelection("C:\\Users\\Venkateshwaran\\git\\repository\\EightFourthFive_Testing\\VideoRecorder");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//			
//         robot.keyPress(KeyEvent.VK_CONTROL);
//         robot.keyPress(KeyEvent.VK_V);
//         robot.keyRelease(KeyEvent.VK_V);
//         robot.keyRelease(KeyEvent.VK_CONTROL);
//         robot.keyPress(KeyEvent.VK_ENTER);
//         robot.keyRelease(KeyEvent.VK_ENTER);
//         
//         Thread.sleep(2000);
//
//      // Press "End" key to scroll to the bottom (if needed)
//      robot.keyPress(KeyEvent.VK_END);
//      robot.keyRelease(KeyEvent.VK_END);
//      Thread.sleep(1000);

//      // Press "Shift" + "Tab" to select the last file
//      robot.keyPress(KeyEvent.VK_SHIFT);
//      robot.keyPress(KeyEvent.VK_TAB);
//      Thread.sleep(100);
//      robot.keyRelease(KeyEvent.VK_SHIFT);
//      robot.keyRelease(KeyEvent.VK_TAB);
//      Thread.sleep(1000);
//
//      robot.keyPress(KeyEvent.VK_END);
//      robot.keyRelease(KeyEvent.VK_END);
//      Thread.sleep(1000);
//      
// 
//      // Press "Enter" to attach the file
//      robot.keyPress(KeyEvent.VK_ENTER);
//      robot.keyRelease(KeyEvent.VK_ENTER);
//
//      Thread.sleep(120000);
////      
//
//      
//      
////      
//      robot.keyPress(KeyEvent.VK_TAB);
//      robot.keyRelease(KeyEvent.VK_TAB);
////      
////
////      
//      robot.keyPress(KeyEvent.VK_ENTER);
//      robot.keyRelease(KeyEvent.VK_ENTER);
//      
//      Thread.sleep(5000);
//     
//      
//      //////////////////////
//      	
//      robot.keyPress(KeyEvent.VK_TAB);
//      robot.keyRelease(KeyEvent.VK_TAB);
//      Thread.sleep(2000);
//      robot.keyPress(KeyEvent.VK_TAB);
//      robot.keyRelease(KeyEvent.VK_TAB);
//      Thread.sleep(2000);
//
//      robot.keyPress(KeyEvent.VK_ENTER);
//      robot.keyRelease(KeyEvent.VK_ENTER);
//      
//      robot.keyPress(KeyEvent.VK_DOWN);
//      robot.keyRelease(KeyEvent.VK_DOWN);
//      Thread.sleep(2000);
//      
//      robot.keyPress(KeyEvent.VK_DOWN);
//      robot.keyRelease(KeyEvent.VK_DOWN);
//      Thread.sleep(2000);
//      
//      robot.keyPress(KeyEvent.VK_ENTER);
//      robot.keyRelease(KeyEvent.VK_ENTER);
//      
//      robot.keyPress(KeyEvent.VK_TAB);
//      robot.keyRelease(KeyEvent.VK_TAB);
//      Thread.sleep(2000);
//      
//      robot.keyPress(KeyEvent.VK_TAB);
//      robot.keyRelease(KeyEvent.VK_TAB);
//      Thread.sleep(2000);
//      
//      robot.keyPress(KeyEvent.VK_ENTER);
//      robot.keyRelease(KeyEvent.VK_ENTER);
//
////      
////      Thread.sleep(5000);
////
////      driver.switchTo().frame(0);
////      robot.keyPress(KeyEvent.VK_TAB);
////      robot.keyRelease(KeyEvent.VK_TAB);
////      Thread.sleep(2000);
////
////      robot.keyPress(KeyEvent.VK_TAB);
////      robot.keyRelease(KeyEvent.VK_TAB);
////      Thread.sleep(2000);
////
//// 
////      robot.keyPress(KeyEvent.VK_ENTER);
////      robot.keyRelease(KeyEvent.VK_ENTER);
//      
//      Thread.sleep(2000);
//
//      
//    
//	
//		driver.findElement(By.xpath("//a[contains(@aria-label,'Automation')]")).click();
//		Thread.sleep(15000);
//
//		
//		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@name='account']"));
//		
//		driver.switchTo().frame(frame);
//		
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
//		
//		
	} 

	@Given("User Navigate to Navia")
	public void user_navigate_to_navia() throws InterruptedException, AWTException {
		driver.get("https://yopmail.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		 WebElement yopMail = driver.findElement(By.xpath("//input[@placeholder='Enter your inbox here']"));
		    yopMail.sendKeys("naviaautomation@yopmail.com");
		    
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();

		    WebElement createAccount = driver.findElement(By.xpath("//a[@title='YOPmail - Temporary email']"));
			Actions ac = new Actions(driver);
			ac.contextClick(createAccount).perform();
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		    Thread.sleep(8000);

			
			Set<String> windowHandles = driver.getWindowHandles();
			ArrayList<String> li = new ArrayList<String>(windowHandles);
			int size = li.size();
			System.out.println(size);
			
		    driver.switchTo().window(li.get(1));

		    
		    
		    driver.navigate().refresh();

				

		getUrl("https://rocket.tradeplusonline.com/beta-v2/login.php");
	//	getUrl("https://rocket.tradeplusonline.com/login.php");

		sleep(5000);

		//clickOnElement(l.getLoginWithClientCode());
	//	driver.navigate().refresh();
	driver.findElement(By.xpath("//button[text()='Login with client code']")).click();
		sleep(5000);
		//
  driver.findElement(By.xpath("//input[@name='clientCode']")).click();

		

		sleep(1000);

		
		
		sendValues(l.getClientCode(), "63832650");
		
		clickOnElement(l.getPassWord());
		sleep(1000);
		
		sendValues(l.getPassWord(), "Navia@23");
		
		
		clickOnElement(l.getCheckBox());
		
		
		clickOnElement(l.getLogin());
		
		
		driver.switchTo().window(li.get(0));
			
		
		
		    
		
		Thread.sleep(8000);
	   

	    WebElement refresh = driver.findElement(By.xpath("//button[@id='refresh']"));
	    refresh.click();
	    
	 WebElement iframe = driver.findElement(By.xpath("//iframe[@id='ifmail']"));
		
	    driver.switchTo().frame(iframe);

	    Thread.sleep(3000);

		WebElement otp = driver.findElement(By.xpath("//font[text()='Your One Time Password (OTP) for BOLTPlus On Web login is ']//child::strong"));
		String text = otp.getText();
		System.err.println(text);
		
		driver.switchTo().defaultContent();

		  Thread.sleep(2000);
	   
		 driver.switchTo().window(li.get(1));
		clickOnElement(l.getOtpClick());
		  Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='userotp']")).sendKeys(text);
		
		driver.switchTo().window(li.get(0));
		 
		 driver.close();

		 driver.switchTo().window(li.get(1));
		 
	}

	@When("User Click login with client code")
	public void user_click_login_with_client_code() throws InterruptedException {
		System.out.println("User Click login with client code");
	}

	@When("User Enter Client Code")
	public void user_enter_client_code() throws InterruptedException {
		System.out.println("User Enter Client Code");

		

	}

	@When("User  Enter Password")
	public void user_enter_password() throws InterruptedException {
	
		System.out.println("User Enter Password");

	}

	@When("User Click Agree CheckBox")
	public void user_click_agree_check_box() {
		System.out.println("User Click Agree CheckBox");


	}

	@When("User Click Login button")
	public void user_click_login_button() throws InterruptedException, AWTException {
	
		System.out.println("User Click Login button");

		
	}

	@When("User Click Otp Verification and enter manualy")
	public void user_click_otp_verification_and_enter_manualy() throws InterruptedException {
	
		System.out.println("User Click Otp Verification and enter manualy");

		
	}

	@When("User Click Login Again")
	public void user_click_login_again() throws InterruptedException {
		
		clickOnElement(l.getLoginAfterOTP());
		setImplicitWait(24);

		System.out.println("Home Page");

		WebElement textBox = driver.findElement(By.xpath("//h2[text()='RISK DISCLOSURES ON DERIVATIVES ']"));

		Thread.sleep(2000);
		
		if (textBox.isDisplayed()) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Agree']//parent::button")).click();

		}

		else {
			System.out.println("Not Preset in a Page");

		}

	}

//	@Then("Navigate to Home Page")
//	public void navigate_to_home_page() throws InterruptedException {
//		setImplicitWait(24);
//
//		System.out.println("Home Page");
//
//		driver.findElement(By.xpath("//span[text()='Agree']//parent::button")).click();
//
//	}

	@When("User Click the Watch List")
	public void user_click_the_watch_list() throws InterruptedException {
		Thread.sleep(4000);

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='header-left']//descendant::span[@class='ind_syml'])[1]"));
		element.click();
	}

	@When("User Select scrip {string}")
	public void user_select_scrip(String string) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='select-box active']//descendant::li//span[text()='" + string + "']"))
				.click();
		System.out.println(string);
		Thread.sleep(4000);
	}

	@When("User Click Watch List Again")
	public void user_click_watch_list_again() throws InterruptedException {
		WebElement element1 = driver
				.findElement(By.xpath("(//div[@class='header-left']//descendant::span[@class='ind_syml'])[1]"));
		element1.click();

		Thread.sleep(2000);
	}

	@When("User mouse over the scrip {string}")
	public void user_mouse_over_the_scrip(String string) throws InterruptedException {
		WebElement contractSelectAgain = driver.findElement(
				By.xpath("//div[@class='select-box active']//descendant::li//span[text()='" + string + "']"));

		Thread.sleep(1000);

		Actions ac = new Actions(driver);
		ac.moveToElement(contractSelectAgain).perform();

	}

	@When("User Click the Charts")
	public void user_click_the_charts() throws InterruptedException {
		WebElement charts = driver.findElement(By.xpath(
				"//div[@class='select-box active']//descendant::span[text()='Nifty 50']//ancestor::li//descendant::img"));
		charts.click();

		Thread.sleep(2000);
	}

	@When("User Click the Candles Icon")
	public void user_click_the_candles_icon() throws InterruptedException {
		WebElement firstiFrame = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));

		driver.switchTo().frame(firstiFrame);

		Thread.sleep(1000);

		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Financial Chart']"));

		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//div[@id='header-toolbar-chart-styles']")).click();
		Thread.sleep(1000);
	}

	@When("User Choose Candle {string}")
	public void user_choose_candle(String string) throws InterruptedException {
		driver.findElement(By.xpath("//div[@data-value='" + string + "']")).click();
		Thread.sleep(1000);
	}

	@When("User Click the Mintues")
	public void user_click_the_mintues() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();
		Thread.sleep(1000);

	}

	@When("User Choose One Minute")
	public void user_choose_one_minute() {
		driver.findElement(By.xpath("//div[text()='1 minute']//ancestor::div[@data-value='1']")).click();

	}

	@When("Verify One Minute Feed Connection Value and Wait One Minute Very Feed Connection Changes")
	public void verify_one_minute_feed_connection_value_and_wait_one_minute_very_feed_connection_changes()
			throws InterruptedException {
		WebElement element3 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		Thread.sleep(4000);
		String text2 = element3.getText();
		System.err.println("Feed Connection Value of One Minute : " + text2);

		Thread.sleep(60000);

		System.out.println("Feed Connection Value of After One Minute : " + text2);

	}

	@When("User Click the Five Minute")
	public void user_click_the_five_minute() {
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='5 minutes']//ancestor::div[@data-value='5']")).click();

	}

	@When("Verify Five Minute Feed Connection Valuebb")
	public void verify_five_minute_feed_connection_value() throws InterruptedException {
		WebElement element2 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		Thread.sleep(4000);
		String text = element2.getText();
		System.err.println("Feed Connection Value of Five Minutes : " + text);

	}

	@When("User Click One Day")
	public void user_click_one_day() {
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='1 day']//ancestor::div[@data-value='1D']")).click();

	}

	@When("Verify One Day Feed Connection Value and Wait One Minute Very Feed Connection Changes")
	public void verify_one_day_feed_connection_value_and_wait_one_minute_very_feed_connection_changes()
			throws InterruptedException {

		WebElement element4 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		Thread.sleep(4000);
		String text3 = element4.getText();
		System.err.println("Feed Connection Value of 1 hour : " + text3);
		Thread.sleep(60000);

		System.err.println("Feed Connection Value of 1 hour and 1 mins: " + text3);

	}

	@When("User click the search box")
	public void user_click_the_search_box() throws InterruptedException {
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@id='project-id']")).click();
	}

	@When("User Search any {string} Script")
	public void user_search_any_script(String string) throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='project-id']")).sendKeys(string);
	}

	@When("User Mouse Over and Add a Script {string}")
	public void user_mouse_over_and_add_a_script(String string ) throws InterruptedException {
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::li"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(7000);

		driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::li"))
				.click();
	}

	@When("User POP Up Message Appear Verify POP UP")
	public void user_pop_up_message_appear_verify_pop_up() throws InterruptedException {

//		WebElement popUp = driver.findElement(By.xpath("//span[text()='Symbol Has been Added Successfully']"));
//
//		if (popUp.isDisplayed()) {
//
//			System.out.println("Verify Pop is Displayed Successfully");
//		} else {
//			System.out.println("Verify Pop is Not Displayed ");
//
//		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Clear']")).click();
		
	}

	@When("User Mouse over the {string} Script and Click")
	public void user_mouse_over_the_first_script_and_click(String string) throws InterruptedException {
		Thread.sleep(3000);

		WebElement script = driver.findElement(By.xpath("(//ul[@class='list ui-sortable'])[1]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(script).perform();
		Thread.sleep(3000);   

		driver.findElement(By.xpath("(//ul[@class='list ui-sortable']//descendant::span)[15]")).click();

	}

	@When("User Delete the Script")
	public void user_delete_the_script() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//lable[text()='Delete']//parent::button")).click();
	}

	@When("User Verify Script Deleted SuccesFully")
	public void user_verify_script_deleted_succes_fully() {

		WebElement recordDelete = driver.findElement(By.xpath("//span[text()='Record Deleted Successfully']"));

		if (recordDelete.isDisplayed()) {
			System.out.println("Verify Pop is Displayed Script Deleted");

		} else {

		}
		System.out.println("Verify Script is Not Deleted");

	}

	@When("User mouse the scrip Selected {string}")
	public void user_mouse_the_scrip_selected(String string) throws InterruptedException {
		Thread.sleep(4000);

		WebElement element2 = driver.findElement(By.xpath("(//span[text()='" + string + "'])[1]"));
		ac.moveToElement(element2).perform();
		Thread.sleep(2000);
	}

	@When("User Click the Buy scrip for Selected {string} Scrip")
	public void user_click_the_buy_scrip_for_selected_scrip(String string) {
		WebElement buyScript = driver.findElement(
				By.xpath("//span[text()='"+string+"']//ancestor::div[@class='m_bg_color']//descendant::span[text()='B']"));
		buyScript.click();
	}

	@When("User Click Market then Limit")
	public void user_click_market_then_limit() throws InterruptedException {
		
		
		WebElement chooseMarket = driver.findElement(By.xpath("//label[text()='Market']"));
		chooseMarket.click();
		Thread.sleep(2000);

		WebElement chooseLimit = driver.findElement(By.xpath("//label[text()='Limit']"));
		chooseLimit.click();
	}

	@When("User Enter Amount in Price Text Box {string}")
	public void user_enter_amount_in_price_text_box(String string) throws InterruptedException {
		
		   WebElement value = driver.findElement(By.xpath("(//span[text()='HDFCBANK']//ancestor::div[@class='m_bg_color']//descendant::span[@class='sys_vl'])[1]"));
		    String text2 = value.getText();
			System.out.println(text2);

		// Convert the string to a floating-point number
		double value1 = Double.parseDouble(text2);
			

		// Subtract 5 from the value
		value1 -= 5;

		// Convert the result back to a string
		String result = Double.toString(value1);
		
		WebElement clearPrice = driver.findElement(
				By.xpath("//label[text()='Price']//parent::div[@class='tag-box']//descendant::input[@type='number']"));
		clearPrice.clear();
		clearPrice.sendKeys(result);
		Thread.sleep(2000);
	}

	@When("User Click Buy")
	public void user_click_buy() throws InterruptedException {
		Thread.sleep(2000);

		WebElement clickBuy = driver.findElement(By.xpath("//button[text()='BUY']"));
		clickBuy.click();
	}

	@When("User Click Yes Popup")
	public void user_click_yes_popup() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='jconfirm-buttons']//child::button[text()='yes']")).click();

		Thread.sleep(2000);

	}

	@When("Verify the Buy Scrip Notification Pop up")
	public void verify_the_buy_scrip_notification_pop_up() {
		WebElement buyPopup = driver.findElement(By.xpath("//span[@class='dhx_message__text']"));
		if (buyPopup.isDisplayed()) {
			System.err.println("Verify the buyPop is Displayed SuccessFully");
		} else {
			System.err.println("Verify the buyPop is Not Displayed ");

		}
	}

	@When("User Click Pending Orders")
	public void user_click_pending_orders() throws InterruptedException {
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[text()='Pending Orders']//parent::a")).click();
		Thread.sleep(2000);
	}

	@When("User Click Edit Icon for Selected Scrip {string}")
	public void user_click_edit_icon_for_selected_scrip(String string) throws InterruptedException {
		WebElement editScript = driver.findElement(By.xpath("//span[text()='" + string+ "']//parent::div[@role='button']//descendant::span[@class='cntx_menu order_context']"));
		editScript.click();
		Thread.sleep(2000);
	}

	@When("User Click Modify")
	public void user_click_modify() {
		driver.findElement(By.xpath("//span[text()='Modify']//ancestor::button")).click();

	}

	@When("User Modify Quality")
	public void user_modify_quality() throws InterruptedException {
		WebElement qty = driver.findElement(By.xpath("//label[text()='Qty']//following-sibling::input"));
		Actions ac = new Actions(driver);
		ac.moveToElement(qty).perform();
		Thread.sleep(2000);

		qty.clear();
		Thread.sleep(2000);

		qty.sendKeys("2");
	}

	@When("User Modify Price")
	public void user_modify_price() throws InterruptedException {
		WebElement price = driver.findElement(By.xpath("//label[text()='Price']//following-sibling::input"));
		price.clear();
		price.sendKeys("513.20");

		Thread.sleep(2000);

	}

	@When("User Click Update")
	public void user_click_update() {
		WebElement update = driver.findElement(By.xpath("//button[text()='Update']"));
		update.click();
	}

	@When("User Click Yes in Pop up")
	public void user_click_yes_in_pop_up() throws InterruptedException {
		Thread.sleep(2000);

		WebElement updateYes = driver.findElement(By.xpath("//button[text()='yes']"));
		updateYes.click();
	}

	@When("Verify the Modify Notification popup")
	public void verify_the_modify_notification_popup() {
		WebElement updatePopup = driver.findElement(By.xpath("//span[@class='dhx_message__text']"));

		if (updatePopup.isDisplayed()) {
			System.out.println("Verify the Updated SuccessFully");
		} else {
			System.out.println("Verify the is not updated");

		}
	}

	@When("User Click Pending Order")
	public void user_click_pending_order() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Pending Orders']//parent::a")).click();
		Thread.sleep(2000);
	}

	@When("User Click Selected Scrip {string} Edit")
	public void user_click_selected_scrip_edit(String string) throws InterruptedException {
		WebElement editScript = driver.findElement(By.xpath("//span[text()='"+string+"']//parent::div[@role='button']//descendant::span[@class='cntx_menu order_context']"));
		editScript.click();
		Thread.sleep(2000);
	}

	@When("User Click Cancel")
	public void user_click_cancel() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Cancel']//ancestor::button[@type='button']")).click();
		Thread.sleep(2000);
	}

	@When("User Click Yes for Confirmation")
	public void user_click_yes_for_confirmation() {
		driver.findElement(By.xpath("//button[text()='yes']")).click();

	}

	@When("User Verify the Cancellation Notification Popup")
	public void user_verify_the_cancellation_notification_popup() throws Exception {
		WebElement deletedScriptPopup = driver.findElement(By.xpath("//span[@class='dhx_message__text']"));

		if (deletedScriptPopup.isDisplayed()) {
			System.out.println("Verify Script Deleted Successfully");
		} else {
			System.out.println("Verify Script is Not Deleted");

		}
		
	}
	@When("User Click Holdings")
	public void user_click_holdings() throws InterruptedException {

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span[text()='Holdings']//parent::a)[1]")).click();
		Thread.sleep(2000);
	}

	@When("Verify Adding All Stock Investment Value is Equal to Investment Value")
	public void verify_adding_all_stock_investment_value_is_equal_to_investment_value() throws InterruptedException {
		List<WebElement> allInvestmentValue = driver.findElements(By.xpath("//div[@class='dhx_grid-row ']//descendant::div[@data-dhx-col-id='investmentvalue']//child::div"));

        // Create a List to store the text values
        List<String> investmentValues = new ArrayList<>();

        // Iterate through each WebElement and extract text values
        for (WebElement invValue : allInvestmentValue) {
            String text = invValue.getText();
            investmentValues.add(text);
            System.out.println("Investments Values in Rows: " + text);
        }

        // Print all text values stored in the list
        System.out.println("All Investment Values: " + investmentValues);

        // Calculate the sum of investment values without using stream API
        double sum = 0;
        for (String value : investmentValues) {
            sum += Double.parseDouble(value);
        }

        // Print the total investment value
        System.err.println("Total Investment Value: " + sum);

        // Find the total investment value element
        WebElement totalInvestmentValue = driver.findElement(By.xpath("//p[text()='Investment Value']//following-sibling::span"));
        String text1 = totalInvestmentValue.getText();

        // Remove currency symbol from text1
        text1 = text1.replaceAll("[^0-9.-]", "");

        System.err.println(text1);

        // Convert sum and text1 to strings and compare before the decimal point
        String sumBeforeDecimal = String.valueOf(sum).split("\\.")[0];
        String text1BeforeDecimal = text1.split("\\.")[0];

        // Verify if the values before the decimal point are equal
        if (sumBeforeDecimal.equals(text1BeforeDecimal)) {
            System.out.println("Inv Value is Equals to Total Investment Amount");
        } else {
            System.out.println("Inv Value is Not Equals to Total Investment Amount");
        }
        
        Thread.sleep(2000);
	}

	@When("Verify Adding All Stock Curr Value is Equal to Current Value")
	public void verify_adding_all_stock_curr_value_is_equal_to_current_value() throws InterruptedException {
		System.err.println(">>>>>>>>>>>>>>>> Current Values<<<<<<<<<<<<<<<<<");
	       

		List<WebElement> allCurrentValue = driver.findElements(By.xpath("//div[@class='dhx_grid-row ']//descendant::div[@data-dhx-col-id='Currvalue']//child::div"));
        List<String> Currvalue = new ArrayList<>();

        for (WebElement cValue : allCurrentValue) {
            String text = cValue.getText();
            Currvalue.add(text);
            System.out.println("Current Values in Rows: " + text);
        }

        // Print all text values stored in the list
        System.out.println("All Current Values: " + Currvalue);
        
       double sum1 = 0;
        for (String value1 : Currvalue) {
            sum1 += Double.parseDouble(value1);
        }
        System.err.println("Total Current Value: " + sum1);

        WebElement currentValue = driver.findElement(By.xpath("//p[text()='Current Value']//following-sibling::span"));
        String text2 = currentValue.getText();
        text2 = text2.replaceAll("[^0-9.-]", "");

        System.err.println(text2);
        
        String sumBeforeDecimal1 = String.valueOf(sum1).split("\\.")[0];
        String text1BeforeDecimal1 = text2.split("\\.")[0];

        Thread.sleep(2000);

        if (sumBeforeDecimal1.equals(text1BeforeDecimal1)) {
            System.out.println("Curr Value is Equals to Total Current Values");
        } else {
            System.out.println("Curr Value is Not Equals to Total Current Values");
        }
        Thread.sleep(2000);
	}

	@When("Verify Adding All Stock P\\/L Value is Equal to P\\/L")
	public void verify_adding_all_stock_p_l_value_is_equal_to_p_l() throws InterruptedException {
		List<WebElement> allTotalPandL = driver.findElements(By.xpath("//div[@class='dhx_grid-row ']//descendant::div[@data-dhx-col-id='PL']//child::div"));
        List<String> TotalPandL = new ArrayList<>();
        Thread.sleep(2000);

        for (WebElement PandL : allTotalPandL) {
            String text22 = PandL.getText();
            TotalPandL.add(text22);
            System.out.println("P/L Values in Rows: " + text22);
        }       
        
        System.out.println("P/L Values: " + TotalPandL);

        double sum2 = 0;
        for (String value2 : TotalPandL) {
        	sum2 += Double.parseDouble(value2);
        }
        System.err.println("Total P/L Value: " + sum2);

        WebElement pAndVValue = driver.findElement(By.xpath("//p[text()='P/L Value']//following-sibling::span"));
        String text3 = pAndVValue.getText();
        
        text3 = text3.replaceAll("[^0-9.-]", "");

        System.err.println(text3);
        Thread.sleep(2000);

        String sumBeforeDecimal2 = String.valueOf(sum2).split("\\.")[0];
        String text1BeforeDecimal2 = text3.split("\\.")[0];

        
        if (sumBeforeDecimal2.equals(text1BeforeDecimal2)) {
            System.out.println("P/L Value is Equals to Total P/L Values");
        } else {
            System.out.println("P/L Value is Not Equals to Total P/L Values");
        }
        Thread.sleep(2000);
	}

	@When("Verify Adding All Stock Today P\\/L Value is Equal to Today P\\/L Value")
	public void verify_adding_all_stock_today_p_l_value_is_equal_to_today_p_l_value() throws InterruptedException {
		List<WebElement> allPandL = driver.findElements(By.xpath("//div[@class='dhx_grid-row ']//descendant::div[@data-dhx-col-id='TPL']//child::div"));
        List<String> pAndL = new ArrayList<>();

        for (WebElement PandL : allPandL) {
            String text23 = PandL.getText();
            pAndL.add(text23);
            System.out.println("All today p/l Values in Rows: " + text23);
        }       
        Thread.sleep(2000);

        System.out.println("All today p/l  Values: " + pAndL);

        double sum3 = 0;
        for (String value3 : pAndL) {
        	sum3 += Double.parseDouble(value3);
        }
        System.err.println("Total today p/l Value: " + sum3);

        WebElement pAndVValueTotal = driver.findElement(By.xpath("//p[text()='Today P/L Value']//following-sibling::span"));
        String text4 = pAndVValueTotal.getText();
        Thread.sleep(2000);

        text4 = text4.replaceAll("[^0-9.-]", "");

        System.err.println(text4);
        
        String sumBeforeDecimal3 = String.valueOf(sum3).split("\\.")[0];
        String text1BeforeDecimal3 = text4.split("\\.")[0];

        
        if (sumBeforeDecimal3.equals(text1BeforeDecimal3)) {
            System.out.println("Today P/L Value is Equals to Today Total P/L Values");
        } else {
            System.out.println("Today P/L Value is Not Equals to Today Total P/L Values");
        }
        Thread.sleep(2000);
        
        
       
	}

	@When("Verify Calculate Current Value Subtract Investment Value Its Equal to P\\/L Value")
	public void verify_calculate_current_value_subtract_investment_value_its_equal_to_p_l_value() throws InterruptedException {
		 WebElement holdingsCurrentValue = driver.findElement(By.xpath("//p[text()='Current Value']//following-sibling::span"));
	        String text = holdingsCurrentValue.getText();

	        // Remove currency symbols
	        text = text.replaceAll("[^0-9.]", "");

	        // Find the Investment Value element
	        WebElement holdingsInvestmentValue = driver.findElement(By.xpath("//p[text()='Investment Value']//following-sibling::span"));
	        String text33 = holdingsInvestmentValue.getText();

	        // Remove currency symbols
	        text33 = text33.replaceAll("[^0-9.]", "");

	        // Convert strings to doubles and subtract
	        double currentValue1 = Double.parseDouble(text);
	        double investmentValue = Double.parseDouble(text33);
	        double difference = currentValue1 - investmentValue;
	        Thread.sleep(2000);

	        // Print the difference
	        System.out.println("Difference between Current Value and Investment Value: " + difference);
	        
	        WebElement holdingsPandLValue = driver.findElement(By.xpath("//p[text()='P/L Value']//following-sibling::span"));
	        String text34 = holdingsPandLValue.getText();

	        text34 = text34.replaceAll("[^0-9.-]", "");
	        Thread.sleep(1000);
	        
	        System.out.println(text34);

	        // Verify if the decimal values are equal
	        if (String.format("%.2f", difference).equals(text34)) {
	            System.out.println("Decimal values of Difference and P&L Value are equal.");
	        } else {
	            System.out.println("Decimal values of Difference and P&L Value are not equal.");
	        }
	}
	@When("User Search {string} in Searchbox")
	public void user_search_in_searchbox(String string) {
		driver.findElement(By.xpath("//input[@id='project-id']")).sendKeys(string);

	}

	@When("User Click Futures")
	public void user_click_futures() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='Futures']")).click();
		Thread.sleep(3000);

	}

	@When("User mouse over {string} and click add icon")
	public void user_mouse_over_and_click_add_icon(String string) throws InterruptedException {
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//div[@class='srh_results act']/descendant::span[text()='"+string+"']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::li//descendant::span[@class='s_add_sym']")).click();

	}

	@When("Symbol Has been Added Successfully Notification Shown")
	public void symbol_has_been_added_successfully_notification_shown() {
	  
//		WebElement notification = driver.findElement(By.xpath("//span[text()='Symbol Has been Added Successfully']"));
//	
//		WebElement alreadyAdded = driver.findElement(By.xpath("//span[text()='Token already exist']"));
//		if (notification.isDisplayed()) {
//			System.out.println("Verify Scrip Added Successfully");
//		} 
//
//		else {
//			System.out.println("error");
//		}
		
		System.out.println("hello");
	}

	@When("User Click Clear in search box")
	public void user_click_clear_in_search_box() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Clear']")).click();
	}

	@When("User Click {string}")
	public void user_click(String string) throws InterruptedException {
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='"+string+"']//preceding-sibling::span[@class='symbolsseries']")).click();

		
	}

	@When("User Click F&O")
	public void user_click_f_o() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//lable[text()='F&O']//parent::button")).click();
	}

	@When("User Click Cancel button in Ready Made Pop up")
	public void user_click_cancel_button_in_ready_made_pop_up() throws InterruptedException {
		
		
		Thread.sleep(5000);
		
		
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("(//span[text()='x'])[1]")).click();
	}

	@When("User Click LTP")
	public void user_click_ltp() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='LTP']")).click();
	}

	@When("User Verify the Fluctuating")
	public void user_verify_the_fluctuating() throws InterruptedException {
		
		WebElement callLTP = driver.findElement(By.xpath("(//div[@class='ops_ltp_item get_attr_data act_left act_right']//descendant::span)[1]"));
		String text = callLTP.getText();
		System.out.println("Call LTP Value :"+text);
		
		Thread.sleep(5000);
		
		WebElement callLTP1 = driver.findElement(By.xpath("(//div[@class='ops_ltp_item get_attr_data act_left act_right']//descendant::span)[1]"));
		String text1 = callLTP1.getText();
		System.out.println("Call LTP Value After 5 Second:"+text1);
		
		if (text.equalsIgnoreCase(text1)) {
			System.out.println("Verified Lpt Call LTP Values is not fluctuating");
		} else {
			System.out.println("Verified Lpt Call LTP Values is fluctuating");

		}
		///////////////////////////////
		
		WebElement putLTP = driver.findElement(By.xpath("(//div[@class='ops_ltp_item get_attr_data act_left act_right']//descendant::span)[12]"));
		String text2 = putLTP.getText();
		System.out.println("Call LTP Value :"+text2);
		
		Thread.sleep(5000);
		
		WebElement putLTP1 = driver.findElement(By.xpath("(//div[@class='ops_ltp_item get_attr_data act_left act_right']//descendant::span)[12]"));
		String text3 = putLTP1.getText();
		System.out.println("Put LTP Value After 5 Second:"+text3);
		
		if (text2.equalsIgnoreCase(text3)) {
			System.out.println("Put Lpt LTP Values is not fluctuating");
		} else {
			System.out.println("Put Lpt LTP Values is fluctuating");

		}
		
	}
	
	@When("User Click Add Money")
	public void user_click_add_money() throws InterruptedException {
		Thread.sleep(4000);

		WebElement element = driver.findElement(
				By.xpath("//div[@data-cell-id='d']//descendant::div[@aria-label='tab-content-btn_addmoney']"));
		element.click();

		

	}

	@When("User enter money in amount to add")
	public void user_enter_money_in_amount_to_add() throws InterruptedException {
		Thread.sleep(2000);

		WebElement addMoneyFrame = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
		driver.switchTo().frame(addMoneyFrame);

		driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).click();

		WebElement enterAmount = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
		enterAmount.clear();
		Thread.sleep(1000);

		enterAmount.sendKeys("50");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='deposit_amount']")).click();

		driver.switchTo().defaultContent();
	}

	@When("User Choose Pay Using UPI")
	public void user_choose_pay_using_upi() throws InterruptedException {
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> li1 = new ArrayList<String>(windowHandles1);
		int size = li1.size();
		System.out.println(size);

		driver.switchTo().window(li1.get(1));

		driver.navigate().refresh();

		driver.navigate().refresh();

		driver.navigate().refresh();

		driver.navigate().refresh();

		driver.navigate().refresh();

		Thread.sleep(5000);



	}

	@When("User Enter UPI\\/ID\\/Mobile Number and click pay now")
	public void user_enter_upi_id_mobile_number_and_click_pay_now() throws InterruptedException, AWTException {
		driver.switchTo().frame(0);

		Robot robot = new Robot();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		js.executeScript("window.scrollBy(0, 500)");
		js.executeScript("window.scrollBy(0, -500)");

		WebElement netBanking = driver.findElement(By.xpath("(//div[@class='input-radio slotted'])[3]"));

		netBanking.click();
		Thread.sleep(1000);

		WebElement UPI = driver.findElement(By.xpath("(//div[@class='input-radio slotted'])[1]"));

		UPI.click();
		Thread.sleep(1000);

		WebElement clickPayUsingUPI = driver.findElement(By.xpath("//button[text()='Pay using UPI / QR']"));
		clickPayUsingUPI.click();


		Thread.sleep(3000);
		

		WebElement element2 = driver.findElement(By.xpath("//div[text()='UPI ID/ Mobile Number']"));
		element2.click();

		driver.findElement(By.xpath("//input[@id='vpa-upi']")).sendKeys("7358302581");

		driver.findElement(By.xpath("//button[text()='Pay Now']")).click();


		
		Thread.sleep(40000);
		WebElement rejectedMessage = driver.findElement(By.xpath("//div[text()='Payment was unsuccessful as collect request was rejected on UPI app.Please initiate the request again']"));

		
		if (rejectedMessage.isDisplayed()) {
			js.executeScript("arguments[0].style.border='2px solid yellow'", rejectedMessage);
			System.out.println("Payment Declined");

		}

		else {
			js.executeScript("arguments[0].style.border='2px solid red'", rejectedMessage);
			System.out.println("Payment SuccessFul");
		}

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

}
	@When("User Click Position")
	public void user_click_position() throws InterruptedException {
		WebElement position = driver.findElement(By.xpath("//span[text()='Position']//parent::a"));
		position.click();
		
		Thread.sleep(2000);
	}

	@When("Verify Product {string} Inv.Value {double} LTP Multiply into Net Qty is Equal to M2M Value")
	public void verify_product_inv_value_ltp_multiply_into_net_qty_is_equal_to_m2m_value(String string, Double double1) throws InterruptedException {
		
		
		WebElement ltpElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='LTP']//descendant::span"));
		String LTP = ltpElement.getText();
		
		System.out.println(LTP);
		
		WebElement invElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='InvValue']//descendant::span"));
		String invPrice = invElement.getText();
		
		System.out.println(invPrice);

		WebElement qtyElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='NetQty']"));
		String qty = qtyElement.getText();
		
		System.out.println(qty);

		WebElement m2mElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='M2M']//descendant::span"));
		String m2m = m2mElement.getText();
		
		System.out.println(m2m);

		Thread.sleep(2000);
		
		LTP = LTP.replace(",", "");
		invPrice = invPrice.replace(",", "");

		// Remove the currency symbol from m2m and convert it to a numeric value
        double m2mValue = Double.parseDouble(m2m.replace("₹", "").trim());
       
       
        // Convert string values to numerical values
        double ltpValue = Double.parseDouble(LTP);
        double invPriceValue = Double.parseDouble(invPrice);
        int qtyValue = Integer.parseInt(qty);

        // Calculate M2M using the formula: LTP - Cost Price * Quantity
        double calculatedM2M = invPriceValue - ltpValue * (qtyValue);

    System.out.println(m2mValue);
	System.out.println(calculatedM2M);
	
	    String strM2mValue = String.valueOf(m2mValue);
	    String strCalculatedM2M = String.valueOf(calculatedM2M);
	
	   
	    if (strM2mValue.equals(strCalculatedM2M)) {
		      System.err.println("Verify Inv Value :"+invPrice +" - " +"LTP Value :"+LTP +" * " +"Net Qty Value : "+qty +" = :"+strCalculatedM2M +" Equal to = M2M "+strM2mValue);
		    } else {
			    
			      System.err.println("Verify Inv Value :"+invPrice +" - " +"LTP Value :"+LTP +" * " +"Net Qty Value : "+qty +" = :"+strCalculatedM2M +" Equal to = M2M "+strM2mValue);

		    }
	}

	@When("Verify Product {string} Cost Price Value {double} LTP Multiply into Net Qty is Equal to M2M Value")
	public void verify_product_cost_price_value_ltp_multiply_into_net_qty_is_equal_to_m2m_value(String string, Double double1) throws InterruptedException {
		WebElement ltpElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='LTP']//descendant::span"));
		String LTP = ltpElement.getText();
		
		System.out.println(LTP);
		
		WebElement costPriceElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='Costprice']//descendant::span"));
		String costPrice = costPriceElement.getText();
		
		System.out.println(costPrice);

		WebElement qtyElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='NetQty']"));
		String qty = qtyElement.getText();
		
		System.out.println(qty);

		WebElement m2mElement = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@role='row']//descendant::div[@data-dhx-col-id='M2M']//descendant::span"));
		String m2m = m2mElement.getText();
		
		System.out.println(m2m);

		Thread.sleep(2000);
		
		LTP = LTP.replace(",", "");
	    costPrice = costPrice.replace(",", "");

		// Remove the currency symbol from m2m and convert it to a numeric value
        double m2mValue = Double.parseDouble(m2m.replace("₹", "").trim());
       
       
        // Convert string values to numerical values
        double ltpValue = Double.parseDouble(LTP);
        double costPriceValue = Double.parseDouble(costPrice);
        int qtyValue = Integer.parseInt(qty);

        // Calculate M2M using the formula: LTP - Cost Price * Quantity
        double calculatedM2M = costPriceValue - ltpValue * (qtyValue);

    System.out.println(m2mValue);
	System.out.println(calculatedM2M);
	
	    String strM2mValue = String.valueOf(m2mValue);
	    String strCalculatedM2M = String.valueOf(calculatedM2M);
	
	   
	    if (strM2mValue.equals(strCalculatedM2M)) {
		      System.err.println("Verify Costprice Value :"+costPrice +" - " +"LTP Value :"+LTP +" * " +"Net Qty Value : "+qty +" = :"+strCalculatedM2M +" Equal to = M2M "+strM2mValue);
		    } else {
			    
			      System.err.println("Verify Costprice Value :"+costPrice +" - " +"LTP Value :"+LTP +" * " +"Net Qty Value : "+qty +" = :"+strCalculatedM2M +" Equal to = M2M "+strM2mValue);

		    }
	}
	
	@When("Click Plus Symbol")
	public void click_plus_symbol() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='add_mw_btn']")).click();
		
	}

	@When("User Enter new MarketWatch Name {string}")
	public void user_enter_new_market_watch_name(String string) throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='new_mw_name']")).sendKeys(string);
	}

	@When("Click Create Button")
	public void click_create_button() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Create']//parent::button")).click();
	}
	@When("Right Click {string} Particular MarketWatch")
	public void right_click_particular_market_watch(String string) throws InterruptedException {
		Thread.sleep(1000);

          WebElement particularElement = driver.findElement(By.xpath("//span[text()='"+string+"']//parent::button"));
          ac.contextClick(particularElement).perform();
          
  		Thread.sleep(1000);

	}

	@When("Click Rename")
	public void click_rename() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Rename']//ancestor::button")).click();
		Thread.sleep(1000);

	}

	@When("User Enter Marketwatch rename {string}")
	public void user_enter_marketwatch_rename(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='new_mw_name']")).sendKeys(string);
		Thread.sleep(1000);

	}

	@When("Click Click Save")
	public void click_click_save() throws InterruptedException {
	  
		driver.findElement(By.xpath("//span[text()='Save']//ancestor::button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='yes']")).click();
	}
	
	@When("User Right Click {string} Particular MarketWatch")
	public void user_right_click_particular_market_watch(String string) throws InterruptedException {
		Thread.sleep(1000);

        WebElement particularElement = driver.findElement(By.xpath("//span[text()='"+string+"']//parent::button"));
        ac.contextClick(particularElement).perform();
        
		Thread.sleep(1000);

	}

	@When("User Click Delete")
	public void user_click_delete() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Delete']//ancestor::button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='yes']")).click();
	}
	
	@When("User MouseOver Dashboard and Click Tools")
	public void user_mouse_over_dashboard_and_click_tools() throws InterruptedException {
	   
		 WebElement dashBoard = driver.findElement(By.xpath("(//span[text()='Dashboard']//ancestor::li)[1]"));
			
			ac.moveToElement(dashBoard).perform();
			
		    Thread.sleep(2000);

			driver.findElement(By.xpath("//label[text()='Tools']//ancestor::li")).click();
			
	}
	
	

	@When("User Click Basket")
	public void user_click_basket() throws InterruptedException {
		driver.switchTo().frame(0);
	    Thread.sleep(2000);
	    
	    WebElement priceAlert = driver.findElement(By.xpath("//h4[text()='Price Alert']//ancestor::div[@class='menu_item']"));

		WebElement basket = driver.findElement(By.xpath("(//h4[text()='Basket']//ancestor::div[@class='menu_item'])[2]"));
          ac.moveToElement(priceAlert).perform();
		
		ac.click(basket).perform();
	}

	@When("User Select Basket {string} Place Order")
	public void user_select_basket_place_order(String string) throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        
        driver.switchTo().frame(0);
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);

	    WebElement everGreenPlaceOrder = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@class='basket_items']//descendant::button[@class='place_order']"));
	    everGreenPlaceOrder.click();
	}

	@When("User Choose {string} Qty for {string} and {string} amount for {string}")
	public void user_choose_qty_for_and_amount_for(String string, String string2, String string3, String string4) throws InterruptedException {
		 Thread.sleep(1000);

		    WebElement gOLDBEES = driver.findElement(By.xpath("(//span[text()='"+string2+"']//ancestor::div[@class='b_top_flex']//descendant::input[@class='qty'])[2]"));
		    gOLDBEES.clear();
		    gOLDBEES.sendKeys(string);
		    Thread.sleep(1000);

		    WebElement gOLDBEESValue = driver.findElement(By.xpath("(//span[text()='"+string4+"']//ancestor::div[@class='b_top_flex']//descendant::input[@class='qty'])[2]"));
		    gOLDBEESValue.clear();
		    gOLDBEESValue.sendKeys(string3);
		    Thread.sleep(1000);
	}

	@When("Again User Choose {string} Qty for {string} and {string} amount for {string}")
	public void again_user_choose_qty_for_and_amount_for(String string, String string2, String string3, String string4) throws InterruptedException {
		WebElement nIFTYBEES = driver.findElement(By.xpath("(//span[text()='"+string2+"']//ancestor::div[@class='b_top_flex']//descendant::input[@class='qty'])[2]"));
	    nIFTYBEES.clear();
	    nIFTYBEES.sendKeys(string);
	    Thread.sleep(1000);

	    WebElement nIFTYBEESValue = driver.findElement(By.xpath("(//span[text()='"+string4+"']//ancestor::div[@class='b_top_flex']//descendant::input[@type='number'])[4]"));
	    nIFTYBEESValue.clear();
	    nIFTYBEESValue.sendKeys(string3);
	}

	@When("Place Order")
	public void place_order() throws InterruptedException {
		 Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//input[@value='Place Orders']")).click();
		    
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("//button[text()='yes']")).click();
		    
		    Thread.sleep(2000);

		    driver.switchTo().defaultContent();
		    
		    
		    WebElement insufficientFund = driver.findElement(By.xpath("//div[@id='nofund_popup']//descendant::h5"));
		    
		    if (insufficientFund.isDisplayed()) {
				System.out.println("InsufficientFund is Displayed");
			} else {
	            System.out.println("Successful added");
			}
	}
	
	@When("User add basket")
	public void user_add_basket() throws InterruptedException {
	    Thread.sleep(2000);

		 driver.switchTo().frame(0);
		 
		 WebElement myBasket = driver.findElement(By.xpath("//button[text()='My Baskets']"));
		 myBasket.click();
	}

	@When("Enter Basketname {string}, description {string} and click add")
	public void enter_basketname_description_and_click_add(String string, String string2) throws InterruptedException {
		WebElement addBasket = driver.findElement(By.xpath("//button[text()=' Add Basket']"));
		addBasket.click();
	    Thread.sleep(1000);

		WebElement basketName = driver.findElement(By.xpath("//input[@placeholder='Enter basket name']"));
		basketName.sendKeys(string);
		
		WebElement basketDescription = driver.findElement(By.xpath("(//textarea[@placeholder='Description'])[1]"));
		basketDescription.sendKeys(string2);
	    Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='add_b_name']")).click();
	    Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.switchTo().defaultContent();
	
	}
	

	@When("User Navigate to Dashboard")
	public void user_navigate_to_dashboard() throws InterruptedException {
		WebElement dashBoard = driver.findElement(By.xpath("(//span[text()='Dashboard']//ancestor::li)[1]"));
		
		ac.moveToElement(dashBoard).perform();
		
	    Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[text()='Dashboard']//ancestor::li)[1]")).click();
		
		WebElement close = driver.findElement(By.xpath("//span[text()='Clear']"));
		
		ac.moveToElement(close).perform();
		
		close.click();

	    Thread.sleep(1000);


	}
	@When("User Select Qty {string}")
	public void user_select_qty(String string) {
		driver.findElement(By.xpath("//input[@id='order_qty']")).sendKeys(string);

	}
	
	

	@When("User Click Basket Icon")
	public void user_click_basket_icon() throws InterruptedException {
	    Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='btn-bskt add_basket']")).click();
	}
	
	@When("User Choose Basket {string}")
	public void user_choose_basket(String string) throws InterruptedException {

	    Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@class='basket_box']")).click();
	
	    Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='yes']")).click();
	    Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Close']")).click();
	    Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@data-dhx-id='close']")).click();
		
	}
	
	@When("User Navigate to Basket and Click My Baskets")
	public void user_navigate_to_basket_and_click_my_baskets() throws InterruptedException {
    WebElement dashBoard = driver.findElement(By.xpath("(//span[text()='Dashboard']//ancestor::li)[1]"));
		
		ac.moveToElement(dashBoard).perform();
		
	    Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[text()='Dashboard']//ancestor::li)[1]")).click();
		
		driver.findElement(By.xpath("//label[text()='Basket']//parent::a")).click();
		
		driver.switchTo().frame(0);
		
		
	    Thread.sleep(1000);

		 WebElement addBasket = driver.findElement(By.xpath("(//span[@onclick='editBasketOrder(this)'])[1]"));
		 addBasket.click();
		 
		    Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[@class='close_pop'])[1]")).click();
	    Thread.sleep(1000);

			WebElement myBasket = driver.findElement(By.xpath("//button[text()='My Baskets']"));
		 myBasket.click();
		

	}


	@When("User Click Place Order for Particular {string} Baskets")
	public void user_click_place_order_for_particular_baskets(String string) throws InterruptedException {
	  
		
		Thread.sleep(1000);

		
		WebElement placeOrderParticularBaskets = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@class='basket_items']//descendant::button[@class='place_order']"));
		placeOrderParticularBaskets.click();
	
	}
	
	@When("User Click Sip Order for Particular {string} Baskets")
	public void user_click_sip_order_for_particular_baskets(String string) throws InterruptedException {
		Thread.sleep(1000);

		WebElement sipOrder = driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@class='basket_items']//descendant::button[@class='place_order sip_place_button']"));
		sipOrder.click();
	}

	@When("User Select Frequency {string} , Enter SIP Installment {string} and Select Sip Day {string}")
	public void user_select_frequency_enter_sip_installment_and_select_sip_day(String string, String string2, String string3) throws InterruptedException {
		  
	    WebElement frequency = driver.findElement(By.xpath("//p[text()='Frequency']//following-sibling::select[@class='sip_err_amount']"));
	
	    Select s = new Select(frequency);
	    s.selectByValue(string);
	    Thread.sleep(2000);

	    WebElement sipInstallment = driver.findElement(By.xpath("//p[text()='SIP Installment']//following-sibling::input"));
	    sipInstallment.clear();
	    sipInstallment.sendKeys(string2);
	    Thread.sleep(2000);

	    WebElement weeklySIPDay = driver.findElement(By.xpath("//p[text()='"+string3+"']//following-sibling::select"));
	    Select s1 = new Select(weeklySIPDay);

	    s1.selectByValue("friday");
	    Thread.sleep(2000);
	    
	    
	 
	    
	    WebElement firstSelectedOption = s1.getFirstSelectedOption();
	    
	    String text3 = firstSelectedOption.getText();
	    
	    System.out.println("Selected day : " +text3);
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//input[@value='Place SIP Orders']")).click();
		   
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//button[text()='Close']")).click();

	    
	    DayOfWeek desiredDay = DayOfWeek.valueOf(text3.toUpperCase());

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the number of days to add to reach the desired day of the week
        int daysToAdd = desiredDay.getValue() - currentDate.getDayOfWeek().getValue();
        if (daysToAdd <= 0) {
            daysToAdd += 7; // If the desired day is earlier in the week, add 7 days to find the next occurrence
        }

        // Calculate the next occurrence of the desired day
        LocalDate nextInstallmentDate = currentDate.plusDays(daysToAdd);

        // Output the next installment date
        System.out.println("Next Installment Date (coming " + text3 + "): " + nextInstallmentDate);
    
        
        
        WebElement nextInstallment = driver.findElement(By.xpath("(//div[@class='sip_act']//child::span)[2]"));
        String text2 = nextInstallment.getText();
        
        // Split the string by ": " to separate the date
        String[] parts = text2.split(": ");

        // Extract the date portion from the second part
        String datePart = parts[1];

        // Output the extracted date
        System.out.println("Next Installment Date: " + datePart);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate extractedDate = LocalDate.parse(datePart, formatter);

        // Output the extracted date
        System.out.println("Next Installment Date from webpage: " + extractedDate);

        // Compare the two dates
        if (nextInstallmentDate.equals(extractedDate)) {
            System.out.println("Both dates match.");
        } else {
            System.out.println("Dates do not match.");
        }
	}

	

	

	

	@When("User Execute following orders")
	public void user_execute_following_orders() throws InterruptedException {

	    Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@onclick='placeBasketOrder()']//parent::div")).click();
	
		
		
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//button[text()='yes']")).click();
	}

	@When("User Click Delete sip for Particular {string} Baskets")
	public void user_click_delete_sip_for_particular_baskets(String string) throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='"+string+"']//ancestor::div[@class='basket_items']//descendant::span[@class='rmv_basket']")).click();
	}

	@When("User Click Yes for confirmation sip delete")
	public void user_click_yes_for_confirmation_sip_delete() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='yes']")).click();
	}


	
	@When("User Click close After Deleted Successfully")
	public void user_click_close_after_deleted_successfully() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		System.out.println("hi");
	}
	
	@When("Navigate to home page")
	public void navigate_to_home_page() throws InterruptedException {
		
		driver.navigate().to("https://rocket.tradeplusonline.com/");
		Thread.sleep(2000);
	   }

	@When("User Select any Call LTP Buy")
	public void user_select_any_call_ltp_buy() throws InterruptedException {
	
		WebElement buy = driver.findElement(By.xpath("(//div[@class='ops_ltp_item get_attr_data act_left act_right']//descendant::span[@data-trade='B'])[1]"));
		buy.click();
		Thread.sleep(1000);

	}

	@When("User Select any Put LTP Sell")
	public void user_select_any_put_ltp_sell() throws InterruptedException {
	
		WebElement sell = driver.findElement(By.xpath("(//div[@class='ops_ltp_item get_attr_data act_left act_right']//descendant::span[@data-trade='S'])[2]"));
		sell.click();
		Thread.sleep(1000);

	}

	@When("User Click Save Strategy")
	public void user_click_save_strategy() throws InterruptedException {
	
		WebElement save = driver.findElement(By.xpath("//div[text()='Save Strategy']"));
		save.click();
		Thread.sleep(1000);

	}

	
	@When("User enter Strategy Name {string}")
	public void user_enter_strategy_name(String string) throws InterruptedException {
		Random random = new Random();

        // Generate a random long value representing milliseconds since epoch
        long randomEpochMilli = random.nextLong();

        // Convert the long value to a LocalDateTime object (Java 8 or later)
        LocalDateTime randomDateTime = Instant.ofEpochMilli(randomEpochMilli).atZone(ZoneId.systemDefault()).toLocalDateTime();

        // Format the LocalDateTime object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = randomDateTime.format(formatter);

        // Print the formatted date time
        System.out.println("Random Date Time: " + formattedDateTime);
		WebElement strategyName = driver.findElement(By.xpath("//input[@id='stratagy_name']"));
		strategyName.sendKeys(string+formattedDateTime);
		Thread.sleep(1000);
	}
	@When("User Click Save")
	public void user_click_save() throws InterruptedException {
	   
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(1000);
		
	

	}

	@When("User Click Strategy Message ok")
	public void user_click_strategy_message_ok() throws InterruptedException {
	    
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='jconfirm-buttons']")).click();
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//span[@class='str_save_close']")).click();
		Thread.sleep(1000);
	}

	@When("User Click Place Order")
	public void user_click_place_order() throws InterruptedException {
		
	  
		driver.findElement(By.xpath("//span[text()=' Place Order']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='yes']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='jconfirm-buttons']//child::button[text()='ok']")).click();
		
	}
	
	@When("User click read made")
	public void user_click_read_made() throws InterruptedException {
	   
		driver.findElement(By.xpath("//div[text()='Ready made']")).click();
		Thread.sleep(1000);

	}

	@When("User Choose Ready made Strategy categories {string}")
	public void user_choose_ready_made_strategy_categories(String string) throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='"+string+"']")).click();
		Thread.sleep(1000);

	}

	@When("User Select Strategy under categories {string}")
	public void user_select_strategy_under_categories(String string) {
	
		driver.findElement(By.xpath("(//div[text()='"+string+"']//parent::div)[1]")).click();
	}
	@When("User Mouse Over and Add a Script")
	public void user_mouse_over_and_add_a_script() throws InterruptedException {
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//div[@class='srh_results act']/descendant::li[1]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='srh_results act']/descendant::span[@class='s_add_sym'])[1]"))
				.click();
	}
	
	@When("User Click Tools {string}")
	public void user_click_tools(String string) throws InterruptedException {
		driver.switchTo().frame(0);
		 
		 WebElement element = driver.findElement(By.xpath("//h4[text()='Global']//ancestor::div[@class='menu_item']"));
		   Actions ac = new Actions(driver);
		   ac.moveToElement(element).perform();		
		
		 Thread.sleep(2000);
	  driver.findElement(By.xpath("//h4[text()='"+string+"']//ancestor::div[@class='menu_item']")).click();


	}

	@When("User Verify Buy Back Page")
	public void user_verify_buy_back_page() throws InterruptedException {
		
		Thread.sleep(10000);

		 String title = driver.getTitle();
		 System.out.println(title);

		   Set<String> windowHandles1 = driver.getWindowHandles();
			ArrayList<String> li1 = new ArrayList<String>(windowHandles1);
			int size = li1.size();
			System.out.println(size);

			driver.switchTo().window(li1.get(1));
			
			List<WebElement> elements = driver.findElements(By.xpath("//table[@class='table footable trade-plus-table footable-loaded custome breakpoint']/tbody/tr/td"));
	
			for (WebElement webElement : elements) {
				String text = webElement.getText();
				System.out.println("BBO DashBoard Current Buybacks Script"+text);
			}
			driver.close();
			
			driver.switchTo().window(li1.get(0));

	}

	@When("User MouseOver Dashboard and Click Mutual Funds")
	public void user_mouse_over_dashboard_and_click_mutual_funds() throws InterruptedException {

		 WebElement dashBoard = driver.findElement(By.xpath("(//span[text()='Dashboard']//ancestor::li)[1]"));
			
			ac.moveToElement(dashBoard).perform();
			
		    Thread.sleep(2000);

			driver.findElement(By.xpath("//label[text()='Mutual Fund']//ancestor::li")).click();
	}
	
	@When("User click Explore and Search {string}")
	public void user_click_explore_and_search(String string) throws InterruptedException, AWTException {
	    Thread.sleep(2000);

		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
		
		driver.switchTo().frame(iframe);
		
	    Thread.sleep(2000);
	    
	    WebElement mandateList = driver.findElement(By.xpath("//a[@id='mandatelist-label']"));
	    
	    Actions ac = new Actions(driver);
	    ac.moveToElement(mandateList).perform();
	    Thread.sleep(15000);


		driver.findElement(By.xpath("//a[@id='dashboard-label']//descendant::i")).click();
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='Search_Input']")).click();
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='Search_Input']")).sendKeys(string);
	    Thread.sleep(2000);
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@When("User Add to WatchList")
	public void user_add_to_watch_list() throws InterruptedException {
	    Thread.sleep(8000);
	    
	  
    driver.findElement(By.xpath("//table[@id='default_results_table']/tbody/tr/td[6]/child::button[text()='Add to watchlist']")).click();

		
	}

	@When("Verify in Watchlist")
	public void verify_in_watchlist() throws InterruptedException {
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Watch List']")).click();


	}

	@When("Select the {string} Mutual Fund")
	public void select_the_mutual_fund(String string) throws InterruptedException {
	    Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[text()='"+string+"'])[1]")).click();
	    Thread.sleep(3000);
	    
	    WebElement element = driver.findElement(By.xpath("//iframe[@name='iframe1']"));
	    
	    driver.switchTo().frame(element);

		driver.findElement(By.xpath("//a[text()='One-Time']//parent::li[@class='tabs-title']")).click();
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='buy_invest_amount']")).sendKeys("10");
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Pay Now']")).click();
	}
	
	@When("User Select UPI Payment")
	public void user_select_upi_payment() {
	   
		driver.findElement(By.xpath("//div[@onclick='open_upifrm()']")).click();
	}

	@When("User enter UPI ID {string} and Click Pay Via UPI")
	public void user_enter_upi_id_and_click_pay_via_upi(String string) {
	 
		driver.findElement(By.xpath("//input[@id='payment_sec_UPI_value']")).sendKeys(string);
		
		driver.findElement(By.xpath("//input[@id='payment_sec_UPI1']")).click();
		
		
	}
	
	@When("User Pay or Decline the Payment")
	public void user_pay_or_decline_the_payment() throws InterruptedException, AWTException {
	  
		Thread.sleep(1000);

		Robot robot = new Robot();

        // Simulate CTRL + - key press to zoom out
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

        // Additional zoom out (repeat as needed)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(45000);
		
		//driver.findElement(By.xpath("//h5[text()=' Cancel Payment ']")).click();
		
	}
	
	@When("Again User Click Pay Now")
	public void again_user_click_pay_now() throws InterruptedException {
		Thread.sleep(2000);

//      WebElement element = driver.findElement(By.xpath("//iframe[@name='iframe1']"));
//	    
//	    driver.switchTo().frame(element);
		driver.findElement(By.xpath("//button[text()='Pay Now']")).click();

	}

	@When("User Select Net Banking and click Pay Via Net Banking")
	public void user_select_net_banking_and_click_pay_via_net_banking() throws InterruptedException, AWTException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@onclick='open_net_bnk()']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='payment_sec_NETBANK']")).click();
		
		Thread.sleep(15000);
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> li = new ArrayList<>(windowHandles2);
		Thread.sleep(2000);

		int size = windowHandles2.size();
		System.out.println(size);
		
		driver.switchTo().window(li.get(1));
		Thread.sleep(2000);


		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.close();

		driver.switchTo().window(li.get(0));

		Thread.sleep(5000);

	}
	
	@When("User go to Watchlist and Delete {string}")
	public void user_go_to_watchlist_and_delete(String string) throws InterruptedException {
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(1000);


		driver.findElement(By.xpath("//a[text()='Watch List']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[text()='"+string+"']//ancestor::tr//descendant::td[6]//child::button)[1]")).click();
	}
	
	@When("User Again go to Watchlist and Delete {string}")
	public void user_again_go_to_watchlist_and_delete(String string) throws InterruptedException {
	  
		
		driver.switchTo().parentFrame();
		
	   driver.switchTo().defaultContent();
	   Thread.sleep(3000);

	   driver.switchTo().frame(0);
	   
	   Thread.sleep(1000);


		driver.findElement(By.xpath("//a[text()='Watch List']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[text()='"+string+"']//ancestor::tr//descendant::td[6]//child::button)[1]")).click();
	
	}

	@When("User MouseOver Dashboard and click IPO\\/NFO and Click")
	public void user_mouse_over_dashboard_and_click_ipo_nfo_and_click() throws InterruptedException {
		WebElement dashBoard = driver.findElement(By.xpath("(//span[text()='Dashboard']//ancestor::li)[1]"));
		
		ac.moveToElement(dashBoard).perform();
		
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='IPO/NFO/BOND']//ancestor::li")).click();

	}

	@When("User Select Current IPO and Click Apply")
	public void user_select_current_ipo_and_click_apply() throws InterruptedException {
	    Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
		
		driver.switchTo().frame(element);
	  
	    Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@value='Apply'])[1]")).click();
	}

	@When("User enter UPI ID , Category , Quantity \\(Lots) , BID Options and Price Cut")
	public void user_enter_upi_id_category_quantity_lots_bid_options_and_price_cut() throws InterruptedException {
	 
		
		driver.findElement(By.xpath("//input[@id='upiid']")).click();
	    Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='upiid']")).sendKeys("venketsmart4848@okhdfcbank");
	    Thread.sleep(1000);

		WebElement element = driver.findElement(By.xpath("//p[text()='Min Qty(Lot Size) : ']//following-sibling::span"));
		String text = element.getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("(//input[@class='quantity'])[1]")).sendKeys(text);
	    Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@cut='11'])[1]")).click();
		
	    Thread.sleep(2000);

	
	}

	@When("User Click Agree and Click Submit")
	public void user_click_agree_and_click_submit() throws InterruptedException {
	   
		driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
	    Thread.sleep(2000);

	}

	@When("User Clik Yes For IPO Amount Payable")
	public void user_clik_yes_for_ipo_amount_payable() throws InterruptedException {
	 
		driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='yes']")).click();
		
	    Thread.sleep(4000);

		
	}
	
	@When("User Click Profit and Click Support")
	public void user_click_profit_and_click_support() {
	
		WebElement element = driver.findElement(By.xpath("//div[@class='user-profile dpd ']"));
		element.click();
		
		driver.findElement(By.xpath("//li[text()='Support']")).click();
		
		
	}
	@Then("User Verify All the Options in Chatbot")
	public void user_verify_all_the_options_in_chatbot() throws InterruptedException {
	 
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> li = new ArrayList<String>(windowHandles);
		int size = li.size();
		System.out.println(size);
		
	    driver.switchTo().window(li.get(0));
	    
	    Thread.sleep(2000);
	    driver.switchTo().window(li.get(1));

	    String text = driver.findElement(By.xpath("//button[text()='Trading Queries']")).getText();
	    System.out.println(text);
	    
	    WebElement element = driver.findElement(By.xpath("//button[text()='Trading Queries']"));
	     element.click();
	     
	     System.out.println("End");
	
	}
}

