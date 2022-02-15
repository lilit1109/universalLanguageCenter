package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCIntesolWorldwidePageConstants.*;
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
	@FindBy(xpath = ENGLISH_FOR_ACADEMIC_PURPOSES_XPATH)
	public WebElement engForAcadPurpose;
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
		tesolTeflCourses.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToEngForHospDwldBtn() {
		engHospDownload.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertificateInTEFLImage() {
		certificateInTEFLImage.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertEngGramInf() {
		engGramInf.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertificateInTEFL() {
		certificateInTEFL.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToDownloadBtn() {
		downloadTEFLInfbtn.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	
	public ULCIntesolWorldwidePage goToEsPCoursesPage() {
		espCourses.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToEngForAcadPurpose() {
		engForAcadPurpose.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToCertificateInEngGram() {
		certificateInEngGram.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToeEgForHospitality() {
		engForHospitality.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToeEgForHospInF() {
		engForHospInF.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
	public ULCIntesolWorldwidePage goToDownloadTEFLInfbtn() {
		downloadTEFLInfbtn.click();
		return new ULCIntesolWorldwidePage(this.driver);
	}
}
