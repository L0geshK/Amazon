package com.amazon.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.amazon.base.BasePage;
import com.amazon.page.HomePage;
import com.amazon.page.RegistractionPage;
import com.amazon.page.signPage;

public class baseTest {
	
   public BasePage basepage; 
   public WebDriver driver;
   public RegistractionPage registractionpage;
   public signPage signpage;
   public HomePage homepage;
	
	@BeforeMethod
	public void baseSetup() {
		basepage= new BasePage();
		basepage.getDriver("Chrome");
		driver.get("https://www.amazon.in/");
		registractionpage = new RegistractionPage();
		signpage = new signPage();
		homepage = new HomePage();
		
		
	}
	@AfterMethod
	public void closeBrowser() {
		basepage.QuitDriver();
	}

}
