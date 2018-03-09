package GoodJobProject.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompanyUsersAuthorPage extends PageObject{
	@FindBy(xpath="//button[contains(text(),'Add a user')]")
	private WebElementFacade addAUserBtn;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[1]")
	private List<WebElementFacade> firstnameList;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[2]")
	private List<WebElementFacade> lastnameList;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[3]")
	private List<WebElementFacade> emailList;
	
	@FindBy(xpath="//button[contains(text(),'Add a user')]")
	private WebElementFacade addAUser;

	public void add_new_users(String firstName, String lastName, String email) {
		waitABit(4000);
		addAUser.waitUntilPresent().click();
		waitABit(2000);
		withAction().moveToElement(firstnameList.get(firstnameList.size()-1)).sendKeys(firstName);
		//(firstnameList.get(firstnameList.size()-1)).type(firstName);
		waitABit(2000);
		//(lastnameList.get(lastnameList.size()-1)).type(lastName);
		withAction().moveToElement(lastnameList.get(lastnameList.size()-1)).sendKeys(lastName);
		waitABit(2000);
		withAction().moveToElement(emailList.get(emailList.size()-1)).sendKeys(email);
		//(emailList.get(emailList.size()-1)).type(email);
		waitABit(20000);
					
	}
	
	
}
