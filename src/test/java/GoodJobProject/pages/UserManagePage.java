package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class UserManagePage extends PageObject{

	
	@FindBy(xpath="//*[@class='manage-content']/div[2]/div/button/span")
	WebElement addBtn;
	//--------------define method------------------

	public void click_On_Add_Btn() {
		waitABit(5000);
		addBtn.click();		
	}


	
}
