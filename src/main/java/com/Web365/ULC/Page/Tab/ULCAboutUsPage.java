package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCAboutUsPageConstants.*;
public class ULCAboutUsPage extends ULCHomePage{

	public ULCAboutUsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		}
	@FindBy(xpath = ABOUTUS_TAB_ABOUTUS_XPATH)
	public WebElement aboutUsAboutUs;
	
	@FindBy(xpath = ABOUTUS_PAGE_IMAGE_XPATH)
	public WebElement aboutUsPageImg;
	
	public ULCAboutUsPage goToAboutUsAboutUs() {
		aboutUsAboutUs.click();
		return new ULCAboutUsPage(this.driver);
	}
	}

