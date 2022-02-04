package com.Web365.ULC.Tab.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Home.ULCHomePage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCTabTest extends ULCBaseTest {
	

	@Test
	public void universalLanguageCenterPageTest() throws InterruptedException {
		
			
		ULCHomePage home = new ULCHomePage(driver);
		home = home.logoClick();
		home.goToAboutUs();
		home.goToCorporatePacks();
		home.goToInternationalExam();
		home.goToIntesolWorldwide();
		home.goToCourses();
		home.goToContacts();
		Assert.assertTrue(home.navigBar.isDisplayed());

	}
}