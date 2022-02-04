package com.Web365.ULC.Tab.Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCAboutUsPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;


public class ULCAboutUsTabPageTest extends ULCBaseTest{
	@Test
	public void uLCHomePageAboutUsAboutUsTest() throws InterruptedException {
		
		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		aboutUs.logoClick();
		Thread.sleep(5000);
		Assert.assertTrue(aboutUs.aboutUsTab.isDisplayed());
		aboutUs.aboutUsTab.click();
		aboutUs.aboutUsAboutUs.click();
		Assert.assertTrue(aboutUs.aboutUsPageImg.isDisplayed());
		Assert.assertTrue(aboutUs.aboutUsText.isDisplayed());
		Assert.assertTrue(aboutUs.instBtn.isDisplayed());
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutUs.instBtn).perform();
		aboutUs.instBtn.click();
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
		Thread.sleep(2000);
		
	}
	@Test
	public void uLCHomePageAboutUsGalleryTest() throws InterruptedException {
		
		ULCAboutUsPage aboutUs = new ULCAboutUsPage(driver);
		Assert.assertTrue(aboutUs.aboutUsTab.isDisplayed());
		aboutUs.aboutUsTab.click();
		Assert.assertTrue(aboutUs.aboutUsGallery.isDisplayed());	
		aboutUs.aboutUsGallery.click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutUs.galleryImg).perform();
		aboutUs.galleryImg.click();
		Thread.sleep(1000);
		//Assert.assertFalse(aboutUs.infImg.isDisplayed());
		aboutUs.closeBtn.click();
		Thread.sleep(1000);
		//Assert.assertTrue(aboutUs.aboutUsGallery.isDisplayed());	
		aboutUs.imgNextBtn.click();	Thread.sleep(1000);
		aboutUs.imgNextBtn.click();Thread.sleep(1000);
		aboutUs.imgNextBtn.click();Thread.sleep(1000);
		aboutUs.imgNextBtn.click();Thread.sleep(1000);
		aboutUs.imgPrevBtn.click();Thread.sleep(1000);
		aboutUs.imgPrevBtn.click();
		aboutUs.imgPrevBtn.click();
		
		
		
		
	}
	}