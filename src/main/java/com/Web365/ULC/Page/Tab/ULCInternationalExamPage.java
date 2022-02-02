package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCInternationalExamPageConstants.*;

public class ULCInternationalExamPage extends ULCHomePage{

	public ULCInternationalExamPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@FindBy(xpath= INTERN_EXAMS_PAGE_XPATH)
	public WebElement intExamPage;
	
	}
