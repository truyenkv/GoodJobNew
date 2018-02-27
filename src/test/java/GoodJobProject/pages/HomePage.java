package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject{

	@FindBy(xpath="//*[@class='gj-title-text']")
	private WebElementFacade titleCompanyList;

	@FindBy(xpath="//a[@id='gj-nav-dropdown']")
	private WebElementFacade userMenu;

	@FindBy(xpath="//a[contains(text(),'User Profile')]")
	private WebElementFacade userProfile;

	private WebElementFacade formControlsFirstName;

	private WebElementFacade formControlsLastName;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElementFacade SaveBtn;

	@FindBy(xpath="//*[contains(text(),'Manage')]")
	private WebElementFacade manageBtn;
	
	@FindBy(xpath="//li[@role='presentation' and @class='selected']")
	private WebElementFacade uploadEmployBtn;
	
	@FindBy(xpath="//*[@class='col-xs-12']")
	private WebElementFacade title;
	

	public void update_First_Name(String firstName) {
		typeInto(formControlsFirstName, firstName);
	}
	
	public void update_Last_Name(String lastName) {
		typeInto(formControlsLastName, lastName);
	}

	public void click_SaveButton() {
		SaveBtn.click();
	}

	public void click_Manage_button() {
		JavascriptExecutor excutor = (JavascriptExecutor)getDriver();
		excutor.executeScript("arguments[0].click();", manageBtn);
		//manageBtn.waitUntilPresent().click();
	}

	public void click_user_menu() {
		waitABit(10000);
		userMenu.click();
	}

	public void click_profile_link() {
		waitABit(5000);
		withAction().moveToElement(userProfile).click().perform();
	}

	public String get_welcome_user_menu_text() {
		return userMenu.getText();
	}

	public String get_upload_employ_data_menu() {
		waitABit(5000);
		return uploadEmployBtn.getText();
	}

	public String get_dashboard_title() {
		waitABit(5000);
		return title.getText();
	}

	public String get_companies_title() {
		waitABit(5000);
		return title.getText();
	}

	

	
	
}
