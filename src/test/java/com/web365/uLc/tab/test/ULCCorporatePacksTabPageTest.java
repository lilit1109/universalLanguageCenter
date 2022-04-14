package  com.web365.uLc.tab.test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.web365.uLc.page.tab.ULCCorporatePacksPage;
import com.web365.uLc.test.base.ULCBaseTest;

public class ULCCorporatePacksTabPageTest extends ULCBaseTest {

	@Test
	public void uLCHomePageCorpPacksTest() throws InterruptedException {
		ULCCorporatePacksPage corpPacks = new ULCCorporatePacksPage(driver);
		System.out.println("Make sure that the Home page is opened and move to Corporate Packs and click on it.");
		corpPacks = corpPacks.goToCorporatePacksTab();
		Thread.sleep(1000);
		
		System.out.println("The Corporate Packs page opened and PDF file is displayed.");
		corpPacks = corpPacks.goToPDFbtn();
		Thread.sleep(1000);
		
		System.out.println("Return to the Corporate Packs tab.");
		corpPacks = corpPacks.goToCorporatePacksTab();
		Thread.sleep(1000);
	}

	@Test
	public void uLCHomePageCorpPacksPdfTest() throws InterruptedException {
		ULCCorporatePacksPage pdfPage = new ULCCorporatePacksPage(driver);
		System.out.println("PDF is displayed, click on it.");
		pdfPage = pdfPage.goToPDFbtn();
		Thread.sleep(1000);
		
		System.out.println("Switch to the new page");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
		
		System.out.println("Click on close button and close the page.");
		driver.close();
		System.out.println("Return to the Home page");
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);
	}

	@Test
	public void uLCHomePageCorpPacksSlideMapTest() throws InterruptedException {
		ULCCorporatePacksPage slideMapImg = new ULCCorporatePacksPage(driver);
		slideMapImg = slideMapImg.goToSlideMap();
		Thread.sleep(1000);
		
		slideMapImg = slideMapImg.goToSlideMapeItem();
		Thread.sleep(1000);
		System.out.println("In The Menu tab, the Home tab page has a Corporation pack function that has the same functions as the Menu Tab Corporation pack tab function.");
	}

}
