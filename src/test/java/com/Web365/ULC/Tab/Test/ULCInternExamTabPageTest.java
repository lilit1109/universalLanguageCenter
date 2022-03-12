package com.Web365.ULC.Tab.Test;

import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCInternationalExamPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCInternExamTabPageTest extends ULCBaseTest{
	@Test
	public void uLCInternExamTabTest() throws InterruptedException {
		ULCInternationalExamPage intExamTabPage= new ULCInternationalExamPage(driver);
		intExamTabPage.goToInternationalExamTab();
			Thread.sleep(4000);
			intExamTabPage.goToInternExamPage();
			Thread.sleep(4000);
		intExamTabPage.goToIntExamToeflInf();	
			Thread.sleep(4000);
			intExamTabPage.goToHomeTab();
	}
}
