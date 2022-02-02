package com.Web365.ULC.Tab.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web365.ULC.Page.Home.ULCHomePage;
import com.Web365.ULC.Page.Tab.ULCAboutUsPage;
import com.Web365.ULC.Page.Tab.ULCContactsPage;
import com.Web365.ULC.Page.Tab.ULCCorporatePacksPage;
import com.Web365.ULC.Page.Tab.ULCInternationalExamPage;
import com.Web365.ULC.Page.Tab.ULCIntesolWorldwidePage;
import com.Web365.ULC.Test.Base.ULCBaseTest;

public class ULCTabTest extends ULCBaseTest {
	
	@Test
	public void universalLanguageCenterPageTest() throws InterruptedException {
		
		ULCHomePage home = new ULCHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.homeTab.isDisplayed());
		
		
		ULCAboutUsPage aboutUs = home.goToAboutUs();
		Assert.assertTrue(aboutUs.aboutUsAboutUs.isDisplayed());
		Thread.sleep(5000);
		
		aboutUs.aboutUsAboutUs.click();
		Thread.sleep(5000);
		Assert.assertTrue(aboutUs.aboutUsPageImg.isDisplayed());
	
		
		ULCCorporatePacksPage corpPack = home.goToCorporatePacks();		
		Assert.assertTrue(corpPack.pdfFile.isDisplayed());
		
		corpPack.pdfFile.click();
		Thread.sleep(5000);
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(5000);
		
						
		ULCInternationalExamPage intExam = home.goToInternationalExam();
		Assert.assertTrue(intExam.intExamPage.isDisplayed());
		Thread.sleep(5000);
		
		
		 ULCIntesolWorldwidePage intWorld = home.goToIntesolWorldwide();
		Assert.assertTrue(intWorld.tesolTeflCourses.isDisplayed());
		
		intWorld.tesolTeflCourses.click();
		Thread.sleep(1000);
		Assert.assertTrue(intWorld.certificateInTEFL.isDisplayed());
		Thread.sleep(1000);
		
		intWorld.certificateInTEFL.click();		
		Assert.assertTrue(intWorld.certificateInTEFLImage.isDisplayed());
		
		intWorld.certificateInTEFLImage.click();
		Thread.sleep(1000);
		
		Assert.assertTrue(intWorld.downloadTEFLInfbtn.isDisplayed());
		intWorld.downloadTEFLInfbtn.click();
		Thread.sleep(1000);
		
		ArrayList<String> tefltabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tefltabs2.get(1));
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(tefltabs2.get(0));
		Thread.sleep(1000);
	
		Assert.assertTrue(home.intesolWorldwideTab.isDisplayed());
		home.intesolWorldwideTab.click();		
		Thread.sleep(1000);
		
		ULCIntesolWorldwidePage interWorld = home.goToIntesolWorldwide();
		Assert.assertTrue(interWorld.espCourses.isDisplayed());
		Thread.sleep(5000);
		
		interWorld.espCourses.click();
		Thread.sleep(1000);
		
		Assert.assertTrue(interWorld.engForHospitality.isDisplayed());
		
		interWorld.engForHospitality.click();
		Thread.sleep(2000);	
		
		Assert.assertTrue(interWorld.engForHospInF.isDisplayed());
		Thread.sleep(2000);	
		Actions actions= new Actions(driver);
		WebElement btn= driver.findElement(By.xpath("//div[@class='tesol-text']//h5[text()='English for Hospitality ']//span[@class='fa fa-download']"));
		actions.moveToElement(btn).perform();
		Thread.sleep(2000);
		btn.click();
		
		ArrayList<String> esptabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(esptabs.get(1));
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(esptabs.get(0));
		Thread.sleep(2000);
			
		ULCContactsPage contacts = home.goToContacts();
		Assert.assertTrue(contacts.contactUs.isDisplayed());
		Thread.sleep(2000);
		
		contacts.fillName("Lilit Todorova");
		Thread.sleep(4000);
		
		contacts.fillMessage("Feel free to get in touch with us if you have any questions");
		Thread.sleep(2000);
		
		Assert.assertTrue(contacts.sbmitBtn.isDisplayed());
		contacts.sbmitBtn.click();
		Thread.sleep(10000);
		
		//Assert.assertTrue(contacts.contactInf.isDisplayed());		
		//Thread.sleep(1000);
		//Assert.assertTrue(contacts.contactUs.isDisplayed());
		
		Assert.assertTrue(contacts.summaryErrors.isDisplayed());
		Thread.sleep(5000);



	}

}
