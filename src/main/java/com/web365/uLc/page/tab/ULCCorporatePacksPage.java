package com.web365.uLc.page.tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.uLc.page.home.ULCHomePage;
import static com.web365.uLc.page.tab.ULCCorporatePacksPageConstants.*;
public class ULCCorporatePacksPage extends ULCHomePage{

	public ULCCorporatePacksPage(WebDriver driver) {
		super(driver);
		this.driver = driver;	
	}
 @FindBy(xpath = CORP_PACK_PAGE_PDF_XPATH)
 public WebElement pdfFile;
 @FindBy(xpath = CORP_PACK_SLIDE_MAP_XPATH)
 public WebElement slideMap;
 @FindBy(xpath = CORPPACK_SLIDE_MAP_ITEM_SKIL_XPATH)
 public WebElement slideMapItemSkil;
 
 public ULCCorporatePacksPage goToPDFbtn() {
		moveToElement(pdfFile);
		return new ULCCorporatePacksPage(this.driver);
 }
public ULCCorporatePacksPage goToSlideMap() {
		moveToElement(slideMap);
		return new ULCCorporatePacksPage(this.driver);
 }
public ULCCorporatePacksPage goToSlideMapeItem() {
	moveToElement(slideMapItemSkil);
		return new ULCCorporatePacksPage(this.driver);
 }

}
