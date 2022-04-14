package com.web365.uLc.page.tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.web365.uLc.page.home.ULCHomePage;
import static com.web365.uLc.page.tab.ULCIntesolWorldwidePageConstants.*;

import java.util.ArrayList;
public class ULCIntesolWorldwidePage extends ULCHomePage{

	public ULCIntesolWorldwidePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@FindBy(xpath = TESOL_TEFL_COURSES_XPATH)
	public WebElement tesolTeflCourses;
	@FindBy(xpath = CERTIFICATE_IN_TEFL_XPATH)
	public WebElement certificateInTEFL;
	@FindBy(xpath = CERTIFICATE_IN_TEFL_IMAGE_XPATH)
	public WebElement certificateInTEFLImage;
	@FindBy(xpath = CERTIFICATE_IN_TEFL_DOWNLOAD_XPATH)
	public WebElement downloadTEFLInfbtn;
	
	@FindBy(xpath = ESP_COURSES_XPATH)
	public WebElement espCourses;
	@FindBy(xpath = ESP_COURSES_PAGE_COURSES_XPATH)
	public WebElement espCoursesPgCourses;
	@FindBy(xpath = ENGLISH_FOR_ACADEMIC_PURPOSES_XPATH)
	public WebElement engForAcadPurpose;
	@FindBy(xpath = ENGLISH_FOR_ACADEMIC_PURPOSES_BUTTON_XPATH)
	public WebElement engForAcadPurposeBtn;
	@FindBy(xpath = CERTIFICATE_IN_ENGLISH_GRAMMAR_XPATH)
	public WebElement certificateInEngGram;
	@FindBy(xpath = CERTIFICATE_IN_ENGLISH_GRAMMAR_INFORMATION_XPATH)
	public WebElement engGramInf;
	
	@FindBy(xpath = ENGLISH_FOR_HOSPITALITY_XPATH)
	public WebElement engForHospitality;
	@FindBy(xpath = ENGLISH_FOR_HOSPITALITY_INFOR_XPATH)
	public WebElement engForHospInF;
	@FindBy(xpath = ENGLISH_FOR_HOSPITALITY_DOWNLOAD_XPATH)
	public WebElement engHospDownload;
	
	public ULCIntesolWorldwidePage goToTesolTeflCoursesPage() {
		moveToElement(tesolTeflCourses);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToEngForHospDwldBtn() {
		moveToElement(engHospDownload);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertificateInTEFLImage() {
		moveToElement(certificateInTEFLImage);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertEngGramInf() {
		moveToElement(engGramInf);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertificateInTEFL() {
		moveToElement(certificateInTEFL);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToDownloadBtn() {
		moveToElement(downloadTEFLInfbtn);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	
	public ULCIntesolWorldwidePage goToEsPCoursesPage() {
		moveToElement(espCourses);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToEsPCoursesPageCourses() {
		moveToElement(espCoursesPgCourses);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToEngForAcadPurpose() {
		moveToElement(engForAcadPurpose);
		ArrayList<String> tabs= new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		driver.close();
	    driver.switchTo().window(tabs.get(0));
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToEngForAcadPurposeBtn() {
		moveToElement(engForAcadPurposeBtn);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertificateInEngGram() {
		moveToElement(certificateInEngGram);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToeEgForHospitality() {
		moveToElement(engForHospitality);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToeEgForHospInF() {
		moveToElement(engForHospInF);
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToDownloadTEFLInfbtn() {
		//moveToElement(downloadTEFLInfbtn);
		downloadTEFLInfbtn.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
}
