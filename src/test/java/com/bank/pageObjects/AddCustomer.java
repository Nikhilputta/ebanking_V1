package com.bank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	public WebDriver ldriver;
	
	public AddCustomer(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement Linkaddcustomer;
	
	@FindBy(name="name")
	WebElement Custname;
	
	@FindBy(name="rad1")
	WebElement Gender;
	

	@FindBy(name="dob")
	WebElement textdob;
	
	@FindBy(name="addr")
	WebElement textaddr;
	
	@FindBy(name="city")
	WebElement textcity;
	
	
	@FindBy(name="state")
	WebElement textstate;
	
	@FindBy(name="pinno")
	WebElement textpin;
	
	@FindBy(name="telephoneno")
	WebElement textphno;
	
	@FindBy(name="emailid")
	WebElement textemail;
	

	@FindBy(name="sub")
	WebElement Submit;
	
	public void LinkAddnewCustomer() {
		Linkaddcustomer.click();
	}
	
	public void custmername(String cname) {
		Custname.sendKeys(cname);
	}
	
	public void custmergender(String cgender) {
		Gender.click();;
	}
	
	public void custmerdob(String dd, String mm, String yyyy) {
		textdob.sendKeys(dd);
		textdob.sendKeys(mm);
		textdob.sendKeys(yyyy);
		
	}
	
	
	public void custmeradd(String Caddres) {
		textaddr.sendKeys(Caddres);
	}
	
	public void custmercity(String Ccity) {
		textcity.sendKeys(Ccity);
	}

	public void custmerstate(String Cstate) {
		textstate.sendKeys(Cstate);
	}
	
	public void custPin(int pin) {
		textpin.sendKeys(String.valueOf(pin));
	}
	
	public void custPhno(String phno) {
		textphno.sendKeys(phno);
	}
	
	public void custEmail(String email) {
		textemail.sendKeys(email);
	}
	
	public void save() {
		Submit.click();
	}
}
