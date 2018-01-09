package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class HomePage extends PageObject{
	//---------------- Define localtor land --------------------
	//get company title
	@FindBy(xpath="//*[@class='gj-title-text']")
	WebElement titleCompanyList;
	//get user profile menu
	@FindBy(xpath="//a[@id='gj-nav-dropdown']")
	WebElement userMenu;
	//get User Profile option
	@FindBy(xpath="//a[contains(text(),'User Profile')]")
	WebElement userProfile;
	//get First Name text
	WebElementFacade formControlsFirstName;
	//get Last Name text
	WebElementFacade formControlsLastName;
	//get Save button
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement SaveBtn;
	//get Manage menu 
	@FindBy(xpath="//a[contains(text(),'Manage')]")
	WebElement manageBtn;
	
	@FindBy(xpath="//li[@role='presentation' and @class='selected']")
	WebElement uploadEmployBtn;
	
	@FindBy(xpath="//*[@class='col-xs-12']")
	WebElement title;
	
	//------------------- Define method ----------------------------	

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
		waitABit(5000);
		manageBtn.click();
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
