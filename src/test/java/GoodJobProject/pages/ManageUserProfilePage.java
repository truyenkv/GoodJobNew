package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class ManageUserProfilePage extends PageObject {
	//get fist name
	WebElementFacade formControlsFirstName;
	//get last name
	WebElementFacade formControlsLastName;
	//get email
	WebElementFacade formControlsEmail;
	//get cancel button
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement cancelBtn;
	//get save button
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveBtn;
	
	
	// ------------- define method -------------------------
	public void input_fist_name(String firstName) {
		typeInto(formControlsFirstName, firstName);	
	}

	public void input_last_name(String lastName) {
		typeInto(formControlsLastName, lastName);
	}

	public void input_email(String email) {
		typeInto(formControlsEmail, email);
	}

	public void click_save() {
		saveBtn.click();
	}
}
