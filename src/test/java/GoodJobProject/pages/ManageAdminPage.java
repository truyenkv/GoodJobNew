package GoodJobProject.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class ManageAdminPage extends PageObject{

	
	@FindBy(xpath="//*[@class='manage-content']/div[2]/div/button/span")
	WebElement addBtn;
	
	@FindBy(xpath="//*[@class='manage-content']/div[1]")
	WebElement title;
	
	@FindBy(xpath="//*[@class='rt-tr -odd']/div[2]")
	List<WebElement> emailOdd;
	
	@FindBy(xpath="//*[@class='rt-tr -odd']/div[1]")
	List<WebElement> usernameOdd;
	
	@FindBy(xpath="/*[@class='rt-tr -even']/div[2]")
	List<WebElement> emailEven;
	
	@FindBy(xpath="//*[@class='rt-tr -even']/div[1]")
	List<WebElement> usernameEven;
	//--------------define method------------------

	int count = 0;
	int index;
	public void click_On_Add_Btn() {
		waitABit(5000);
		addBtn.click();		
	}

	public String get_Manage_Admin_title() {
		return title.getText();
	}


	public String get_Email() {
		
		return null;
	}

	public String get_Username() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
