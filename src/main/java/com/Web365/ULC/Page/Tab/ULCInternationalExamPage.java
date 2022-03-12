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
	@FindBy(xpath= INTERN_EXAMS_TOEFL_INFO_XPATH)
	public WebElement intExamToefl;
	
	
	public ULCInternationalExamPage goToInternExamPage() {
	moveToElement(intExamPage);
	return new ULCInternationalExamPage(this.driver);	
	}
	public ULCInternationalExamPage goToIntExamToeflInf() {
		moveToElement(intExamToefl);
	return new ULCInternationalExamPage(this.driver);
		
	}
	
	
	
	}
