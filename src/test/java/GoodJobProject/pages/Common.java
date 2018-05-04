package GoodJobProject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Common extends PageObject{
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public static WebElementFacade saveBtn;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	public static WebElementFacade nextBtn;
	
	
	@FindBy(xpath="//*[@class='glyphicon glyphicon-ok']")
	public static WebElementFacade okIcon;

}
