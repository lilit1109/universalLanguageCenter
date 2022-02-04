package com.Web365.ULC.Page.Tab;

import static com.Web365.ULC.Page.Tab.ULCHomePageTabConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;

public class ULCHomePageTab extends ULCHomePage{
	
	

	public ULCHomePageTab(WebDriver driver) {
		super(driver);
		this.driver = driver;	
	}
 @FindBy(xpath = HOME_PAGE_UNIKIDS_XPATH)
 public WebElement uniKids;
 @FindBy(xpath = UNIKIDS_SUMMER_PROGRAM_XPATH)
 public WebElement uniKidsProg;
 @FindBy(xpath = UNIKIDS_PROGRAM_PUZZLE_IMAGE_XPATH)
 public WebElement puzzleImg;
 @FindBy(xpath = UNIKIDS_PROGRAM_PAGE_IMAGE_XPATH)
 public WebElement pageImg;
 @FindBy(xpath = RUSSIAN_LANGUAGE_IMAGE_XPATH)
 public WebElement rusLangImg;
 @FindBy(xpath = LANGUAGES_PAGE_XPATH)
 public WebElement langPage;
 @FindBy(xpath = YOUNG_LERNERS_PROGRAM_XPATH )
 public WebElement youngLernersProg;
 @FindBy(xpath = INT_EXAM_PAGE_IMAGE_XPATH)
 public WebElement intExamImg;
 @FindBy(xpath = GERMAN_PAGE_IMAGE_XPATH)
 public WebElement germanPageImg;
 @FindBy(xpath = CORPORATIVE_PACK_IMAGE_XPATH)
 public WebElement corpPackImg;
 @FindBy(xpath = ANIMATED_IMAGES_XPATH)
 public WebElement animImgs;
 
 
public ULCHomePageTab goToCoursesLang() {
	youngLernersProg.click();
	return new ULCHomePageTab(this.driver);
}
public ULCHomePageTab goToLangPage() {
	langPage.click();
	return new ULCHomePageTab(this.driver);
}
public ULCHomePageTab goToRussLangImg() {
	rusLangImg.click();
	return new ULCHomePageTab(this.driver);
}
 
 public ULCHomePageTab goToHomePageTab() {
		uniKids.click();
		return new ULCHomePageTab(this.driver);
 }
 
 public ULCHomePageTab goToUniKidsProg() {
	 uniKidsProg.click();
		return new ULCHomePageTab(this.driver);
 }
 public ULCHomePageTab goToPuzzleImg() {
	 puzzleImg.click();
		return new ULCHomePageTab(this.driver);
}
 public ULCHomePageTab goToPageImg() {
	pageImg.click();
		return new ULCHomePageTab(this.driver);
}
 public ULCHomePageTab goToIntExamImg() {
	 intExamImg.click();
			return new ULCHomePageTab(this.driver);
	}

public ULCHomePageTab goToCorpPackImg() {
	corpPackImg.click();
			return new ULCHomePageTab(this.driver);
	}
public ULCHomePageTab goToAnimImgs() {
	animImgs.click();
			return new ULCHomePageTab(this.driver);
	}

}
