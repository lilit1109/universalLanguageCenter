package com.Web365.ULC.Tab.Test;



import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCContactsPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCContactsTabPageTest extends ULCBaseTest{
	
	@Test
	public void uLCContactsTabPageTest() throws InterruptedException {
	ULCContactsPage contactsTabPage = new ULCContactsPage(driver);
	Assert.assertTrue(contactsTabPage.contactsTab.isDisplayed());
	contactsTabPage = contactsTabPage.goToContactsTab();
	Thread.sleep(5000);	
	contactsTabPage = new ULCContactsPage(driver);
	Assert.assertTrue(contactsTabPage.contactInf.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contactsTabPage.contactsTab).perform();
	}
	@Test
	public void uLCContactsPersonalInfoPageTest() throws InterruptedException {
	ULCContactsPage personalInfPage = new ULCContactsPage(driver);
	Assert.assertTrue(personalInfPage.contactsTab.isDisplayed());
	personalInfPage = new ULCContactsPage(driver);
	Assert.assertTrue(personalInfPage.contactInf.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(personalInfPage.contactsTab).perform();
	Thread.sleep(2000);
	}
	@Test
	public void uLCPersonalInfoNameFieldTest() throws InterruptedException {
	ULCContactsPage nameField = new ULCContactsPage(driver);
	Assert.assertTrue(nameField.contactsTab.isDisplayed());
	nameField = new ULCContactsPage(driver);
	nameField.fillName("Lilit Todorova");
	Thread.sleep(4000);
	nameField = new ULCContactsPage(driver);
	Assert.assertTrue(nameField.sbmitBtn.isDisplayed());
	nameField = nameField.goToSbmitbtn();
	Thread.sleep(4000);
	nameField = new ULCContactsPage(driver);
	Assert.assertTrue(nameField.summaryErrors.isDisplayed());
	nameField = nameField.goToSummaryErrors();
	Actions actions = new Actions(driver);
	actions.moveToElement(nameField.contactsTab).perform();
	Thread.sleep(2000);
	System.out.println("The Email, Phone, and Message fields are required");
	Thread.sleep(8000);
}
	@Test
	public void uLCPersonalInfoEmailFieldTest() throws InterruptedException {
	ULCContactsPage emailField = new ULCContactsPage(driver);
	Assert.assertTrue(emailField.contactsTab.isDisplayed());
	emailField = new ULCContactsPage(driver);
	emailField.fillEmail("My Email Address");
	Thread.sleep(2000);
	emailField = new ULCContactsPage(driver);
	Assert.assertTrue(emailField.sbmitBtn.isDisplayed());
	emailField = emailField.goToSbmitbtn();
	Thread.sleep(4000);
	emailField = new ULCContactsPage(driver);
	Assert.assertTrue(emailField.summaryErrors.isDisplayed());
	emailField = emailField.goToSummaryErrors();
	Actions actions = new Actions(driver);
	actions.moveToElement(emailField.contactsTab).perform();
	Thread.sleep(2000);
	System.out.println("The Phone and Message fields are required");
	Thread.sleep(8000);
}
	@Test
	public void uLCPersonalInfoPhoneFieldTest() throws InterruptedException {
	ULCContactsPage phoneField = new ULCContactsPage(driver);
	Assert.assertTrue(phoneField.contactsTab.isDisplayed());
	phoneField = new ULCContactsPage(driver);
	phoneField.fillPhoneNum("My Phone Number");
	Thread.sleep(2000);
	phoneField = new ULCContactsPage(driver);
	Assert.assertTrue(phoneField.sbmitBtn.isDisplayed());
	phoneField = phoneField.goToSbmitbtn();
	Thread.sleep(4000);
	phoneField = new ULCContactsPage(driver);
	Assert.assertTrue(phoneField.summaryErrors.isDisplayed());
	phoneField = phoneField.goToSummaryErrors();
	Actions actions = new Actions(driver);
	actions.moveToElement(phoneField.contactsTab).perform();
	Thread.sleep(2000);
	System.out.println("The Message fields are required");
	Thread.sleep(8000);
}
	@Test
	public void uLCPersonalInfoMessageFieldTest() throws InterruptedException {
	ULCContactsPage messageField = new ULCContactsPage(driver);
	Assert.assertTrue(messageField.contactsTab.isDisplayed());
	messageField = new ULCContactsPage(driver);
	messageField.fillMessage("Feel free to get in touch with us if you have any questions");
	Thread.sleep(2000);
	messageField = new ULCContactsPage(driver);
	Assert.assertTrue(messageField.sbmitBtn.isDisplayed());
	messageField = messageField.goToSbmitbtn();
	Thread.sleep(4000);
	messageField = new ULCContactsPage(driver);
	Assert.assertTrue(messageField.summaryErrors.isDisplayed());
	messageField = messageField.goToSummaryErrors();
	Actions actions = new Actions(driver);
	actions.moveToElement(messageField.contactsTab).perform();
	Thread.sleep(2000);
	System.out.println("All fields are filled");
	System.out.println("The application did not check the email field email validation value");
	System.out.println("The application did not check the phone box numeric value");
	System.out.println("The application did not send a message and returned to the home page");
	Thread.sleep(8000);
}
	
	@Test
	public void uLCContactsPageMapTest() throws InterruptedException {
		ULCContactsPage mapPage = new ULCContactsPage(driver);
		Assert.assertTrue(mapPage.contactsTab.isDisplayed());
		mapPage = mapPage.goToContactsTab();
		Actions actions = new Actions(driver);
		actions.moveToElement(mapPage.contactsPageMap).perform();
		Thread.sleep(2000);
	//actions.moveToElement(mapPage.placeCardDir).perform();
////		mapPage = mapPage.goToPlaceCardDir();
////		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(1));
////		Assert.assertTrue(mapPage.inputStartDir.isDisplayed());
////		Thread.sleep(6000);
////        mapPage.fillStartDirection("Mantashyan st");
////		System.out.println("The Direction is shown on the Google map.");
////		driver.close();
////		driver.switchTo().window(tabs.get(0));
//		Thread.sleep(6000);
//		actions.moveToElement(mapPage.satelliteMap).perform();
//		mapPage=mapPage.goToSatelliteMap();
		Assert.assertTrue(mapPage.contactsPageMap.isDisplayed());
		actions.moveToElement(mapPage.contactsTab).perform();
		Thread.sleep(2000);
	}
//	@Test
//	public void uLCContactsPageMapDirectionTest() throws InterruptedException {
//	ULCContactsPage contactsMapDir = new ULCContactsPage(driver);
//	Assert.assertTrue(contactsMapDir.contactsTab.isDisplayed());
//	Actions actions = new Actions(driver);
//	actions.moveToElement(contactsMapDir.mapPlaceCard).perform();
//	contactsMapDir=contactsMapDir.goToPlaceCardDir();
//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(tabs.get(1));
//	Thread.sleep(2000);
//	Assert.assertTrue(contactsMapDir.inputStartDir.isDisplayed());
//	contactsMapDir.fillStartDirection("Mantashyan st");
//	System.out.println("The Direction is shown on the Google map.");
//	driver.close();
//	driver.switchTo().window(tabs.get(0));
//	actions.moveToElement(contactsMapDir.contactsTab).perform();
//	Thread.sleep(2000);
//	}
//	@Test
//	public void uLCPagePlaceCardReviewTest() throws InterruptedException {
//	ULCContactsPage placeCardReview = new ULCContactsPage(driver);
//	Assert.assertTrue(placeCardReview.contactsTab.isDisplayed());
//	placeCardReview = placeCardReview.goToContactsTab();
//	Actions actions = new Actions(driver);
//	actions.moveToElement(placeCardReview.placeCardLargMap).perform();
//	placeCardReview=placeCardReview.goToPlaceCardReview();
//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(tabs.get(1));
//	Thread.sleep(2000);
//	Assert.assertTrue(placeCardReview.reviewPage.isDisplayed());	
//	placeCardReview = placeCardReview.goToWriteReviewPage();
//	driver.switchTo().window(tabs.get(2));
//	Assert.assertTrue(placeCardReview.writeReview.isDisplayed());
//	driver.close();
//	driver.switchTo().window(tabs.get(0));
//	actions.moveToElement(placeCardReview.contactsTab).perform();
//	Thread.sleep(2000);
//	}
	
	@Test
	public void uLCContactsPageAboutUsTest() throws InterruptedException {
	ULCContactsPage contPgAbUs = new ULCContactsPage(driver);
	Assert.assertTrue(contPgAbUs.contactsTab.isDisplayed());
	contPgAbUs = contPgAbUs.goToContactsTab();
	Thread.sleep(5000);	
	contPgAbUs = new ULCContactsPage(driver);
	Assert.assertTrue(contPgAbUs.contPgAboutUs.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contPgAbUs.contactsTab).perform();
	}
	@Test
	public void uLCContactsPageCategoriesTest() throws InterruptedException {
	ULCContactsPage contPgCategories = new ULCContactsPage(driver);
	Assert.assertTrue(contPgCategories.contactsTab.isDisplayed());
	contPgCategories = contPgCategories.goToContactsTab();
	Thread.sleep(5000);	
	contPgCategories = new ULCContactsPage(driver);
	Assert.assertTrue(contPgCategories.contPgCategories.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contPgCategories.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesHomeTest() throws InterruptedException {
	ULCContactsPage categHome = new ULCContactsPage(driver);
	Assert.assertTrue(categHome.contactsTab.isDisplayed());
	categHome = categHome.goToContactsTab();
	Thread.sleep(5000);	
	categHome = new ULCContactsPage(driver);
	Assert.assertTrue(categHome.contPgCategHome.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categHome.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesAboutUSTest() throws InterruptedException {
	ULCContactsPage categAboutUs = new ULCContactsPage(driver);
	Assert.assertTrue(categAboutUs.contactsTab.isDisplayed());
	categAboutUs = categAboutUs.goToContactsTab();
	Thread.sleep(5000);	
	categAboutUs = new ULCContactsPage(driver);
	Assert.assertTrue(categAboutUs.contPgAboutUs.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categAboutUs.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesCorpPacksTest() throws InterruptedException {
	ULCContactsPage categCorpPacks = new ULCContactsPage(driver);
	Assert.assertTrue(categCorpPacks.contactsTab.isDisplayed());
	categCorpPacks = categCorpPacks.goToContactsTab();
	Thread.sleep(5000);	
	categCorpPacks = new ULCContactsPage(driver);
	Assert.assertTrue(categCorpPacks.contPgCatgCorpPacks.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categCorpPacks.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesInternExamTest() throws InterruptedException {
	ULCContactsPage categIntEx = new ULCContactsPage(driver);
	Assert.assertTrue(categIntEx.contactsTab.isDisplayed());
	categIntEx = categIntEx.goToContactsTab();
	Thread.sleep(5000);	
	categIntEx = new ULCContactsPage(driver);
	Assert.assertTrue(categIntEx.contPgCorpInternEx.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categIntEx.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesUniKidsTest() throws InterruptedException {
	ULCContactsPage categUniKIds = new ULCContactsPage(driver);
	Assert.assertTrue(categUniKIds.contactsTab.isDisplayed());
	categUniKIds = categUniKIds.goToContactsTab();
	Thread.sleep(5000);	
	categUniKIds = new ULCContactsPage(driver);
	Assert.assertTrue(categUniKIds.contPgCategUniKids.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categUniKIds.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesCoursesTest() throws InterruptedException {
	ULCContactsPage categCourses = new ULCContactsPage(driver);
	Assert.assertTrue(categCourses.contactsTab.isDisplayed());
	categCourses = categCourses.goToContactsTab();
	Thread.sleep(5000);	
	categCourses = new ULCContactsPage(driver);
	Assert.assertTrue(categCourses.contPgCategCourses.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categCourses.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesNewsTest() throws InterruptedException {
	ULCContactsPage categNews = new ULCContactsPage(driver);
	Assert.assertTrue(categNews.contactsTab.isDisplayed());
	categNews = categNews.goToContactsTab();
	Thread.sleep(5000);	
	categNews = new ULCContactsPage(driver);
	Assert.assertTrue(categNews.contPgCategNews.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categNews.contactsTab).perform();
	}
	@Test
	public void uLCContactsCategoriesContactsTest() throws InterruptedException {
	ULCContactsPage categContacts = new ULCContactsPage(driver);
	Assert.assertTrue(categContacts.contactsTab.isDisplayed());
	categContacts = categContacts.goToContactsTab();
	Thread.sleep(5000);	
	categContacts = new ULCContactsPage(driver);
	Assert.assertTrue(categContacts.contPgCategContacts.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(categContacts.contactsTab).perform();
	}
	@Test
	public void uLCContactsPageFollowUsTest() throws InterruptedException {
	ULCContactsPage contFollowUs = new ULCContactsPage(driver);
	Assert.assertTrue(contFollowUs.contactsTab.isDisplayed());
	contFollowUs = contFollowUs.goToContactsTab();
	Thread.sleep(5000);	
	contFollowUs = new ULCContactsPage(driver);
	Assert.assertTrue(contFollowUs.contPgFollowUs.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contFollowUs.contactsTab).perform();
	}
	@Test
	public void uLCContactsPageAddressTest() throws InterruptedException {
	ULCContactsPage contAddress = new ULCContactsPage(driver);
	Assert.assertTrue(contAddress.contactsTab.isDisplayed());
	contAddress = contAddress.goToContactsTab();
	Thread.sleep(5000);	
	contAddress = new ULCContactsPage(driver);
	Assert.assertTrue(contAddress.contPgAddress.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contAddress.contactsTab).perform();
	}
	@Test
	public void uLCContactsPagePhoneTest() throws InterruptedException {
	ULCContactsPage contPhone = new ULCContactsPage(driver);
	Assert.assertTrue(contPhone.contactsTab.isDisplayed());
	contPhone = contPhone.goToContactsTab();
	Thread.sleep(5000);	
	contPhone = new ULCContactsPage(driver);
	Assert.assertTrue(contPhone.contPgPhone.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contPhone.contactsTab).perform();
	}
	@Test
	public void uLCContactsPageEmailTest() throws InterruptedException {
	ULCContactsPage contEmail = new ULCContactsPage(driver);
	Assert.assertTrue(contEmail.contactsTab.isDisplayed());
	contEmail = contEmail.goToContactsTab();
	Thread.sleep(5000);	
	contEmail = new ULCContactsPage(driver);
	Assert.assertTrue(contEmail.contPgEmail.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contEmail.contactsTab).perform();
	}
	@Test
	public void uLCContactsPageFacebookTest() throws InterruptedException {
	ULCContactsPage contFacebook = new ULCContactsPage(driver);
	Assert.assertTrue(contFacebook.contactsTab.isDisplayed());
	contFacebook = contFacebook.goToContactsTab();
	Thread.sleep(5000);	
	contFacebook = new ULCContactsPage(driver);
	Assert.assertTrue(contFacebook.contPgFacebook.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contFacebook.contactsTab).perform();
	}
	@Test
	public void uLCContactsPageInstagramTest() throws InterruptedException {
	ULCContactsPage contInstagram = new ULCContactsPage(driver);
	Assert.assertTrue(contInstagram.contactsTab.isDisplayed());
	contInstagram = contInstagram.goToContactsTab();
	Thread.sleep(5000);	
	contInstagram = new ULCContactsPage(driver);
	Assert.assertTrue(contInstagram.contPgInstagram.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contInstagram.contactsTab).perform();
	}
	@Test
	public void uLCContactsPageSkypeTest() throws InterruptedException {
	ULCContactsPage contSkype = new ULCContactsPage(driver);
	Assert.assertTrue(contSkype.contactsTab.isDisplayed());
	contSkype = contSkype.goToContactsTab();
	Thread.sleep(5000);	
	contSkype = new ULCContactsPage(driver);
	Assert.assertTrue(contSkype.contPgSkype.isDisplayed());
	Actions actions = new Actions(driver);
	actions.moveToElement(contSkype.contactsTab).perform();
	}
	}
	
	


