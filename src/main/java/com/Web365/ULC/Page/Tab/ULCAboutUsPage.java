package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCAboutUsPageConstants.*;

public class ULCAboutUsPage extends ULCHomePage {

	public ULCAboutUsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ABOUTUS_TAB_ABOUTUS_XPATH)
	public WebElement aboutUsAboutUs;

	@FindBy(xpath = ABOUTUS_PAGE_TEXT_XPATH)
	public WebElement aboutUsText;

	@FindBy(xpath = ABOUTUS_PAGE_IMAGE_XPATH)
	public WebElement aboutUsPageImg;
	@FindBy(xpath = INSTAGRAM_BATTON_XPATH)
	public WebElement instBtn;
	@FindBy(xpath = ABOUTUS_TAB_STAFF_XPATH)
	public WebElement aboutUsStaff;
	@FindBy(xpath = ABOUTUS_TAB_VACANCIES_XPATH)
	public WebElement aboutUsVacancy;
	@FindBy(xpath = ABOUTUS_VACANCIES_DOWNLOAD_XPATH)
	public WebElement vacancyDldBtn;
	@FindBy(xpath = ABOUTUS_TAB_GALLERY_XPATH)
	public WebElement aboutUsGallery;
	@FindBy(xpath = GALLERY_IMAGES_XPATH)
	public WebElement galleryImg;
	@FindBy(xpath = GALLERY_IMAGES_NEXT_BTN_XPATH)
	public WebElement imgNextBtn;
	@FindBy(xpath = GALLERY_ACTIVE_CURRENT_PAGE_XPATH)
	public WebElement currPage;
	@FindBy(xpath = GALLERY_IMAGES_PREV_BTN_XPATH)
	public WebElement imgPrevBtn;
	@FindBy(xpath = INFORMATION_IMAGE_XPATH)
	public WebElement infImg;
	@FindBy(xpath = CLOSE_BTN_XPATH)
	public WebElement closeBtn;

	public ULCAboutUsPage goToAboutUsStaff() {
		aboutUsStaff.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToInfImg() {
		infImg.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToCurrPage() {
		currPage.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToCloseBtn() {
		closeBtn.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToNextImg() {
		imgNextBtn.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToPrevImg() {
		imgNextBtn.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsVacancy() {
		aboutUsVacancy.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToVacancyDldBtn() {
		vacancyDldBtn.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsGallery() {
		aboutUsGallery.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsAboutUs() {
		aboutUsAboutUs.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsPageImg() {
		aboutUsPageImg.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsText() {
		aboutUsText.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToInsBtn() {
		instBtn.click();
		return new ULCAboutUsPage(this.driver);
	}

}
