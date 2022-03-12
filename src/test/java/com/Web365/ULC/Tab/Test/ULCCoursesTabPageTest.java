package com.Web365.ULC.Tab.Test;

import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCCoursesPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCCoursesTabPageTest extends ULCBaseTest{
	
	@Test
	public void uLCCoursesTabLangPageTest() throws InterruptedException {
		ULCCoursesPage coursesTabLgPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursesTabLgPg.goToCoursesTab();
		Thread.sleep(2000);
		System.out.println("The Courses Tab menu is opened and Language tab is opened.");
		coursesTabLgPg.goToLanguagesTabPg();
		Thread.sleep(2000);
		System.out.println("Return to the Courses Tab.");
		coursesTabLgPg.goToCoursesTab();
		Thread.sleep(2000);
		
	}
	@Test
	public void uLCCoursesTabUniKidsPageTest() throws InterruptedException {
		ULCCoursesPage  coursUniKPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursUniKPg.goToCoursesTab();
		Thread.sleep(2000);
		System.out.println("The Courses Menu is opened and UniKids is displayed.");
		coursUniKPg.goToUniKidPg();
		System.out.println("Return to the Courses Tab.");
		coursUniKPg.goToCoursesTab();
	}
	@Test
	public void uLCCoursesTabUniKidsEnglishTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsEngl = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		uniKidsEngl.goToCoursesTab();
		Thread.sleep(2000);
		System.out.println("The UniKids Menu is opened.");
		uniKidsEngl.goToUniKidPg();
		System.out.println("The UniKids Menu is opened and  English tab is displayed.");
		 uniKidsEngl.goToUniKidPg();
		Thread.sleep(2000);
		System.out.println("Return to the Courses Tab.");
		uniKidsEngl.goToCoursesTab();
	}
	@Test
	public void uLCCoursesTabUniKidsGermanTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsGerm = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		uniKidsGerm.goToCoursesTab();
		Thread.sleep(2000);
		System.out.println("The UniKids Menu is opened.");
		uniKidsGerm.goToUniKidPg();
		Thread.sleep(2000);
		System.out.println("The UniKids Menu is opened and  German tab is displayed.");
		uniKidsGerm.goToUniKidGermPg();
		System.out.println("Return to the Courses Tab.");
		uniKidsGerm.goToCoursesTab();
	}
	@Test
	public void uLCCoursesTabUniKidsFrenchTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsFrch = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		uniKidsFrch.goToCoursesTab();
		System.out.println("The UniKids Menu is opened.");
		uniKidsFrch.goToUniKidPg();
		Thread.sleep(2000);
		System.out.println("The UniKids Menu is opened and  French tab is displayed.");
		uniKidsFrch.goToUniKidFrchPg();
		System.out.println("Return to the Courses Tab.");
		uniKidsFrch.goToCoursesTab();
	}
	@Test
	public void uLCCoursesTabLevelsPageTest() throws InterruptedException {
		ULCCoursesPage  coursLevelsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursLevelsPg.goToCoursesTab();
		Thread.sleep(2000);
		System.out.println("The Courses Menu is opened and Levels tab is displayed.");
		coursLevelsPg.goToLevelsTabPg();
		Thread.sleep(2000);
		System.out.println("Return to the Courses Tab.");
		coursLevelsPg.goToCoursesTab();
	}
	@Test
	public void uLCCoursesTabTariffsPageTest() throws InterruptedException {
		ULCCoursesPage  coursTariffsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursTariffsPg.goToCoursesTab();
		Thread.sleep(2000);
		System.out.println("The Courses Menu is opened and Tariffs tab is displayed.");
		coursTariffsPg.goToTariffsTabPg();
		Thread.sleep(2000);
		System.out.println("Return to the Courses Tab.");
		coursTariffsPg.goToCoursesTab();
	}
	@Test
	public void uLCCoursesTabSeminarsPageTest() throws InterruptedException {
		ULCCoursesPage  coursSeminarsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursSeminarsPg.goToCoursesTab();
		System.out.println("The Courses Menu is opened and Seminars tab is displayed.");
		coursSeminarsPg.goToSeminarsTabPg();
		Thread.sleep(2000);
		System.out.println("Return to the Courses Tab.");
		coursSeminarsPg.goToCoursesTab();
	}
	@Test
	public void uLCCoursesTabNewsPageTest() throws InterruptedException {
		ULCCoursesPage  coursNewsPg = new ULCCoursesPage(driver);
		System.out.println("The Home page is open, and Courses Tab is displayed.");
		coursNewsPg.goToCoursesTab();
		Thread.sleep(2000);
		System.out.println("The Courses Menu is opened and News tab is displayed.");
		coursNewsPg.goToNewsTabPg();
		Thread.sleep(2000);
		System.out.println("Return to the Courses Tab.");
		coursNewsPg.goToCoursesTab();
	}
}
