package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class LoginPage extends PageObject {

	private WebElementFacade loginEmail; 

	private WebElementFacade loginPassword; 

	@FindBy(xpath="//button[@type='submit']") 
	private WebElementFacade loginBtn;

	@FindBy(xpath="//*[@class='gj-title-text']")
	private WebElementFacade titleCompanyList;
	
	public void input_email(String email) {
		typeInto(loginEmail, email);
	}

	public void input_password(String password) {
		typeInto(loginPassword, password);		
	}

	public void click_Login_button() {
		loginBtn.waitUntilPresent().click();		
	}
}
