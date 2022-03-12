package com.Web365.ULC.Page.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Web365.ULC.Page.Home.ULCHomePage;
import static com.Web365.ULC.Page.Tab.ULCCoursesPageConstants.*;

public class ULCCoursesPage extends ULCHomePage {

	public ULCCoursesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = LANGUAGES_PAGE_TAB_XPATH)
	public WebElement languageTabPg;
	@FindBy(xpath = UNIKIDS_SUMMER_PROGRAM_PAGE_TAB_XPATH)
	public WebElement unikidsPg;
	@FindBy(xpath = UNIKIDS_ENGLISH_TAB_XPATH)
	public WebElement unikidsEngl;
	@FindBy(xpath = UNIKIDS_GERMAN_TAB_XPATH)
	public WebElement unikidsGerm;
	@FindBy(xpath = UNIKIDS_FRENCH_TAB_XPATH)
	public WebElement unikidsFrch;
	@FindBy(xpath = LEVELS_PAGE_TAB_XPATH)
	public WebElement levelsTabPg;
	@FindBy(xpath = TARIFFS_PAGE_TAB_XPATH)
	public WebElement tariffsTabPg;
	@FindBy(xpath = SEMINARS_PAGE_TAB_XPATH)
	public WebElement seminarsTabPg;
	@FindBy(xpath = NEWS_PAGE_TAB_XPATH)
	public WebElement newsTabPg;

	public ULCCoursesPage goToLanguagesTabPg() {
		moveToElement(languageTabPg);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToUniKidPg() {
		moveToElement(unikidsPg);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToUniKidEnglPg() {
		moveToElement(unikidsEngl);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToUniKidGermPg() {
		moveToElement(unikidsGerm);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToUniKidFrchPg() {
		moveToElement(unikidsFrch);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToLevelsTabPg() {
		moveToElement(levelsTabPg);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToTariffsTabPg() {
		moveToElement(tariffsTabPg);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToSeminarsTabPg() {
		moveToElement(seminarsTabPg);
		return new ULCCoursesPage(this.driver);

	}

	public ULCCoursesPage goToNewsTabPg() {
		moveToElement(newsTabPg);
		return new ULCCoursesPage(this.driver);

	}

}
