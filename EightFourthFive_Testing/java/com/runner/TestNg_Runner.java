package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@io.cucumber.testng.CucumberOptions(features="C:\\Users\\Venkateshwaran\\git\\repository\\EightFourthFive_Testing\\src\\test\\java\\com\\feature\\Daily_EightFourthFive_Testing_Login_Payin_Payout_AddAndDeleteScrip_AmoOrderPlacingModfication_CancelAndPlacedAmoOrder.feature",
                  glue ={"com.stepdefinition"} , 
                //  tags="@sipOrder",
                  plugin = {"pretty",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		  "html:target/HtmlReports1/report.html",
                           "json:target/JSONReports/report.json",
                           "junit:target/JUnitReports/report.xml"})
public class TestNg_Runner extends AbstractTestNGCucumberTests{
	
	public static WebDriver driver;


	@org.testng.annotations.BeforeClass
	public static void browserLaunch(){
		
		driver=BaseClass.launchBroswer("chrome");
	}

}
