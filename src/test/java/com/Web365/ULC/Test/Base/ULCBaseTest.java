package com.Web365.ULC.Test.Base;

import static com.Web365.ULC.Test.Base.ULCBaseTestConstants.ULC_URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class ULCBaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void openUCLPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ULC_URL);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
