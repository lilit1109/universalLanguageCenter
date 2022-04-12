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
	public WebElement contPgCategCorpPacks;
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
		moveToElement(contactUs);
		return new ULCContactsPage(this.driver);
	}

	public ULCContactsPage fillName(String name) {
		inputName.sendKeys(name);
		return new ULCContactsPage(this.driver);
	}

	public ULCContactsPage fillEmail(String email) {
		inputEmail.sendKeys(email);
		return new ULCContactsPage(this.driver);
	}

	public ULCContactsPage fillPhoneNum(String phoneNum) {
		inputPhoneNum.sendKeys(phoneNum);
		return new ULCContactsPage(this.driver);
	}

	public ULCContactsPage fillMessage(String message) {
		inputMessage.sendKeys(message);
		return new ULCContactsPage(this.driver);
	}

	public ULCContactsPage goToSbmitbtn() {
		moveToElement(sbmitBtn);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContactInf() {
		moveToElement(contactInf);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToSummaryErrors() {
		moveToElement(summaryErrors);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContactsPageMap() {
		moveToElement(contactsPageMap);
		contactsPageMap.click();
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToMapPlaceCard() {
		moveToElement(mapPlaceCard);

		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToPlaceCardDir() {
		moveToElement(placeCardDir);
		placeCardDir.click();
		driver.get(
				"https://www.google.com/maps/dir//Universe+Language+Centre+%2F+%C2%AB%D5%85%D5%B8%D6%82%D5%B6%D5%AB%D5%BE%D5%A5%D6%80%D5%BD%C2%BB+%D5%AC%D5%A5%D5%A6%D5%BE%D5%AB+%D5%AF%D5%A5%D5%B6%D5%BF%D6%80%D5%B8%D5%B6+49+2+Komitas+Ave+Yerevan+0051,+Armenia/@40.2080701,44.5168151,16z/data=!4m8!4m7!1m0!1m5!1m1!1s0x406abd3591ef889d:0x70a05b2a3e46b440!2m2!1d44.5168151!2d40.2080701");

		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToPlaceCardReview() {
		moveToElement(placeCardReview);
		driver.get("http://www.ulc.am/Home/Contact");
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToPlaceCardLargMap() throws InterruptedException {
		driver.get(
				"https://www.google.com/maps/place/Universe+Language+Centre+%2F+%C2%AB%D5%85%D5%B8%D6%82%D5%B6%D5%AB%D5%BE%D5%A5%D6%80%D5%BD%C2%BB+%D5%AC%D5%A5%D5%A6%D5%BE%D5%AB+%D5%AF%D5%A5%D5%B6%D5%BF%D6%80%D5%B8%D5%B6/@40.208078,44.516816,16z/data=!4m5!3m4!1s0x0:0x70a05b2a3e46b440!8m2!3d40.2080701!4d44.5168151?hl=en-US");
		Thread.sleep(4000);
		driver.get("http://www.ulc.am/Home/Contact");
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage fillStartDirection(String startDir) {
		driver.get(
				"https://www.google.com/maps/dir//Universe+Language+Centre+%2F+%C2%AB%D5%85%D5%B8%D6%82%D5%B6%D5%AB%D5%BE%D5%A5%D6%80%D5%BD%C2%BB+%D5%AC%D5%A5%D5%A6%D5%BE%D5%AB+%D5%AF%D5%A5%D5%B6%D5%BF%D6%80%D5%B8%D5%B6+49+2+Komitas+Ave+Yerevan+0051,+Armenia/@40.2080701,44.5168151,16z/data=!4m8!4m7!1m0!1m5!1m1!1s0x406abd3591ef889d:0x70a05b2a3e46b440!2m2!1d44.5168151!2d40.2080701");
		moveToElement(inputStartDir);
		inputStartDir.sendKeys(startDir, Keys.ENTER);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage fillEndDirection(String endDir) throws InterruptedException {
		moveToElement(inputEndDir);
		inputEndDir.sendKeys(endDir, Keys.ENTER);
		Thread.sleep(2000);
		driver.get("http://www.ulc.am/Home/Contact");
		return new ULCContactsPage(this.driver);
	}

	public ULCContactsPage goToSatelliteMap() {
		moveToElement(satelliteMap);
		satelliteMap.click();
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToReviewPage() throws InterruptedException {
		driver.get(
				"https://www.google.com/search?hl=en-US&gl=us&q=49,+Universe+Language+Centre+/+%C2%AB%D5%85%D5%B8%D6%82%D5%B6%D5%AB%D5%BE%D5%A5%D6%80%D5%BD%C2%BB+%D5%AC%D5%A5%D5%A6%D5%BE%D5%AB+%D5%AF%D5%A5%D5%B6%D5%BF%D6%80%D5%B8%D5%B6,+2+Komitas+Ave,+Yerevan+0051,+Armenia&ludocid=8115586765513208896&lsig=AB86z5UQ506tdDz8mw2yPL_OsyuS&hl=en&gl=US#lrd=0x406abd3591ef889d:0x70a05b2a3e46b440,1");
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToWriteReviewPage() throws InterruptedException {
		moveToElement(writeReview);
		driver.manage().window().maximize();
		driver.get("http://www.ulc.am/Home/Contact");
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgAboutUs() {
		moveToElement(contPgAboutUs);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategories() {
		moveToElement(contPgCategories);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategHome() {
		moveToElement(contPgCategHome);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategAboutUs() {
		moveToElement(contPgCategAboutUs);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategCorpPacks() {
		moveToElement(contPgCategCorpPacks);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCorpInternEx() {
		moveToElement(contPgCorpInternEx);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategUniKids() {
		moveToElement(contPgCategUniKids);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategCourses() {
		moveToElement(contPgCategCourses);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategNews() {
		moveToElement(contPgCategNews);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgCategContacts() {
		moveToElement(contPgCategContacts);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgFollowUs() {
		moveToElement(contPgFollowUs);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgAddress() {
		moveToElement(contPgAddress);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgPhone() {
		moveToElement(contPgPhone);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgEmail() {
		moveToElement(contPgEmail);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgFacebook() {
		moveToElement(contPgFacebook);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgInstagram() {
		moveToElement(contPgInstagram);
		return new ULCContactsPage(this.driver);

	}

	public ULCContactsPage goToContPgSkype() {
		moveToElement(contPgSkype);
		return new ULCContactsPage(this.driver);

	}

}
