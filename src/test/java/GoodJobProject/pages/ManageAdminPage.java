package GoodJobProject.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.JavascriptExecutor;
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
	int indexOdd = -1, indexEven = -1;
	public void click_On_Add_Btn() {
		waitABit(5000);
		addBtn.click();		
	}

	public String get_Manage_Admin_title() {
		return title.getText();
	}

	public boolean getEmail(String email) {
		for(int i=0; i<emailOdd.size(); i++)
			{
				if(emailOdd.get(i).getText().equals(email))
				{
					count+=1;
					indexOdd=i;
				}
				
			}
			
			for(int j=0; j<emailEven.size(); j++)
			{
				if(emailOdd.get(j).getText().equals(email))
				{
					count+=1;
					indexEven = j;
				}
				
			}
			if (count==1)
				return true;
			else 
				return false;
		}

	public boolean getUserName(String username) {
		if(count!=1)
			return false;
		else
		{
			if((usernameOdd.get(indexOdd).getText().equals(username)) || (usernameEven.get(indexEven).getText().equals(username)))
			{
				return true;
			}
			else
				return false;
		}
	
	}
}





	

