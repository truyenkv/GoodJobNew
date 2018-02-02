package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ManagePartnerPage extends PageObject{

	@FindBy(xpath="//button[contains(text(),'Add Partner')]")
	private WebElementFacade addPartBtn;
	
	
	/**
	 * Click on Add Partner
	 * 
	 * @param managePartnerBtn
	 */
	public void click_add_button() {
		addPartBtn.waitUntilPresent().click();
	}

}
