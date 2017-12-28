package GoodJobProject.steps;

import junit.framework.Assert;
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

	public boolean get_Email_Is_Shown(String email) {
		waitABit(5000);
		return userManagerPage.getEmail(email);
	}

	public boolean get_User_Name_Is_Shown(String username) {
		return userManagerPage.getUserName(username);
	}



	
	








}
