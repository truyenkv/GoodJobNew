package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class ManageAllPage extends PageObject {
//---------------- Define localtor land --------------------
	@FindBy(xpath="//*[contains(text(),'Manage Administrators')]")
	WebElement userManage;

	public void click_User_Manage_icon() {
		waitABit(5000);
		userManage.click();
	}
	
	
}
