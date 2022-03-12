package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Test.Base.ULCBaseTest;
import com.Web365.ULC.Page.Tab.ULCHomePageTab;

public class ULCHomeTabPageTest extends ULCBaseTest {

	@Test
	public void uLCHomePageRegisterTest() throws InterruptedException {
		ULCHomePageTab register = new ULCHomePageTab(driver);
		System.out.println("Go to the Home page, find the Register button and click on it.");
		register.goToRegisterBtn();
		System.out.println("Switch to the new page.");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(4000);
		System.out.println("Click on the Sign-in blue string and open for sign-in page.");
		register.goToTestPageSignIn();
		Thread.sleep(4000);
		System.out.println("Switch to the new page.");
		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		System.out.println("Make sure that the Google Sign-in page is opened.");
		Assert.assertTrue(register.googleSignInPage.isDisplayed());
		Thread.sleep(1000);
		System.out.println("On the Google Sign-in page, type and fill in the personal information on the field.");
		register.fillname("lilit");
		Thread.sleep(1000);
		System.out.println("Click on the Next button.");
		register.goToSignInNextBtn();
		Thread.sleep(1000);
		System.out.println("Click on the Create Account button.");
		register.goToSignInCreateAccount();
		Thread.sleep(1000);
		register.goToSignInCreateAccount();
		System.out.println("Click on the Create Account for My Self button.");
		register.goToCrAccForMySelf();
		Thread.sleep(1000);
		System.out.println("Switch to the home page.");
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);
	}

	@Test
	public void uLCHomePageCoursesTest() throws InterruptedException {
		ULCHomePageTab coursesPage = new ULCHomePageTab(driver);
		System.out.println("The Home page is opened, and the Courses Image is displayed.");
		coursesPage.goToCoursesImg();
		Thread.sleep(4000);
		System.out.println("Click on the Courses image and make sure the Courses Language is displayed.");
		coursesPage.goToCoursesLang();
		System.out.println("The Courses Language Information is opened. Make sure the ESP information is displayed.");
		coursesPage.goToESPText();
		Thread.sleep(4000);
	}

	@Test
	public void uLCCoursesGermanLanguageTest() throws InterruptedException {
		ULCHomePageTab germanLangCourse = new ULCHomePageTab(driver);
		System.out.println("The Courses Language page is opened.");
		Thread.sleep(2000);
		System.out.println("Go to the German language image on the Courses Language page and click on it.");
		germanLangCourse.goToGermanLanguage();
		Thread.sleep(2000);
		System.out.println("Make sure that the german specific purpose text is displayed.");
//		germanLangCourse.goToGermanText();
		Thread.sleep(2000);
//		System.out.println("Return the Courses Language page.");
//		germanLangCourse.goToCoursesLang();
	}

	@Test
	public void uLCCoursesRussianLanguageTest() throws InterruptedException {
		ULCHomePageTab rusLangCourse = new ULCHomePageTab(driver);
		System.out.println("The Courses Language page is opened.");
		Thread.sleep(2000);
		System.out.println("Go to the Russian language image on the Courses Language page and click on it.");
		rusLangCourse.goToRussLangImg();
		Thread.sleep(2000);
		System.out.println("Make sure that the german specific purpose text is displayed.");
		rusLangCourse.goToRussLangInf();
		Thread.sleep(5000);
		System.out.println("Return to the Home page.");
		rusLangCourse.goToHomeTab();
		Thread.sleep(4000);
	}

	@Test
	public void uLCHomePageUniKidsTest() throws InterruptedException {
		ULCHomePageTab uniKidsPage = new ULCHomePageTab(driver);
		System.out.println("The Home page is opened, and the UniKids Image is displayed.");
		uniKidsPage.goToHomePageUniKidsTab();
		Thread.sleep(2000);
		System.out.println("UniKids page is opened and the UniKids program is displayed.");
		uniKidsPage.goToUniKidsProg();
		Thread.sleep(2000);
		System.out.println("The UniKids page Image is  displayed.");
		uniKidsPage.goToPageImg();
		Thread.sleep(2000);
		System.out.println("The UniKids page puzzle Image is  displayed.");
		uniKidsPage.goToPuzzleImg();
		Thread.sleep(2000);
	}

	@Test
	public void uLCHomePageIntExamTest() throws InterruptedException {
		ULCHomePageTab intExams = new ULCHomePageTab(driver);
		System.out.println("The Home page is opened, and the International Exam Image is displayed.");
		Thread.sleep(2000);
		intExams.goToHomeTab();
		System.out.println("Click in the International Exam Image and open the page.");
		intExams.goToIntExamImg();
		Thread.sleep(2000);
		System.out.println("The International Exam page is opendand German page image is displayed.");
		intExams.goToGermanText();
		Thread.sleep(2000);
				
	}

	@Test
	public void uLCHomePageCorpPackTest() throws InterruptedException {
		ULCHomePageTab corpPacks = new ULCHomePageTab(driver);
		System.out.println("The Home page is displayed.");
		corpPacks.goToHomeTab();
		Thread.sleep(2000);
		System.out.println("Click in the Corporate Packs Image and open the page.");
		corpPacks.goToCorpPackImg();
		Thread.sleep(2000);
		System.out.println("The Corporate Packs page is opendand and animated images are displayed.");
		Thread.sleep(4000);
		System.out.println("Return the Home page.");
		corpPacks.goToHomeTab();

	}

}
