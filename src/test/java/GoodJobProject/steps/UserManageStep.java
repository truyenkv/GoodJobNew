package GoodJobProject.steps;

import GoodJobProject.pages.UserManagePage;
import net.thucydides.core.steps.ScenarioSteps;

public class UserManageStep extends ScenarioSteps{

	UserManagePage userManagerPage;
	public void open_detail_user_screen(String user) {
		userManagerPage.open_user_detail(user);
	}

}
