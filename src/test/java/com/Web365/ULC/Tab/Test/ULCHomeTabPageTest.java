package com.Web365.ULC.Tab.Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Test.Base.ULCBaseTest;
import com.Web365.ULC.Page.Tab.ULCHomePageTab;

public class ULCHomeTabPageTest extends ULCBaseTest {

	@Test
	public void uLCHomePageCoursesTest() throws InterruptedException {
		ULCHomePageTab home = new ULCHomePageTab(driver);
		home.logoClick();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(home.coursesImg).perform();
		home.coursesImg.click();
		Thread.sleep(2000);
		Assert.assertTrue(home.langPage.isDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(home.rusLangImg.isDisplayed());
		Thread.sleep(2000);
		home.rusLangImg.click();
		Thread.sleep(5000);
		Assert.assertFalse(home.youngLernersProg.isDisplayed());
		Thread.sleep(5000);
		//Actions actions1 = new Actions(driver);
		//WebElement hoverBtn1 = driver.findElement(By.xpath("//img[@src='/img/iconn1.jpg']"));
		actions.moveToElement(home.rusLangImg).perform();
		home.rusLangImg.click();
		Assert.assertFalse(home.youngLernersProg.isDisplayed());
		Thread.sleep(5000);
	}

	@Test
	public void uLCHomePageUniKidsTest() throws InterruptedException {

		ULCHomePageTab home = new ULCHomePageTab(driver);
		home.logoClick();
		Actions actions1 = new Actions(driver);
		//WebElement hoverBtn2 = driver.findElement(By.xpath("//div//a[@href='/Home/English' and text()='Show more']"));
		actions1.moveToElement(home.uniKids).perform();
		home.uniKids.click();
		Assert.assertTrue(home.uniKidsProg.isDisplayed());
		actions1.moveToElement(home.uniKidsProg).perform();
		Assert.assertTrue(home.puzzleImg.isDisplayed());
		Thread.sleep(5000);
		Assert.assertTrue(home.pageImg.isDisplayed());
		Thread.sleep(5000);

	}
	
@Test
	public void uLCHomePageIntExamTest() throws InterruptedException {

		ULCHomePageTab home = new ULCHomePageTab(driver);
		home.logoClick();
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(home.intExamImg).perform();
		home.intExamImg.click();
		Thread.sleep(5000);
		Assert.assertTrue(home.germanPageImg.isDisplayed());
		Thread.sleep(5000);
}

@Test
	public void uLCHomePageCorpPackTest() throws InterruptedException {

	ULCHomePageTab home = new ULCHomePageTab(driver);
	home.logoClick();
	Actions actions4 = new Actions(driver);
	actions4.moveToElement(home.corpPackImg).perform();
	Thread.sleep(5000);
	home.corpPackImg.click();
	Thread.sleep(5000);
	Assert.assertTrue(home.animImgs.isDisplayed());
	Thread.sleep(5000);
}
		
}
