package GoodJobProject.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UpdatePasswordPage extends PageObject{

	//get Password field
	WebElementFacade createPassword;
	
	//get Confirm password field
	WebElementFacade retypeCreatePassword;
	
	//get Next button
	@FindBy(xpath="//*[contains(text(),'Next')]")
	WebElement nextBtn;
	
	public void update_pass(String password) {
		typeInto(createPassword, password);
		typeInto(retypeCreatePassword, password);
		nextBtn.click();
	}
	

}
