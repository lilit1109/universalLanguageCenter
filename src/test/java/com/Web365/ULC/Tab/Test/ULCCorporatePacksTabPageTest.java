package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCCorporatePacksPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCCorporatePacksTabPageTest extends ULCBaseTest {

	@Test
	public void uLCHomePageCorpPacksTest() throws InterruptedException {
		ULCCorporatePacksPage corpPacks = new ULCCorporatePacksPage(driver);
		System.out.println("Make sure that the Home page is opened and move to Corporate Packs and click on it.");
		corpPacks.goToCorporatePacksTab();
		Thread.sleep(2000);
		System.out.println("The Corporate Packs page opened and PDF file is displayed.");
		corpPacks.goToPDFbtn();
		Thread.sleep(5000);
		System.out.println("Return to the Corporate Packs tab.");
		corpPacks.goToCorporatePacksTab();
		Thread.sleep(2000);
	}

	@Test
	public void uLCHomePageCorpPacksPdfTest() throws InterruptedException {
		ULCCorporatePacksPage pdfPage = new ULCCorporatePacksPage(driver);
		System.out.println("PDF is displayed, click on it.");
		pdfPage.goToPDFbtn();
		Thread.sleep(2000);
		System.out.println("Switch to the new page");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		System.out.println("Click on close button and close the page.");
		driver.close();
		System.out.println("Return to the Home page");
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(2000);
	}

	@Test
	public void uLCHomePageCorpPacksSlideMapTest() throws InterruptedException {
		ULCCorporatePacksPage slideMapImg = new ULCCorporatePacksPage(driver);
		slideMapImg.goToSlideMap();
		Thread.sleep(5000);
		slideMapImg.goToSlideMapeItem();
		Thread.sleep(5000);
		System.out.println("In The Menu tab, the Home tab page has a Corporation pack function that has the same functions as the Menu Tab Corporation pack tab function.");
	}

}
