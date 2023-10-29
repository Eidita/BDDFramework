package com.facebook.stepDefination;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithScenarioOutline extends BaseStep {
	LoginPage lgp;
	@Given("user can enter {string} and {string}to open app")
	public void userCanEnterAndHttpsWwwFacebookComToOpenApp(String browser,String Url) {
		openApp(browser, Url);
	}
	
	@When("user enter {string} and {string}for input field")
	public void userEnterAnd(String userName, String password) {
		lgp=new LoginPage(driver);
		lgp.userNameMethod(userName);
		lgp.passWordMethod(password);
		 
	}
	
	@When("user click login button")
	public void userClickLoginButton() {
	  lgp.logingButton();
	}
	
	@Then("user can close app")
	public void userCanCloseApp() {
		closeApp();
	}




}
