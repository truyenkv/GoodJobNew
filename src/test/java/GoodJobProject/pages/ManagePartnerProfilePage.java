package GoodJobProject.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ManagePartnerProfilePage extends PageObject{
	
	private WebElementFacade partnerNameInput;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElementFacade saveBtn;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElementFacade CancelBtn;

	@FindBy(xpath="//button[contains(text(),'Add a user')]")
	private WebElementFacade addUserBtn;
	
	private WebElementFacade firstNameInput;
	
	private WebElementFacade lastNameInput;
	
	private WebElementFacade emailInput;
	

	@FindBy(xpath="//span[contains(text(),'Manager')]")
	private WebElementFacade roleOption;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-ok']")
	private WebElementFacade okIcon;
	/**
	 * Input Partner name to Partner fields.
	 * 
	 * @param partnerName
	 */
	public void input_partner_name(String partnerName) {
		partnerNameInput.waitUntilPresent().type(partnerName);
		
	}

	/**
	 * Click on Save button
	 * 
	 * @param 
	 */
	public void click_on_save_button() {
		saveBtn.waitUntilPresent().click();
	}

	
	
	/**
	 * Click on Add button to allow input user information
	 * 
	 * @param 
	 */
	public void click_add_user_button() {		
		addUserBtn.waitUntilPresent().click();
	}

	
	
	/**
	 * Let input user information and click add icon
	 * 
	 * @param 
	 * @throws AWTException 
	 */
	public void input_user_infor(String firstName, String lastName,	String email, String role) throws AWTException {
		firstNameInput.waitUntilPresent().type(firstName);
		waitABit(2000);
		lastNameInput.waitUntilPresent().type(lastName);
		waitABit(2000);
		emailInput.waitUntilPresent().type(email);
		waitABit(2000);
		Robot r = new Robot();
		if(role.equals("User"))
		{
			roleOption.click();
			waitABit(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			waitABit(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}		
		okIcon.waitUntilPresent().click();
		waitABit(3000);
	}
}
