package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Test.Base.ULCBaseTest;
import com.Web365.ULC.Page.Tab.ULCHomePageTab;

public class ULCHomeTabPageTest extends ULCBaseTest {
	
	@Test
	public void uLCHomePageRegisterTest() throws InterruptedException {
		ULCHomePageTab register = new ULCHomePageTab(driver);
		register = register.goToRegisterBtn();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(4000);
		register = register.goToTestPage();
		Thread.sleep(4000);
		
		register = register.goToTestPageSignIn();
		Thread.sleep(4000);
		
		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		register = new ULCHomePageTab(driver);
		Assert.assertTrue(register.googleSignInPage.isDisplayed());
		Thread.sleep(1000);
		
		register.fillname("lilit");
		Thread.sleep(1000);
		
		register = register.goToSignInNextBtn();
		Thread.sleep(1000);
		
		register = new ULCHomePageTab(driver);
		Assert.assertTrue(register.signInTryAgainBnt.isDisplayed());
		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		register = new ULCHomePageTab(driver);
		Assert.assertTrue(register.createAccountBtn.isDisplayed());
		Thread.sleep(1000);
		
		register = new ULCHomePageTab(driver);
		Assert.assertTrue(register.signInTryAgainBnt.isDisplayed());
		Thread.sleep(1000);
		
		register = new ULCHomePageTab(driver);
		register = register.goToSignInCreateAccount();
		Thread.sleep(1000);
		register.createAccountBtn.click();
		
		register = new ULCHomePageTab(driver);
		register = register.goToCrAccForMySelf();
		Thread.sleep(1000);
		
		register = new ULCHomePageTab(driver);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);
	}
	
	@Test
	public void uLCHomePageCoursesTest() throws InterruptedException {
		ULCHomePageTab coursesPage = new ULCHomePageTab(driver);
		Assert.assertTrue(coursesPage.coursesImg.isDisplayed());
		coursesPage = coursesPage.goToCoursesImg();
		Thread.sleep(4000);
		
		coursesPage = new ULCHomePageTab(driver);
		Thread.sleep(4000);
		coursesPage = coursesPage.goToCoursesLang();
		Assert.assertTrue(coursesPage.langPage.isDisplayed());
		Thread.sleep(4000);
		
		coursesPage = new ULCHomePageTab(driver);
		coursesPage = coursesPage.goToESPText();
		Thread.sleep(4000);
		
		Assert.assertTrue(coursesPage.eSPText.isDisplayed());
		Thread.sleep(4000);
	}

	@Test
	public void uLCCoursesGermanLanguageTest() throws InterruptedException {
		ULCHomePageTab germanLangCourse = new ULCHomePageTab(driver);
		germanLangCourse = germanLangCourse.goToCoursesLang();
		Assert.assertTrue(germanLangCourse.langPage.isDisplayed());
		Thread.sleep(2000);
		
		germanLangCourse = new ULCHomePageTab(driver);
		germanLangCourse = germanLangCourse.goToGermanLanguage();
		Thread.sleep(2000);
		
		germanLangCourse =new ULCHomePageTab(driver);
		Assert.assertTrue(germanLangCourse.germLangImg.isDisplayed());
		Thread.sleep(2000);
		
		germanLangCourse = germanLangCourse.goToGermanLanguage();
		Thread.sleep(2000);
		
		germanLangCourse =new ULCHomePageTab(driver);
		Assert.assertTrue(germanLangCourse.germSpecPurpText.isDisplayed());
		Thread.sleep(4000);

	}
	@Test
	public void uLCCoursesRussianLanguageTest() throws InterruptedException {
		ULCHomePageTab rusLangCourse = new ULCHomePageTab(driver);
	Assert.assertTrue(rusLangCourse.langPage.isDisplayed());
	Thread.sleep(2000);
	
	rusLangCourse = new ULCHomePageTab(driver);
		Assert.assertTrue(rusLangCourse.rusLangImg.isDisplayed());
		rusLangCourse = rusLangCourse.goToRussLangImg();
		Thread.sleep(2000);
		rusLangCourse.rusLangImg.click();
		Thread.sleep(5000);
		
		rusLangCourse = new ULCHomePageTab(driver);
		Assert.assertTrue(rusLangCourse.rusLangInf.isDisplayed());
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(rusLangCourse.homeTab).perform();
		rusLangCourse.homeTab.click();		
		Thread.sleep(4000);
	}
	@Test
	public void uLCHomePageUniKidsTest() throws InterruptedException {
		ULCHomePageTab uniKidsPage = new ULCHomePageTab(driver);
		Actions actions = new Actions(driver);
		Assert.assertTrue(uniKidsPage.uniKidsImg.isDisplayed());
		actions.moveToElement(uniKidsPage.uniKidsImg).perform();
		uniKidsPage.uniKidsImg.click();	
		Thread.sleep(2000);
		
		uniKidsPage = new ULCHomePageTab(driver);
		Assert.assertTrue(uniKidsPage.uniKidsProg.isDisplayed());
		uniKidsPage = new ULCHomePageTab(driver);
		
		Assert.assertTrue(uniKidsPage.pageImg.isDisplayed());
		Thread.sleep(2000);
		
		uniKidsPage = new ULCHomePageTab(driver);
		Assert.assertTrue(uniKidsPage.puzzleImg.isDisplayed());
		Thread.sleep(5000);
		
		actions.moveToElement(uniKidsPage.homeTab).perform();
		uniKidsPage.homeTab.click();
		Thread.sleep(5000);
	}

	@Test
	public void uLCHomePageIntExamTest() throws InterruptedException {
		ULCHomePageTab intExams = new ULCHomePageTab(driver);
		Assert.assertTrue(intExams.intExamImg.isDisplayed());
		Thread.sleep(2000)
		;
		Actions actions = new Actions(driver);
		actions.moveToElement(intExams.intExamImg).perform();
		intExams.intExamImg.click();
		Thread.sleep(2000);
		
		intExams = new ULCHomePageTab(driver);
		Assert.assertTrue(intExams.germanPageImg.isDisplayed());
		Thread.sleep(2000);
		
		actions.moveToElement(intExams.homeTab).perform();
		intExams.homeTab.click();		
		Thread.sleep(4000);
	}

	@Test
	public void uLCHomePageCorpPackTest() throws InterruptedException {
		ULCHomePageTab corpPacks = new ULCHomePageTab(driver);
		Assert.assertTrue(corpPacks.corpPackImg.isDisplayed());
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(corpPacks.corpPackImg).perform();
		corpPacks.corpPackImg.click();
		Thread.sleep(2000);
		
		actions.moveToElement(corpPacks.animImgs).perform();
		Assert.assertTrue(corpPacks.animImgs.isDisplayed());
		Thread.sleep(4000);
		
		
		
	}

}
