package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class UserManagePage extends PageObject{

	
	//--------------define locator--------------
	//get user account
	@FindBy(xpath="")
	WebElement userAccount;

	
	//--------------define method------------------
	public void open_user_detail(String user) {
		userAccount.c
	}

}
