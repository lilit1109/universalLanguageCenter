package com.web365.uLc.tab.test;

import org.testng.annotations.Test;

import com.web365.uLc.page.tab.ULCInternationalExamPage;
import com.web365.uLc.test.base.ULCBaseTest;

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
