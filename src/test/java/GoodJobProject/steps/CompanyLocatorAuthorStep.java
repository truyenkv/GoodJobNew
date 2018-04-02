package GoodJobProject.steps;

import GoodJobProject.pages.CompanyLocationAuthorPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CompanyLocatorAuthorStep extends ScenarioSteps{
	CompanyLocationAuthorPage comLocationAuthorPage;

	public void click_next_button() {
		comLocationAuthorPage.click_next_button();
	}

	public void add_new_location(String address, String city, String state, String zip) {
		comLocationAuthorPage.add_location(address, city, state, zip);
	}
	
}
