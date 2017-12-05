package GoodJobProject.steps;

import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.ManageUserProfilePage;

public class ManageUserProfileStep extends ScenarioSteps{
	ManageUserProfilePage manageUserProfilePage;

	public void input_FistName(String firstName) {
		manageUserProfilePage.input_fist_name(firstName);
	}

	public void input_LastName(String lastName) {
		manageUserProfilePage.input_last_name(lastName);
	}

	public void input_Email(String email) {
		manageUserProfilePage.input_email(email);
		
	}

	public void click_On_Save_Button() {
		manageUserProfilePage.click_save();
	}

}
