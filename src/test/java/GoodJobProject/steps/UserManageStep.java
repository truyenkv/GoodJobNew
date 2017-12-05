package GoodJobProject.steps;

import GoodJobProject.pages.UserManagePage;
import net.thucydides.core.steps.ScenarioSteps;

public class UserManageStep extends ScenarioSteps{

	UserManagePage userManagerPage;

	public void click_On_Add_Button() {
		userManagerPage.click_On_Add_Btn();
		
	}

}
