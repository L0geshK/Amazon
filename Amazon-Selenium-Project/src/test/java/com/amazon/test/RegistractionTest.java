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
		Assert.assertEquals(registractionpage.getTitle(), "Amazon Registration","Error-Page Title Does not Match"+registractionpage.getTitle());
	}
	
	
	@Test
	public void verfiyMobilenumber() {
		registractionpage.verifyMobileNumberFunctionality();
	}
	
	@Test
	public void SignInLinkText() {
		Assert.assertEquals(signpage.getTitle(), "Amazon Sign In","Error-Page Title Does not Match"+registractionpage.getTitle());
		registractionpage.clickOnSignIn();
	}

}
