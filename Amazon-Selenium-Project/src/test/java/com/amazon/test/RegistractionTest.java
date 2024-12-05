package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.baseTest.baseTest;

public class RegistractionTest  extends baseTest{
	
	@BeforeMethod
	public void setUpPage() {
		homepage.openRegistractionPage();
		
	}
	@Test
	public void isLogoPresentTest() {
		Assert.assertTrue(registractionpage.verifylogo(), "Error-logo is no Present");
		
	}
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(registractionpage.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","error Title doest not match");
	}

}
