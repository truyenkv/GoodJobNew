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
	WebElement companyMenu;
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
	//get admin list title
	@FindBy(xpath="//*[@class='manage-content']/div[1]/div")
	WebElement adminListTitle;
	//get Manage menu 
	@FindBy(xpath="//a[contains(text(),'Manage')]")
	WebElement manageBtn;
	//------------------- Define method ----------------------------	
	public String get_title_company() {
		waitABit(10000);
		return titleCompanyList.getText();
	}
	
	public void click_on_company_profile() {
		waitABit(10000);
		companyMenu.click();
	}

	public void click_on_UserProfile_option() {
		waitABit(5000);
		withAction().moveToElement(userProfile).click().perform();
	}

	public void update_First_Name(String firstName) {
		typeInto(formControlsFirstName, firstName);
	}
	
	public void update_Last_Name(String lastName) {
		typeInto(formControlsLastName, lastName);
	}

	public void clickSaveButton() {
		SaveBtn.click();
	}

	public String get_Manage_System_admin_title() {
		waitABit(5000);
		return adminListTitle.getText();
	}

	public void click_Manage_button() {
		waitABit(5000);
		manageBtn.click();
	}

	

	
	
}
