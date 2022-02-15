package com.Web365.ULC.Tab.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCIntesolWorldwidePage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCIntesolWorldTabPageTest extends ULCBaseTest{
	
	
	@Test
	public void uLCIntesolWorldTPageTest() throws InterruptedException {
		ULCIntesolWorldwidePage intWorldwPage = new ULCIntesolWorldwidePage(driver);
		intWorldwPage = intWorldwPage.goToIntesolWorldwideTab();

		Assert.assertTrue(intWorldwPage.intesolWorldwideTab.isDisplayed());
		intWorldwPage.intesolWorldwideTab.click();
		Thread.sleep(4000);
		Assert.assertTrue(intWorldwPage.tesolTeflCourses.isDisplayed());
		Thread.sleep(4000);

			intWorldwPage = intWorldwPage.goToTesolTeflCoursesPage();
			Thread.sleep(4000);
			intWorldwPage = new ULCIntesolWorldwidePage(driver);
			Thread.sleep(4000);


			Assert.assertTrue(intWorldwPage.certificateInTEFL.isDisplayed());
			Thread.sleep(4000);

			intWorldwPage = intWorldwPage.goToCertificateInTEFL();
			Thread.sleep(1000);
			intWorldwPage = new ULCIntesolWorldwidePage(driver);
			Thread.sleep(4000);


			Assert.assertTrue(intWorldwPage.certificateInTEFLImage.isDisplayed());
			Thread.sleep(4000);
			intWorldwPage = new ULCIntesolWorldwidePage(driver);

			intWorldwPage = intWorldwPage.goToCertificateInTEFLImage();
			Thread.sleep(6000);
			Assert.assertTrue(intWorldwPage.downloadTEFLInfbtn.isDisplayed());
			intWorldwPage = intWorldwPage.goToDownloadTEFLInfbtn();
			Thread.sleep(6000);

	}
	@Test
	public void uLCIntesolWorldESPPageTest() throws InterruptedException {
		ULCIntesolWorldwidePage intWorldwESPPage = new ULCIntesolWorldwidePage(driver);
		intWorldwESPPage = intWorldwESPPage.goToIntesolWorldwideTab();

		Assert.assertTrue(intWorldwESPPage.intesolWorldwideTab.isDisplayed());
		intWorldwESPPage.intesolWorldwideTab.click();
		Thread.sleep(4000);
		Assert.assertTrue(intWorldwESPPage.espCourses.isDisplayed());
		intWorldwESPPage = intWorldwESPPage.goToEsPCoursesPage();
			Thread.sleep(1000);
			intWorldwESPPage = new ULCIntesolWorldwidePage(driver);
Thread.sleep(1000);
Assert.assertTrue(intWorldwESPPage.engForAcadPurpose.isDisplayed());
intWorldwESPPage = new ULCIntesolWorldwidePage(driver);

			intWorldwESPPage = intWorldwESPPage.goToEngForAcadPurpose();			
			Thread.sleep(3000);
			//intWorldwESPPage.engForAcadPurpose.click();
//			Thread.sleep(1000);
intWorldwESPPage = new ULCIntesolWorldwidePage(driver);
			//Assert.assertTrue(intWorldwESPPage.engGramInf.isDisplayed());
			//intWorldwESPPage.engGramInf.click();
//			Actions actions = new Actions(driver);
//			actions.moveToElement(intWorldwESPPage.engForHospitality).perform();
			Thread.sleep(2000);		
			intWorldwESPPage = new ULCIntesolWorldwidePage(driver);
			Thread.sleep(2000);		

			Assert.assertTrue(intWorldwESPPage.engForHospitality.isDisplayed());
			Thread.sleep(2000);		

			intWorldwESPPage = intWorldwESPPage.goToeEgForHospitality();			
			Thread.sleep(2000);		
			intWorldwESPPage = new ULCIntesolWorldwidePage(driver);
			Thread.sleep(2000);		

			intWorldwESPPage = intWorldwESPPage.goToEngForHospDwldBtn();
			Thread.sleep(2000);		

			Assert.assertTrue(intWorldwESPPage.engHospDownload.isDisplayed());
			Thread.sleep(2000);		

			intWorldwESPPage.engHospDownload.click();			
			//intWorldwESPPage = new ULCIntesolWorldwidePage(driver);

			Thread.sleep(2000);	
			Thread.sleep(2000);
			
	}

}
