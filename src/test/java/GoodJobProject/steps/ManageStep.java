package GoodJobProject.steps;

import GoodJobProject.pages.ManagePage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageStep extends ScenarioSteps{

	ManagePage manageAllPage;
	public void open_User_Manage_page() {
		manageAllPage.click_User_Manage_icon();
	}

}
