package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCCorporatePacksPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCCorporatePacksTabPageTest extends ULCBaseTest {

	@Test
	public void uLCHomePageCorpPacksTest() throws InterruptedException {

		ULCCorporatePacksPage corpPacks = new ULCCorporatePacksPage(driver);
		corpPacks = corpPacks.goToCorporatePacksTab();
		Assert.assertTrue(corpPacks.corporatePacksTab.isDisplayed());
		corpPacks.corporatePacksTab.click();
		Assert.assertTrue(corpPacks.pdfFile.isDisplayed());
	}

	@Test
	public void uLCHomePageCorpPacksPdfTest() throws InterruptedException {

		ULCCorporatePacksPage pdfPage = new ULCCorporatePacksPage(driver);
		pdfPage = pdfPage.goToPDFbtn();
		Assert.assertTrue(pdfPage.pdfFile.isDisplayed());
		pdfPage.pdfFile.click();
		Thread.sleep(5000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(2000);
	}

	@Test
	public void uLCHomePageCorpPacksSlideMapTest() throws InterruptedException {

		ULCCorporatePacksPage slideMapImg = new ULCCorporatePacksPage(driver);
		slideMapImg = slideMapImg.goToSlideMap();
		Actions actions = new Actions(driver);
		actions.moveToElement(slideMapImg.slideMap).perform();
		Assert.assertTrue(slideMapImg.slideMap.isDisplayed());
		Thread.sleep(5000);
		Assert.assertTrue(slideMapImg.slideMapItemSkil.isDisplayed());
		Thread.sleep(5000);
		System.out.println(
				"In The Menu tab, the Home tab page has a Corporation pack function that has the same functions as the Menu Tab Corporation pack tab function.");
	}

}
