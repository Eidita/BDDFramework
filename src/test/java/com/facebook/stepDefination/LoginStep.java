package com.facebook.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;
	@Given("User open facebook application")
	public void userOpenFacebookApplication() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@When("enter my valid userName")
	public void enterMyValidUserName() {
		driver.findElement(By.id("email")).sendKeys("hdcb");
	}
	
	@When("enter my valid pass")
	public void enterMyValidPass() {
		driver.findElement(By.id("pass")).sendKeys("jhs");
	}
	
	@When("hit login button")
	public void hitLoginButton() {
	    }
	
	@Then("I can be logged in")
	public void iCanBeLoggedIn() {
	    }

}
