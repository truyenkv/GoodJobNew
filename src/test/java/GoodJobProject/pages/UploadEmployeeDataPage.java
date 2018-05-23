package GoodJobProject.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UploadEmployeeDataPage extends PageObject{
	@FindBy(xpath="//*[@class='gj-page-title row']/div[1]")
	private WebElementFacade title;
	
	@FindBy(xpath="//a[contains(text(),'Upload Employee Data')]")
	public static WebElementFacade uploadEmployeeDataMenu;
	
	@FindBy(xpath="//*[@class='media-body']")
	private WebElementFacade warningMessage;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[1]")
	private List<WebElementFacade> yearList;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[2]")
	private List<WebElementFacade> periodList;
	
	@FindBy(xpath="//*[@class='rt-tr-group']/div/div[5]/div/span")
	private List<WebElementFacade> uploadIconList;

	List<Integer> listIndex = new ArrayList<Integer>();

	int periodIndex = -1;
	int periodCount = 0;
	public String get_title_on_screen() {
		return title.waitUntilPresent().getText();
	}

	public void click_on_Next_button() {
		Common.nextBtn.waitUntilPresent().click();
	}

	public void select_file_upload() {
		Common.browseLnk.waitUntilPresent().click();
	}

	public void upload_file(String filePath) {
		waitABit(1000);
		Common.browseLnk.waitUntilPresent().click();
		waitABit(2000);
		Common.upload_file(filePath);
		
	}

	public void click_on_upload_button() {
		Common.uploadBtn.waitUntilPresent().click();
		
	}

	public String get_title_after_uploadfile() {
		waitABit(3000);
		return title.waitUntilPresent().getText();
	}

	public void click_uploadEmployeeData_menu() {
		waitABit(7000);
		uploadEmployeeDataMenu.waitUntilPresent().click();
	}

	public String get_warning_message() {
		waitABit(3000);
		return warningMessage.waitUntilPresent().getText();
	}

	public boolean determined_the_year(String year) {
		waitABit(3000);
		for(int i=0; i<yearList.size(); i++)
		{
			if(yearList.get(i).getText().equals(year))
			{
				listIndex.add(i);
			}
		}

		for(Integer index : listIndex)
		{
			System.out.println(index);
		}
		if(listIndex.size()==0)
			return false;
		return true;
	}

	public boolean determined_the_period(String period) {
		if(listIndex.size()==0)
			return false;
		else 
		{

			for(Integer index : listIndex)
			{
				if(periodList.get(index).getText().equals(period))
				{
					periodIndex = index;
					System.out.println(periodIndex);
					periodCount +=1;
					if(periodCount!=1)
						return false;
					
				}
			}
		}
		return true;
	}

	public void click_upload_icon() {
		waitABit(4000);
		//uploadIconList.get(periodIndex).click();
		JavascriptExecutor excutor = (JavascriptExecutor)getDriver();
		excutor.executeScript("arguments[0].click();", uploadIconList.get(periodIndex));
	}
	
	
}
