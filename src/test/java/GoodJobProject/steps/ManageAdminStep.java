package GoodJobProject.steps;

import GoodJobProject.pages.ManageAdminPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageAdminStep extends ScenarioSteps{

	ManageAdminPage userManagerPage;

	public void click_On_Add_Button() {
		userManagerPage.click_On_Add_Btn();
		
	}

	public String get_sysAdminTitle() {
		return userManagerPage.get_Manage_Admin_title();
	}

	public String get_Email() {
		return userManagerPage.getEmail();
	}

}
