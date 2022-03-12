package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCContactsPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCContactsTabPageTest extends ULCBaseTest {

	@Test
	public void uLCContactsTabPageTest() throws InterruptedException {
		ULCContactsPage contactsTabPage = new ULCContactsPage(driver);
		System.out.println("The Home page is opened and Contacts Tab is displayed.");
		contactsTabPage.goToContactsTab();
		Thread.sleep(2000);
		System.out.println("The Contacts Page opened and Contacts information is displayed.");
		contactsTabPage.goToContactInf();
		Thread.sleep(2000);
		System.out.println("Return to the Contacts tab.");
		contactsTabPage.goToContactsTab();
	}

	@Test
	public void uLCContactsPersonalInfoPageTest() throws InterruptedException {
		ULCContactsPage personalInfPage = new ULCContactsPage(driver);
		System.out.println("The Home page is opened and Contacts Tab is displayed.");
		personalInfPage.goToContactsTab();
		System.out.println("The Contacts Page opened and personal information is displayed.");
		personalInfPage.goToContactInf();
		System.out.println("Return to the Contacts tab.");
		personalInfPage.goToContactsTab();
		Thread.sleep(2000);
	}

	@Test
	public void uLCPersonalInfoNameFieldTest() throws InterruptedException {
		ULCContactsPage nameField = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened and personal information page is opened.");
		nameField.goToContactsTab();
		System.out.println("Type the Name in the personal information name field.");
		nameField.fillName("Lilit Todorova");
		Thread.sleep(4000);
		System.out.println("Click on the Submit button.");
		nameField.goToSbmitbtn();
		Thread.sleep(4000);
		System.out.println("Ensure that the Summary Error is displayed, and Email, Phone, and Message fields are required.");
		nameField.goToSummaryErrors();
		System.out.println("Return to the Contacts tab.");
		nameField.goToContactsTab();
		Thread.sleep(2000);
	}

	@Test
	public void uLCPersonalInfoEmailFieldTest() throws InterruptedException {
		ULCContactsPage emailField = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		emailField.goToContactsTab();
		System.out.println("Type the Email address in the personal information Email field.");
		emailField.fillEmail("My Email Address");
		Thread.sleep(2000);
		System.out.println("Click on the Submit button.");
		emailField.goToSbmitbtn();
		Thread.sleep(4000);
		System.out.println("Ensure that the Summary Error is displayed, and Name, Phone and Message fields are required.");
		emailField.goToSummaryErrors();
		System.out.println("Return to the Contacts tab.");
		emailField.goToContactsTab();
		Thread.sleep(2000);
		System.out.println("Ensure that the validation does not check and ignore that the email format.");
		Thread.sleep(2000);
	}

	@Test
	public void uLCPersonalInfoPhoneFieldTest() throws InterruptedException {
		ULCContactsPage phoneField = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		phoneField.goToContactsTab();
		System.out.println("Type the Phone Number in the personal information Phone Number field.");
		phoneField.fillPhoneNum("My Phone Number");
		Thread.sleep(2000);
		System.out.println("Click on the Submit button.");
		phoneField.goToSbmitbtn();
		Thread.sleep(4000);
		System.out.println("Ensure that the Summary Error is displayed, and Name, Phone and Email fields are required.");
		phoneField.goToSummaryErrors();
		System.out.println("Return to the Contacts tab.");
		phoneField.goToContactsTab();
		Thread.sleep(2000);
		System.out.println("Ensure that the validation does not check for only numeric requirements and ignores the digit requirements");
		Thread.sleep(2000);
	}

	@Test
	public void uLCPersonalInfoMessageFieldTest() throws InterruptedException {
		ULCContactsPage messageField = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		messageField.goToContactsTab();
		System.out.println("Type the Message in the personal information Message field.");
		messageField.fillMessage("Feel free to get in touch with us if you have any questions");
		Thread.sleep(2000);
		System.out.println("Click on the Submit button.");
		messageField.goToSbmitbtn();
		Thread.sleep(4000);
		System.out.println("Ensure that the Summary Error is displayed, and Name, Phone and Email fields are required.");
		messageField.goToSummaryErrors();
		messageField = messageField.goToSummaryErrors();
		System.out.println("Return to the Contacts tab.");
		messageField.goToContactsTab();
		Thread.sleep(2000);
	}

	@Test
	public void uLCPersonalInfoSubmitTest() throws InterruptedException {
		ULCContactsPage submitePage = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		submitePage.goToContactsTab();
		System.out.println("Type the Name in the personal information name field.");
		submitePage.fillName("Lilit Todorova");
		Thread.sleep(4000);
		System.out.println("Type the Email address in the personal information Email field.");
		submitePage.fillEmail("My Email Address");
		Thread.sleep(2000);
		System.out.println("Type the Phone Number in the personal information Phone Number field.");
		submitePage.fillPhoneNum("My Phone Number");
		Thread.sleep(2000);
		System.out.println("Type the Message in the personal information Message field.");
		submitePage.fillMessage("Feel free to get in touch with us if you have any questions");
		Thread.sleep(2000);
		System.out.println("Click on the Submit button.");
		submitePage.goToSbmitbtn();
		Thread.sleep(4000);
		System.out.println("All fields are filled");
		System.out.println("Ensure that the application did not send a message and returned to the home page");
		Thread.sleep(2000);
		System.out.println("Return to the Contacts tab.");
		submitePage.goToContactsTab();
	}

	@Test
	public void uLCContactsPageMapTest() throws InterruptedException {
		ULCContactsPage mapPage = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		mapPage.goToContactsTab();
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		mapPage.goToContactsPageMap();
		Thread.sleep(2000);
		System.out.println("Ensure that the Contacts tab is displayed.");
		mapPage.goToContactsTab();
		Thread.sleep(2000);
	}

	@Test
	public void uLCContactsPageMapDirectionTest() throws InterruptedException {
		ULCContactsPage contactsMapDir = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contactsMapDir.goToContactsTab();
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		Thread.sleep(2000);
		System.out.println("The Contacts Page Map is opened and Direction is displayed");
		System.out.println("Type the Start direction");
		contactsMapDir.fillStartDirection("Mantashyan st");
		Thread.sleep(2000);
		System.out.println("Type the End direction");
		contactsMapDir.fillEndDirection("ULC");
		System.out.println("Ensure that the direction is displayed");
		System.out.println("Return to the Contacts tab.");
		contactsMapDir.goToContactsTab();
		Thread.sleep(2000);
	}

	@Test
	public void uLCPagePlaceCardReviewTest() throws InterruptedException {
		ULCContactsPage placeCardReview = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		placeCardReview.goToContactsTab();
		Thread.sleep(2000);
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		placeCardReview.goToContactsPageMap();
		Thread.sleep(2000);
		System.out.println("The Contacts Page Map Review window is opened");
		placeCardReview.goToReviewPage();
		Thread.sleep(4000);
		System.out.println("Review window is opened and WriteReview is displayed");
		placeCardReview.goToWriteReviewPage();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(4000);
		System.out.println("The Contacts Tab is opened.");
		placeCardReview.goToContactsTab();
		
	}

	@Test
	public void uLCPageViewLargeMapTest() throws InterruptedException {
		ULCContactsPage viewLargeMap = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		viewLargeMap.goToContactsTab();
		Thread.sleep(4000);
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		viewLargeMap.goToContactsPageMap();
		Thread.sleep(2000);
		System.out.println("The Contacts page map is displayed and large map is opened in new window.");
		viewLargeMap.goToPlaceCardLargMap();
		Thread.sleep(4000);

	}

	@Test
	public void uLCContactsPageAboutUsTest() throws InterruptedException {
		ULCContactsPage contPgAbUs = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contPgAbUs.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is AboutUs is displayed");
		contPgAbUs.goToContPgAboutUs();
		Thread.sleep(1000);
		System.out.println("The Contacts Tab is opened.");
		contPgAbUs.goToContactsTab();
	}

	@Test
	public void uLCContactsPageCategoriesTest() throws InterruptedException {
		ULCContactsPage contPgCategories = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contPgCategories.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Categories is displayed");
		contPgCategories.goToContPgCategories();
		System.out.println("The Contacts Tab is opened.");
		contPgCategories.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesHomeTest() throws InterruptedException {
		ULCContactsPage categHome = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categHome.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Home is displayed");
		categHome.goToContPgCategHome();
		System.out.println("The Contacts Tab is opened.");
		categHome.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesAboutUSTest() throws InterruptedException {
		ULCContactsPage categAboutUs = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categAboutUs.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is AboutUs is displayed");
		categAboutUs.goToContPgCategAboutUs();
		System.out.println("The Contacts Tab is opened.");
		categAboutUs.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesCorpPacksTest() throws InterruptedException {
		ULCContactsPage categCorpPacks = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categCorpPacks.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Corporate Packs is displayed");
		categCorpPacks.goToContPgCategCorpPacks();
		System.out.println("The Contacts Tab is opened.");
		categCorpPacks.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesInternExamTest() throws InterruptedException {
		ULCContactsPage categIntEx = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categIntEx.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is International Exam is displayed");
		categIntEx.goToContPgCorpInternEx();
		System.out.println("The Contacts Tab is opened.");
		categIntEx.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesUniKidsTest() throws InterruptedException {
		ULCContactsPage categUniKIds = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categUniKIds.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is UniKids is displayed");
		categUniKIds.goToContPgCategUniKids();
		System.out.println("The Contacts Tab is opened.");
		categUniKIds.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesCoursesTest() throws InterruptedException {
		ULCContactsPage categCourses = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categCourses.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Courses is displayed");
		categCourses.goToContPgCategCourses();
		System.out.println("The Contacts Tab is opened.");
		categCourses.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesNewsTest() throws InterruptedException {
		ULCContactsPage categNews = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categNews.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is News is displayed");
		categNews.goToContPgCategNews();
		System.out.println("The Contacts Tab is opened.");
		categNews.goToContactsTab();
	}

	@Test
	public void uLCContactsCategoriesContactsTest() throws InterruptedException {
		ULCContactsPage categContacts = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categContacts.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Contacts is displayed");
		categContacts.goToContPgCategContacts();
		System.out.println("The Contacts Tab is opened.");
		categContacts.goToContactsTab();
	}

	@Test
	public void uLCContactsPageFollowUsTest() throws InterruptedException {
		ULCContactsPage contFollowUs = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contFollowUs.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Follow us is displayed");
		contFollowUs.goToContPgFollowUs();
		System.out.println("The Contacts Tab is opened.");
		contFollowUs.goToContactsTab();
	}

	@Test
	public void uLCContactsPageAddressTest() throws InterruptedException {
		ULCContactsPage contAddress = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contAddress.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Address is displayed");
		contAddress.goToContPgAddress();
		System.out.println("The Contacts Tab is opened.");
		contAddress.goToContactsTab();
	}

	@Test
	public void uLCContactsPagePhoneTest() throws InterruptedException {
		ULCContactsPage contPhone = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contPhone.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Phone is displayed");
		contPhone.goToContPgPhone();
		System.out.println("The Contacts Tab is opened.");
		contPhone.goToContactsTab();
	}

	@Test
	public void uLCContactsPageEmailTest() throws InterruptedException {
		ULCContactsPage contEmail = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contEmail.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Email is displayed");
		contEmail.goToContPgEmail();
		System.out.println("The Contacts Tab is opened.");
		contEmail.goToContactsTab();
	}

	@Test
	public void uLCContactsPageFacebookTest() throws InterruptedException {
		ULCContactsPage contFacebook = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contFacebook.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Facebook buttonl is displayed");
		contFacebook.goToContPgFacebook();
		System.out.println("The Contacts Tab is opened.");
		contFacebook.goToContactsTab();
	}

	@Test
	public void uLCContactsPageInstagramTest() throws InterruptedException {
		ULCContactsPage contInstagram = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contInstagram.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Instagram buttonl is displayed");
		contInstagram.goToContPgInstagram();
		System.out.println("The Instagram button doesn't open the Instagram page returns to the Home page.");
		System.out.println("The Contacts Tab is opened.");
		contInstagram.goToContactsTab();
	}

	@Test
	public void uLCContactsPageSkypeTest() throws InterruptedException {
		ULCContactsPage contSkype = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contSkype.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("In the bottom of the Contacts page is Skype buttonl is displayed");
		contSkype.goToContPgSkype();
		System.out.println("The Instagram button doesn't open the Skype page returns to the Home page.");
		System.out.println("The Contacts Tab is opened.");
		contSkype.goToContactsTab();
	}
}
