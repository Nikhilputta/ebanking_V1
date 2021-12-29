package com.bank.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.pageObjects.LoginPage;

public class TC_Logintest_001 extends BaseClass{
	@Test
	public void logingTest() {
		driver.get(baseURL);
		logger.info("Url is lanched");
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
		logger.info("username is enterd");
		lp.setpassword(password);
		logger.info("password is enterd");
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Welcome To Manager's Page of GTPL Bank")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(true);
		}
		
	}

}
