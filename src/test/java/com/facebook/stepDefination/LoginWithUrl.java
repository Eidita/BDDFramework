package com.facebook.stepDefination;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithUrl extends BaseStep{
	LoginPage lp;
	@Given("user will open <string> and <{string}>")
	public void userWillOpenChromeAnd(String browser, String Url) {
		openApp(browser, Url);
	}
	
	@When("user enter usernames {string}")
	public void userEnterUsernames(String usernames) {
		lp=new LoginPage(driver);
		lp.userNameMethod(usernames);
	    }
	
	@When("user enter passwords {string}")
	public void userEnterPasswords(String passwords) {
	    lp.passWordMethod(passwords);
	}
	
	@When("click on logins button")
	public void clickOnLoginsButton() {
		lp.logingButton();
	    }
	
	@Then("user logg in")
	public void userLoggIn() {
		closeApp();
	   }



}
