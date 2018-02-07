package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class ManagePage extends PageObject {
	
	@FindBy(xpath="//*[contains(text(),'Manage Administrators')]")
	private WebElementFacade manageAdminBtn;

	@FindBy(xpath="//*[contains(text(),'Manage Partners')]")
	private WebElementFacade managePartnerBtn;
	
	@FindBy(xpath="//span[contains(text(),'Manage Companies')]")
	private WebElementFacade manageCompanyBtn;

	
	/**
	 * Click on Manage Partners menu
	 * 
	 * @param managePartnerBtn
	 */
	public void click_open_Manage_Partners() {
		managePartnerBtn.waitUntilPresent().click();
	}

	/**
	 * Click on Manage Administrators menu
	 * 
	 * @param manageAdminBtn;
	 */
	public void click_on_manage_administrator_button() {
		manageAdminBtn.waitUntilPresent().click();
	}


	



	
}
