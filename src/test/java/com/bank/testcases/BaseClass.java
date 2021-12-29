package com.bank.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.bank.utitles.readconfig;

public class BaseClass  {
	
	readconfig read = new readconfig();
	public String baseURL = read.getApplicationUrl();
	public String username = read.getusername();
	public String password = read.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		logger = logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
	}

}
	