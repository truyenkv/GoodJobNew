package GoodJobProject.steps;

import GoodJobProject.pages.ManageAllPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageStep extends ScenarioSteps{

	ManageAllPage manageAllPage;
	public void open_User_Manage_page() {
		manageAllPage.click_User_Manage_icon();
	}

}
