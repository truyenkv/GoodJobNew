package GoodJobProject.steps;

import GoodJobProject.pages.UpdatePasswordPage;
import net.thucydides.core.steps.ScenarioSteps;

public class UpdatePasswordStep extends ScenarioSteps {
	
	UpdatePasswordPage updatePassPage;

	public void update_password(String password) {
		updatePassPage.update_pass(password);		
	}

}
