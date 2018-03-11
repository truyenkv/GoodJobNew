package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompanyLocationAuthorPage extends PageObject{
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElementFacade nextBtn;

	public void click_next_button() {
		nextBtn.waitUntilPresent().click();
	}
}
