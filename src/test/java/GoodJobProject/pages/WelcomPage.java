package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class WelcomPage extends PageObject{

	//get Create An Account button
	@FindBy(xpath="//*[contains(text(),'Create an account')]")
	WebElement createAccountBtn;
	
	public void click_Create_An_Account_button() {
		waitABit(5000);
		createAccountBtn.click();
	}
}
