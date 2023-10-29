package com.facebook.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStep {
	public WebDriver driver;
	
	
	public WebDriver openApp(String browser,String Url) {

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "C:/WS/DriverForSelenium/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Chrome is default browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Url);
		return driver;

	}

	
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}
	}

}
