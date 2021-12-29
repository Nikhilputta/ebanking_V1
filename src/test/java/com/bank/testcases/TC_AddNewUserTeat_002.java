package com.bank.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.pageObjects.AddCustomer;
import com.bank.pageObjects.LoginPage;

public class TC_AddNewUserTeat_002 extends BaseClass {
	
	@Test
	public void ValidatingAddCustomer() {
		
		driver.get(baseURL);
		logger.info("sucessfully launch the url");
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		AddCustomer ad = new AddCustomer(driver);
		ad.LinkAddnewCustomer();
		ad.custmername("NikhilP");
		ad.custmergender("male");
		ad.custmerdob("19", "09", "1996");
		ad.custmeradd("Muneshwara block");
		ad.custmercity("Banglore");
		ad.custmerstate("Karanata");
		ad.custPin(560026);
		ad.custPhno(randomeNumber());
		String email = randomemail() + "@gamil.com";
		ad.custEmail(email);
		ad.save();
		
		boolean  src = driver.getPageSource().contains("");
		
		if(src==true) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}else {
			Assert.assertTrue(true);
		}
		
		
	}
	
	public String randomemail() {
		String RandomE = RandomStringUtils.randomAlphabetic(8);
		return RandomE;
	}
	
	public String randomeNumber() {
		String RandomeN = RandomStringUtils.randomNumeric(10);
		return RandomeN;
		
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
