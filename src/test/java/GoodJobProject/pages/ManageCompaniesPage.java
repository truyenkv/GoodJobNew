package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ManageCompaniesPage extends PageObject{

	@FindBy(xpath="//button[contains(text(),'Add Company')]")
	private WebElementFacade addComBtn;
	
	
	/**
	 * Click on Add Company button
	 * 
	 * @param addComBtn
	 */
	public void click_Add_Company_button() {
		addComBtn.waitUntilPresent().click();
	}
	

}
