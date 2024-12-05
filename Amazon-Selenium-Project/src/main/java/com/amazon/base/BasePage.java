package com.amazon.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BasePage {
	
	public WebDriver driver;
	



	public WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
		}else if(browser.equalsIgnoreCase("Edge")) {
			EdgeOptions edgeoptions = new EdgeOptions();
			edgeoptions.addArguments("--headless");
			driver= new EdgeDriver(edgeoptions);
		}
		return driver;
	}
	
	public void QuitDriver() {
		driver.quit();
	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public boolean verifylogo() {
		return false;
	}

}
