package com.Web365.ULC.Page.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Base.ULCBasePage;
import com.Web365.ULC.Page.Home.ULCHomePage;
import com.Web365.ULC.Page.Tab.ULCAboutUsPage;
import com.Web365.ULC.Page.Tab.ULCContactsPage;
import com.Web365.ULC.Page.Tab.ULCCorporatePacksPage;
import com.Web365.ULC.Page.Tab.ULCInternationalExamPage;
import com.Web365.ULC.Page.Tab.ULCIntesolWorldwidePage;
import com.Web365.ULC.Page.Tab.ULCursesPage;

import static com.Web365.ULC.Page.Home.ULCHomePageConstants.*;
public class ULCHomePage extends ULCBasePage{

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
		public WebElement navigBar;

public ULCHomePage logoClick() {
	logo.click();
	return new ULCHomePage(this.driver);
}
public ULCHomePage goToHome() {
	homeTab.click();
	return new ULCHomePage(this.driver);
}
public ULCAboutUsPage goToAboutUs() {
	aboutUsTab.click();
	return new ULCAboutUsPage(this.driver);
}
public ULCCorporatePacksPage goToCorporatePacks() {
	corporatePacksTab.click();
	return new ULCCorporatePacksPage(this.driver);
}
public ULCInternationalExamPage goToInternationalExam() {
	internationalExamsTab.click();
	return new ULCInternationalExamPage(this.driver);
}
public ULCIntesolWorldwidePage goToIntesolWorldwide() {
	intesolWorldwideTab.click();
	return new ULCIntesolWorldwidePage(this.driver);
}
public ULCursesPage goToCourses() {
	coursesTab.click();
	return new ULCursesPage(this.driver);
}
public ULCContactsPage goToContacts() {
	contactsTab.click();
	return new ULCContactsPage(this.driver);
}
public ULCContactsPage goToNavigBar() {
	navigBar.click();
	return new ULCContactsPage(this.driver);
}
	

}

