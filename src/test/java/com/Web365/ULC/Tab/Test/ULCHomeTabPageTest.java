package com.Web365.ULC.Tab.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		WebElement hoverBtn = driver.findElement(By.xpath("//div[@class='cont-animation']//a[@href='/Home/Courses']"));
		actions.moveToElement(hoverBtn).perform();
		hoverBtn.click();
		Thread.sleep(2000);
		Assert.assertTrue(home.langPage.isDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(home.rusLangImg.isDisplayed());
		Thread.sleep(2000);
		home.rusLangImg.click();
		Thread.sleep(5000);
		Assert.assertFalse(home.youngLernersProg.isDisplayed());
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement hoverBtn1 = driver.findElement(By.xpath("//img[@src='/img/iconn1.jpg']"));
		actions1.moveToElement(hoverBtn1).perform();
		hoverBtn1.click();
		Assert.assertTrue(home.youngLernersProg.isDisplayed());
		Thread.sleep(5000);
	}

	@Test
	public void uLCHomePageUniKidsTest() throws InterruptedException {

		ULCHomePageTab home = new ULCHomePageTab(driver);
		home.logoClick();
		Actions actions2 = new Actions(driver);
		WebElement hoverBtn2 = driver.findElement(By.xpath("//div//a[@href='/Home/English' and text()='Show more']"));
		actions2.moveToElement(hoverBtn2).perform();
		hoverBtn2.click();
		Assert.assertTrue(home.uniKidsProg.isDisplayed());
		Actions img = new Actions(driver);
		WebElement img1 = driver.findElement(By.xpath("//img[@src='/img/ulc_gallery25.jpg']"));
		img.moveToElement(img1).perform();
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
		WebElement hoverBtn3 = driver.findElement(By.xpath("//div[@class='cont-animation']//a[@href='/Home/Examin']"));
		actions3.moveToElement(hoverBtn3).perform();
		hoverBtn3.click();
		Thread.sleep(5000);
		Assert.assertTrue(home.germanPageImg.isDisplayed());
		Thread.sleep(5000);
}

@Test
	public void uLCHomePageCorpPackTest() throws InterruptedException {

	ULCHomePageTab home = new ULCHomePageTab(driver);
	home.logoClick();
	Actions actions4 = new Actions(driver);
	WebElement hoverBtn4 = driver.findElement(By.xpath("//div[@class='cont-animation']//a[@href='/Home/Corporate']"));
	actions4.moveToElement(hoverBtn4).perform();
	Thread.sleep(5000);
	hoverBtn4.click();
	Thread.sleep(5000);
	Assert.assertTrue(home.animImgs.isDisplayed());
	Thread.sleep(5000);
}
		
}
