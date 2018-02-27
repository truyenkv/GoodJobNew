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

	public void click_on_save_button() {
		manageUserProfilePage.click_save();
	}

	public void click_on_enable_button() {
		manageUserProfilePage.click_enable_button();
		
	}

	public String get_error_message() {
		return manageUserProfilePage.get_err_message();
	}

}
