package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class ManageUserProfilePage extends PageObject {
	
	private WebElementFacade firstNameInput;
	
	private WebElementFacade lastNameInput;
	
	private WebElementFacade formControlsEmail;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElementFacade cancelBtn;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElementFacade saveBtn;
	
	
	
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
		formControlsEmail.waitUntilPresent().type(email);
		typeInto(formControlsEmail, email);
	}
	
	
	
	
	/**
	 * Click on Save button  
	 * 
	 * @param saveBtn
	 */
	public void click_save() {
		saveBtn.waitUntilPresent().click();
	}
}
