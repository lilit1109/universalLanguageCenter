package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCAboutUsPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCAboutUsTabPageTest extends ULCBaseTest {

	@Test
	public void uLCHomePageAboutUsAboutUsTest() throws InterruptedException {
		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);

		System.out.println("The Home page is opened and About Us is displayed");
		Assert.assertTrue(aboutUs.aboutUsTab.isDisplayed());
		aboutUs = aboutUs.goToAboutUsTab();
		Thread.sleep(1000);

		System.out.println("The About Us menu is opened and About Us button is displayed");
		aboutUs = aboutUs.goToAboutUsAboutUs();
		Thread.sleep(1000);

		System.out.println("Make sure that the About us page Image  is displayed");
		aboutUs = aboutUs.goToAboutUsPageImg();
		Thread.sleep(1000);

		System.out.println("Make sure that the About us page text is displayed");
		aboutUs = aboutUs.goToAboutUsText();
		Thread.sleep(1000);

		System.out.println("Make sure that the About us page instagram button is displayed");
		aboutUs = aboutUs.goToInsBtn();
		Thread.sleep(1000);

		System.out.println("The button doesn't work");
		System.out.println("Return to the Home page");
		aboutUs = aboutUs.goToAboutUsTab();
	}

	@Test
	public void uLCHomePageAboutUsStaffTest() throws InterruptedException {
		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);

		System.out.println("The About Us menu is opened");
		aboutUs = aboutUs.goToAboutUsTab();
		Thread.sleep(1000);

		System.out.println("The About Us menu is opened and Staff button is displayed");
		aboutUs = aboutUs.goToAboutUsStaff();
		Thread.sleep(1000);
		System.out.println("AboutUS Staff tab button doesn't react to the action");
		Thread.sleep(1000);
	}

	@Test
	public void uLCHomePageAboutUsVacancyTest() throws InterruptedException {
		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		System.out.println("The About Us menu is opened");
		aboutUs = aboutUs.goToAboutUsTab();
		Thread.sleep(1000);

		System.out.println("The About Us menu is opened and Vacancy button is displayed");
		aboutUs = aboutUs.goToAboutUsVacancy();
		Thread.sleep(1000);

		System.out.println("The Vacancy page  is opened and Download button is displayed");
		aboutUs = aboutUs.goToVacancyDldBtn();
		Thread.sleep(1000);

		System.out.println("Click on the Download button and switch to new page and open the PDF documentation");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);

		System.out.println("Click on the Close button and return the AboutUs page");
		driver.close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);

	}

	@Test
	public void uLCHomePageAboutUsGalleryTest() throws InterruptedException {
		ULCAboutUsPage aboutUsImg = new ULCAboutUsPage(driver);

		System.out.println("The About Us menu is opened");
		aboutUsImg = aboutUsImg.goToAboutUsTab();

		System.out.println("The About Us menu is opened and Gallery button is displayed");
		aboutUsImg = aboutUsImg.goToAboutUsGallery();
		Thread.sleep(1000);

		System.out.println("Click on the Gallery image");
		aboutUsImg = aboutUsImg.goToGalleryImage();
		Thread.sleep(1000);

		System.out.println("Click on the Close button and close the image");
		aboutUsImg = aboutUsImg.goToCloseBtn();
		Thread.sleep(1000);

		System.out.println("Return to the AboutUs Tab");
		aboutUsImg = aboutUsImg.goToAboutUsTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCGalleryImagesTest() throws InterruptedException {
		ULCAboutUsPage gallImgs = new ULCAboutUsPage(driver);
		System.out.println("The Gallery page is opened and images are displayed");
		gallImgs = gallImgs.goToGalleryImage();
		Thread.sleep(1000);

		System.out.println("Click in the image full screen batton");
		gallImgs = gallImgs.goToFullScreenBtn();
		Thread.sleep(1000);

		System.out.println("Click in the right arrow batton and change the images");
		gallImgs = gallImgs.goToRightArrowBatton();
		Thread.sleep(1000);

		System.out.println("Click in the left arrow batton and change the images");
		gallImgs = gallImgs.goToLeftArrowBatton();
		Thread.sleep(1000);

		System.out.println("Click in the page close batton and return to the About us Gallery page");
		gallImgs = gallImgs.goToCloseBtn();
		Thread.sleep(1000);

		System.out.println("Click in the next arrow batton and change the images");
		gallImgs = gallImgs.goToNextImg();
		Thread.sleep(1000);

		System.out.println("Click in the right arrow batton and change the images");
		gallImgs = gallImgs.goToPrevImg();
		Thread.sleep(1000);

		System.out.println("Return to the Home Tab");
		gallImgs = gallImgs.goToAboutUsTab();
		Thread.sleep(1000);
	}
}