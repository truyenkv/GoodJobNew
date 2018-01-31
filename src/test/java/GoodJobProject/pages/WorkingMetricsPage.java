package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class WorkingMetricsPage extends PageObject{

	@FindBy(xpath="//*[contains(text(),'Create an account')]")
	private WebElementFacade createAccountBtn;
	
	/**
	 * Click on Create An Account button
	 * 
	 * @param createAccountBtn 
	 */
	public void click_create_an_account_button() {
		createAccountBtn.waitUntilPresent().click();
	}
}
