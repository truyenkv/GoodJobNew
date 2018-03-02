package GoodJobProject.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ManageCompaniesPage extends PageObject{

	@FindBy(xpath="//button[contains(text(),'Add Company')]")
	private WebElementFacade addComBtn;
	
	@FindBy(xpath="//*[@class='col-xs-12']")
	private WebElementFacade companyTitle;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[1]")
	private List<WebElementFacade> listCompany;
	/**
	 * Click on Add Company button
	 * 
	 * @param addComBtn
	 */
	public void click_Add_Company_button() {
//		addComBtn.waitUntilPresent().click();
		JavascriptExecutor excutor = (JavascriptExecutor)getDriver();
		excutor.executeScript("arguments[0].click();", addComBtn);
	}


	public String get_company_list_title() {
		return companyTitle.waitUntilPresent().getText();
	}


	public boolean check_company_is_shown(String companyName) {
		waitABit(3000);
		int count=0;
		for(int i=0; i<listCompany.size(); i++)
		{
			System.out.println(listCompany.get(i).getText());
			if(listCompany.get(i).getText().equals(companyName))
			{
				count+=1;
			}
		}
		if(count!=1)
			return false;
		else
			return true;
		
	}
	

}
