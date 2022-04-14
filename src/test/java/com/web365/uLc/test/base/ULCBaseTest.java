package com.web365.uLc.test.base;

import static com.web365.uLc.test.base.ULCBaseTestConstants.ULC_URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.web365.uLc.page.home.ULCHomePage;



public class ULCBaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void openUCLPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ULC_URL);
	ULCHomePage home = new ULCHomePage(driver);
		home = home.goToLogo();
		Assert.assertTrue(home.homeTab.isDisplayed());
		
		}
		
		

	
	@AfterClass
	public void tearDown() throws InterruptedException {
		driver.close();
		driver.quit();
		Thread.sleep(2000);
	}
	

}
