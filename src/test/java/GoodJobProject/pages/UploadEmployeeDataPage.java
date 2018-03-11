package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UploadEmployeeDataPage extends PageObject{
	@FindBy(xpath="//*[@class='gj-page-title row']")
	private WebElementFacade title;

	public String get_title_on_screen() {
		return title.waitUntilPresent().getText();
	}
}
