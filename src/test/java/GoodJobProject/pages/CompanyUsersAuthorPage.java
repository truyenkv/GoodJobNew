package GoodJobProject.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompanyUsersAuthorPage extends PageObject{
	
	@FindBy(xpath="//*[@class='rt-tr-group'][last()]/div/div[1]/input")
	private WebElementFacade firstnameField;
	
	@FindBy(xpath="//*[@class='rt-tr-group'][last()]/div/div[2]/input")
	private WebElementFacade lastnameField;
	
	@FindBy(xpath="//*[@class='rt-tr-group'][last()]/div/div[3]/input")
	private WebElementFacade emailField;
	
	@FindBy(xpath="//button[contains(text(),'Add a user')]")
	private WebElementFacade addAUser;
	

	
	@FindBy(xpath="//span[contains(text(),'Manager')]")
	private WebElementFacade roleOption;
	
	public void add_new_users(String firstName, String lastName, String email) {
		waitABit(2000);
		addAUser.waitUntilPresent().click();
		firstnameField.waitUntilPresent().sendKeys(firstName);
		lastnameField.waitUntilPresent().sendKeys(lastName);
		emailField.waitUntilPresent().sendKeys(email);
		Robot r;
		try {
			r = new Robot();
			roleOption.click();
			waitABit(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			waitABit(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Common.okIcon.waitUntilPresent().click();		
	}


	public void click_on_next_button() {
		Common.nextBtn.waitUntilPresent().click();
		
	}
	
	
}
