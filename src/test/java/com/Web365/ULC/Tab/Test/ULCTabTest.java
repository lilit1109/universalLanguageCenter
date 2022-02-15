package com.Web365.ULC.Tab.Test;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Home.ULCHomePage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCTabTest extends ULCBaseTest {
	

	@Test
	public void universalLanguageCenterPageTest() throws InterruptedException {
		
			
		ULCHomePage home = new ULCHomePage(driver);
		home = home.logoClick();
		home.goToAboutUsTab();
		home.goToCorporatePacksTab();
		home.goToInternationalExamTab();
		home.goToIntesolWorldwideTab();
		home.goToCoursesTab();
		home.goToContactsTab();
		Assert.assertTrue(home.navigTabBar.isDisplayed());
		}
	
	@Test
	public void uLCPageBookNowTest() throws InterruptedException {
		ULCHomePage bookNow = new ULCHomePage(driver);
		bookNow = bookNow.goToBookNow();
		Actions actions = new Actions(driver);
		actions.moveToElement(bookNow.bookNowPage).perform();
		bookNow =  bookNow.goToSelectCourse();
		Thread.sleep(2000);
		actions.moveToElement(bookNow.homeTab).perform();
		bookNow = bookNow.goToSelectCourse();
		Thread.sleep(2000);
		actions.moveToElement(bookNow.selectTrainings).perform();
		bookNow = bookNow.goToSelectTrainings();
		Thread.sleep(2000);
		actions.moveToElement(bookNow.makeAPayment).perform();
		bookNow = bookNow.goToMakeAPayment();
		Thread.sleep(2000);
		bookNow.fillFirstName("Lilit");
		Thread.sleep(2000);
		bookNow.fillLastName("Todorova");
		Thread.sleep(2000);
		bookNow.fillEmail("lilit");
		Thread.sleep(2000);
		bookNow.fillPhone("lilit");
		Thread.sleep(2000);
		bookNow.fillMessage("Hi, how are you");
		Thread.sleep(2000);
		actions.moveToElement(bookNow.paymentNext).perform();
		bookNow = bookNow.goToPaymentNext();
		actions.moveToElement(bookNow.paymentCheckout).perform();
		bookNow = bookNow.goToPaymentCheckout();
		actions.moveToElement(bookNow.homeTab).perform();
		Thread.sleep(2000);
	}
	
}