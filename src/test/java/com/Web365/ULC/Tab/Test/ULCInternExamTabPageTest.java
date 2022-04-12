package com.Web365.ULC.Tab.Test;

import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCInternationalExamPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCInternExamTabPageTest extends ULCBaseTest {
	@Test
	public void uLCInternExamTabTest() throws InterruptedException {
		ULCInternationalExamPage intExamTabPage = new ULCInternationalExamPage(driver);
		System.out.println("The Home page is opened, and the International Exam tab is displayed");
		intExamTabPage = intExamTabPage.goToInternationalExamTab();
		Thread.sleep(4000);
		
		System.out.println("The International Exam information page is opened");
		intExamTabPage = intExamTabPage.goToInternExamPage();
		Thread.sleep(4000);
		
		System.out.println("The International Exam TOEFL exam information is displayed");
		intExamTabPage = intExamTabPage.goToIntExamToeflInf();
		Thread.sleep(4000);
		
		intExamTabPage.goToHomeTab();
		Thread.sleep(4000);
	}
}
