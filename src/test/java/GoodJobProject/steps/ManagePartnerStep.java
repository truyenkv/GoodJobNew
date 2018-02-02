package GoodJobProject.steps;

import GoodJobProject.pages.ManagePartnerPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManagePartnerStep extends ScenarioSteps{

	ManagePartnerPage managePartPage;
	
	public void click_on_add_partner_button() {
		managePartPage.click_add_button();
	}

}
