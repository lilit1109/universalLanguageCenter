package com.web365.uLc.tab.test;

import org.testng.annotations.Test;

import com.web365.uLc.page.tab.ULCCoursesPage;
import com.web365.uLc.test.base.ULCBaseTest;

public class ULCCoursesTabPageTest extends ULCBaseTest{
	
	@Test
	public void uLCCoursesTabLangPageTest() throws InterruptedException {
		ULCCoursesPage coursesTabLgPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursesTabLgPg = coursesTabLgPg.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The Courses Tab menu is opened and Language tab is opened.");
		coursesTabLgPg = coursesTabLgPg.goToLanguagesTabPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		coursesTabLgPg = coursesTabLgPg.goToCoursesTab();
		Thread.sleep(1000);
		
	}
	@Test
	public void uLCCoursesTabUniKidsPageTest() throws InterruptedException {
		ULCCoursesPage  coursUniKPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursUniKPg = coursUniKPg.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The Courses Menu is opened and UniKids is displayed.");
		coursUniKPg = coursUniKPg.goToUniKidPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		coursUniKPg = coursUniKPg.goToCoursesTab();
		Thread.sleep(1000);
	}
	@Test
	public void uLCCoursesTabUniKidsEnglishTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsEngl = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		uniKidsEngl = uniKidsEngl.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The UniKids Menu is opened.");
		uniKidsEngl = uniKidsEngl.goToUniKidPg();
		Thread.sleep(1000);
		
		System.out.println("The UniKids Menu is opened and  English tab is displayed.");
		 uniKidsEngl = uniKidsEngl.goToUniKidPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		uniKidsEngl = uniKidsEngl.goToCoursesTab();
		Thread.sleep(1000);
	}
	@Test
	public void uLCCoursesTabUniKidsGermanTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsGerm = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		uniKidsGerm = uniKidsGerm.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The UniKids Menu is opened.");
		uniKidsGerm = uniKidsGerm.goToUniKidPg();
		Thread.sleep(1000);
		
		System.out.println("The UniKids Menu is opened and  German tab is displayed.");
		uniKidsGerm = uniKidsGerm.goToUniKidGermPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		uniKidsGerm = uniKidsGerm.goToCoursesTab();
		Thread.sleep(1000);
	}
	@Test
	public void uLCCoursesTabUniKidsFrenchTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsFrch = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		uniKidsFrch = uniKidsFrch.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The UniKids Menu is opened.");
		uniKidsFrch = uniKidsFrch.goToUniKidPg();
		Thread.sleep(1000);
		
		System.out.println("The UniKids Menu is opened and  French tab is displayed.");
		uniKidsFrch = uniKidsFrch.goToUniKidFrchPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		uniKidsFrch = uniKidsFrch.goToCoursesTab();
		Thread.sleep(1000);
	}
	@Test
	public void uLCCoursesTabLevelsPageTest() throws InterruptedException {
		ULCCoursesPage  coursLevelsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursLevelsPg = coursLevelsPg.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The Courses Menu is opened and Levels tab is displayed.");
		coursLevelsPg = coursLevelsPg.goToLevelsTabPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		coursLevelsPg = coursLevelsPg.goToCoursesTab();
		Thread.sleep(1000);
	}
	@Test
	public void uLCCoursesTabTariffsPageTest() throws InterruptedException {
		ULCCoursesPage  coursTariffsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursTariffsPg = coursTariffsPg.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The Courses Menu is opened and Tariffs tab is displayed.");
		coursTariffsPg = coursTariffsPg.goToTariffsTabPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		coursTariffsPg = coursTariffsPg.goToCoursesTab();
		Thread.sleep(1000);
	}
	@Test
	public void uLCCoursesTabSeminarsPageTest() throws InterruptedException {
		ULCCoursesPage  coursSeminarsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursSeminarsPg = coursSeminarsPg.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The Courses Menu is opened and Seminars tab is displayed.");
		coursSeminarsPg = coursSeminarsPg.goToSeminarsTabPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		coursSeminarsPg = coursSeminarsPg.goToCoursesTab();
		Thread.sleep(1000);
	}
	@Test
	public void uLCCoursesTabNewsPageTest() throws InterruptedException {
		ULCCoursesPage  coursNewsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursNewsPg = coursNewsPg.goToCoursesTab();
		Thread.sleep(1000);
		
		System.out.println("The Courses Menu is opened and News tab is displayed.");
		coursNewsPg = coursNewsPg.goToNewsTabPg();
		Thread.sleep(1000);
		
		System.out.println("Return to the Courses Tab.");
		coursNewsPg = coursNewsPg.goToCoursesTab();
		Thread.sleep(1000);
	}
}
