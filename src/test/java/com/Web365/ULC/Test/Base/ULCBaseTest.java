package com.Web365.ULC.Test.Base;

import static com.Web365.ULC.Test.Base.ULCBaseTestConstants.ULC_URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Web365.ULC.Page.Home.ULCHomePage;



public class ULCBaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void openUCLPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ULC_URL);
	ULCHomePage home = new ULCHomePage(driver);
		home.goToLogo();
		Assert.assertTrue(home.homeTab.isDisplayed());
		
		}
		
		

	
	@AfterClass
	public void tearDown() throws InterruptedException {
		driver.close();
		driver.quit();
		Thread.sleep(5000);
	}
	

}
