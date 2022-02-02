package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCContactPageConstants.*;
public class ULCContactsPage extends ULCHomePage {

	public ULCContactsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;		
	}
	
	@FindBy(xpath = CONTACT_US_XPATH)
	public WebElement contactUs;
	
	@FindBy(xpath = CONTACTS_PAGE_NAME_INPUT_XPATH)
	public WebElement inputName; 
	
	@FindBy(xpath = CONTACTS_PAGE_MESSAGE_INPUT_XPATH)
	public WebElement inputMessage; 
	
	@FindBy(xpath = CONTACTS_PAGE_SBMIT_BUTTON_XPATH)
	public WebElement sbmitBtn; 
	
	@FindBy(xpath = CONTACTS_PAGE_CONTACT_INF_XPATH)
	public WebElement contactInf; 
	
	@FindBy(xpath = CONTACTS_PAGE_SUMMARY_ERRORS_XPATH)
	public WebElement summaryErrors; 
	
	public ULCContactsPage goToContacts() {
		contactUs.click();
		return new ULCContactsPage(this.driver);
	}

	public void fillName(String name) {
		inputName.sendKeys(name);
		
	}
	public void fillMessage(String message) {
		inputMessage.sendKeys(message);
		
	}
	public ULCContactsPage goToSbmitbtn() {
		sbmitBtn.click();
		return new ULCContactsPage(this.driver);
		
	}
	public ULCContactsPage goToContactInf() {
		contactInf.click();
		return new ULCContactsPage(this.driver);
		
	}
	public ULCContactsPage goToSummaryErrors() {
		summaryErrors.click();
		return new ULCContactsPage(this.driver);
		
	}
}
