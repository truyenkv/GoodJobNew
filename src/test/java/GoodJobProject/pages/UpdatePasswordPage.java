package GoodJobProject.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UpdatePasswordPage extends PageObject{

	private WebElementFacade createPassword;
	
	private WebElementFacade retypeCreatePassword;
	
	@FindBy(xpath="//*[contains(text(),'Next')]")
	private WebElementFacade nextBtn;
	
	
	/**
	 * Create password for account
	 * 
	 * @param password
	 */
	public void update_pass(String password) {
		createPassword.waitUntilPresent().waitUntilPresent().type(password);
		retypeCreatePassword.waitUntilPresent().waitUntilPresent().type(password);
		nextBtn.waitUntilPresent().click();
	}
	

}
