package GoodJobProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserDetailPage extends PageObject{

	WebElementFacade formControlsLastName;
	public void update_last_name(String lastName) {
		typeInto(formControlsLastName, lastName);
	}

}
