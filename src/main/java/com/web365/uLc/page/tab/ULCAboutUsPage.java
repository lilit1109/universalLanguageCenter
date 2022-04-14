package com.web365.uLc.page.tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.uLc.page.home.ULCHomePage;

import static com.web365.uLc.page.tab.ULCAboutUsPageConstants.*;

public class ULCAboutUsPage extends ULCHomePage {

	public ULCAboutUsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ABOUTUS_TAB_ABOUTUS_XPATH)
	public WebElement aboutUsAboutUs;

	@FindBy(xpath = ABOUTUS_PAGE_TEXT_XPATH)
	public WebElement aboutUsText;
	@FindBy(xpath = RIGHT_ARROW_BATTON_XPATH)
	public WebElement rightArrowBtn;
	@FindBy(xpath = LEFT_ARROW_BATTON_XPATH)
	public WebElement leftArrowBtn;
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
	@FindBy(xpath = FULL_SCREEN_BTN_XPATH)
	public WebElement fullScrBtn;
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
		moveToElement(aboutUsStaff);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToRightArrowBatton() throws InterruptedException {
		moveToElement(rightArrowBtn);
		rightArrowBtn.click();
		Thread.sleep(1000);
		rightArrowBtn.click();
		Thread.sleep(1000);
		rightArrowBtn.click();
		Thread.sleep(1000);
		rightArrowBtn.click();
		Thread.sleep(1000);
		rightArrowBtn.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToLeftArrowBatton() throws InterruptedException {
		moveToElement(leftArrowBtn);
		leftArrowBtn.click();
		Thread.sleep(1000);
		leftArrowBtn.click();
		Thread.sleep(1000);
		leftArrowBtn.click();
		Thread.sleep(1000);
		leftArrowBtn.click();
		Thread.sleep(1000);
		leftArrowBtn.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToInfImg() {
		infImg.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToFullScreenBtn() {
		moveToElement(fullScrBtn);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToCurrPage() {
		currPage.click();
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToCloseBtn() {
		moveToElement(closeBtn);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToNextImg() throws InterruptedException {
		moveToElement(imgNextBtn);
		imgNextBtn.click();
		Thread.sleep(1000);
		imgNextBtn.click();
		Thread.sleep(1000);
		imgNextBtn.click();
		Thread.sleep(1000);
		imgNextBtn.click();
		Thread.sleep(1000);
		imgNextBtn.click();
		Thread.sleep(1000);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToPrevImg() throws InterruptedException {
		moveToElement(imgPrevBtn);
		imgPrevBtn.click();
		Thread.sleep(1000);
		imgPrevBtn.click();
		Thread.sleep(1000);
		imgPrevBtn.click();
		Thread.sleep(1000);
		imgPrevBtn.click();
		Thread.sleep(1000);
		imgPrevBtn.click();
		Thread.sleep(1000);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsVacancy() {
		moveToElement(aboutUsVacancy);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToVacancyDldBtn() {
		moveToElement(vacancyDldBtn);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsGallery() {
		moveToElement(aboutUsGallery);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsAboutUs() {
		moveToElement(aboutUsAboutUs);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsPageImg() {
		moveToElement(aboutUsPageImg);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToAboutUsText() {
		moveToElement(aboutUsText);
		return new ULCAboutUsPage(this.driver);
	}

	public ULCAboutUsPage goToInsBtn() {
		moveToElement(instBtn);
		return new ULCAboutUsPage(this.driver);
	}
	public ULCAboutUsPage goToGalleryImage() {
		moveToElement(galleryImg);
		return new ULCAboutUsPage(this.driver);
}
}
