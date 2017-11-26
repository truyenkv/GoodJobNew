package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class LoginPage extends PageObject {

	//---------------- Define localtor land --------------------
	
	//get email's locator
	WebElementFacade loginEmail; 
	//get password's locator
	WebElementFacade loginPassword; 
	//get login's locator
	@FindBy(xpath="//button[@type='submit']") 
	WebElement loginBtn;
	//get company list title 
	@FindBy(xpath="//*[@class='gj-title-text']")
	WebElement titleCompanyList;
	
	//------------------- Define method ----------------------------
	public void input_email(String email) {
		typeInto(loginEmail, email);
	}

	public void input_password(String password) {
		typeInto(loginPassword, password);		
	}

	public void click_Login_button() {
		loginBtn.click();		
	}

//	public String get_title_Com() {
//		waitABit(10000);
//		return titleCompanyList.getText();
//	}

}
