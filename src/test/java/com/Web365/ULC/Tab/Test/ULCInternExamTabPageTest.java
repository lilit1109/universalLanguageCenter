package com.Web365.ULC.Tab.Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Tab.ULCInternationalExamPage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCInternExamTabPageTest extends ULCBaseTest{
	@Test
	public void uLCInternExamTabTest() throws InterruptedException {
		ULCInternationalExamPage intExamTabPage= new ULCInternationalExamPage(driver);
		intExamTabPage = intExamTabPage.goToInternationalExamTab();
		Assert.assertTrue(intExamTabPage.internationalExamsTab.isDisplayed());	
		intExamTabPage.internationalExamsTab.click();
			Thread.sleep(4000);
			Actions action = new Actions(driver);
			action.moveToElement(intExamTabPage.intExamPage).perform();
		Assert.assertTrue(intExamTabPage.intExamToefl.isDisplayed());	
			Thread.sleep(4000);
	}
}
