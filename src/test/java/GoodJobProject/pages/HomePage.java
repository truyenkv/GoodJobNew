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
	@FindBy(xpath="//*[@id='gj-nav-dropdown']")
	WebElement companyMenu;
	//get User Profile option
	@FindBy(xpath="//a[contains(text(),'User Profile')]]")
	WebElement userProfile;
	//get First Name text
	WebElementFacade formControlsFirstName;
	//get Save button
	@FindBy(xpath="//button[@type='button']")
	WebElement SaveBtn;
	//get admin list title
	@FindBy(xpath="//*[@class='gj-title-admin']")
	WebElement adminListTitle;
	//------------------- Define method ----------------------------	
	public String get_title_company() {
		waitABit(10000);
		return titleCompanyList.getText();
	}
	
	public void click_on_company_profile() {
		waitABit(5000);
		companyMenu.click();
	}

	public void click_on_UserProfile_option() {
		withAction().moveToElement(userProfile).click().perform();
	}

	public void update_First_Name(String firstName) {
		typeInto(formControlsFirstName, firstName);
	}

	public void clickSaveButton() {
		SaveBtn.click();
	}

	public String get_Manage_System_admin_title() {
		return adminListTitle.getText();
	}

	
	
}
