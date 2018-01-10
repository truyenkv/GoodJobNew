package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class EmailPage extends PageObject{
	//get email text field
	WebElementFacade login;
	
	//get check inbox button
	@FindBy(xpath="//input[@value='Check Inbox']")
	WebElement checkInboxBtn;
	
	//get Get Start button
	@FindBy(xpath="//a[contains(text(),'Get Started')]")
	WebElement getStartBtn;
	
	
	public void input_email(String emailConfirm) {
		typeInto(login, emailConfirm);		
		checkInboxBtn.click();
	}


	public void click_getstart_btn() {
		getStartBtn.click();
	}

}
