package com.Web365.ULC.Tab.Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCCoursesPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCCoursesTabPageTest extends ULCBaseTest{
	
	@Test
	public void uLCCoursesTabLangPageTest() throws InterruptedException {
		
		ULCCoursesPage coursesTabLgPg = new ULCCoursesPage(driver);
		coursesTabLgPg = coursesTabLgPg.goToCoursesTab();
		Assert.assertTrue(coursesTabLgPg.coursesTab.isDisplayed());
		Assert.assertTrue(coursesTabLgPg.languageTabPg.isDisplayed());
		Thread.sleep(2000);
		coursesTabLgPg=coursesTabLgPg.goToLanguagesTabPg();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(coursesTabLgPg.coursesTab).perform();
		
	}
	@Test
	public void uLCCoursesTabUniKidsPageTest() throws InterruptedException {
		ULCCoursesPage  coursUniKPg = new ULCCoursesPage(driver);
		Assert.assertTrue(coursUniKPg.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(coursUniKPg.unikidsPg).perform();
		Assert.assertTrue(coursUniKPg.unikidsPg.isDisplayed());
		coursUniKPg = coursUniKPg.goToUniKidPg();
		Thread.sleep(2000);
		actions.moveToElement(coursUniKPg.coursesTab).perform();
	}
	@Test
	public void uLCCoursesTabUniKidsEnglishTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsEngl = new ULCCoursesPage(driver);
		Assert.assertTrue(uniKidsEngl.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(uniKidsEngl.unikidsPg).perform();
		Assert.assertTrue(uniKidsEngl.unikidsPg.isDisplayed());
		uniKidsEngl = uniKidsEngl.goToUniKidPg();
		Thread.sleep(2000);
		Assert.assertTrue(uniKidsEngl.unikidsEngl.isDisplayed());
		actions.moveToElement(uniKidsEngl.unikidsEngl).perform();
		uniKidsEngl.unikidsEngl.click();
		actions.moveToElement(uniKidsEngl.coursesTab).perform();
	}
	@Test
	public void uLCCoursesTabUniKidsGermanTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsGerm = new ULCCoursesPage(driver);
		Assert.assertTrue(uniKidsGerm.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(uniKidsGerm.unikidsPg).perform();
		Assert.assertTrue(uniKidsGerm.unikidsPg.isDisplayed());
		uniKidsGerm = uniKidsGerm.goToUniKidPg();
		Thread.sleep(2000);
		Assert.assertTrue(uniKidsGerm.unikidsGerm.isDisplayed());
		actions.moveToElement(uniKidsGerm.unikidsGerm).perform();
		uniKidsGerm.unikidsGerm.click();
		actions.moveToElement(uniKidsGerm.coursesTab).perform();
	}
	@Test
	public void uLCCoursesTabUniKidsFrenchTabTest() throws InterruptedException {
		ULCCoursesPage  uniKidsFrch = new ULCCoursesPage(driver);
		Assert.assertTrue(uniKidsFrch.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(uniKidsFrch.unikidsPg).perform();
		Assert.assertTrue(uniKidsFrch.unikidsPg.isDisplayed());
		uniKidsFrch = uniKidsFrch.goToUniKidPg();
		Thread.sleep(2000);
		Assert.assertTrue(uniKidsFrch.unikidsFrch.isDisplayed());
		actions.moveToElement(uniKidsFrch.unikidsFrch).perform();
		uniKidsFrch.unikidsFrch.click();
		actions.moveToElement(uniKidsFrch.coursesTab).perform();
	}
	@Test
	public void uLCCoursesTabLevelsPageTest() throws InterruptedException {
		ULCCoursesPage  coursLevelsPg = new ULCCoursesPage(driver);
		Assert.assertTrue(coursLevelsPg.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(coursLevelsPg.levelsTabPg).perform();
		Assert.assertTrue(coursLevelsPg.levelsTabPg.isDisplayed());
		coursLevelsPg = coursLevelsPg.goToLevelsTabPg();
		Thread.sleep(2000);
		actions.moveToElement(coursLevelsPg.coursesTab).perform();
	}
	@Test
	public void uLCCoursesTabTariffsPageTest() throws InterruptedException {
		ULCCoursesPage  coursTariffsPg = new ULCCoursesPage(driver);
		Assert.assertTrue(coursTariffsPg.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(coursTariffsPg.tariffsTabPg).perform();
		Assert.assertTrue(coursTariffsPg.tariffsTabPg.isDisplayed());
		coursTariffsPg = coursTariffsPg.goToTariffsTabPg();
		Thread.sleep(2000);
		actions.moveToElement(coursTariffsPg.coursesTab).perform();
	}
	@Test
	public void uLCCoursesTabSeminarsPageTest() throws InterruptedException {
		ULCCoursesPage  coursSeminarsPg = new ULCCoursesPage(driver);
		Assert.assertTrue(coursSeminarsPg.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(coursSeminarsPg.seminarsTabPg).perform();
		Assert.assertTrue(coursSeminarsPg.seminarsTabPg.isDisplayed());
		coursSeminarsPg = coursSeminarsPg.goToSeminarsTabPg();
		Thread.sleep(2000);
		actions.moveToElement(coursSeminarsPg.coursesTab).perform();
	}
	@Test
	public void uLCCoursesTabNewsPageTest() throws InterruptedException {
		ULCCoursesPage  coursNewsPg = new ULCCoursesPage(driver);
		Assert.assertTrue(coursNewsPg.coursesTab.isDisplayed());
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(coursNewsPg.newsTabPg).perform();
		Assert.assertTrue(coursNewsPg.newsTabPg.isDisplayed());
		coursNewsPg = coursNewsPg.goToNewsTabPg();
		Thread.sleep(2000);
		actions.moveToElement(coursNewsPg.coursesTab).perform();
	}
}
