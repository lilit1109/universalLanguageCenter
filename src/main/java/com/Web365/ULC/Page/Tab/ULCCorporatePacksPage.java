package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCCorporatePacksPageConstants.*;
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
		pdfFile.click();
		return new ULCCorporatePacksPage(this.driver);
 }
public ULCCorporatePacksPage goToSlideMap() {
		slideMap.click();
		return new ULCCorporatePacksPage(this.driver);
 }
public ULCCorporatePacksPage goToSlideMapeItem() {
	slideMapItemSkil.click();
		return new ULCCorporatePacksPage(this.driver);
 }

}
