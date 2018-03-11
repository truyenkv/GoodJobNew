package GoodJobProject.steps;

import GoodJobProject.pages.CompanyLocationAuthorPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CompanyLocatorAuthorStep extends ScenarioSteps{
	CompanyLocationAuthorPage comLocationAuthorPage;

	public void click_next_button() {
		comLocationAuthorPage.click_next_button();
	}
	
}
