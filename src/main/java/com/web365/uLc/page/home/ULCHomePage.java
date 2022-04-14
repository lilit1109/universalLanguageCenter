package com.web365.uLc.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.uLc.page.home.ULCHomePage;
import com.web365.uLc.page.tab.ULCAboutUsPage;
import com.web365.uLc.page.tab.ULCContactsPage;
import com.web365.uLc.page.tab.ULCCorporatePacksPage;
import com.web365.uLc.page.tab.ULCInternationalExamPage;
import com.web365.uLc.page.tab.ULCIntesolWorldwidePage;
import com.web365.uLc.page.base.ULCBasePage;
import com.web365.uLc.page.tab.ULCCoursesPage;
import com.web365.uLc.page.tab.ULCHomePageTab;

import static com.web365.uLc.page.home.ULCHomePageConstants.*;

public class ULCHomePage extends ULCBasePage {

	public ULCHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ULC_LOGO_XPATH)
	public WebElement logo;
	@FindBy(xpath = HOME_TAB_XPATH)
	public WebElement homeTab;
	@FindBy(xpath = ABOUT_US_TAB_XPATH)
	public WebElement aboutUsTab;
	@FindBy(xpath = CORPORATE_PACKS_TAB_XPATH)
	public WebElement corporatePacksTab;
	@FindBy(xpath = INTERNATIONAL_EXAMS_TAB_XPATH)
	public WebElement internationalExamsTab;
	@FindBy(xpath = INTESOL_WORLDWIDE_TAB_XPATH)
	public WebElement intesolWorldwideTab;
	@FindBy(xpath = COURSES_TAB_XPATH)
	public WebElement coursesTab;
	@FindBy(xpath = CONTACTS_TAB_XPATH)
	public WebElement contactsTab;
	@FindBy(xpath = HOME_PAGE_NEWS_XPATH)
	public WebElement homeNewsBtn;
	@FindBy(xpath = NAVIGATION_BAR_XPATH)
	public WebElement navigTabBar;
	@FindBy(xpath = ULC_BOOK_NOW_XPATH)
	public WebElement bookNowPage;
	@FindBy(xpath = ULC_BOOK_NOW_SELECT_COURSE_XPATH)
	public WebElement selectCourses;
	@FindBy(xpath = ULC_BOOK_NOW_TRAININGS_XPATH)
	public WebElement selectTrainings;
	@FindBy(xpath = ULC_BOOK_NOW_MAKE_A_PAYMENT_XPATH)
	public WebElement makeAPayment;
	@FindBy(xpath = ULC_MAKE_A_PAYMENT_FIRST_NAME_XPATH)
	public WebElement paymentFirstName;
	@FindBy(xpath = ULC_MAKE_A_PAYMENT_LAST_NAME_XPATH)
	public WebElement paymentLastName;
	@FindBy(xpath = ULC_MAKE_A_PAYMENT_EMAIL_XPATH)
	public WebElement paymentEmail;
	@FindBy(xpath = ULC_MAKE_A_PAYMENT_PHONE_XPATH)
	public WebElement paymentPhone;
	@FindBy(xpath = ULC_MAKE_A_PAYMENT_MESSAGE_XPATH)
	public WebElement paymentMessage;
	@FindBy(xpath = ULC_MAKE_A_PAYMENT_NEXT_BATTON_XPATH)
	public WebElement paymentNext;
	@FindBy(xpath = ULC_MAKE_A_PAYMENT_CHECKOUT_BATTON_XPATH)
	public WebElement paymentCheckout;

	public ULCHomePage goToLogo() {
		moveToElement(logo);
//	logo.click();
		return new ULCHomePage(this.driver);
	}

	public ULCHomePageTab goToHomeTab() {
		moveToElement(homeTab);
		homeTab.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCAboutUsPage goToAboutUsTab() {
		moveToElement(aboutUsTab);
		aboutUsTab.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCCorporatePacksPage goToCorporatePacksTab() {
		moveToElement(corporatePacksTab);
		return new ULCCorporatePacksPage(this.driver);
	}

	public ULCInternationalExamPage goToInternationalExamTab() {
		moveToElement(internationalExamsTab);
		return new ULCInternationalExamPage(this.driver);
	}

	public ULCIntesolWorldwidePage goToIntesolWorldwideTab() {
		moveToElement(intesolWorldwideTab);
		return new ULCIntesolWorldwidePage(this.driver);
	}

	public ULCCoursesPage goToCoursesTab() {
		moveToElement(coursesTab);
		return new ULCCoursesPage(this.driver);
	}

	public ULCContactsPage goToContactsTab() {
		moveToElement(contactsTab);
		contactsTab.click();
		return new ULCContactsPage(this.driver);
	}

	public ULCContactsPage goToNavigTabBar() {
		navigTabBar.click();
		return new ULCContactsPage(this.driver);
	}

	public ULCHomePage goToBookNow() {
		moveToElement(bookNowPage);
		bookNowPage.click();
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage goToSelectCourse() {
		moveToElement(selectCourses);
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage goToSelectTrainings() {
		moveToElement(selectTrainings);
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage goToMakeAPayment() {
		makeAPayment.click();
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage fillFirstName(String name) {
		paymentFirstName.sendKeys(name);
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage fillLastName(String lastname) {
		paymentLastName.sendKeys(lastname);
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage fillEmail(String email) {
		paymentEmail.sendKeys(email);
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage fillPhone(String phone) {
		paymentPhone.sendKeys(phone);
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage fillMessage(String message) {
		paymentMessage.sendKeys(message);
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage goToPaymentNext() {
		paymentNext.click();
		return new ULCHomePage(this.driver);
	}

	public ULCHomePage goToPaymentCheckout() {
		paymentCheckout.click();
		return new ULCHomePage(this.driver);
	}
}
