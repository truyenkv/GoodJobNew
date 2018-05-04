package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class ManageUserProfilePage extends PageObject {
	
	private WebElementFacade firstNameInput;
	
	private WebElementFacade lastNameInput;
	
	private WebElementFacade emailInput;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElementFacade cancelBtn;
	
//	@FindBy(xpath="//button[contains(text(),'Save')]")
//	private WebElementFacade saveBtn;
	
	@FindBy(xpath="//button[contains(text(),'Enable')]")
	private WebElementFacade enableBtn;
	
	@FindBy(xpath="//*[@class='gj-error alert alert-danger']")
	private WebElementFacade errMess;
	
	
	@FindBy(xpath="//*[@class='modal-body']")
	private WebElementFacade confirmMess;
	
	
	/**
	 * Update First Name 
	 * 
	 * @param firstName
	 */
	public void input_fist_name(String firstName) {
		firstNameInput.waitUntilPresent().type(firstName);
	}

	
	/**
	 * Update Last Name 
	 * 
	 * @param lastName
	 */
	public void input_last_name(String lastName) {
		lastNameInput.waitUntilPresent().type(lastName);
	}

	
	/**
	 * Input email 
	 * 
	 * @param email
	 */
	public void input_email(String email) {
		typeInto(emailInput, email);
	}
	
	
	
	
	/**
	 * Click on Save button  
	 * 
	 * @param saveBtn
	 */
	public void click_save() {
		Common.saveBtn.waitUntilPresent().click();
	}

	
	/**
	 * Click on Enable button for re-enable account  
	 * 
	 * @param saveBtn
	 */
	public void click_enable_button() {
		enableBtn.waitUntilPresent().click();
	}


	public String get_err_message() {
		return errMess.waitUntilPresent().getText();
	}


	public String get_confirm() {
		return confirmMess.getText();
	}


	
}
