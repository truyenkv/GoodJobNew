package GoodJobProject.steps;

import GoodJobProject.pages.ManageCompanyPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageCompanyStep extends ScenarioSteps{
	ManageCompanyPage manageCompanyPage;

	public void input_required_fields(String companyName, String companyIdentifier) {
		manageCompanyPage.input_required_fields(companyName, companyIdentifier);
	}

	public void input_locations_value(String address, String city, String state, String zip) {
		manageCompanyPage.input_location_value(address, city, state, zip);
	}

	public void click_on_Save_button() {
		manageCompanyPage.click_Save_button();
	}

	public void add_user(String firstName, String lastName, String email) {
		manageCompanyPage.add_user(firstName, lastName, email);
	}



}
