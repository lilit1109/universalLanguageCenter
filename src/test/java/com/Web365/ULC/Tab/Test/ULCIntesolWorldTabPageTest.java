package com.Web365.ULC.Tab.Test;


import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCIntesolWorldwidePage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCIntesolWorldTabPageTest extends ULCBaseTest{
	
	
	@Test
	public void uLCIntesolWorldTPageTest() throws InterruptedException {
		ULCIntesolWorldwidePage intWorldwPage = new ULCIntesolWorldwidePage(driver);
		System.out.println("The Home page is opened, find and click on the Intesol Worldwide");
		intWorldwPage.goToIntesolWorldwideTab();
		Thread.sleep(2000);
		System.out.println("The Intesol Worldwide menu is opened and  go to the TOSL/TEFL/Courses button and click on it");
		intWorldwPage.goToTesolTeflCoursesPage();
		Thread.sleep(2000);
		System.out.println("Click to the TOSL/TEFL/Courses and find Certificate  In TEFL");
		intWorldwPage.goToCertificateInTEFL();
		Thread.sleep(1000);
		System.out.println("Click in the Certificate  In TEFL Image");
		intWorldwPage.goToCertificateInTEFLImage();
		Thread.sleep(2000);
		System.out.println("Click to the Certificate In TEFL download button");
		intWorldwPage.goToDownloadTEFLInfbtn();
		Thread.sleep(1000);
		System.out.println("Return to the Intesol Worldwide Tab");
	

	}
	@Test
	public void uLCIntesolWorldESPPageTest() throws InterruptedException {
		ULCIntesolWorldwidePage intWorldwESPPage = new ULCIntesolWorldwidePage(driver);
		System.out.println("The Home page is opened, find and click on the Intesol Worldwide");
		intWorldwESPPage.goToIntesolWorldwideTab();
		Thread.sleep(1000);
		System.out.println("The Intesol Worldwide menu is opened and  go to the ESP/Courses button and click on it");
		intWorldwESPPage.goToEsPCoursesPage();
		Thread.sleep(1000);
		System.out.println("Open the ESP/Courses page and makesure the Courses menu is displayed");
		intWorldwESPPage.goToEsPCoursesPageCourses();
		Thread.sleep(1000);
	}
		@Test
		public void uLCESPEnglishForAcademicPurposeTest() throws InterruptedException {
			ULCIntesolWorldwidePage espEfAP = new ULCIntesolWorldwidePage(driver);
		System.out.println("Click to the ESP/Courses and find English For Academic Purpose");
		System.out.println("Click on the English For Academic Purpose download button and open the new page");
		espEfAP.goToEngForAcadPurpose();	
		
		Thread.sleep(1000);
	}
	    @Test
		public void uLCEforAPCertificateEnglishGrammar() throws InterruptedException {
			ULCIntesolWorldwidePage eAPCertEngGr = new ULCIntesolWorldwidePage(driver);
		System.out.println("Click to the ESP/Courses and find English For Academic Purpose");
		eAPCertEngGr.goToEngForAcadPurposeBtn();		
		Thread.sleep(1000);
		System.out.println("Click to the ESP/Courses and find Certificate English Grammar Information");
		eAPCertEngGr.goToCertificateInEngGram();
		Thread.sleep(1000);
		System.out.println("The Certificate for English Grammar Information is displayed");
		eAPCertEngGr.goToCertEngGramInf();
		Thread.sleep(1000);
		
	    }
	    @Test
		public void uLCESPEnglishForHospitality() throws InterruptedException {
			ULCIntesolWorldwidePage eSPEngForHosp = new ULCIntesolWorldwidePage(driver);
		System.out.println("Click to the ESP/Courses and find English For Hospitality");
		eSPEngForHosp.goToeEgForHospitality();
		Thread.sleep(2000);	
		System.out.println("In the English For Hospitality page click on the download button");
		eSPEngForHosp.goToEngForHospDwldBtn();
		Thread.sleep(2000);
		System.out.println("Return to the Intesol Worldwide Tab");
		Thread.sleep(1000);
		
			
	}

}
