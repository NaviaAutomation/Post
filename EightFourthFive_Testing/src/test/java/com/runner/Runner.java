package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = {
 "C:\\Users\\CommonPC\\eclipse-workspace\\EightFourthFive_Testing\\src\\test\\java\\com\\feature\\PostMarketTesting_Nine_Fifteen.feature"
		
},
        glue = {"com.stepdefinition"},
		//tags="@New",
		plugin = { "pretty", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
				"html:target/HtmlReports1/report.html", "json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml" })
public class Runner {
	//naviaautomation@yopmail.com

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {

		driver = BaseClass.launchBroswer("chrome");
	}
}
