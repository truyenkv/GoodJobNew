package GoodJobProject.pages;

import java.awt.AWTException;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ManageAdminPage extends PageObject{

	
	@FindBy(xpath="//*[@class='add-user-button-top col-xs-12']//button[contains(text(),'Add User')]")
	private WebElementFacade addBtn;
	
	@FindBy(xpath="//*[@class='manage-content']/div[1]")
	private WebElementFacade title;
	
//	@FindBy(xpath="//*[@class='rt-tr -odd']/div[2]")
//	private List<WebElementFacade> emailOdd;
//	
//	@FindBy(xpath="//*[@class='rt-tr -odd']/div[1]")
//	private List<WebElementFacade> usernameOdd;
//	
//	@FindBy(xpath="//*[@class='rt-tr -even']/div[2]")
//	private List<WebElementFacade> emailEven;
//	
//	@FindBy(xpath="//*[@class='rt-tr -even']/div[1]")
//	private List<WebElementFacade> usernameEven;

	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[2]")
	private List<WebElementFacade> emailList;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[1]")
	private List<WebElementFacade> userList;
	
	int count = 0;
	int indexOdd = -1, indexEven = -1;
	int index = -1;
	String emailtepm = "";
	/**
	 * click on Add User button
	 * 
	 * @param addBtn
	 * 
	 */
	public void click_On_Add_Btn() {
		addBtn.waitUntilPresent().click();		
	}

	
	/**
	 * Get title when save successfully
	 * 
	 * @param title
	 * 
	 */
	public String get_Manage_Admin_title() {
		return title.getText();
	}

	
	/**
	 * Check email is existed on user list
	 * 
	 * @param getEmail
	 * 
	 */
	public boolean getEmail(String email) {
		waitABit(3000);
		for(int i=0; i<emailList.size(); i++)
		{
			System.out.print(emailList.get(i).getText());
			if(emailList.get(i).getText().equals(email))
			{
				count+=1;
				index=i;
			}
		}
		if(count!=1)
			return false;
		else
			return true;
//		for(int i=0; i<emailOdd.size(); i++)
//			{
//				if(emailOdd.get(i).getText().equals(email))
//				{
//					count+=1;
//					indexOdd=i;
//				}
//				
//			}
//			
//		for(int j=0; j<emailEven.size(); j++)
//		{
//			if(emailEven.get(j).getText().equals(email))
//			{
//				count+=1;
//				indexEven = j;
//			}
//			
//		}
//		if (count==1)
//			return true;
//		else 
//			return false;
		}

	
	/**
	 * Check user name is corrected after check email is existed.
	 * 
	 * @param title
	 * 
	 */
	public boolean getUserName(String username) {
		if(count!=1)
			return false;
		else 
		{
			if(userList.get(index).getText().equals(username))
				return true;
			else 
				return false;
		}
//		if(count!=1)
//			return false;
//		else
//		{
//			if((usernameOdd.get(indexOdd).getText().equals(username)) || (usernameEven.get(indexEven).getText().equals(username)))
//			{
//				return true;
//			}
//			else
//				return false;
//		}
	
	}
	
}





	

