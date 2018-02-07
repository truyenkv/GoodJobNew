package GoodJobProject.steps;

import junit.framework.Assert;
import GoodJobProject.pages.ManageAdminPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageAdminStep extends ScenarioSteps{

	ManageAdminPage manageAdminPage;

	public void click_On_Add_Button() {
		manageAdminPage.click_On_Add_Btn();
		
	}

	public String get_sysAdminTitle() {
		return manageAdminPage.get_Manage_Admin_title();
	}

	public boolean get_Email_Is_Shown(String email) {
		waitABit(5000);
		return manageAdminPage.getEmail(email);
	}

	public boolean get_User_Name_Is_Shown(String username) {
		return manageAdminPage.getUserName(username);
	}

	public void click_on_save_button() {
		manageAdminPage.click_on_save_button();
		
	}



	
	








}
