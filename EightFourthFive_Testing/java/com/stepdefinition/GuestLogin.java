package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseClass;
import com.pom.Guest_Login_Chart_Minutes_POM;
import com.pom.Guest_Login_Chart_POM;
import com.pom.Guest_Login_POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuestLogin extends BaseClass {

	Guest_Login_POM p = new Guest_Login_POM(driver);
	Guest_Login_Chart_POM s = new Guest_Login_Chart_POM(driver);
	Guest_Login_Chart_Minutes_POM m = new Guest_Login_Chart_Minutes_POM(driver);

	@Given("User Launch The Url")
	public void user_launch_the_url() throws InterruptedException, AWTException {

		driver.get("https://yopmail.com/");

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		WebElement yopMail = driver.findElement(By.xpath("//input[@placeholder='Enter your inbox here']"));
		yopMail.sendKeys("guestloginautomation@yopmail.com");

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

		getUrl("https://rocket.tradeplusonline.com/login.php");

		driver.navigate().refresh();

		driver.switchTo().window(li.get(0));

		driver.switchTo().window(li.get(1));

		Thread.sleep(5000);

	}

	@When("User Click The Login As Guest button")
	public void user_click_the_login_as_guest_button() throws InterruptedException {

		p.getGustLogin().click();
		Thread.sleep(3000);

	}

	@When("User Click The Name")
	public void user_click_the_name() throws InterruptedException {

		p.getName().sendKeys("Kanniappan");
		Thread.sleep(1000);

	}

	@When("User Click The Email")
	public void user_click_the_email() throws InterruptedException {

		p.geteMail().sendKeys("kanniappanb460@gmail.com");
		Thread.sleep(1000);

	}

	@When("User Click The MobileNumber")
	public void user_click_the_mobile_number() throws InterruptedException {

		p.getMobileNumber().sendKeys("6374837965");
		Thread.sleep(1000);

	}

	@When("User Click The Agree Icon")
	public void user_click_the_agree_icon() throws InterruptedException {

		p.getAgree().click();
		Thread.sleep(2000);

	}

	@When("User Click The Login button in Guest login button")
	public void user_click_the_login_button_in_guest_login_button() throws InterruptedException {

		p.getLogin().click();

		Thread.sleep(6000);

	}

	@Then("Next Page Shown")
	public void next_page_shown() {

		toGetTitle();

	}

	@When("User Send The Mobile Otp and Verification")
	public void user_send_the_mobile_otp_and_verification() throws InterruptedException, AWTException {

		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> li = new ArrayList<String>(windowHandles);
		int size = li.size();
		System.out.println(size);

		driver.switchTo().window(li.get(0));

		Thread.sleep(8000);
		driver.navigate().refresh();

		driver.switchTo().frame("ifmail");

		WebElement text2 = driver.findElement(By.xpath("//div[@id='mail']"));
		String text3 = text2.getText();

		String otpPattern = "\\b\\d{6}\\b"; // Matches exactly 6 consecutive digits

		// Compile the pattern and create a matcher
		Pattern pattern = Pattern.compile(otpPattern);
		Matcher matcher = pattern.matcher(text3);

		// Check if the OTP is found
		if (matcher.find()) {
			// Extract the OTP
			String otp = matcher.group();
			System.out.println("Extracted OTP: " + otp);

			driver.switchTo().defaultContent();

			driver.switchTo().window(li.get(1));

			driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys(otp);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='login_otp_submit'] ")).click();

			driver.switchTo().window(li.get(0));

			driver.close();

			driver.switchTo().window(li.get(1));
		} else {
			System.out.println("OTP not found in the text.");
		}
		driver.switchTo().defaultContent();
		Thread.sleep(6000);

	}

	@When("User Click The Login button")
	public void user_click_the_login_button() {

	}

	@When("User Click The Profile")
	public void user_click_the_profile() throws InterruptedException {

		s.getProfile().click();
		Thread.sleep(3000);

	}

	@When("User Click The Theme button")
	public void user_click_the_theme_button() throws InterruptedException {

		s.getTheme().click();
		Thread.sleep(2000);

	}

	@When("User Click The Niftyfifty Icon")
	public void user_click_the_niftyfifty_icon() throws InterruptedException {

		s.getNiftyfifty().click();
		Thread.sleep(2000);

	}

	@When("User Click The Chart button")
	public void user_click_the_chart_button() throws InterruptedException {

		s.getChart().click();
		Thread.sleep(8000);

	}

	@When("User Click The Chart Minutes button")
	public void user_click_the_chart_minutes_button() throws InterruptedException {

		framesHandling();
		Thread.sleep(2000);
		m.getMinutesButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}

	@When("User Change The Five Minutes Chart Icon")
	public void user_change_the_five_minutes_chart_icon() throws InterruptedException {

		framesHandling();
		Thread.sleep(2000);
		m.getFiveMinutes().click();
		switchToMainFrame();
		Thread.sleep(6000);

	}

	@When("User Change The Fifteen Minutes Chart Icon")
	public void user_change_the_fifteen_minutes_chart_icon() throws InterruptedException {

		framesHandling();
		Thread.sleep(2000);
		m.getMinutesButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		m.getFifteenMinutes().click();
		switchToMainFrame();
		Thread.sleep(6000);

	}

	@When("User Change The One Hour Chart Icon")
	public void user_change_the_one_hour_chart_icon() throws InterruptedException {

		framesHandling();
		Thread.sleep(2000);
		m.getMinutesButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		m.getOneHour().click();
		switchToMainFrame();
		Thread.sleep(6000);

	}

	@When("User Change The One Day Chart Icon")
	public void user_change_the_one_day_chart_icon() throws InterruptedException {

		framesHandling();
		Thread.sleep(2000);
		m.getMinutesButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		m.getOneDay().click();
		switchToMainFrame();
		Thread.sleep(6000);

	}

	@When("User Click The Chart Icon button   #Candles")
	public void user_click_the_chart_icon_button_candles() throws InterruptedException {

		framesHandling();
		s.getChartIconButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}

	@When("User Click The Candles Icon button")
	public void user_click_the_candles_icon_button() throws InterruptedException {

		framesHandling();
		s.getCandlesIconbutton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}

	@When("User Click The Indicator button")
	public void user_click_the_indicator_button() throws InterruptedException {

		framesHandling();
		s.getIndicatorButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}

	@When("User Click The Indicator To Value Send  #Mass Index")
	public void user_click_the_indicator_to_value_send_mass_index() throws InterruptedException {

		framesHandling();
		s.getIndicatorSearchButton().sendKeys("Mass Index");
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		s.getIndicatorValueClickButton().click();
		switchToMainFrame();
		Thread.sleep(4000);

		// framesHandling();
		s.getMassIndexButtonPop().click();
		// switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		s.getIndicatorValueCloseButton().click();
		switchToMainFrame();

		Thread.sleep(2000);

	}

	@When("User Click The Setting button")
	public void user_click_the_setting_button() throws InterruptedException {

		framesHandling();
		s.getSettingButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}
	
	@When("User Click The Color Bars button")
	public void user_click_the_color_bars_button() throws InterruptedException {
	   
		framesHandling();
		s.getColorBars().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Body button")
	public void user_click_the_body_button() throws InterruptedException {
	   
		framesHandling();
		s.getBodyButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Borders button")
	public void user_click_the_borders_button() throws InterruptedException {
	    
		framesHandling();
		s.getBordersButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Wick button")
	public void user_click_the_wick_button() throws InterruptedException {
	   
		framesHandling();
		s.getWickButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Last Price Line button")
	public void user_click_the_last_price_line_button() throws InterruptedException {
	    
		framesHandling();
		s.getLastPriceLine().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	

//	@When("User Click The Price button")
//	public void user_click_the_price_button() throws InterruptedException {
//	  
//		framesHandling();
//		s.getPriceButton().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//		
//		framesHandling();
//		s.getPriceButtonValue().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//		
//	}
//
//	@When("User Click The Line button")
//	public void user_click_the_line_button() throws InterruptedException {
//		
//		framesHandling();
//		s.getLineButton().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//		
//		framesHandling();
//		s.getPriceButtonValue().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//
//	}
//
//	@When("User Click The Fill button")
//	public void user_click_the_fill_button() throws InterruptedException {
//		
//		framesHandling();
//		s.getFillButton().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//		
//		framesHandling();
//		s.getFillButtonValue().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//	    
//	}
//
//	@When("User Click The LastLine button")
//	public void user_click_the_last_line_button() throws InterruptedException {
//	   
//		framesHandling();
//		s.getLastLineButton().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//	}
	
	@When("User Click The HighAndLowPrice button")
	public void user_click_the_high_and_low_price_button() throws InterruptedException {
	    
		framesHandling();
		s.getHighAndLowPriceButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}
	
	@When("User Click The Precision button")
	public void user_click_the_precision_button() throws InterruptedException {
		
		framesHandling();
		
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,500)"); 
		pageUpandDown.executeScript("window.scrollBy(0,500)"); 
		

		
//		WebElement element = driver.findElement(By.xpath("//span[text()='Precision']"));
//		js.executeAsyncScript("arguments[0].scrollIntoView();", element);
//		
		
//		js.executeScript("window.scrollBy(0, 500)");
//		js.executeScript("window.scrollBy(0, 500)");
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		switchToMainFrame();
		
		framesHandling();
		s.getPrecisionButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		s.getPrecisionButtonValue().click();
		
		pageUpandDown.executeScript("window.scrollBy(0,500)"); 
		pageUpandDown.executeScript("window.scrollBy(0,500)"); 
		switchToMainFrame();
		Thread.sleep(2000);

	}


	@When("User Click The TimeZone button")
	public void user_click_the_time_zone_button() throws InterruptedException {
	   
		framesHandling();
		s.getTimeZoneButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getTimeZoneButtonValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	
	@Then("User Click The SymbolOkey button")
	public void user_click_the_symbol_okey_button() throws InterruptedException {
	   
		framesHandling();
		s.getSymbolOkey().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@Then("User Again Check Setting button")
	public void user_again_check_setting_button() throws InterruptedException {
	    
		framesHandling();
		s.getSettingButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	
	@When("User Click The Status Line button")
	public void user_click_the_status_line_button() throws InterruptedException {

		framesHandling();
		s.getStatusLineButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}

	@When("User Click The Symbol button")
	public void user_click_the_symbol_button() throws InterruptedException {
		
		framesHandling();
		s.getSymbol().click();
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		s.getSymbolButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		s.getSymbolButtonValue().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}
	
	@When("User Click The Open Market Status button")
	public void user_click_the_open_market_status_button() throws InterruptedException {
	   
		framesHandling();
		s.getOpenMarketStatus().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The OHLC Value button")
	public void user_click_the_ohlc_value_button() throws InterruptedException {
	   
		framesHandling();
		s.getOHLCValueButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Bar Value Change button")
	public void user_click_the_bar_value_change_button() throws InterruptedException {
	   
		framesHandling();
		s.getBarValueChange().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Volume button Disable")
	public void user_click_the_volume_button_disable() throws InterruptedException {
	   
		framesHandling();
		s.getVolumeButtonDisable().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Indicator Titles button")
	public void user_click_the_indicator_titles_button() throws InterruptedException {
	   
		framesHandling();
		s.getIndicatorTitles().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Indicator Arguments button")
	public void user_click_the_indicator_arguments_button() throws InterruptedException {
	    
		framesHandling();
		s.getIndicatorArguments().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		
	}

	@When("User Click The Indicator Value button")
	public void user_click_the_indicator_value_button() throws InterruptedException {
	    
		framesHandling();
		s.getIndicatorValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Status Background button")
	public void user_click_the_status_background_button() throws InterruptedException {
	   
		framesHandling();
		s.getStatusBackground().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	
	@Then("User Click The StatusOkey button")
	public void user_click_the_status_okey_button() throws InterruptedException {
	   
		framesHandling();
		s.getStatusOkey().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	
	
	@When("User Again Check Setting button In Scales")
	public void user_again_check_setting_button_in_scales() throws InterruptedException {
	    
		framesHandling();
		s.getSettingButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	
	@When("User Click The Scales button")
	public void user_click_the_scales_button() throws InterruptedException {
	   
		framesHandling();
		s.getScalesButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	

	@When("User Click The Symbol Label button")
	public void user_click_the_symbol_label_button() throws InterruptedException {

		framesHandling();
		s.getSymbolLabelButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}
	
	@When("User Click The Symbol Last Price  button")
	public void user_click_the_symbol_last_price_button() throws InterruptedException {
	    
		framesHandling();
		s.getSymbolLastPrice().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getSymbolLastPriceValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The High and Low button")
	public void user_click_the_high_and_low_button() throws InterruptedException {

		framesHandling();
		s.getHighAndLowButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}

	@When("User Click the Indicator Name button")
	public void user_click_the_indicator_name_button() throws InterruptedException {

		framesHandling();
		s.getIndicatorNameButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}
	
	@When("User Click The Indicator Value Label button")
	public void user_click_the_indicator_value_label_button() throws InterruptedException {
	   
		framesHandling();
		s.getIndicatorValueLabel().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	
	@When("User Click The No Overlapping Label button")
	public void user_click_the_no_overlapping_label_button() throws InterruptedException {
	    
		framesHandling();
		s.getNoOverlappingLabel().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	
	@When("User Click The Countdown Bar Close button")
	public void user_click_the_countdown_bar_close_button() throws InterruptedException {
	   
		framesHandling();
		s.getBarCloseButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click the Indicator Lock Price To Bar Ratio button")
	public void user_click_the_indicator_lock_price_to_bar_ratio_button() throws InterruptedException, AWTException {
	   
		framesHandling();
		s.getLockPriceBarRatio().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getLockPriceBarRatioTextButton().click();
		
		for (int i = 1; i <=10; i++) {
			
			Robot robot=new Robot();
			
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			
		}
		//s.getLockPriceBarRatioTextButton().clear();
		s.getLockPriceBarRatioTextButton().sendKeys("72.0");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click the Indicator Scales Placement button")
	public void user_click_the_indicator_scales_placement_button() throws InterruptedException {
	   
		framesHandling();
		s.getScalesPlacementButton().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getScalesPlacementButtonValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}

	@When("User Click the Indicator Date Format button")
	public void user_click_the_indicator_date_format_button() throws InterruptedException {
	    
		framesHandling();
		s.getDateFormatButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getDateFormatButtonValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}
	
	@Then("User Click The ScalesOkey button")
	public void user_click_the_scales_okey_button() throws InterruptedException {
	   
		framesHandling();
		s.getScalesOkey().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}
	
	@When("User Again Click The Setting button")
	public void user_again_click_the_setting_button() throws InterruptedException {
	  
		framesHandling();
		s.getSettingButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}
	

	@When("User Click The Apperance button")
	public void user_click_the_apperance_button() throws InterruptedException {

		framesHandling();
		s.getApperanceButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}

	@When("User Click The Background button")
	public void user_click_the_background_button() throws InterruptedException {

		framesHandling();
		s.getBackgroundButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

		framesHandling();
		s.getBackgroundValueButton().click();
		switchToMainFrame();
		Thread.sleep(2000);

	}
	
	@When("User Click The Very Grid Lines button")
	public void user_click_the_very_grid_lines_button() throws InterruptedException {
	   
		framesHandling();
		s.getVeryGridLines().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getVeryGridLinesValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}

	@When("User Click The Horz Grid lines button")
	public void user_click_the_horz_grid_lines_button() throws InterruptedException {
	    
		framesHandling();
		s.getHorzGridLines().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getHorzGridLinesValue().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getTemplate().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}

//	@When("User Click The Session Breaks button")
//	public void user_click_the_session_breaks_button() throws InterruptedException {
//	   
//		framesHandling();
//		s.getSessionBreaks().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//		
//	}

	@When("User Click The Scales Text button")
	public void user_click_the_scales_text_button() throws InterruptedException {
	   
		framesHandling();
		
//		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
//		pageUpandDown.executeAsyncScript("arguments[0].click();", s.getScalesTextButton());
		
		s.getScalesTextButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		
		//pageUpandDown.executeAsyncScript("arguments[0].click();", s.getScalesTextButtonValue());
		s.getScalesTextButtonValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Scales Lines button")
	public void user_click_the_scales_lines_button() throws InterruptedException {
	   
		framesHandling();
		s.getScalesLinesButton().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getScalesLinesButtonValue().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getTemplate().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}

	@When("User Click The Crosshair button")
	public void user_click_the_crosshair_button() throws InterruptedException {
	   
		framesHandling();
		s.getCrosshairButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getCrosshairButtonValue().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Watermark button")
	public void user_click_the_watermark_button() throws InterruptedException {
	   
		framesHandling();
		s.getWatermarkButton().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Navigation button")
	public void user_click_the_navigation_button() throws InterruptedException {
	   
		framesHandling();
		s.getNavigationButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getNavigationButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The pane button")
	public void user_click_the_pane_button() throws InterruptedException {
	    
		framesHandling();
		s.getPaneButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		s.getPaneButtonValue().click();
		JavascriptExecutor pageUpandDown = (JavascriptExecutor) driver;
		pageUpandDown.executeScript("window.scrollBy(0,1000)"); 
		pageUpandDown.executeScript("window.scrollBy(0,1000)");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Top Margin button")
	public void user_click_the_top_margin_button() throws InterruptedException, AWTException {
	   
		framesHandling();
		s.getTopMargin().click();
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		//s.getTopMargin().clear();
		s.getTopMargin().sendKeys("5");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Bottom Margin button")
	public void user_click_the_bottom_margin_button() throws InterruptedException, AWTException {
	   
		framesHandling();
		s.getBottomMargin().click();
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		//s.getBottomMargin().clear();
		s.getBottomMargin().sendKeys("5");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Right Margin button")
	public void user_click_the_right_margin_button() throws InterruptedException, AWTException {
	    
		framesHandling();
		s.getRightMargin().click();
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		//s.getRightMargin().clear();
		s.getRightMargin().sendKeys("5");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The ApperanceOkey  button")
	public void user_click_the_apperance_okey_button() throws InterruptedException {
	    
		framesHandling();
		s.getApperanceOkey().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		
	}

//	@When("User Click The Template button")
//	public void user_click_the_template_button() throws InterruptedException {
//
//		framesHandling();
//		s.getTemplateButton().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//
//		framesHandling();
//		s.getTemplateValueButton().click();
//		switchToMainFrame();
//		Thread.sleep(2000);
//
//	}
	
	@When("User Click The Save button")
	public void user_click_the_save_button() throws InterruptedException {
	    
		framesHandling();
		m.getSaveButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The New Chart Layout button")
	public void user_click_the_new_chart_layout_button() throws InterruptedException {
	    
		framesHandling();
		m.getChartLayoutButton().sendKeys("Test");;
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		m.getSaveButtonClick().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		
	}

	@When("User Click The Manage Chart Layout button")
	public void user_click_the_manage_chart_layout_button() throws InterruptedException {
	   
		framesHandling();
		m.getManageChartLayout().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}

	@When("User Click The Rename button")
	public void user_click_the_rename_button() throws InterruptedException {
	    
		framesHandling();
		m.getRenameButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		m.getRenameButtonValue().sendKeys("Navia");;
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		m.getRenameButtonValueSave().click();
		switchToMainFrame();
		Thread.sleep(2000);
	
	}

	@When("User Again Click The Manage Chart Layout button")
	public void user_again_click_the_manage_chart_layout_button() throws InterruptedException {
	  
		framesHandling();
		m.getRenameButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Copy Chart Layout button")
	public void user_click_the_copy_chart_layout_button() throws InterruptedException {
	   
		framesHandling();
		m.getCopyChartLayout().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		m.getCopyChartLayoutSave().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Again Manage Chart Layout button")
	public void user_click_the_again_manage_chart_layout_button() throws InterruptedException {
	    
		framesHandling();
		m.getAgainManageChartLayoutButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@When("User Click The Load Layout button")
	public void user_click_the_load_layout_button() throws InterruptedException {
	   
		framesHandling();
		m.getLoadLayoutButton().click();
		switchToMainFrame();
		Thread.sleep(2000);
		
		framesHandling();
		m.getLoadLayoutButtonValue().sendKeys("Navia");
		switchToMainFrame();
		Thread.sleep(2000);
		
	}

	@Then("User Click The Load Layout Close button")
	public void user_click_the_load_layout_close_button() throws InterruptedException {
	   
		framesHandling();
		m.getLoadLayoutButtonValueClose().click();
		switchToMainFrame();
		Thread.sleep(2000);
	}
	
	
	@When("User Click The Chart Size Window One button")
	public void user_click_the_chart_size_window_one_button() throws InterruptedException {

		s.getWindowSizeOne().click();
		Thread.sleep(2000);

	}

	@When("User Click The Chart Size Window Two button")
	public void user_click_the_chart_size_window_two_button() throws InterruptedException {

		s.getWindowSizeTwo().click();
		Thread.sleep(2000);

	}

	@When("User Click The Chart Size Window Three button")
	public void user_click_the_chart_size_window_three_button() throws InterruptedException {

		s.getWindowSizeThree().click();
		Thread.sleep(2000);

	}
	
	
	
	
	

	@When("User Click The Chart Size Window Maximum button")
	public void user_click_the_chart_size_window_maximum_button() throws InterruptedException {

		framesHandling();
		s.getWindowMaximumSize().click();
		switchToMainFrame();
		Thread.sleep(7000);

	}

	@When("User Click The Chart Close button")
	public void user_click_the_chart_close_button() throws InterruptedException {

		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

	}

}
