package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UploadEmployedDataPage extends PageObject{
	@FindBy(xpath="//*[@class='gj-page-title row']")
	private WebElementFacade completeTitle;

	
	/**
	 * get complete steps to provode title 
	 * 
	 * @param compeleteTitle
	 */
	public String get_complete_steps_to_provide_title() {
		return completeTitle.waitUntilPresent().getText();
	}
}
