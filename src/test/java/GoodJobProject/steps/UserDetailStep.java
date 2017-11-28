package GoodJobProject.steps;

import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.UserDetailPage;

public class UserDetailStep extends ScenarioSteps{

	UserDetailPage userDetailPage;
	public void update_last_name(String lastName) {
		userDetailPage.update_last_name(lastName);
	}

}
