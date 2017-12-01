package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class UserManagePage extends PageObject{

	
	//--------------define method------------------
	public void open_user_detail(String user) {
		$("//*[contains(text(),'"+user+"']").click();
		withAction().moveToElement($("//*[contains(text(),'"+user+"']")).click().perform();
	}

}
