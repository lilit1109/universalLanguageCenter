package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCAboutUsPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCAboutUsTabPageTest extends ULCBaseTest {
   
	@Test
	public void uLCHomePageAboutUsAboutUsTest() throws InterruptedException {

		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		Assert.assertTrue(aboutUs.aboutUsTab.isDisplayed());
		aboutUs.aboutUsTab.click();
		aboutUs.aboutUsAboutUs.click();
		Assert.assertTrue(aboutUs.aboutUsPageImg.isDisplayed());
		Assert.assertTrue(aboutUs.aboutUsText.isDisplayed());
		Assert.assertTrue(aboutUs.instBtn.isDisplayed());
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutUs.instBtn).perform();
		Thread.sleep(4000);
		aboutUs.instBtn.click();
		Thread.sleep(6000);
		System.out.println("The button doesn't work");
	}

	@Test
	public void uLCHomePageAboutUsStaffTest() throws InterruptedException {

		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		Assert.assertTrue(aboutUs.aboutUsTab.isDisplayed());
		aboutUs.aboutUsTab.click();
		Assert.assertTrue(aboutUs.aboutUsStaff.isDisplayed());
		Thread.sleep(1000);
		aboutUs.aboutUsStaff.click();
		Thread.sleep(1000);
		System.out.println("AboutUS Staff tab button doesn't react to the action");
	}

	@Test
	public void uLCHomePageAboutUsVacancyTest() throws InterruptedException {

		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		Assert.assertTrue(aboutUs.aboutUsTab.isDisplayed());
		aboutUs.aboutUsTab.click();
		Assert.assertTrue(aboutUs.aboutUsVacancy.isDisplayed());
		aboutUs.aboutUsVacancy.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutUs.vacancyDldBtn).perform();
		aboutUs.vacancyDldBtn.click();
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
		Assert.assertTrue(aboutUsImg.aboutUsTab.isDisplayed());
		aboutUsImg.aboutUsTab.click();
		Assert.assertTrue(aboutUsImg.aboutUsGallery.isDisplayed());
		aboutUsImg.aboutUsGallery.click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutUsImg.galleryImg).perform();
		actions.moveToElement(aboutUsImg.aboutUsTab).perform();
		Thread.sleep(5000);
	}
		
		@Test
		public void uLCGalleryImagesTest() throws InterruptedException {

			ULCAboutUsPage gallImgs = new ULCAboutUsPage(driver);
		gallImgs.galleryImg.click();
		Assert.assertTrue(gallImgs.fullScrBtn.isDisplayed());
		gallImgs.fullScrBtn.click();
		Thread.sleep(5000);
		gallImgs.rightArrowBtn.click();
		gallImgs.rightArrowBtn.click();
		gallImgs.rightArrowBtn.click();
		gallImgs.rightArrowBtn.click();
		gallImgs.leftArrowBtn.click();
		gallImgs.leftArrowBtn.click();
		gallImgs.leftArrowBtn.click();
		gallImgs.leftArrowBtn.click();
		gallImgs.closeBtn.click();
		Thread.sleep(1000);
		Assert.assertTrue(gallImgs.currPage.isDisplayed());
		gallImgs.imgNextBtn.click();
		Thread.sleep(1000);
		gallImgs.imgNextBtn.click();
		Thread.sleep(1000);
		gallImgs.imgNextBtn.click();
		Thread.sleep(1000);
		gallImgs.imgNextBtn.click();
		Thread.sleep(1000);
		gallImgs.imgPrevBtn.click();
		Thread.sleep(1000);
		gallImgs.imgPrevBtn.click();
		gallImgs.imgPrevBtn.click();

	}
}