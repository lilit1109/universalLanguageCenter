package com.Web365.ULC.Page.Tab;

import static com.Web365.ULC.Page.Tab.ULCHomePageTabConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;

public class ULCHomePageTab extends ULCHomePage {

	public ULCHomePageTab(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = HOME_PAGE_REGISTER_BATTON_XPATH)
	public WebElement registerBtn;
	@FindBy(xpath = PLACEMENT_TEST_PAGE_XPATH)
	public WebElement testPage;
	@FindBy(xpath = PLACEMENT_TEST_SIGNIN_BTN_XPATH)
	public WebElement testPageSignInBtn;

	@FindBy(xpath = HOME_PAGE_UNIKIDS_XPATH)
	public WebElement uniKidsImg;
	@FindBy(xpath = UNIKIDS_SUMMER_PROGRAM_XPATH)
	public WebElement uniKidsProg;
	@FindBy(xpath = UNIKIDS_PROGRAM_PUZZLE_IMAGE_XPATH)
	public WebElement puzzleImg;
	@FindBy(xpath = UNIKIDS_PROGRAM_PAGE_IMAGE_XPATH)
	public WebElement pageImg;
	@FindBy(xpath = RUSSIAN_LANGUAGE_IMAGE_XPATH)
	public WebElement rusLangImg;
	@FindBy(xpath = RUSSIAN_LANGUAGE_INFORM_XPATH)
	public WebElement rusLangInf;
	@FindBy(xpath = LANGUAGES_PAGE_ESP_TEXT_XPATH)
	public WebElement eSPText;
	@FindBy(xpath = LANGUAGES_PAGE_XPATH)
	public WebElement langPage;
	@FindBy(xpath = YOUNG_LERNERS_PROGRAM_XPATH)
	public WebElement youngLernersProg;
	@FindBy(xpath = INT_EXAM_PAGE_IMAGE_XPATH)
	public WebElement intExamImg;
	@FindBy(xpath = GERMAN_PAGE_IMAGE_XPATH)
	public WebElement germanPageImg;
	@FindBy(xpath = CORPORATIVE_PACK_IMAGE_XPATH)
	public WebElement corpPackImg;
	@FindBy(xpath = ANIMATED_IMAGES_XPATH)
	public WebElement animImgs;
	@FindBy(xpath = COURSES_PAGE_IMAGES_XPATH)
	public WebElement coursesImg;
	@FindBy(xpath = GERMAN_COURSES_IMAGES_XPATH)
	public WebElement germLangImg;
	@FindBy(xpath = GERMAN_FOR_SPEC_PURPOSES_TEXT_XPATH)
	public WebElement germSpecPurpText;
	@FindBy(xpath = SIGNIN_TYPE_INFORMATION_XPATH)
	public WebElement signInTypeInf;
	@FindBy(xpath = SIGNIN_PAGE_XPATH)
	public WebElement googleSignInPage;
	@FindBy(xpath = SIGNIN_PAGE_NEXT_BATTON_XPATH)
	public WebElement signPageNextBtn;
	@FindBy(xpath = SIGNIN_ERROR_TRY_AGAIN_BATTON_XPATH)
	public WebElement signInTryAgainBnt;
	@FindBy(xpath = SIGNIN_PAGE_CREATE_ACCOUNT_BATTON_XPATH)
	public WebElement createAccountBtn;
	@FindBy(xpath = CREATE_ACCOUNT_FORMYSELF_XPATH)
	public WebElement createAccForMySelf;

	public ULCHomePageTab goToSignInPage() {
		googleSignInPage.click();
		return new ULCHomePageTab(this.driver);
	}

	public void fillname(String identifierId) {
		signInTypeInf.sendKeys(identifierId);
	}

	public ULCHomePageTab goToGermanLanguage() {
		germLangImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToGermanText() {
		germSpecPurpText.click();
		return new ULCHomePageTab(this.driver);

	}

	public ULCHomePageTab goToCrAccForMySelf() {
		createAccForMySelf.click();
		return new ULCHomePageTab(this.driver);

	}

	public ULCHomePageTab goToRegisterBtn() {
		registerBtn.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToTestPage() {
		testPage.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToTestPageSignIn() {
		testPageSignInBtn.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToSignInNextBtn() {
		signPageNextBtn.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToSignInTryAgain() {
		moveToElement(signInTryAgainBnt);
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToSignInCreateAccount() {
		createAccountBtn.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToCoursesLang() {
		youngLernersProg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToCoursesImg() {
		coursesImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToESPText() {
		eSPText.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToLangPage() {
		langPage.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToRussLangImg() {
		rusLangImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToRussLangInf() {
		rusLangInf.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToHomePageUniKidsTab() {
		uniKidsImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToUniKidsProg() {
		uniKidsProg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToPuzzleImg() {
		puzzleImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToPageImg() {
		pageImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToIntExamImg() {
		intExamImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToCorpPackImg() {
		corpPackImg.click();
		return new ULCHomePageTab(this.driver);
	}

	public ULCHomePageTab goToAnimImgs() {
		animImgs.click();
		return new ULCHomePageTab(this.driver);
	}

}
