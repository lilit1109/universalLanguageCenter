package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCContactPageConstants.*;

public class ULCContactsPage extends ULCHomePage {

	public ULCContactsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACT_US_XPATH)
	public WebElement contactUs;

	@FindBy(xpath = CONTACTS_PAGE_NAME_INPUT_XPATH)
	public WebElement inputName;
	
	@FindBy(xpath = CONTACTS_PAGE_EMAIL_INPUT_XPATH)
	public WebElement inputEmail;
	
	@FindBy(xpath = CONTACTS_PAGE_PHONE_INPUT_XPATH)
	public WebElement inputPhoneNum;

	@FindBy(xpath = CONTACTS_PAGE_MESSAGE_INPUT_XPATH)
	public WebElement inputMessage;

	@FindBy(xpath = CONTACTS_PAGE_SBMIT_BUTTON_XPATH)
	public WebElement sbmitBtn;

	@FindBy(xpath = CONTACTS_PAGE_CONTACT_INF_XPATH)
	public WebElement contactInf;

	@FindBy(xpath = CONTACTS_PAGE_SUMMARY_ERRORS_XPATH)
	public WebElement summaryErrors;
	
	
	@FindBy(xpath = CONTACTS_PAGE_MAP_PAGE_XPATH)
	public WebElement contactsPageMap;
	@FindBy(xpath = CONTACTS_PAGE_MAP_PLACE_CARD_XPATH)
	public WebElement mapPlaceCard;

	@FindBy(xpath = CONTACTS_PAGE_MAP_PLACE_CARD_DIRECTION_XPATH)
	public WebElement placeCardDir;
	
	@FindBy(xpath = CONTACTS_PAGE_MAP_PLACE_CARD_REVIEW_XPATH)
	public WebElement placeCardReview;
	
	@FindBy(xpath = CONTACTS_PAGE_REVIEW_PAGE_XPATH)
	public WebElement reviewPage;
	
	@FindBy(xpath = REVIEW_PAGE_WRITE_REVIEW_PAGE_XPATH)
	public WebElement writeReview;
	
	@FindBy(xpath = CONTACTS_PAGE_MAP_PLACE_CARD_VIEWLARGEMAP_XPATH)
	public WebElement placeCardLargMap;
	
	@FindBy(xpath = CONTACTS_PAGE_GOOGLE_MAP_STARTING_POINT_BOX_XPATH)
	public WebElement inputStartDir;
	
	@FindBy(xpath = CONTACTS_PAGE_GOOGLE_MAP_DASTINATION_BOX_XPATH)
	public WebElement inputEndDir;
	
	@FindBy(xpath = CONTACTS_PAGE_MAP_SATELLITE_IMAGE_BATTON_XPATH)
	public WebElement satelliteMap;
	
	@FindBy(xpath = CONTACTS_PAGE_ABOUTUS_INFO_XPATH)
	public WebElement contPgAboutUs;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_INFO_XPATH)
	public WebElement contPgCategories;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_HOME_XPATH)
	public WebElement contPgCategHome;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_ABOUTUS_XPATH)
	public WebElement contPgCategAboutUs;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_CORPPACKS_XPATH)
	public WebElement contPgCatgCorpPacks;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_INTERNEXAMS_XPATH)
	public WebElement contPgCorpInternEx;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_UNIKIDS_XPATH)
	public WebElement contPgCategUniKids;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_COURSES_XPATH)
	public WebElement contPgCategCourses;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_NEWS_XPATH)
	public WebElement contPgCategNews;
	@FindBy(xpath = CONTACTS_PAGE_CATEGORIES_CONTACTS_XPATH)
	public WebElement contPgCategContacts;
	@FindBy(xpath = CONTACTS_PAGE_FOLLOWUS_INFO_XPATH)
	public WebElement contPgFollowUs;
	@FindBy(xpath = CONTACTS_PAGE_ADDRESS_INFO_XPATH)
	public WebElement contPgAddress;
	@FindBy(xpath = CONTACTS_PAGE_PHONENUMBER_INFO_XPATH)
	public WebElement contPgPhone;
	@FindBy(xpath = CONTACTS_PAGE_EMAIL_INFO_XPATH)
	public WebElement contPgEmail;
	@FindBy(xpath = CONTACTS_PAGE_FACEBOOK_XPATH)
	public WebElement contPgFacebook;
	@FindBy(xpath = CONTACTS_PAGE_INSTAGRAM_XPATH)
	public WebElement contPgInstagram;
	@FindBy(xpath = CONTACTS_PAGE_SKYPE_XPATH)
	public WebElement contPgSkype;
	
	public ULCContactsPage goToContacts() {
		contactUs.click();
		return new ULCContactsPage(this.driver);
	}

	public void fillName(String name) {
		inputName.sendKeys(name);

	}
	public void fillEmail(String email) {
		inputEmail.sendKeys(email);

	}
	public void fillPhoneNum(String phoneNum) {
		inputPhoneNum.sendKeys(phoneNum);

	}

	public void fillMessage(String message) {
		inputMessage.sendKeys(message);

	}

	public ULCContactsPage goToSbmitbtn() {
		sbmitBtn.click();
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContactInf() {
		contactInf.click();
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToSummaryErrors() {
		summaryErrors.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContactsPageMap() {
		contactsPageMap.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToMapPlaceCard() {
		mapPlaceCard.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToPlaceCardDir() {
		placeCardDir.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToPlaceCardReview() {
		placeCardReview.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToPlaceCardLargMap() {
		placeCardLargMap.click();
		return new ULCContactsPage(this.driver);

	}
	public void fillStartDirection(String startDir) {
		inputStartDir.sendKeys(startDir);	

	}
	public void fillEndDirection(String endDir) {
		inputEndDir.sendKeys(endDir,Keys.ENTER);

	}
	public ULCContactsPage goToSatelliteMap() {
		satelliteMap.click();
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToReviewPage() {
		reviewPage.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToWriteReviewPage() {
		writeReview.click();
		return new ULCContactsPage(this.driver);

	}///////////////////////////////////////
	public ULCContactsPage goToContPgAboutUs() {
		contPgAboutUs.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCategories() {
		contPgCategories.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCategHome() {
		contPgCategHome.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCategAboutUs() {
		contPgCategAboutUs.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCatgCorpPacks() {
		contPgCatgCorpPacks.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCorpInternEx() {
		contPgCorpInternEx.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCategUniKids() {
		contPgCategUniKids.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCategCourses() {
		contPgCategCourses.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCategNews() {
		contPgCategNews.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgCategContacts() {
		contPgCategContacts.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgFollowUs() {
		contPgFollowUs.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgAddress() {
		contPgAddress.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgPhone() {
		contPgPhone.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgEmail() {
		contPgEmail.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgFacebook() {
		contPgFacebook.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToContPgInstagram() {
		contPgInstagram.click();
		return new ULCContactsPage(this.driver);

	}
	public ULCContactsPage goToCcontPgSkype() {
		contPgSkype.click();
		return new ULCContactsPage(this.driver);

	}
	
}
