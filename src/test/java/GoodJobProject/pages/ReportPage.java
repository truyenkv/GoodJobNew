package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ReportPage extends PageObject{

	@FindBy(xpath="//*[@class='gj-app-button action btn btn-default']")
	private WebElementFacade showReportBtn;
	public String get_social_impact_scorecart_title() {
		return showReportBtn.waitUntilPresent().getText();
	}

}
