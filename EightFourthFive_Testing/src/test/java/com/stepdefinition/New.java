package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New  extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException{
		
           launchBroswer("chrome");
	        driver.manage().window().maximize();
	        Thread.sleep(5000);

	        driver.get("https://web.whatsapp.com/");

	        // Click on "Log in with phone number"
	        driver.findElement(By.xpath("//div[text()='Log in with phone number']//parent::span[@role='button']")).click();
	        Thread.sleep(5000);

	        driver.findElement(By.xpath("(//span[@data-icon='chevron'])[1]")).click();
	        
	        driver.findElement(By.xpath("//p[contains(@class,'selectable')]")).sendKeys("India");
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("(//div[text()='India']//parent::div)[1]")).click();
	        
	        Thread.sleep(2000);


	        driver.findElement(By.xpath("//input[@aria-label='Type your phone number.']")).sendKeys("7904670421");
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("(//div[text()='Next']//parent::div)[1]")).click();

	}
	
}