package com.Web365.ULC.Tab.Test;


import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCIntesolWorldwidePage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCIntesolWorldTabPageTest extends ULCBaseTest{
	
	
	@Test
	public void uLCIntesolWorldTPageTest() throws InterruptedException {
		ULCIntesolWorldwidePage intWorldwPage = new ULCIntesolWorldwidePage(driver);
		System.out.println("The Home page is opened, find and click on the Intesol Worldwide");
		intWorldwPage = intWorldwPage.goToIntesolWorldwideTab();
		Thread.sleep(2000);
		
		System.out.println("The Intesol Worldwide menu is opened and  go to the TOSL/TEFL/Courses button and click on it");
		intWorldwPage = intWorldwPage.goToTesolTeflCoursesPage();
		Thread.sleep(2000);
		
		System.out.println("Click to the TOSL/TEFL/Courses and find Certificate  In TEFL");
		intWorldwPage = intWorldwPage.goToCertificateInTEFL();
		Thread.sleep(1000);
		
		System.out.println("Click in the Certificate  In TEFL Image");
		intWorldwPage = intWorldwPage.goToCertificateInTEFLImage();
		Thread.sleep(2000);
		
		System.out.println("Click to the Certificate In TEFL download button");
		intWorldwPage = intWorldwPage.goToDownloadTEFLInfbtn();
		Thread.sleep(1000);
		
		System.out.println("Return to the Intesol Worldwide Tab");
	

	}
	@Test
	public void uLCIntesolWorldESPPageTest() throws InterruptedException {
		ULCIntesolWorldwidePage intWorldwESPPage = new ULCIntesolWorldwidePage(driver);
		System.out.println("The Home page is opened, find and click on the Intesol Worldwide");
		intWorldwESPPage = intWorldwESPPage.goToIntesolWorldwideTab();
		Thread.sleep(1000);
		
		System.out.println("The Intesol Worldwide menu is opened and  go to the ESP/Courses button and click on it");
		intWorldwESPPage = intWorldwESPPage.goToEsPCoursesPage();
		Thread.sleep(1000);
		
		System.out.println("Open the ESP/Courses page and makesure the Courses menu is displayed");
		intWorldwESPPage = intWorldwESPPage.goToEsPCoursesPageCourses();
		Thread.sleep(1000);
	}
		@Test
		public void uLCESPEnglishForAcademicPurposeTest() throws InterruptedException {
			ULCIntesolWorldwidePage espEfAP = new ULCIntesolWorldwidePage(driver);
		System.out.println("Click to the ESP/Courses and find English For Academic Purpose");
		System.out.println("Click on the English For Academic Purpose download button and open the new page");
		espEfAP = espEfAP.goToEngForAcadPurpose();	
		
		Thread.sleep(1000);
	}
	    @Test
		public void uLCEforAPCertificateEnglishGrammar() throws InterruptedException {
			ULCIntesolWorldwidePage eAPCertEngGr = new ULCIntesolWorldwidePage(driver);
		System.out.println("Click to the ESP/Courses and find English For Academic Purpose");
		eAPCertEngGr = eAPCertEngGr.goToEngForAcadPurposeBtn();		
		Thread.sleep(1000);
		
		System.out.println("Click to the ESP/Courses and find Certificate English Grammar Information");
		eAPCertEngGr = eAPCertEngGr.goToCertificateInEngGram();
		Thread.sleep(1000);
		
		System.out.println("The Certificate for English Grammar Information is displayed");
		eAPCertEngGr = eAPCertEngGr.goToCertEngGramInf();
		Thread.sleep(1000);
		
	    }
	    @Test
		public void uLCESPEnglishForHospitality() throws InterruptedException {
			ULCIntesolWorldwidePage eSPEngForHosp = new ULCIntesolWorldwidePage(driver);
		System.out.println("Click to the ESP/Courses and find English For Hospitality");
		eSPEngForHosp = eSPEngForHosp.goToeEgForHospitality();
		Thread.sleep(2000);	
		
		System.out.println("In the English For Hospitality page click on the download button");
		eSPEngForHosp = eSPEngForHosp.goToEngForHospDwldBtn();
		Thread.sleep(2000);
		
		System.out.println("Return to the Intesol Worldwide Tab");
		Thread.sleep(1000);
		
			
	}

}
