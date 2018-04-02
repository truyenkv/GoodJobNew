package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompanyLocationAuthorPage extends PageObject{
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElementFacade nextBtn;
	
	@FindBy(xpath="//*[@class='rt-tr-group'][last()]/div/div[2]/input")
	private WebElementFacade addressField;

	@FindBy(xpath="//*[@class='rt-tr-group'][last()]/div/div[4]/input")
	private WebElementFacade cityField;
	
	@FindBy(xpath="//*[@class='rt-tr-group'][last()]/div/div[5]/input")
	private WebElementFacade stateField;
	
	@FindBy(xpath="//*[@class='rt-tr-group'][last()]/div/div[6]/input")
	private WebElementFacade zipField;
	
	@FindBy(xpath="//button[contains(text(),'Add another location')]")
	private WebElementFacade addLocationBtn;
	
	
	public void click_next_button() {
		nextBtn.waitUntilPresent().click();
	}

	public void add_location(String address, String city, String state,	String zip) {
		waitABit(2000);
		addLocationBtn.waitUntilPresent().click();
		addressField.waitUntilPresent().sendKeys(address);
		cityField.waitUntilPresent().sendKeys(city);
		stateField.waitUntilPresent().sendKeys(state);
		zipField.waitUntilPresent().sendKeys(zip);
	}
}
