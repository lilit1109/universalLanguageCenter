package com.Web365.ULC.Page.Base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ULCBasePage {
	
protected WebDriver driver;
	
	public ULCBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

}
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click();
		actions.build().perform();
	}

}
	
	

