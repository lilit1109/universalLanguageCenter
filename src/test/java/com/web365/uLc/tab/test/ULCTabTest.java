package com.web365.uLc.tab.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.uLc.page.home.ULCHomePage;
import com.web365.uLc.page.tab.ULCAboutUsPage;
import com.web365.uLc.page.tab.ULCContactsPage;
import com.web365.uLc.page.tab.ULCCorporatePacksPage;
import com.web365.uLc.page.tab.ULCCoursesPage;
import com.web365.uLc.page.tab.ULCInternationalExamPage;
import com.web365.uLc.page.tab.ULCIntesolWorldwidePage;
import com.web365.uLc.test.base.ULCBaseTest;

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
		ULCAboutUsPage aboutUs = home.goToAboutUsTab();
		Thread.sleep(2000);
		
		System.out.println("Click on the AboutUs tab.");
		ULCCorporatePacksPage corpPack = aboutUs.goToCorporatePacksTab();
		Thread.sleep(2000);
		
		System.out.println("Click on the Corporate Packs tab.");
		ULCInternationalExamPage intExam = corpPack.goToInternationalExamTab();
		Thread.sleep(2000);
		
		System.out.println("Click on the International Exam tab.");
		ULCIntesolWorldwidePage wwPage = intExam.goToIntesolWorldwideTab();
		Thread.sleep(2000);
		
		System.out.println("Click on the Intesol Worldwide tab.");
		ULCCoursesPage courses = wwPage.goToCoursesTab();
		Thread.sleep(2000);
		
		System.out.println("Click on the Courses tab.");
		ULCContactsPage contacts = courses.goToContactsTab();
		Thread.sleep(2000);
		
		System.out.println("Click on the Contacts tab.");
		Thread.sleep(2000);
		Assert.assertTrue(contacts.navigTabBar.isDisplayed());
	}

	@Test
	public void uLCPageBookNowTest() throws InterruptedException {
		
		ULCHomePage home = new ULCHomePage(driver);
		System.out.println("Make sure that the Book Now button is displayed and click on it.");
		home  = home.goToBookNow();
		Thread.sleep(2000);
		
		System.out.println("Click in the Courses box and select the course.");
		ULCHomePage selectCourses = home.goToSelectCourse();
		Thread.sleep(2000);
		
		System.out.println("Click in the Trainings box and select the Training hours.");
		ULCHomePage selectTraining = selectCourses.goToSelectTrainings();
		Thread.sleep(2000);
		
		System.out.println("Click in the Make a payment button and open the new page.");
		ULCHomePage makePayment = selectTraining.goToMakeAPayment();
		Thread.sleep(2000);
		
		System.out.println("Type and fill the personal information field.");
		ULCHomePage firstName = makePayment.fillFirstName("Lilit");
		Thread.sleep(2000);
		ULCHomePage lastName = firstName.fillLastName("Todorova");
		Thread.sleep(2000);
		ULCHomePage email = lastName.fillEmail("lilit");
		Thread.sleep(2000);
		ULCHomePage phone = email.fillPhone("lilit");
		Thread.sleep(2000);
		ULCHomePage message = phone.fillMessage("Hi, how are you");
		Thread.sleep(2000);
		
		System.out.println("Click on the Next button and open the page for checkout");
		ULCHomePage payment = message.goToPaymentNext();
		Thread.sleep(2000);

		System.out.println("Click on the Checkout button and make a payment.");
		ULCHomePage paymentCheckout= payment.goToPaymentCheckout();
		Thread.sleep(2000);
		
		System.out.println("Return to the Home page.");
		home = paymentCheckout.goToHomeTab();
		Thread.sleep(2000);
	}

}