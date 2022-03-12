package com.Web365.ULC.Tab.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Home.ULCHomePage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCTabTest extends ULCBaseTest {
	

	@Test
	public void universalLanguageCenterPageTest() throws InterruptedException {
		
			
		ULCHomePage home = new ULCHomePage(driver);
			System.out.println("Go to the ULC page, find the ULC Logo and click on it.");
		home.goToLogo();
		Thread.sleep(2000);
			System.out.println("Make sure the homepage is opened and tabs is displayed.");
		home.goToHomeTab();
		Thread.sleep(2000);
			System.out.println("Click on the Home tab.");
		home.goToAboutUsTab();
		Thread.sleep(2000);
			System.out.println("Click on the AboutUs tab.");
		home.goToCorporatePacksTab();
		Thread.sleep(2000);
			System.out.println("Click on the Corporate Packs tab.");
		home.goToInternationalExamTab();
		Thread.sleep(2000);
			System.out.println("Click on the International Exam tab.");
		home.goToIntesolWorldwideTab();
		Thread.sleep(2000);
			System.out.println("Click on the Intesol Worldwide tab.");
		home.goToCoursesTab();
		Thread.sleep(2000);
			System.out.println("Click on the Courses tab.");
		home.goToContactsTab();
		Thread.sleep(2000);
			System.out.println("Click on the Contacts tab.");
			Thread.sleep(2000);
		Assert.assertTrue(home.navigTabBar.isDisplayed());
		}
	
	@Test
	public void uLCPageBookNowTest() throws InterruptedException {
		ULCHomePage bookNow = new ULCHomePage(driver);
			System.out.println("Make sure that the Book Now button is displayed and click on it.");
		bookNow.goToBookNow();
			Thread.sleep(2000);
			System.out.println("Click in the Courses box and select the course.");
		bookNow.goToSelectCourse();
			Thread.sleep(2000);
			System.out.println("Click in the Trainings box and select the Training hours.");
		bookNow.goToSelectTrainings();
			Thread.sleep(2000);
			System.out.println("Click in the Make a payment button and open the new page.");
		bookNow.goToMakeAPayment();
			Thread.sleep(2000);
			System.out.println("Type and fill the personal information field.");
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
			System.out.println("Click on the Next button and open the page for checkout");
		bookNow.goToPaymentNext();
			Thread.sleep(2000);
			System.out.println("Click on the Checkout button and make a payment.");
		bookNow.goToPaymentCheckout();
			Thread.sleep(2000);
			System.out.println("Return to the Home page.");
		bookNow.goToHomeTab();
			Thread.sleep(2000);
	}
	
}