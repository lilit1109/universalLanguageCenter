package  com.web365.uLc.tab.test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.web365.uLc.page.tab.ULCContactsPage;
import com.web365.uLc.test.base.ULCBaseTest;

public class ULCContactsTabPageTest extends ULCBaseTest {

	@Test
	public void uLCContactsTabPageTest() throws InterruptedException {
		ULCContactsPage contactsTabPage = new ULCContactsPage(driver);
		
		System.out.println("The Home page is opened and Contacts Tab is displayed.");
		contactsTabPage = contactsTabPage.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Page opened and Contacts information is displayed.");
		contactsTabPage = contactsTabPage.goToContactInf();
		Thread.sleep(1000);
		
		System.out.println("Return to the Contacts tab.");
		contactsTabPage = contactsTabPage.goToContactsTab();
		Thread.sleep(1000);

	}

	@Test
	public void uLCContactsPersonalInfoPageTest() throws InterruptedException {
		ULCContactsPage personalInfPage = new ULCContactsPage(driver);
		
		System.out.println("The Home page is opened and Contacts Tab is displayed.");
		personalInfPage = personalInfPage.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Page opened and personal information is displayed.");
		personalInfPage = personalInfPage.goToContactInf();
		Thread.sleep(1000);
		
		System.out.println("Return to the Contacts tab.");
		personalInfPage = personalInfPage.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCPersonalInfoNameFieldTest() throws InterruptedException {
		ULCContactsPage nameField = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened and personal information page is opened.");
		nameField = nameField.goToContactsTab();
		
		System.out.println("Type the Name in the personal information name field.");
		nameField = nameField.fillName("Lilit Todorova");
		Thread.sleep(1000);
		
		System.out.println("Click on the Submit button.");
		nameField = nameField.goToSbmitbtn();
		Thread.sleep(1000);
		
		System.out.println("Ensure that the Summary Error is displayed, and Email, Phone, and Message fields are required.");
		nameField = nameField.goToSummaryErrors();
		
		System.out.println("Return to the Contacts tab.");
		nameField = nameField.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCPersonalInfoEmailFieldTest() throws InterruptedException {
		ULCContactsPage emailField = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		emailField = emailField.goToContactsTab();
		
		System.out.println("Type the Email address in the personal information Email field.");
		emailField = emailField.fillEmail("My Email Address");
		Thread.sleep(1000);
		
		System.out.println("Click on the Submit button.");
		emailField = emailField.goToSbmitbtn();
		Thread.sleep(1000);
		
		System.out.println("Ensure that the Summary Error is displayed, and Name, Phone and Message fields are required.");
		emailField = emailField.goToSummaryErrors();
		
		System.out.println("Return to the Contacts tab.");
		emailField = emailField.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("Ensure that the validation does not check and ignore that the email format.");
		Thread.sleep(1000);
	}

	@Test
	public void uLCPersonalInfoPhoneFieldTest() throws InterruptedException {
		ULCContactsPage phoneField = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		phoneField = phoneField.goToContactsTab();
		
		System.out.println("Type the Phone Number in the personal information Phone Number field.");
		phoneField = phoneField.fillPhoneNum("My Phone Number");
		Thread.sleep(1000);
		
		System.out.println("Click on the Submit button.");
		phoneField = phoneField.goToSbmitbtn();
		Thread.sleep(1000);
		
		System.out.println("Ensure that the Summary Error is displayed, and Name, Phone and Email fields are required.");
		phoneField = phoneField.goToSummaryErrors();
		Thread.sleep(1000);
		
		System.out.println("Return to the Contacts tab.");
		phoneField = phoneField.goToContactsTab();
		Thread.sleep(1000);
		System.out.println("Ensure that the validation does not check for only numeric requirements and ignores the digit requirements");
		Thread.sleep(1000);
	}

	@Test
	public void uLCPersonalInfoMessageFieldTest() throws InterruptedException {
		ULCContactsPage messageField = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		messageField = messageField.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("Type the Message in the personal information Message field.");
		messageField = messageField.fillMessage("Feel free to get in touch with us if you have any questions");
		Thread.sleep(1000);
		
		System.out.println("Click on the Submit button.");
		messageField = messageField.goToSbmitbtn();
		Thread.sleep(1000);
		
		System.out.println("Ensure that the Summary Error is displayed, and Name, Phone and Email fields are required.");
		messageField = messageField.goToSummaryErrors();
		Thread.sleep(1000);
		
		System.out.println("Return to the Contacts tab.");
		messageField = messageField.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCPersonalInfoSubmitTest() throws InterruptedException {
		ULCContactsPage submitePage = new ULCContactsPage(driver);
		System.out.println("Ensure that the Contacts Tab is opened and personal information page is opened.");
		submitePage = submitePage.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("Type the Name in the personal information name field.");
		submitePage = submitePage.fillName("Lilit Todorova");
		Thread.sleep(1000);
		
		System.out.println("Type the Email address in the personal information Email field.");
		submitePage = submitePage.fillEmail("My Email Address");
		Thread.sleep(1000);
		
		System.out.println("Type the Phone Number in the personal information Phone Number field.");
		submitePage = submitePage.fillPhoneNum("My Phone Number");
		Thread.sleep(1000);
		
		System.out.println("Type the Message in the personal information Message field.");
		submitePage = submitePage.fillMessage("Feel free to get in touch with us if you have any questions");
		Thread.sleep(1000);
		
		System.out.println("Click on the Submit button.");
		submitePage = submitePage.goToSbmitbtn();
		Thread.sleep(1000);
		
		System.out.println("All fields are filled");
		System.out.println("Ensure that the application did not send a message and returned to the home page");
		Thread.sleep(1000);
		
		System.out.println("Return to the Contacts tab.");
		submitePage = submitePage.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageMapTest() throws InterruptedException {
		ULCContactsPage mapPage = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		mapPage = mapPage.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		mapPage = mapPage.goToContactsPageMap();
		Thread.sleep(1000);
		
		System.out.println("Ensure that the Contacts tab is displayed.");
		mapPage = mapPage.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageMapDirectionTest() throws InterruptedException {
		ULCContactsPage contactsMapDir = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contactsMapDir = contactsMapDir.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		Thread.sleep(1000);
		
		System.out.println("The Contacts Page Map is opened and Direction is displayed");
		System.out.println("Type the Start direction");
		Thread.sleep(1000);
		
		contactsMapDir = contactsMapDir.fillStartDirection("Mantashyan st");
		Thread.sleep(1000);
		
		System.out.println("Type the End direction");
		contactsMapDir = contactsMapDir.fillEndDirection("ULC");
		Thread.sleep(1000);
		
		System.out.println("Ensure that the direction is displayed");
		System.out.println("Return to the Contacts tab.");
		contactsMapDir = contactsMapDir.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCPagePlaceCardReviewTest() throws InterruptedException {
		ULCContactsPage placeCardReview = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		placeCardReview = placeCardReview.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		placeCardReview = placeCardReview.goToContactsPageMap();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Page Map Review window is opened");
		placeCardReview = placeCardReview.goToReviewPage();
		Thread.sleep(1000);
		
		System.out.println("Review window is opened and WriteReview is displayed");
		placeCardReview = placeCardReview.goToWriteReviewPage();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		placeCardReview = placeCardReview.goToContactsTab();
		
	}

	@Test
	public void uLCPageViewLargeMapTest() throws InterruptedException {
		ULCContactsPage viewLargeMap = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		viewLargeMap = viewLargeMap.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened and Contacts Page Map is displayed");
		viewLargeMap = viewLargeMap.goToContactsPageMap();
		Thread.sleep(1000);
		
		System.out.println("The Contacts page map is displayed and large map is opened in new window.");
		viewLargeMap = viewLargeMap.goToPlaceCardLargMap();
		Thread.sleep(1000);

	}

	@Test
	public void uLCContactsPageAboutUsTest() throws InterruptedException {
		ULCContactsPage contPgAbUs = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contPgAbUs = contPgAbUs.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is AboutUs is displayed");
		contPgAbUs = contPgAbUs.goToContPgAboutUs();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		contPgAbUs = contPgAbUs.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageCategoriesTest() throws InterruptedException {
		ULCContactsPage contPgCategories = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contPgCategories = contPgCategories.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Categories is displayed");
		contPgCategories = contPgCategories.goToContPgCategories();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		contPgCategories = contPgCategories.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesHomeTest() throws InterruptedException {
		ULCContactsPage categHome = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categHome = categHome.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Home is displayed");
		categHome = categHome.goToContPgCategHome();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categHome = categHome.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesAboutUSTest() throws InterruptedException {
		ULCContactsPage categAboutUs = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categAboutUs = categAboutUs.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is AboutUs is displayed");
		categAboutUs = categAboutUs.goToContPgCategAboutUs();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categAboutUs = categAboutUs.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesCorpPacksTest() throws InterruptedException {
		ULCContactsPage categCorpPacks = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categCorpPacks = categCorpPacks.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Corporate Packs is displayed");
		categCorpPacks = categCorpPacks.goToContPgCategCorpPacks();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categCorpPacks = categCorpPacks.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesInternExamTest() throws InterruptedException {
		ULCContactsPage categIntEx = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categIntEx = categIntEx.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is International Exam is displayed");
		categIntEx = categIntEx.goToContPgCorpInternEx();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categIntEx = categIntEx.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesUniKidsTest() throws InterruptedException {
		ULCContactsPage categUniKIds = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categUniKIds = categUniKIds.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is UniKids is displayed");
		categUniKIds = categUniKIds.goToContPgCategUniKids();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categUniKIds = categUniKIds.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesCoursesTest() throws InterruptedException {
		ULCContactsPage categCourses = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categCourses = categCourses.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Courses is displayed");
		categCourses = categCourses.goToContPgCategCourses();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categCourses = categCourses.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesNewsTest() throws InterruptedException {
		ULCContactsPage categNews = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categNews = categNews.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is News is displayed");
		categNews = categNews.goToContPgCategNews();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categNews = categNews.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsCategoriesContactsTest() throws InterruptedException {
		ULCContactsPage categContacts = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		categContacts = categContacts.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Contacts is displayed");
		categContacts = categContacts.goToContPgCategContacts();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		categContacts = categContacts.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageFollowUsTest() throws InterruptedException {
		ULCContactsPage contFollowUs = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contFollowUs = contFollowUs.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Follow us is displayed");
		contFollowUs = contFollowUs.goToContPgFollowUs();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		contFollowUs = contFollowUs.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageAddressTest() throws InterruptedException {
		ULCContactsPage contAddress = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contAddress = contAddress.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Address is displayed");
		contAddress = contAddress.goToContPgAddress();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		contAddress = contAddress.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPagePhoneTest() throws InterruptedException {
		ULCContactsPage contPhone = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contPhone = contPhone.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Phone is displayed");
		contPhone = contPhone.goToContPgPhone();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		contPhone = contPhone.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageEmailTest() throws InterruptedException {
		ULCContactsPage contEmail = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contEmail = contEmail.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Email is displayed");
		contEmail = contEmail.goToContPgEmail();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		contEmail = contEmail.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageFacebookTest() throws InterruptedException {
		ULCContactsPage contFacebook = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contFacebook = contFacebook.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Facebook buttonl is displayed");
		contFacebook = contFacebook.goToContPgFacebook();
		Thread.sleep(1000);
		
		System.out.println("The Contacts Tab is opened.");
		contFacebook = contFacebook.goToContactsTab();
		Thread.sleep(1000);
		
	}

	@Test
	public void uLCContactsPageInstagramTest() throws InterruptedException {
		ULCContactsPage contInstagram = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contInstagram = contInstagram.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Instagram buttonl is displayed");
		contInstagram = contInstagram.goToContPgInstagram();
		Thread.sleep(1000);
		
		System.out.println("The Instagram button doesn't open the Instagram page returns to the Home page.");
		System.out.println("The Contacts Tab is opened.");
		contInstagram = contInstagram.goToContactsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCContactsPageSkypeTest() throws InterruptedException {
		ULCContactsPage contSkype = new ULCContactsPage(driver);
		System.out.println("The Contacts Tab is opened.");
		contSkype = contSkype.goToContactsTab();
		Thread.sleep(1000);
		
		System.out.println("In the bottom of the Contacts page is Skype buttonl is displayed");
		contSkype = contSkype.goToContPgSkype();
		Thread.sleep(1000);
		
		System.out.println("The Instagram button doesn't open the Skype page returns to the Home page.");
		System.out.println("The Contacts Tab is opened.");
		contSkype = contSkype.goToContactsTab();
		Thread.sleep(1000);
	}
}
