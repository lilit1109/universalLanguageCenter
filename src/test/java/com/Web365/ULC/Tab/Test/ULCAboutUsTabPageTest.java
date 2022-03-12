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
		aboutUs.goToAboutUsTab();
		Thread.sleep(4000);
		System.out.println("The About Us menu is opened and About Us button is displayed");
		aboutUs.goToAboutUsAboutUs();
		Thread.sleep(2000);
		System.out.println("Make sure that the About us page Image  is displayed");
		aboutUs.goToAboutUsPageImg();
		Thread.sleep(2000);
		System.out.println("Make sure that the About us page text is displayed");
		aboutUs.goToAboutUsText();
		Thread.sleep(2000);
		System.out.println("Make sure that the About us page instagram button is displayed");
		aboutUs.goToInsBtn();
		Thread.sleep(4000);
		System.out.println("The button doesn't work");
		System.out.println("Return to the Home page");
		aboutUs.goToHomeTab();
	}

	@Test
	public void uLCHomePageAboutUsStaffTest() throws InterruptedException {
		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		System.out.println("The About Us menu is opened");
		aboutUs.goToAboutUsTab();
		Thread.sleep(1000);
		System.out.println("The About Us menu is opened and Staff button is displayed");
		aboutUs.goToAboutUsStaff();
		Thread.sleep(1000);
		System.out.println("AboutUS Staff tab button doesn't react to the action");
	}

	@Test
	public void uLCHomePageAboutUsVacancyTest() throws InterruptedException {
		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		System.out.println("The About Us menu is opened");
		aboutUs.goToAboutUsTab();
		System.out.println("The About Us menu is opened and Vacancy button is displayed");
		aboutUs.goToAboutUsVacancy();
		System.out.println("The Vacancy page  is opened and Download button is displayed");
		aboutUs.goToVacancyDldBtn();
		System.out.println("Click on the Download button and switch to new page and open the PDF documentation");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);

	}

	@Test
	public void uLCHomePageAboutUsGalleryTest() throws InterruptedException {
		ULCAboutUsPage aboutUsImg = new ULCAboutUsPage(driver);
		System.out.println("The About Us menu is opened");
		aboutUsImg.goToAboutUsTab();
		System.out.println("The About Us menu is opened and Gallery button is displayed");
		aboutUsImg.goToAboutUsGallery();
		Thread.sleep(1000);
		System.out.println("Click on the Gallery image");
		aboutUsImg.goToGalleryImage();
		Thread.sleep(1000);
		aboutUsImg.goToCloseBtn();
		Thread.sleep(1000);
		System.out.println("Return to the Home Tab");
		aboutUsImg.goToAboutUsTab();
		Thread.sleep(2000);
	}
		
		@Test
		public void uLCGalleryImagesTest() throws InterruptedException {
		ULCAboutUsPage gallImgs = new ULCAboutUsPage(driver);
		System.out.println("The Gallery page is opened and images are displayed");
		gallImgs.goToGalleryImage();
		Thread.sleep(1000);
		System.out.println("Click in the image full screen batton");
		gallImgs.goToFullScreenBtn();
		Thread.sleep(2000);
		System.out.println("Click in the right arrow batton and change the images");
		gallImgs.goToRightArrowBatton();
		Thread.sleep(2000);
		System.out.println("Click in the left arrow batton and change the images");
		gallImgs.goToLeftArrowBatton();
		Thread.sleep(2000);
		System.out.println("Click in the page close batton and return to the About us Gallery page");
		gallImgs.goToCloseBtn();
		Thread.sleep(1000);
		System.out.println("Click in the next arrow batton and change the images");
		gallImgs.goToNextImg();
		Thread.sleep(1000);
		System.out.println("Click in the right arrow batton and change the images");
		gallImgs.goToPrevImg();
		Thread.sleep(1000);
		System.out.println("Return to the Home Tab");
		gallImgs.goToAboutUsTab();
		Thread.sleep(1000);
	}
}