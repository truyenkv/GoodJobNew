package GoodJobProject.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompanyInformationAuthorPage extends PageObject{
	
	private WebElementFacade companyNameInput;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElementFacade nextBtn;

	public void update_information() {
		companyNameInput.waitUntilPresent().click();
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			waitABit(1000);
			r.keyRelease(KeyEvent.VK_TAB);
			//focus Business Type
			waitABit(3000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(1000);
			r.keyRelease(KeyEvent.VK_DOWN);
			waitABit(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//choosing Business Type
			waitABit(3000);
			r.keyPress(KeyEvent.VK_TAB);
			waitABit(1000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			// focus Sector / Industry
			waitABit(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			waitABit(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
//			// chossing Sector / Industry
			waitABit(3000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
//			// focus sub Sector
			waitABit(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			waitABit(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			waitABit(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
//			// chossing sub Sector
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitABit(3000);
		nextBtn.waitUntilPresent().click();
		
	}
	
	
	
}
