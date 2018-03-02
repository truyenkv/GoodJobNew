package GoodJobProject.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ManageCompanyPage extends PageObject{

	private WebElementFacade companyNameInput;
	
	private WebElementFacade einInput;
	
	private WebElementFacade street1Input;
	
	private WebElementFacade cityInput;
	
	private WebElementFacade stateInput;
	
	private WebElementFacade postalCodeInput;
	
	private WebElementFacade firstNameInput;
	
	private WebElementFacade lastNameInput;
	
	private WebElementFacade emailInput;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElementFacade saveBtn;
	
	@FindBy(xpath="//input[@aria-activedescendant='react-select-4--value']")
	private WebElementFacade sectorDrop;
	
	@FindBy(xpath="//input[@aria-activedescendant='react-select-5--value']")
	private WebElementFacade subSectorDrop;

	@FindBy(xpath="//input[@aria-activedescendant='react-select-6--value']")
	private WebElementFacade percentageDrop;

	@FindBy(xpath="//button[contains(text(),'Add a user')]")
	private WebElementFacade addAUserBtn;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-ok']")
	private WebElementFacade okIcon;
	
	
	/**
	 * Input required fields on Manage company
	 * 
	 * @param companyName and companyIdentifier
	 */
	public void input_required_fields(String companyName, String companyIdentifier) {
		companyNameInput.waitUntilPresent().type(companyName);
		try {
			Robot r = new Robot();
			einInput.waitUntilPresent().type(companyIdentifier);
//			JavascriptExecutor excutor = (JavascriptExecutor)getDriver();
//			excutor.executeScript("arguments[0].click();", sectorDrop);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
//			sectorDrop.waitUntilPresent().click();
			waitABit(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(2000);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			waitABit(3000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
//			excutor.executeScript("arguments[0].click();", subSectorDrop);
//			subSectorDrop.click();
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(2000);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			waitABit(3000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
//			excutor.executeScript("arguments[0].click();", percentageDrop);
//			percentageDrop.click();
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(2000);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


	/**
	 * Input location value 
	 * 
	 * @param address, city, state, zip
	 */
	public void input_location_value(String address, String city, String state,	String zip) {	
		street1Input.waitUntilPresent().type(address);
		cityInput.waitUntilPresent().type(city);
		stateInput.waitUntilPresent().type(state);
		postalCodeInput.waitUntilPresent().type(zip);
	}


	/**
	 * click on save button to save location value.
	 * 
	 * @param save
	 */
	public void click_Save_button() {
		saveBtn.waitUntilPresent().click();
	}


	/**
	 * Select add user to user list
	 * 
	 * @param firstName, lastName, email
	 */
	public void add_user(String firstName, String lastName, String email) {	
		addAUserBtn.waitUntilPresent().click();
		firstNameInput.waitUntilPresent().type(firstName);
		lastNameInput.waitUntilPresent().type(lastName);
		emailInput.waitUntilPresent().type(email);
		waitABit(2000);
		okIcon.waitUntilPresent().click();		
	}


}
